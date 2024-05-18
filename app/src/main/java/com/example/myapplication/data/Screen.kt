package com.example.myapplication.data

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.List
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.ui.graphics.vector.ImageVector

sealed class Screen(val route: String, val title: String, val icon: ImageVector) {
    object Home : Screen("home", "Home", Icons.Default.Home)
    object Booking : Screen("booking", "Booking", Icons.Default.List)
    object Transaction : Screen("transaction", "Transaction", Icons.Default.ShoppingCart)
    object Profile : Screen("profile", "Profile", Icons.Default.AccountCircle)
    // Add more screens if needed
}