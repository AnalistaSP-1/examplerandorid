package com.lt.ecommerceappmvvm.presentation.navigation.graph

import AuthNavGraph
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import com.lt.ecommerceappmvvm.presentation.navigation.Graph

@Composable
fun RootNavGraph(navController: NavHostController){
    NavHost(
        navController = navController,
        route = Graph.ROOT,
        startDestination = Graph.AUTH,
    ){
AuthNavGraph(navController = navController)
    }
}