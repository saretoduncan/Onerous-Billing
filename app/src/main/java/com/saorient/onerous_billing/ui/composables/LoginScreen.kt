package com.saorient.onerous_billing.ui.composables

import android.graphics.Color
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.saorient.onerous_billing.R
import com.saorient.onerous_billing.ui.*
import com.saorient.onerous_billing.ui.theme.Onerous_BillingTheme
import kotlinx.coroutines.runBlocking
import org.intellij.lang.annotations.JdkConstants.HorizontalAlignment


@Composable
fun LoginScreen(modifier:Modifier= Modifier) {
    Box(modifier = Modifier
        .background(
            MaterialTheme.colorScheme.background
        )
        .fillMaxSize()
        .padding(horizontal = 20.dp)
    ){
        Column(
            modifier= Modifier
                .fillMaxSize()
                .verticalScroll(rememberScrollState(), true)
            ) {

            Column(modifier= modifier.fillMaxWidth()) {
                Spacer(modifier = Modifier.height(50.dp))
                Image(painter = painterResource(id = loginIllustation()), contentDescription ="app logo",
                    modifier= Modifier
                        .align(alignment = Alignment.CenterHorizontally)
                        .size(200.dp))
                Spacer( modifier=Modifier.height(10.dp))
                Text(
                    text = "Login",
                    style = MaterialTheme.typography.displaySmall,
                    fontWeight = FontWeight.Bold,
                    color= MaterialTheme.colorScheme.onBackground,
                    modifier = Modifier.align(alignment = Alignment.CenterHorizontally),

                    )
                Spacer(modifier = Modifier.height(10.dp))

                TextEdit(label = "Email", modifier = Modifier
                    .align(alignment = Alignment.CenterHorizontally)
                    .background(MaterialTheme.colorScheme.background)
                    .width(280.dp))
                Spacer(modifier = Modifier.height(10.dp))
                PasswordTextEdit(modifier= Modifier
                    .align(alignment = Alignment.CenterHorizontally)
                    .width(280.dp))
                Spacer(modifier = Modifier.height(10.dp))
                Box(modifier=Modifier.width(280.dp).align(alignment =Alignment.CenterHorizontally)) {
                    Text(text = "forgot password?", color= MaterialTheme.colorScheme.onBackground, modifier= Modifier.align(alignment =Alignment.CenterEnd))
                }
                Spacer(modifier = Modifier.height(10.dp))
                SimpleButton(colors =ButtonDefaults.buttonColors(MaterialTheme.colorScheme.primaryContainer),
                    buttonText = "Login",
                    shape = 5,
                    modifier = Modifier
                        .width(280.dp)
                        .align(alignment = Alignment.CenterHorizontally)
                    , textColor = MaterialTheme.colorScheme.onPrimaryContainer
                )
                Spacer(modifier = Modifier.height(10.dp))
                AuthDivider(modifier= Modifier
                    .width(280.dp)
                    .align(alignment = Alignment.CenterHorizontally))
                Spacer(modifier = Modifier.height(10.dp))
                ElevatedButton(colors = ButtonDefaults.buttonColors(MaterialTheme.colorScheme.background) ,
                    buttonElevation = ButtonDefaults.buttonElevation(defaultElevation = 2.dp),
                    shape = 5,
                    buttonText = "continue with google",

                    modifier = Modifier
                        .align(alignment = Alignment.CenterHorizontally)
                        .width(280.dp))
            }

            Spacer(modifier = Modifier.weight(1f))
            Row(modifier= modifier
                .padding(bottom = 20.dp)
                .fillMaxWidth(),
                horizontalArrangement = Arrangement.Center,

                ) {
                Text(text = "Don't have an account yet?", color=MaterialTheme.colorScheme.onBackground)
                Spacer(modifier = Modifier.width(2.dp))
                Text(text = "Register",color= MaterialTheme.colorScheme.tertiary)
            }
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