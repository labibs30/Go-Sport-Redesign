package com.example.myapplication.viewModels
import androidx.compose.runtime.mutableStateListOf
import androidx.lifecycle.ViewModel
import com.example.myapplication.data.Booked

class BookedVM:ViewModel() {
    var bookeds = mutableStateListOf<Booked>()
        private set

    init {
        // Initialize with sample data
        bookeds.addAll(
            listOf(
                Booked(1, "Lapangan Hatta", 200000,  "paid"),
                Booked(2, "Lapangan Kertajaya", 150000,  "paid"),
                Booked(3, "Lapangan Sutet", 500000,  "paid"),
                // Add more promos as needed
            )
        )
    }
    fun getAllBookeds(): List<Booked> {
        return bookeds
    }
}