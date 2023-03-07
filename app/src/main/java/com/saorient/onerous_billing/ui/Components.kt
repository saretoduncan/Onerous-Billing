package com.saorient.onerous_billing.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Visibility
import androidx.compose.material.icons.filled.VisibilityOff
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.saorient.onerous_billing.ui.theme.Onerous_BillingTheme

@Composable
fun TextEdit(modifier:Modifier= Modifier, label:String="") {
    var text by remember{mutableStateOf("")}
    OutlinedTextField(value = text, onValueChange = {
        text=it
    }, label={Text(label)},modifier= modifier)
}

@Composable
fun PasswordTextEdit(modifier: Modifier= Modifier) {
    var password by rememberSaveable { mutableStateOf("") }
    var passwordVisible by rememberSaveable{ mutableStateOf(false) }
    OutlinedTextField(value = password,
        onValueChange ={
        password=it
    },
        label = { Text(text = "password")},
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
fun SimpleButton(buttonText:String="", shape:Int= 0,colors: ButtonColors,modifier: Modifier= Modifier ) {
    Button(onClick = { /*TODO*/ },shape=CutCornerShape(shape),colors=colors, modifier = modifier) {
        Text(text= buttonText)
    }
}

@Composable
fun ElevatedButton(buttonText:String="",
                   shape: Int=0,
                   colors: ButtonColors,
                   buttonElevation: ButtonElevation, modifier: Modifier) {
    Button(onClick = { /*TODO*/ }, elevation= ButtonDefaults.buttonElevation(
        defaultElevation = 10.dp
    ), modifier = Modifier.background(MaterialTheme.colorScheme.background)) {
        Text(text=buttonText)
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


@Preview
@Composable
fun SimpleButtonPreview() {
    Onerous_BillingTheme {
        SimpleButton(buttonText = "login", shape = 10,
            colors=ButtonDefaults
                .buttonColors(MaterialTheme.colorScheme.primaryContainer) )
    }
}@Preview
@Composable
fun ElevateButtonPreview() {
    Onerous_BillingTheme {
        ElevatedButton(buttonText = "login", shape = 10,
            colors=ButtonDefaults
                .buttonColors(MaterialTheme.colorScheme.primaryContainer),
            buttonElevation = ButtonDefaults.buttonElevation(defaultElevation = 10.dp),
            modifier= Modifier.background(MaterialTheme.colorScheme.background))
    }
}