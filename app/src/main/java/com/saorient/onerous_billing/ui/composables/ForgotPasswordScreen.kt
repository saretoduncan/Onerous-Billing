package com.saorient.onerous_billing.ui.composables

import android.annotation.SuppressLint
import android.content.Context
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ChevronLeft
import androidx.compose.material3.*

import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.saorient.onerous_billing.R
import com.saorient.onerous_billing.ui.SimpleButton
import com.saorient.onerous_billing.ui.TextEdit
import com.saorient.onerous_billing.ui.TopBar
import com.saorient.onerous_billing.ui.theme.Onerous_BillingTheme



@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ForgotPasswordScreen(modifier: Modifier = Modifier, navController: NavController) {
    Scaffold(topBar = {
        TopBar(navController = navController, title = "Reset Password")

                      },
        content = {
            Column(modifier= Modifier
                .fillMaxWidth()
                .verticalScroll(rememberScrollState(), enabled = true)) {
                Spacer(modifier =Modifier.height(100.dp))
                Text(text="Please enter your registered email below to receive password reset OTP",
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .width(280.dp)
                        .align(alignment = Alignment.CenterHorizontally),
                    )
                Spacer(modifier =Modifier.height(100.dp))
                TextEdit(label="Email", modifier = Modifier
                    .align(Alignment.CenterHorizontally)
                    .width(280.dp))
                Spacer(modifier=Modifier.height(10.dp))
                SimpleButton(buttonText ="Send OTP" ,colors = ButtonDefaults.buttonColors(MaterialTheme.colorScheme.primaryContainer),
                    textColor =MaterialTheme.colorScheme.onPrimaryContainer,
                    shape = 5,
                    modifier = Modifier.align(Alignment.CenterHorizontally).width(280.dp))
            }

        }
   )
}
@Preview(showBackground = true)
@Composable
fun ForgotPasswordScreenPreview() {

    Onerous_BillingTheme {
        val navController = rememberNavController()
        ForgotPasswordScreen( navController= navController)
    }
}