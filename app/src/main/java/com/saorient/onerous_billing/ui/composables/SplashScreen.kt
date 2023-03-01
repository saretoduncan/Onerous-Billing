package com.saorient.onerous_billing.ui.composables

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.saorient.onerous_billing.Greeting
import com.saorient.onerous_billing.R
import com.saorient.onerous_billing.ui.navigation.Navigation
import com.saorient.onerous_billing.ui.navigation.Screen
import com.saorient.onerous_billing.ui.theme.Onerous_BillingTheme
import kotlinx.coroutines.delay

@Composable
fun SplashScreen (navController: NavController) {

    Box(modifier = Modifier
        .fillMaxSize()
        .background(MaterialTheme.colorScheme.background), contentAlignment = Alignment.Center){
        Column {
            Image(painter = painterResource(id = logo()), contentDescription = "logo")
            Text(text = "Onerous Billing", fontSize = 30.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.align(alignment = Alignment.CenterHorizontally),
                color=MaterialTheme.colorScheme.onBackground
            )
        }

    }
   LaunchedEffect(Unit){
       delay(2000)
       navController.navigate(Screen.LoginScreen.route)
   }

}

@Composable
fun logo():Int {
    return if (isSystemInDarkTheme()) R.drawable.logo_dark
    else R.drawable.logo_light
}
@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    Onerous_BillingTheme {

    }
}