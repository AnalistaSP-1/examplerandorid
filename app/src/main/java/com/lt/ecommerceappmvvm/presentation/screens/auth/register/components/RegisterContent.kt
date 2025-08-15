package com.lt.ecommerceappmvvm.presentation.screens.auth.register.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.MailOutline
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.outlined.Person
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.lt.ecommerceappmvvm.R
import com.lt.ecommerceappmvvm.presentation.components.DefaulButton
import com.lt.ecommerceappmvvm.presentation.components.DefaulTextField

@Composable
fun RegisterContent(paddingValues:PaddingValues) {
Box(modifier =Modifier
    .padding(paddingValues =paddingValues)
    .fillMaxSize()

)
    Image(
       modifier = Modifier.fillMaxSize(),
       painter = painterResource(id = R.drawable.woman_9),
       contentDescription = "",
contentScale = ContentScale.Crop,
      /*
       colorFilter = ColorFilter.colorMatrix(
           ColorMatrix().apply {
               setToScale(redScale = 0.5f, greenScale = 0.5f, blueScale = 0.5f, alphaScale = 1f)
}
       )
       */



)

    Column (
    modifier = Modifier
        .fillMaxWidth()
        .padding(top = 80.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ){

        Image(
            modifier = Modifier
                .height(100.dp)
                .aspectRatio(1f), // mantiene relación
            painter = painterResource(id = R.drawable.user_image),
            contentDescription = "",
            contentScale = ContentScale.Crop // o Fit si quieres bordes

        )

        Spacer(modifier = Modifier.height(10.dp))

        Text(
            text = "Information",
            fontWeight = FontWeight.Bold,
            fontSize = 19.sp ,
            color = Color.White
        )
        Spacer(modifier = Modifier.height(10.dp))

        Card(
            modifier = Modifier.fillMaxSize(),
            shape = RoundedCornerShape(
                topStart = 40.dp,
                topEnd = 40.dp
            ),
            colors = CardDefaults.cardColors(
                containerColor = Color.White.copy(alpha = 0.6f ) // Cambia el color de fondo a rojo
            )


            ){
            Column(
                modifier = Modifier.padding(top = 30.dp, start = 30.dp, end = 30.dp),

            ) {

                Text(

                    modifier = Modifier.padding(top = 30.dp),
                    text = "Registrarse",
                    fontWeight = FontWeight.Bold,
                    fontSize = 20.sp,
                    color = Color.Black
                )
                Spacer(modifier = Modifier.height(20.dp))


                DefaulTextField(
                    modifier = Modifier.fillMaxWidth(),
                    value = "",
                    onValueChange = {},
                    label = "Nombre",
                    icon = Icons.Default.Person,
                )
                DefaulTextField(
                    modifier = Modifier.fillMaxWidth(),
                    value = "",
                    onValueChange = {},
                    label = "Apellidos",
                    icon = Icons.Outlined.Person,
                )
                DefaulTextField(
                    modifier = Modifier.fillMaxWidth(),
                    value = "",
                    onValueChange = {},
                    label = "Correo",
                    icon = Icons.Default.MailOutline,
                    keyboardType = KeyboardType.Email
                )
                DefaulTextField(
                    modifier = Modifier.fillMaxWidth(),
                    value = "",
                    onValueChange = {},
                    label = "Telefono",
                    icon = Icons.Default.Call,
                    keyboardType = KeyboardType.Number

                )
                DefaulTextField(
                    modifier = Modifier.fillMaxWidth(),
                    value = "",
                    onValueChange = {},
                    label = "Contraseña",
                    icon = Icons.Default.Lock,
                    keyboardType = KeyboardType.Password

                )
                DefaulTextField(
                    modifier = Modifier.fillMaxWidth(),
                    value = "",
                    onValueChange = {},
                    label = "Confirmar Contraseña",
                    icon = Icons.Default.Lock,
                    keyboardType = KeyboardType.Password

                )

                Spacer(modifier = Modifier.height(20.dp))
                DefaulButton(
                    modifier = Modifier.fillMaxWidth()
                        // .padding(top = 20.dp, bottom = 10.dp),
                        .height(50.dp),
                    text = "confirm",
                    onClick = {}
                )

            }


        }
    }

}



