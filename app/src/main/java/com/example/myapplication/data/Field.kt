package com.example.myapplication.data

import androidx.annotation.DrawableRes

data class Field(
    val id:Int,
    val name: String,
    val category: String,
    val prize: Double,
    val rating: Float,
    val location: Float,
    val description: String,
    @DrawableRes val imageResourceId: Int
    // Add more properties as needed
)
