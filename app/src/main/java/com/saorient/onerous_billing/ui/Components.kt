package com.saorient.onerous_billing.ui


import androidx.annotation.DrawableRes
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Visibility
import androidx.compose.material.icons.filled.VisibilityOff
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalSoftwareKeyboardController
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.saorient.onerous_billing.R
import com.saorient.onerous_billing.ui.theme.Onerous_BillingTheme
import java.time.format.TextStyle

@OptIn(ExperimentalComposeUiApi::class)
@Composable
fun TextEdit(modifier:Modifier= Modifier, label:String="") {
    val keyboardController= LocalSoftwareKeyboardController.current
    var text by remember{mutableStateOf("")}
    OutlinedTextField(value = text, onValueChange = {
        text=it
    }, label={Text(label)},keyboardOptions= KeyboardOptions.Default.copy(
        imeAction = ImeAction.Done
    ),
        keyboardActions= KeyboardActions(
            onDone = {
                keyboardController?.hide();
            }
        ),modifier= modifier)
}

@OptIn(ExperimentalComposeUiApi::class)
@Composable
fun PasswordTextEdit(modifier: Modifier= Modifier) {
    val keyboardController= LocalSoftwareKeyboardController.current
    var password by rememberSaveable { mutableStateOf("") }
    var passwordVisible by rememberSaveable{ mutableStateOf(false) }
    OutlinedTextField(value = password,
        onValueChange ={
        password=it
    },
        label = { Text(text = "password")},
        keyboardOptions= KeyboardOptions.Default.copy(
            imeAction = ImeAction.Done
        ),
        keyboardActions= KeyboardActions(
            onDone = {
                keyboardController?.hide();
            }
        ),
        visualTransformation = if(passwordVisible) VisualTransformation.None else PasswordVisualTransformation(),
        trailingIcon = {
            val image = if(passwordVisible){
                Icons.Filled.Visibility
            }else Icons.Filled.VisibilityOff
            val description = if (passwordVisible) "Hide Password" else "Show Password"
            IconButton(onClick = { passwordVisible=!passwordVisible }) {
                Icon(imageVector = image, description)
            }
        },
        modifier= modifier
    )

}
@Composable
fun SimpleButton(buttonText:String="", shape:Int= 0,colors: ButtonColors,modifier: Modifier= Modifier, textColor:androidx.compose.ui.graphics.Color) {
    Button(onClick = { /*TODO*/ },shape=CutCornerShape(shape),colors=colors, modifier = modifier) {
       Text(text = buttonText,style=androidx.compose.ui.text.TextStyle(color=textColor))
    }
}

@Composable
fun ElevatedButton(buttonText:String="",
                   shape: Int=0,
                   colors: ButtonColors,
                   buttonElevation: ButtonElevation,

                   modifier: Modifier) {
    Button(onClick = { /*TODO*/ },
        elevation= buttonElevation,
        shape = CutCornerShape(shape),
        colors = colors, modifier = modifier) {

        Text(text=buttonText, color=MaterialTheme.colorScheme.onBackground)
    }

    
}

@Composable
fun AuthDivider(modifier: Modifier=Modifier) {
    Row(horizontalArrangement = Arrangement.spacedBy(2.dp),
        verticalAlignment = Alignment.CenterVertically,
        modifier = modifier) {
        Box(
            modifier
                .height(1.dp)
                .weight(1f)
                .background(MaterialTheme.colorScheme.onBackground)
        )
        Text(text = "or", color=MaterialTheme.colorScheme.onBackground, style = androidx.compose.ui.text.TextStyle(fontWeight = FontWeight.Bold))
        Box(
            modifier
                .height(1.dp)
                .weight(1f)
                .background(MaterialTheme.colorScheme.onBackground)
        )
        }
    }

@Preview(showBackground = true)
@Composable
fun TextEditPreview() {
    Onerous_BillingTheme {
       TextEdit( modifier = Modifier.background(MaterialTheme.colorScheme.background),label = "Name")
    }
}

@Preview(showBackground = true)
@Composable
fun PasswordEditPreview() {
    Onerous_BillingTheme {
      PasswordTextEdit(modifier= Modifier.background(MaterialTheme.colorScheme.background) )
    }
}



@Preview(showBackground = true)
@Composable
fun SimpleButtonPreview() {
    Onerous_BillingTheme {
        SimpleButton(buttonText = "login", shape = 10,
            colors=ButtonDefaults
                .buttonColors(MaterialTheme.colorScheme.primaryContainer),
            textColor = MaterialTheme.colorScheme.onPrimaryContainer, modifier = Modifier.width(200.dp))
    }
}@Preview(showBackground = true)
@Composable
fun ElevateButtonPreview() {
    Onerous_BillingTheme {
        ElevatedButton(buttonText = "login", shape = 10,
            colors=ButtonDefaults
                .buttonColors(MaterialTheme.colorScheme.background),
            buttonElevation = ButtonDefaults.buttonElevation(defaultElevation = 10.dp),
            modifier= Modifier.background(MaterialTheme.colorScheme.background),
           )
    }
}
@Preview(showBackground = true)
@Composable
fun AuthDividerPreview() {
    Onerous_BillingTheme {
        AuthDivider(modifier= Modifier
            .background(MaterialTheme.colorScheme.background)


            )
    }
}