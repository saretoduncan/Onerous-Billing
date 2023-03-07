package com.saorient.onerous_billing.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
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
       TextEdit( modifier = Modifier.background(MaterialTheme.colorScheme.background),label = "password")
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