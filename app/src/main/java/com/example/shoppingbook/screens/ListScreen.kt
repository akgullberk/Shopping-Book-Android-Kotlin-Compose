package com.example.shoppingbook.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.FabPosition
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.example.shoppingbook.model.Item

@Composable
fun ItemList(itemList : List<Item>){
    Scaffold(topBar = {},

        floatingActionButtonPosition = FabPosition.End,
        floatingActionButton ={
            FAB {

            }

        } , content = {innerPadding ->

            LazyColumn(
                contentPadding = innerPadding,
                modifier = Modifier
                    .fillMaxSize()
                    .background(color = MaterialTheme.colorScheme.primaryContainer)
            ) {
                items(itemList){
                    ItemRow(item = it)
                }
            }

        })


}

@Composable
fun ItemRow(item : Item){
    Column(modifier = Modifier
        .fillMaxWidth()
        .background(color = MaterialTheme.colorScheme.primaryContainer)
        .clickable {

        }
    ) {
        Text(text = item.itemName,
            style = MaterialTheme.typography.displayMedium,
            modifier = Modifier.padding(2.dp),
            fontWeight = FontWeight.Bold
        )
    }
}

@Composable
fun FAB(onClick : () -> Unit){
    FloatingActionButton(onClick = onClick) {
        Icon(Icons.Filled.Add,"Floating Button")
    }
}