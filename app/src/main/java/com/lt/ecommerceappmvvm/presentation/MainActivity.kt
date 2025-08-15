package com.lt.ecommerceappmvvm.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold

import androidx.compose.ui.Modifier

import com.lt.ecommerceappmvvm.ui.theme.KotrilEcommerceMVVMTheme

import androidx.compose.material3.Surface
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.lt.ecommerceappmvvm.presentation.navigation.graph.RootNavGraph

class MainActivity : ComponentActivity() {

    private lateinit var navController: NavHostController


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       // enableEdgeToEdge()
        setContent {
            KotrilEcommerceMVVMTheme(dynamicColor = false)  {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Surface (
                       modifier = Modifier.fillMaxSize()
                           .padding(innerPadding),
                       color = MaterialTheme.colorScheme.background
                    ){
                        navController = rememberNavController()
                        RootNavGraph(navController = navController)
                    }

                }
            }
        }
    }
}


