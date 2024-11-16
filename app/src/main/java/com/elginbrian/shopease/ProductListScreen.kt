package com.elginbrian.shopease

import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.GridItemSpan
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableIntState
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
@Preview
fun ProductListScreen(
    cartAmount: MutableIntState = mutableIntStateOf(0),
    navController: NavController = rememberNavController()
) {
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
        LazyVerticalGrid(
            modifier = Modifier
                .fillMaxSize()
                .padding(horizontal = 16.dp),
            columns = GridCells.Fixed(2),
            verticalArrangement = Arrangement.spacedBy(16.dp),
            horizontalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            item(span = { GridItemSpan(2) }) {
                Spacer(modifier = Modifier.height(24.dp))
            }
            items(ProductList.products.size) { index ->
                ProductWidget(product = ProductList.products[index]){
                    navController.navigate("product_detail/${it.id}")
                }
            }
            item(span = { GridItemSpan(2) }) {
                Spacer(modifier = Modifier.height(64.dp))
            }
        }
    }
}
