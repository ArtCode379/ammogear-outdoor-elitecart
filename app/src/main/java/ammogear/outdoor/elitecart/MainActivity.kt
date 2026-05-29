package ammogear.outdoor.elitecart

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import ammogear.outdoor.elitecart.ui.composable.approot.AppRoot
import ammogear.outdoor.elitecart.ui.theme.ProductAppYPPTTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ProductAppYPPTTheme {
                AppRoot()
            }
        }
    }
}