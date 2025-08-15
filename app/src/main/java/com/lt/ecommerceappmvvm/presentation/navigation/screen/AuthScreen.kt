package com.lt.ecommerceappmvvm.presentation.navigation.screen

open class AuthScreen (val route:String){
object  Login:AuthScreen(route = "/login")
    object Register:AuthScreen(route = "/register")}
