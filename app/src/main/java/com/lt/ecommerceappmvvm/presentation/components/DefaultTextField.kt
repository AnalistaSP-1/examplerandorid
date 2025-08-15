package com.lt.ecommerceappmvvm.presentation.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import com.lt.ecommerceappmvvm.ui.theme.Blue200

@Composable
fun DefaulTextField(
    //modifier: Modifier,
    modifier: Modifier,
    value: String,
    onValueChange: (values:String) -> Unit,
    label:String,
    icon:ImageVector,
    keyboardType: KeyboardType = KeyboardType.Text,
    hideText:Boolean = false
){
    OutlinedTextField(
        modifier = Modifier.fillMaxWidth(),
        value =value ,
        onValueChange ={text ->onValueChange(text)} ,
        label = {
            Text(text = label)
        },
        leadingIcon = {
            Icon(
                imageVector = icon,
                contentDescription = "",
                tint = Blue200,

                )

        },

        keyboardOptions = KeyboardOptions(keyboardType = keyboardType),
        visualTransformation = if (hideText) PasswordVisualTransformation() else
            androidx.compose.ui.text.input.VisualTransformation.None,

//         colors = TextFieldDefaults.colors(
//             focusedContainerColor = Color.Transparent,
//             unfocusedContainerColor = Color.Transparent,
//             disabledContainerColor = Color.Transparent,     )
    )


}