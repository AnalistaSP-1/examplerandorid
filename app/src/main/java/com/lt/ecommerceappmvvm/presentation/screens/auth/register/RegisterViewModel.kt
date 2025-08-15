package com.lt.ecommerceappmvvm.presentation.screens.auth.register
import android.util.Patterns
import  androidx.compose.runtime.*
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class RegisterViewModel @Inject constructor(): ViewModel(){
    var state by mutableStateOf(RegisterState())
    var errorMessage by mutableStateOf(value = "")
        private set
    fun onNameInput(input: String){
        state = state.copy(name = input)
    }
    fun onLastNameInput(input: String){
        state = state.copy(lastName = input)
    }
    fun onEmailInput(input: String){
        state = state.copy(email = input)
    }
    fun onPhoneInput(input: String){
        state = state.copy(phone = input)

    }
    fun onPasswordInput(input: String){

        state = state.copy(password = input)
    }
    fun onConfirmPasswordInput(input: String){
        state = state.copy(confirmPassword = input)
    }
    fun validateForm() = viewModelScope.launch {

        if (state.name == "") {
            errorMessage = "Ingrese  nombre  "

        }
        else if (state.lastName == "") {
            errorMessage = "Ingrese  Apellidos  "

        }

        else if (state.email == "") {
            errorMessage = "Ingrese correo  "

        }     else if (state.phone == "") {
            errorMessage = "Ingrese numero  "

        }
        else if (state.password == "") {
            errorMessage = "Ingrese Contraseña  "

        }
        else if (state.confirmPassword == "") {
            errorMessage = "Confirmar Contraseña  "

        }
        else if (!Patterns.EMAIL_ADDRESS.matcher(state.email).matches()){
            errorMessage = "El email no es valido "
        }  else if(state.password.length < 6){
            errorMessage = "La contraseña debe tener al menos 6 caracteres"
        }else if(state.password != state.confirmPassword){
            errorMessage = "La contraseña no coinciden"
        }
        delay( timeMillis = 3000)
        errorMessage=""
    }

}