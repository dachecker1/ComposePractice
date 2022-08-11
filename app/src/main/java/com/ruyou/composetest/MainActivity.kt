package com.ruyou.composetest

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.gestures.detectDragGesturesAfterLongPress
import androidx.compose.foundation.gestures.detectHorizontalDragGestures
import androidx.compose.foundation.gestures.detectTapGestures
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.material.rememberDrawerState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Column(modifier = Modifier.verticalScroll(rememberScrollState())) {
                ListItem(name = "naasdfasdfme", prof = "prof")
                ListItem(name = "naasdfasdfme", prof = "prof")
                ListItem(name = "naasdfasdfme", prof = "prof")
                ListItem(name = "naasdfasdfme", prof = "prof")
                ListItem(name = "naasdfasdfme", prof = "prof")
                ListItem(name = "naasdfasdfme", prof = "prof")
                ListItem(name = "naasdfasdfme", prof = "prof")
                ListItem(name = "naasdfasdfme", prof = "prof")
                ListItem(name = "naasdfasdfme", prof = "prof")
                ListItem(name = "naasdfasdfme", prof = "prof")
                ListItem(name = "naasdfasdfme", prof = "prof")
                ListItem(name = "naasdfasdfme", prof = "prof")
            }

        }
    }
}

@Composable
private fun ListItem(name: String, prof: String) {
    Card(modifier = Modifier
        .fillMaxWidth()
        .padding(10.dp)
        .clickable {

        }
        .pointerInput(Unit) {
            detectHorizontalDragGestures { change, dragAmount ->
                Log.d("MyTag", "click $dragAmount")
            }
        },
        shape = RoundedCornerShape(15.dp),
        elevation = 10.dp
    ) {
        Box() {
            Row(verticalAlignment = Alignment.CenterVertically) {
                Image(
                    painter = painterResource(id = R.drawable.image),
                    contentDescription = "image",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .size(64.dp)
                        .clip(shape = CircleShape)
                        .padding(5.dp)
                )
                Column(modifier = Modifier.padding(start = 16.dp)) {
                    Text(text = name)
                    Text(text = prof)
                }

            }
        }
    }
}


