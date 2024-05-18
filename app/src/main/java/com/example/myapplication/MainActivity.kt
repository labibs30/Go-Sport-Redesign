package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.myapplication.pages.FieldDetailPage
import com.example.myapplication.pages.FieldListPage
import com.example.myapplication.pages.Login
import com.example.myapplication.pages.MainPage
import com.example.myapplication.pages.PurchasingPage
import com.example.myapplication.ui.theme.MyApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApplicationTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    val navController = rememberNavController()
                    NavHost(navController   = navController, startDestination = "login"){
                        composable("login"){ Login(navController)}
                        composable("homepage/{email}", arguments = listOf(navArgument("email"){
                            type = NavType.StringType
                        })){ backStackEntry ->
                            val email = backStackEntry.arguments?.getString("email") ?: ""
//                            HomePage(email = backStackEntry.arguments?.getString("email") ?: "")
                            MainPage(email = email, navController = navController)
                        }
                        composable(
                            route = "fieldsList/{sportName}",
                            arguments = listOf(navArgument("sportName") { type = NavType.StringType })
                        ) { backStackEntry ->
                            val sportName = backStackEntry.arguments?.getString("sportName") ?: ""
                            FieldListPage(sportName = sportName, navController)
                        }
                        composable(
                            route = "detail/{fieldId}",
                            arguments = listOf(navArgument("fieldId") { type = NavType.IntType })
                        ) { backStackEntry ->
                            val fieldId = backStackEntry.arguments?.getInt("fieldId") ?: 0
                            FieldDetailPage(fieldId = fieldId, navController = navController)
                        }
                        composable("purchase/{fieldId}") { backStackEntry ->
                            val fieldId = backStackEntry.arguments?.getString("fieldId")?.toInt() ?: 0
                            PurchasingPage(fieldId, navController)
                        }
                    }
                }
            }
        }
    }
}
