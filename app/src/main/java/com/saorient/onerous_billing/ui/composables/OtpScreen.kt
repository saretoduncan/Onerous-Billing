package com.saorient.onerous_billing.ui.composables

import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.saorient.onerous_billing.R
import com.saorient.onerous_billing.ui.SimpleButton
import com.saorient.onerous_billing.ui.TextEdit
import com.saorient.onerous_billing.ui.TopBar
import com.saorient.onerous_billing.ui.navigation.Screen
import com.saorient.onerous_billing.ui.theme.Onerous_BillingTheme


@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun OtpComposableScreen(modifier:Modifier= Modifier, navController: NavController) {
    Scaffold(
      topBar = { TopBar(navController =navController, title =  R.string.Reset_password) },
        content = {
            Column(modifier= Modifier
                .fillMaxWidth()
                .verticalScroll(rememberScrollState(), enabled = true)) {
                Spacer(modifier =Modifier.height(100.dp))
                Text(text="Please enter a 4 digit sent sent to abc@gmail.com",
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .width(280.dp)
                        .align(alignment = Alignment.CenterHorizontally),
                )
                Spacer(modifier =Modifier.height(100.dp))

                    TextEdit(modifier= Modifier
                        .width(280.dp)
                        .background(MaterialTheme.colorScheme.background)
                        .align(alignment = Alignment.CenterHorizontally),
                        label = "OTP",
                        keyboardType = KeyboardType.Number)


                Spacer(modifier=Modifier.height(10.dp))
                SimpleButton(buttonText ="Verify" ,colors = ButtonDefaults.buttonColors(
                    MaterialTheme.colorScheme.primaryContainer),
                    textColor = MaterialTheme.colorScheme.onPrimaryContainer,
                    shape = 5,
                    modifier = Modifier
                        .align(Alignment.CenterHorizontally)
                        .width(280.dp)){
                    navController.navigate(Screen.SetNewPasswordScreen.route)
                }
                Spacer(modifier=Modifier.height(10.dp))
                Text(text = "Resend OTP", color = MaterialTheme.colorScheme.onBackground,
                    modifier=Modifier.align(alignment = Alignment.CenterHorizontally))
            }
        }
    )

}
@Preview(showBackground = true)
@Composable
fun OtpScreenPreview() {

    Onerous_BillingTheme {
        val navController = rememberNavController()
        OtpComposableScreen( navController= navController)
    }
}