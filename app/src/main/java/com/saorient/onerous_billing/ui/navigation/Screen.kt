package com.saorient.onerous_billing.ui.navigation

sealed class Screen(val route:String){
    object SplashScreen:Screen("splash_screen")
    object LoginScreen:Screen("login_screen")
    object SignupScreen:Screen("sign_screen")
    object ForgotPassword:Screen("forgotPassword_screen")
    object  EnterOtpScreen:Screen("otp_screen")
    object MainScreen:Screen("main_screen")
}