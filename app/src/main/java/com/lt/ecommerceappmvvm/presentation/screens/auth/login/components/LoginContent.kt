package com.lt.ecommerceappmvvm.presentation.screens.auth.login.components
import android.R.attr.text
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.ColorMatrix
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.lt.ecommerceappmvvm.R
import com.lt.ecommerceappmvvm.presentation.components.DefaulButton
import com.lt.ecommerceappmvvm.presentation.components.DefaulTextField
import com.lt.ecommerceappmvvm.presentation.navigation.screen.AuthScreen

@Composable
fun LoginContent(navController: NavController,paddingValues: androidx.compose.foundation.layout.PaddingValues
) {
   var email by remember {mutableStateOf("")}
    var password by remember {mutableStateOf("")}

    //IMAGEN
    Box(modifier = Modifier.fillMaxSize()) {
        Image(
            modifier = Modifier.fillMaxSize(),
            painter = painterResource(id = R.drawable.chef1),
            contentDescription = "Imagen de fondo",
            contentScale = ContentScale.Crop,
            colorFilter =  ColorFilter.colorMatrix(
                ColorMatrix().apply {
                    setToScale(redScale = 0.5f, greenScale = 0.5f, blueScale = 0.5f, alphaScale = 1f)
                }
            )
        )
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 50.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                modifier = Modifier
                    .height(100.dp)
                    .width(100.dp),
                painter = painterResource(id = R.drawable.logo),
                contentDescription = "Logo",
            )
            Text(
                modifier = Modifier.padding(top = 7.dp),
                text = "ECOMERCE APP",
                fontWeight = FontWeight.Bold,
                color = Color.White,
                fontSize = 20.sp
            )
            Spacer(modifier= Modifier.weight(1f))
            Card( //border redondeados
                modifier = Modifier
                    .fillMaxWidth()
                    .height(330.dp),// tamaño del card ingresa
                shape = RoundedCornerShape(
                    topEnd = 40.dp,
                    topStart = 40.dp
                ),
                colors = CardDefaults.cardColors(
                    containerColor = Color.White.copy(alpha = 0.9f)
                )

            )
            {
                //columna con cajas de textos
                Column(
                    modifier = Modifier.padding(top = 30.dp, end = 15.dp, start = 15.dp),
                ) {
                    Text(modifier = Modifier.padding(bottom = 20.dp),
                        text = "INGRESA",
                        fontWeight = FontWeight.Bold,
                        fontSize = 20.sp,
                        color = Color.Black

                    )
                    /* OutlinedTextField(
                         modifier = Modifier.fillMaxWidth(),
                         value ="" ,
                         onValueChange ={} ,
                         label = {
                             Text(text = "Correo Electronico")
                         },
                         leadingIcon = {
                             Icon(
                                 imageVector = Icons.Default.Email,
                                 contentDescription = "Email Icon",
                                 tint = Blue200,


                                 )

                         },
 //         colors = TextFieldDefaults.colors(
 //             focusedContainerColor = Color.Transparent,
 //             unfocusedContainerColor = Color.Transparent,
 //             disabledContainerColor = Color.Transparent,     )
                     )*/
                    DefaulTextField(
                        modifier = Modifier.fillMaxWidth(),
                        value =email,
                        onValueChange ={text->
                            email  =  text
                        } ,
                        label = "Corre Electronico",
                        icon = Icons.Default.Email,
                        keyboardType = KeyboardType.Email
                    )

                    DefaulTextField(
                        modifier = Modifier.fillMaxWidth(),
                        value =password,
                        onValueChange ={    text->
                            password  =  text

                        } ,
                        label = "Contraseña",
                        icon = Icons.Default.Lock,
                        keyboardType = KeyboardType.Password
                    )

//espacio entre cajas de texto
                    Spacer(modifier = Modifier.height(10.dp))

                    /*  OutlinedTextField(
                          modifier = Modifier.fillMaxWidth(),
                          value ="" ,
                          onValueChange ={} ,
                          label = {
                              Text(text = "Contraseña")
                          },
                          leadingIcon = {
                              Icon(
                                  imageVector = Icons.Default.Lock,
                                  contentDescription = "Email Icon",
                                  tint = Blue200,
                              )
                          },
  //     colors = TextFieldDefaults.colors(
  //         focusedContainerColor = Color.Transparent,
  //         unfocusedContainerColor = Color.Transparent,
  //         disabledContainerColor = Color.Transparent,     )

                      )*/
                    /*   Button(
                           //boton
                           modifier = Modifier.fillMaxWidth()
                               .padding(top = 20.dp, bottom = 10.dp),
                           onClick = {}) {
                           Text(text = "LOGIN")
                       }*/
                    DefaulButton(
                        modifier = Modifier.fillMaxWidth()
                            // .padding(top = 20.dp, bottom = 10.dp),
                            .height(50.dp),
                        text = "LOGIN",
                        onClick = {}
                    )
//espacio entre cajas de texto

                    Spacer(modifier = Modifier.height(10.dp))

                    Row (// horizontal el texto
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(top = 13.dp),

                        horizontalArrangement = Arrangement.Center
                    ) {
                        Text(text = "No tienes una cuenta?")
                        Spacer(modifier = Modifier.width(6.dp))
                        Text(
                            modifier = Modifier.clickable { navController.navigate(route = AuthScreen.Register.route) },
                            text = "Registrate",
                            fontWeight = FontWeight.Bold,
                            color = Color.DarkGray)
                    }
                }

            }
        }
    }
}