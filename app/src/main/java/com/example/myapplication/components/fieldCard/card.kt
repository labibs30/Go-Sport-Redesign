package com.example.myapplication.components.fieldCard

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material.icons.filled.Star
import androidx.compose.material.icons.filled.StarHalf
import androidx.compose.material.icons.outlined.FavoriteBorder
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.myapplication.data.Field

@Composable
fun FieldCard(field: Field, navController: NavController) {
    Card(
        modifier = Modifier
            .padding(16.dp)
            .fillMaxWidth()
            .clickable {
                navController.navigate("detail/${field.id}")
            },
        elevation = CardDefaults.cardElevation(4.dp),
        shape = RoundedCornerShape(16.dp),
    ) {
        Surface(
            color = Color.White, // Set background color to white
            modifier = Modifier.fillMaxWidth(),
            shape = RoundedCornerShape(16.dp)
        ) {
            Row(modifier = Modifier.padding(0.dp)) {
                // Image
                Image(
                    painter = painterResource(id = field.imageResourceId),
                    contentDescription = field.name,
                    modifier = Modifier
                        .fillMaxHeight()
                        .size(135.dp)
                        .aspectRatio(1f),
                    contentScale = ContentScale.FillBounds
                )

                // Text content
                Column(
                    modifier = Modifier
                        .padding(start = 16.dp, top = 16.dp, bottom = 16.dp)
                        .weight(3f)
                ) {
                    // Name
                    Text(
                        text = field.name,
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Bold
                    )
                    Spacer(modifier = Modifier.height(4.dp))
                    // Rating
                    RatingStars(rating = field.rating)
                    Spacer(modifier = Modifier.height(4.dp))
                    // Price
                    Text(
                        text = "Rp ${field.prize}",
                        fontSize = 14.sp
                    )
                    Spacer(modifier = Modifier.height(4.dp))
                    // Location icon and data
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Icon(Icons.Default.LocationOn, contentDescription = null)
                        Spacer(modifier = Modifier.width(8.dp))
                        Text(
                            text = "${field.location} Km",
                            fontSize = 14.sp
                        )
                    }
                }
                Spacer(modifier = Modifier.height(8.dp))
                LoveButton()
            }

        }
    }
}
@Composable
fun RatingStars(rating: Float) {
    val fullStars = rating.toInt()
    val halfStar = (rating - fullStars) >= 0.5f

    Row {
        repeat(fullStars) {
            Icon(Icons.Filled.Star, contentDescription = null, tint = Color.Yellow)
        }
        if (halfStar) {
            Icon(Icons.Filled.StarHalf, contentDescription = null, tint = Color.Yellow)
        }
    }
}

@Composable
fun LoveButton() {
    var isLoved by remember { mutableStateOf(false) }

    IconButton(
        onClick = { isLoved = !isLoved },
        modifier = Modifier
            .size(48.dp)
            .padding(8.dp)
    ) {
        Icon(
            imageVector = if (isLoved) Icons.Filled.Favorite else Icons.Outlined.FavoriteBorder,
            contentDescription = null,
            tint = if (isLoved) Color.Red else Color.Gray
        )
    }
}