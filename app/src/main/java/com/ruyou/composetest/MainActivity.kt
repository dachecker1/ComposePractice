package com.ruyou.composetest

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.ruyou.composetest.ui.theme.Custom
import com.ruyou.composetest.ui.theme.ItemRow

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LazyRow(
            modifier = Modifier.fillMaxWidth()
                .background(Custom)) {
                itemsIndexed(
                    listOf<ItemRowModel>(
                        ItemRowModel(imageId = R.drawable.image_1, "Lucy"),
                        ItemRowModel(imageId = R.drawable.image_2, "Linda"),
                        ItemRowModel(imageId = R.drawable.image_3, "Samanta"),
                        ItemRowModel(imageId = R.drawable.image_4, "Nancy"),
                        ItemRowModel(imageId = R.drawable.image_6, "Alex"),
                        ItemRowModel(imageId = R.drawable.image_5, "Amanda")
                    )
                ) { _, item ->
                    ItemRow(item = item)
                }
            }
        }
    }
}



