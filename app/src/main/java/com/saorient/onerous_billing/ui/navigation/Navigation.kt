package com.saorient.onerous_billing.ui.navigation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.saorient.onerous_billing.ui.composables.*

@Composable
fun Navigation() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Screen.SplashScreen.route){
        composable(route= Screen.SplashScreen.route){
            SplashScreen(navController=navController)
        }
        composable(route= Screen.LoginScreen.route){
            LoginScreen(navController = navController)
        }
        composable(route = Screen.ForgotPassword.route){
            ForgotPasswordScreen(navController = navController)
        }
        composable(route = Screen.EnterOtpScreen.route){
            OtpComposableScreen(navController = navController)
        }
        composable(route = Screen.SetNewPasswordScreen.route){
            SetNewPasswordScreen()
        }

    }

}