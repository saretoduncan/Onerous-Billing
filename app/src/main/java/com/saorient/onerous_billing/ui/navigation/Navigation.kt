package com.saorient.onerous_billing.ui.navigation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.saorient.onerous_billing.ui.composables.LoginScreen
import com.saorient.onerous_billing.ui.composables.SplashScreen

@Composable
fun Navigation() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Screen.SplashScreen.route){
        composable(route= Screen.SplashScreen.route){
            SplashScreen(navController=navController)
        }
        composable(route= Screen.LoginScreen.route){
            LoginScreen()
        }
    }

}