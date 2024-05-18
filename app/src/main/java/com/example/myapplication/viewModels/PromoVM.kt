package com.example.myapplication.viewModels
import com.example.myapplication.R.drawable
import androidx.compose.runtime.mutableStateListOf
import androidx.lifecycle.ViewModel
import com.example.myapplication.data.Promo

class PromoVM:ViewModel() {
    var promos = mutableStateListOf<Promo>()
        private set

    init {
        // Initialize with sample data
        promos.addAll(
            listOf(
                Promo(drawable.banner1, "Ends on 31 Dec 2023"),
                Promo(drawable.banner2, "Ends on 15 Jan 2024"),
                Promo(drawable.banner1, "Ends on 10 Feb 2024")
                // Add more promos as needed
            )
        )
    }
}