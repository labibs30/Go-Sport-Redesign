package com.example.myapplication.pages

import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import com.example.myapplication.data.Field
import com.example.myapplication.viewModels.FieldVM
import java.time.LocalDate
import java.time.format.DateTimeFormatter

@RequiresApi(Build.VERSION_CODES.O)
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun FieldDetailPage(fieldId: Int, navController: NavController) {
    val fieldViewModel: FieldVM = viewModel()
    val field: Field? = fieldViewModel.getFieldById(fieldId)
    val showDialog = remember { mutableStateOf(false) }
    val currentDate = LocalDate.now().format(DateTimeFormatter.ofPattern("dd MMMM yyyy"))

    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Column(modifier = Modifier.fillMaxWidth()) {
                        Text(
                            text = "${field?.name}",
                            textAlign = TextAlign.Center,
                            modifier = Modifier.fillMaxWidth(),
                            color = MaterialTheme.colorScheme.onPrimary // Set the title text color to white
                        )
                        Text(
                            text = currentDate,
                            textAlign = TextAlign.Center,
                            modifier = Modifier.fillMaxWidth(),
                            color = MaterialTheme.colorScheme.onPrimary, // Set the date text color to white
                            style = MaterialTheme.typography.bodySmall // You can customize the style if needed
                        )
                    }
                },
                navigationIcon = {
                    IconButton(onClick = { navController.popBackStack() }) {
                        Icon(Icons.Filled.ArrowBack, contentDescription = "Back",tint = MaterialTheme.colorScheme.onPrimary)
                    }
                },
                colors = TopAppBarDefaults.smallTopAppBarColors(
                    containerColor = MaterialTheme.colorScheme.primary
                )
            )
        },
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .padding(innerPadding)
                .verticalScroll(rememberScrollState())
                .padding(16.dp) // Adjust padding for better spacing
        ) {
            if (field != null) {
                Image(
                    painter = painterResource(id = field.imageResourceId),
                    contentDescription = field.name,
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(200.dp)
                        .clip(RoundedCornerShape(8.dp)),
                    contentScale = ContentScale.Crop
                )
                Spacer(modifier = Modifier.height(16.dp))
                Text(
                    text = "Rating: ${field.rating}",
                    fontSize = 20.sp, // Increase font size
                    fontWeight = FontWeight.Bold, // Make rating bold
                    modifier = Modifier.padding(bottom = 8.dp)
                )
                Text(
                    text = "Price: Rp ${field.prize}",
                    fontSize = 20.sp, // Increase font size
                    fontWeight = FontWeight.Bold, // Make price bold
                    modifier = Modifier.padding(bottom = 8.dp)
                )
                Text(
                    text = "Location: ${field.location} Km",
                    fontSize = 20.sp, // Increase font size
                    fontWeight = FontWeight.Bold, // Make location bold
                    modifier = Modifier.padding(bottom = 8.dp)
                )
                Text(
                    text = "${field.description}",
                    fontSize = 12.sp, // Decrease font size for description
                    modifier = Modifier.padding(bottom = 8.dp)
                )
                Button(
                    onClick = {
                        navController.navigate("purchase/${field.id}")
                    },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(vertical = 16.dp)
                ) {
                    Text(text = "Book Now")
                }
            } else {
                Text(
                    text = "Field not found",
                    fontSize = 20.sp, // Increase font size
                    fontWeight = FontWeight.Bold, // Make message bold
                    modifier = Modifier.padding(bottom = 8.dp)
                )
            }
        }
    }
    if (showDialog.value) {
        BookingForm(
            onConfirm = { name, email ->
                // Handle booking confirmation
                // You can perform the booking logic here
                showDialog.value = false
            },
            onDismiss = { showDialog.value = false }
        )
    }
}

@Composable
fun BookingForm(
    onConfirm: (String, String) -> Unit,
    onDismiss: () -> Unit,
) {
    var name by rememberSaveable { mutableStateOf("") }
    var email by rememberSaveable { mutableStateOf("") }

    AlertDialog(
        onDismissRequest = onDismiss,
        title = { Text("Book Now") },
        confirmButton = {
            Button(
                onClick = {
                    if (name.isNotEmpty() && email.isNotEmpty()) {
                        onConfirm(name, email)
                        onDismiss()
                    }
                }
            ) {
                Text("Confirm")
            }
        },
        dismissButton = {
            Button(onClick = onDismiss) {
                Text("Cancel")
            }
        },
        text = {
            Column {
                TextField(
                    value = name,
                    onValueChange = { name = it },
                    label = { Text("Name") }
                )
                Spacer(modifier = Modifier.height(16.dp))
                TextField(
                    value = email,
                    onValueChange = { email = it },
                    label = { Text("Email") }
                )
            }
        }
    )
}

