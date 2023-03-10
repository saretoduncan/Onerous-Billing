package com.saorient.onerous_billing

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.saorient.onerous_billing.ui.composables.SplashScreen
import com.saorient.onerous_billing.ui.navigation.Navigation
import com.saorient.onerous_billing.ui.theme.Onerous_BillingTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Onerous_BillingTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier
                    .background(MaterialTheme.colorScheme.background)
                    .fillMaxSize()
                ) {
                    Navigation()
                }

            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    Onerous_BillingTheme {
        Navigation()
    }
}