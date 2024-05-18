package com.example.myapplication.pages

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.myapplication.components.Navbar.BottomNavigationBar
import com.example.myapplication.data.Screen

@Composable
fun MainPage(email: String, navController: NavHostController) {
    val nestedNavController = rememberNavController()
    Scaffold(
        bottomBar = { BottomNavigationBar(nestedNavController) }
    ) { innerPadding ->
        NavHost(
            navController = nestedNavController,
            startDestination = Screen.Home.route,
            modifier = Modifier.padding(innerPadding)
        ) {
            composable(Screen.Home.route) { HomePage(email, navController) }
            composable(Screen.Booking.route) { BookingPage() }
            composable(Screen.Transaction.route) { TransactionPage() }
            composable(Screen.Profile.route) { TransactionPage() }
        }
    }
}