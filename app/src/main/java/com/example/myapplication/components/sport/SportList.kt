package com.example.myapplication.components.sport

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.myapplication.R.drawable
import com.example.myapplication.data.Sport

@Composable
fun SportList(navController: NavController){
    val sports = listOf(
        Sport("Futsal", drawable.futsal),
        Sport("Badminton", drawable.badmin),
        Sport("Billiard", drawable.biliard),
        Sport("Voli", drawable.voli),
        Sport("Tennis", drawable.tennis),
        Sport("Golf", drawable.golf),
    )

    LazyRow(
        modifier = Modifier.padding(horizontal = 0.dp),
        horizontalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        items(sports.size) { index ->
            val sport = sports[index]
            SportItem(sport = sport) {
                // Navigate to the FieldsList destination passing the sport's name as an argument
                navController.navigate("FieldsList/${sport.name}")
            }
        }
    }
}
