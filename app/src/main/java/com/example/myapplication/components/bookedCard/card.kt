package com.example.myapplication.components.bookedCard

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.myapplication.data.Booked

@Composable
fun BookingCard(booked: Booked) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 8.dp),
        elevation = CardDefaults.cardElevation(4.dp),
    ) {
        Surface(
            color = MaterialTheme.colorScheme.onTertiary, // Set background color to white
            modifier = Modifier.fillMaxWidth(),
            shape = RoundedCornerShape(16.dp)
        ) {
            Column(
                modifier = Modifier.padding(16.dp)
            ) {
                Text(text = "Field: ${booked.fieldName}", color = MaterialTheme.colorScheme.onPrimary)
                Text(text = "Price: ${booked.price}", color = MaterialTheme.colorScheme.onPrimary)
                Text(text = "Status: ${booked.status}", color = MaterialTheme.colorScheme.onPrimary)
            }
        }
    }
}