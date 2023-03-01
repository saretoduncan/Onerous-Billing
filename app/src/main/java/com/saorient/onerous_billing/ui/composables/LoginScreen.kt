package com.saorient.onerous_billing.ui.composables

import android.graphics.Color
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.*
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.saorient.onerous_billing.R
import com.saorient.onerous_billing.ui.theme.Onerous_BillingTheme
import org.intellij.lang.annotations.JdkConstants.HorizontalAlignment


@Composable
fun LoginScreen(modifier:Modifier= Modifier) {
    Box(modifier = Modifier
        .background(
            MaterialTheme.colorScheme.background
        )
        .fillMaxSize()){
        Column(modifier=modifier.fillMaxWidth()) {
            Spacer(modifier = Modifier.height(50.dp))
            Image(painter = painterResource(id = loginIllustation()), contentDescription ="app logo",
                modifier= Modifier.align(alignment = Alignment.CenterHorizontally).size(250.dp))

        }


    }
}

@Composable
fun loginIllustation():Int {
    return if(isSystemInDarkTheme()) return R.drawable.secure_login_dark
    else return R.drawable.secure_login_light
}
@Preview(showBackground = true)
@Composable
fun loginScreenPreview() {
    Onerous_BillingTheme {
        LoginScreen()
    }
}