package com.elginbrian.shopease

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage

@Composable
@Preview
fun ProductWidget(
    product: ProductEntity = ProductList.products[0]
){
    Card(
        modifier = Modifier
            .width(140.dp)
            .height(220.dp),
        colors = CardDefaults.cardColors(Color.White),
        elevation = CardDefaults.cardElevation(10.dp)
    ) {
        Column(
            modifier = Modifier.fillMaxWidth().fillMaxHeight(0.7f)
        ) {
            AsyncImage(model = product.photoURL, contentDescription = product.name ,modifier = Modifier.fillMaxSize(), contentScale = ContentScale.Crop)
        }
        Column(
            modifier = Modifier.fillMaxSize().padding(8.dp)
        ) {
            Text(product.name, fontWeight = FontWeight.SemiBold, maxLines = 1, color = Color.Black)
            Spacer(modifier = Modifier.height(2.dp))
            Text(product.rating.toString() + " Stars", fontSize = 12.sp, color = Color.Black)
        }
    }
}