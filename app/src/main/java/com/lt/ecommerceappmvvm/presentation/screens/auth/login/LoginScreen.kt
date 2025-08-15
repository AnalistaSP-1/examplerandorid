package com.lt.ecommerceappmvvm.presentation.screens.auth.login

import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import com.lt.ecommerceappmvvm.presentation.screens.auth.login.components.LoginContent

@Composable
fun LoginScreen(navController : NavHostController){

    Scaffold() { paddingValues ->

LoginContent(navController = navController, paddingValues)
    }
}

@Preview (showBackground = true , showSystemUi = true)
@Composable
fun LoginScreenPreview(){
    LoginScreen(navController = NavHostController(LocalContext.current))

}