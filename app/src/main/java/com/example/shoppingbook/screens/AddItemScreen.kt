package com.example.shoppingbook.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.example.shoppingbook.model.Item

@Composable
fun AddItemScreen(saveFunction : () -> Unit){

    val itemName = remember {
        mutableStateOf(" ")
    }

    val storeName = remember {
        mutableStateOf("")
    }

    val price = remember {
        mutableStateOf("")
    }

    Box(modifier = Modifier
        .fillMaxSize()
        .background(color = MaterialTheme.colorScheme.primaryContainer),
        contentAlignment = Alignment.Center

    ){
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            TextField(value =itemName.value,
                placeholder = {
                    Text("Enter Item Name")

                },
                onValueChange = {
                    itemName.value = it
                },
                colors = TextFieldDefaults.colors(
                    focusedContainerColor = Color.Transparent,
                    unfocusedContainerColor = Color.Transparent,
                    focusedIndicatorColor = Color.Transparent,
                    unfocusedIndicatorColor = Color.Transparent

                )
            )

            TextField(value =storeName.value,
                placeholder = {
                    Text("Enter Store Name")

                },
                onValueChange = {
                    storeName.value = it
                },
                colors = TextFieldDefaults.colors(
                    focusedContainerColor = Color.Transparent,
                    unfocusedContainerColor = Color.Transparent,
                    focusedIndicatorColor = Color.Transparent,
                    unfocusedIndicatorColor = Color.Transparent

                )
            )

            TextField(value =price.value,
                placeholder = {
                    Text("Enter Price")

                },
                onValueChange = {
                    price.value = it
                },
                colors = TextFieldDefaults.colors(
                    focusedContainerColor = Color.Transparent,
                    unfocusedContainerColor = Color.Transparent,
                    focusedIndicatorColor = Color.Transparent,
                    unfocusedIndicatorColor = Color.Transparent

                )
            )

            Button(onClick = {
                val itemToInsert = Item(itemName = itemName.value, storeName = storeName.value, price = price.value, image = ByteArray(1))
                saveFunction()
            }) {
                Text(text = "Save")
            }
        }
    }
}