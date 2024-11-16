package com.elginbrian.shopease

import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableIntState
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import coil.compose.AsyncImage

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
@Preview
fun ProductDetailScreen(
    cartAmount: MutableIntState = mutableIntStateOf(0),
    productId: String = "1",
    navController: NavController = rememberNavController(),
    onClick: () -> Unit = {}
){
    val product = ProductList.products.find { it.id == productId }

    if(product != null){
        Scaffold(
            modifier = Modifier.fillMaxSize().background(Color.White),
            floatingActionButton = {
                Card(
                    modifier = Modifier.size(80.dp),
                    shape = CircleShape,
                    colors = CardDefaults.cardColors(MaterialTheme.colorScheme.primary)
                ){
                    Box(modifier = Modifier.fillMaxSize().clickable {
                        if(cartAmount.value > 0) cartAmount.value -= 1
                    }, contentAlignment = Alignment.Center){
                        Text(cartAmount.value.toString(), fontSize = 24.sp, color = Color.White)
                    }
                }
            }
        ){
            Column(modifier = Modifier.fillMaxSize()){
                Column(
                    modifier = Modifier.fillMaxWidth().fillMaxHeight(0.4f)
                ) {
                    AsyncImage(model = product.photoURL, contentDescription = product.name ,modifier = Modifier.fillMaxSize(), contentScale = ContentScale.Crop)
                }
                Column(
                    modifier = Modifier.fillMaxSize().padding(16.dp)
                ) {
                    Text(product.name, fontWeight = FontWeight.SemiBold, fontSize = 24.sp, color = Color.Black)
                    Spacer(modifier = Modifier.height(4.dp))
                    Text(product.rating.toString() + " Stars", fontSize = 16.sp, color = Color.Black)
                    Spacer(modifier = Modifier.height(12.dp))
                    Text(product.description, fontSize = 16.sp, color = Color.Black, textAlign = TextAlign.Justify)
                    Spacer(modifier = Modifier.height(16.dp))
                    Button(onClick = onClick) {
                        Text("Add to Cart")
                    }
                }
            }
        }
    }
}