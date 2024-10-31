package com.example.shoppingbook

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.shoppingbook.model.Item
import com.example.shoppingbook.ui.theme.ShoppingBookTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ShoppingBookTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Box(modifier = Modifier.padding(innerPadding)){

                    }
                }
            }
        }
    }
}

@Composable
fun ItemList(itemList : List<String>){
    LazyColumn(modifier = Modifier
        .fillMaxSize()
        .background(color = MaterialTheme.colorScheme.primaryContainer)
    ) {
        items(itemList){
            ItemRow(itemname = it, itemprice = it)
        }
    }
}

@Composable
fun ItemRow(itemname : String, itemprice : String){
    Column(modifier = Modifier
        .fillMaxWidth()
        .background(color = MaterialTheme.colorScheme.primaryContainer)
        .clickable {

        }
    ) {
        Text(text = itemname,
            style = MaterialTheme.typography.displayMedium,
            modifier = Modifier.padding(2.dp),
            fontWeight = FontWeight.Bold
            )
        Text(text = itemprice,
            style = MaterialTheme.typography.displaySmall,
            modifier = Modifier.padding(2.dp),
            fontWeight = FontWeight.Bold
        )
    }
}



@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ShoppingBookTheme {
        ItemList(itemList = listOf("test","test2","test3"))
    }
}