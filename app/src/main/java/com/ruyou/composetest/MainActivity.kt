package com.ruyou.composetest

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Row(
                modifier = Modifier
                    .background(Color.Gray)
                    .fillMaxWidth()
                    .fillMaxHeight(0.5F)
            ) {
                Column(
                    modifier = Modifier
                        .background(Color.LightGray)
                        .fillMaxWidth(0.5F)
                        .fillMaxHeight(),
                    verticalArrangement = Arrangement.SpaceEvenly,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(text = "hello!")
                    Text(text = "Vena")
                    Text(text = "Madrid")
                }
                Column(
                    modifier = Modifier
                        .background(Color.Green)
                        .fillMaxHeight(0.4F)
                        .fillMaxWidth(),
                    verticalArrangement = Arrangement.SpaceEvenly,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(text = "123!")
                    Text(text = "456")
                    Text(text = "789")
                }
            }
        }
    }
}


