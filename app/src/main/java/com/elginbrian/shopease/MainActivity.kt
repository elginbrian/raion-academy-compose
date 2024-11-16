package com.elginbrian.shopease

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.elginbrian.shopease.ui.theme.ShopEaseTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ShopEaseTheme {
                val navController = rememberNavController()
                val cartAmount = remember { mutableIntStateOf(0) }

                NavHost(navController = navController, startDestination = "product_list"){
                    composable("product_list"){
                        ProductListScreen(
                            cartAmount = cartAmount,
                            navController = navController
                        )
                    }
                    composable("product_detail/{productId}"){
                        val productId = it.arguments?.getString("productId")
                        ProductDetailScreen(
                            productId = productId.toString(),
                            cartAmount = cartAmount,
                            navController = navController
                        ){
                            cartAmount.value += 1
                        }
                    }
                }
            }
        }
    }
}
