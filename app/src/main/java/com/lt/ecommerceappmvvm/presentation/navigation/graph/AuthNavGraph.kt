import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation
import com.lt.ecommerceappmvvm.presentation.navigation.Graph
import com.lt.ecommerceappmvvm.presentation.navigation.screen.AuthScreen
import com.lt.ecommerceappmvvm.presentation.screens.auth.login.LoginScreen
import com.lt.ecommerceappmvvm.presentation.screens.auth.register.RegisterScreen

fun NavGraphBuilder.AuthNavGraph(navController: NavHostController){
    navigation(
route = Graph.AUTH,
        startDestination = AuthScreen.Login.route
    )
    {
        composable(route = AuthScreen.Login.route) {
            LoginScreen(navController=navController)

            }

        composable(route = AuthScreen.Register.route) {
            RegisterScreen(navController=navController)
        }



    }
}