package com.lt.ecommerceappmvvm.presentation.components

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController // <--- CAMBIO AQUÍ (o asegúrate de que esté la importación general)

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DefaulTopBar(
    title: String,
    upAvailable: Boolean = false,
    navController: NavController? = null // <--- CAMBIO AQUÍ de NavHostController? a NavController?
) {
    TopAppBar(
        title = {
            Text(
                text = title,
                fontSize = 19.sp
            )
        },
        colors = TopAppBarDefaults.topAppBarColors(
            containerColor = Color.White,
            titleContentColor = Color.Black,
            navigationIconContentColor = Color.Black // El tint en el Icon de abajo anulará esto si son diferentes
        ),
        navigationIcon = {
            if (upAvailable) { // No necesitas && navController != null aquí si usas ?. más abajo
                IconButton(onClick = {
                    // Log opcional si lo necesitas para depurar
                    // android.util.Log.d("DefaulTopBar", "Botón Atrás presionado")
                    navController?.popBackStack() // Llamada segura, si navController es null, no hace nada
                }) {
                    Icon(
                        imageVector = Icons.Filled.ArrowBack,
                        contentDescription = "Volver atrás", // Es mejor tener una descripción de contenido real
                        tint = Color.Black // Si navigationIconContentColor y este tint son iguales, uno es redundante
                    )
                }
            }
        }
    )
}
