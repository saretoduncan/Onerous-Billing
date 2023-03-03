package com.saorient.onerous_billing.ui

import androidx.compose.foundation.background
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.tooling.preview.Preview
import com.saorient.onerous_billing.ui.composables.LoginScreen
import com.saorient.onerous_billing.ui.theme.Onerous_BillingTheme

@Composable
fun textEdit(modifier:Modifier= Modifier, label:String="") {
    var text by remember{mutableStateOf("")}
    OutlinedTextField(value = text, onValueChange = {
        text=it
    }, label={Text(label)},modifier= modifier)



}

@Composable
fun button(modifier: Modifier= Modifier, ) {
    
}
@Preview(showBackground = true)
@Composable
fun textEditPreview() {
    Onerous_BillingTheme {
       textEdit( modifier = Modifier.background(MaterialTheme.colorScheme.background),label = "password")
    }
}