package com.lt.ecommerceappmvvm.presentation.screens.auth.register

// import android.R; // Esta importación no es necesaria aquí y podría ser un error si no la usas.
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack // O considera Icons.AutoMirrored.Filled.ArrowBack
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton // Asegúrate de que esta importación esté
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults // Asegúrate de que esta importación esté
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.lt.ecommerceappmvvm.presentation.components.DefaulTopBar
import com.lt.ecommerceappmvvm.presentation.screens.auth.register.components.RegisterContent

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun RegisterScreen(navController: NavController) {
    Scaffold(
        topBar = {
            DefaulTopBar(
                title = "Register",
                upAvailable = true,
                navController=navController
            )

        }
    ) { paddingValues ->
        RegisterContent(paddingValues = paddingValues)
    }
}