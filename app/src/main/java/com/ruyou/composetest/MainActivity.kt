package com.ruyou.composetest

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.ui.Modifier
import com.ruyou.composetest.ui.theme.Custom
import com.ruyou.composetest.ui.theme.ItemRow

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LazyColumn(
            modifier = Modifier.fillMaxWidth()
                .background(Custom)) {
                itemsIndexed(
                    listOf<ItemRowModel>(
                        ItemRowModel(imageId = R.drawable.image_1, "Lucy", "Фитоняшки — это девушки, следящие за своей фигурой и активно занимающиеся фитнесом. Само слово \"фитоняшка\", образованное от слияния двух слов \"фитнес\" и \"няшка\" (милашка), появилось в речи несколько лет назад"),
                        ItemRowModel(imageId = R.drawable.image_2, "Linda", "desc"),
                        ItemRowModel(imageId = R.drawable.image_3, "Samanta", "desc"),
                        ItemRowModel(imageId = R.drawable.image_4, "Nancy", "desc"),
                        ItemRowModel(imageId = R.drawable.image_6, "Alex", "desc"),
                        ItemRowModel(imageId = R.drawable.image_5, "Amanda", "desc")
                    )
                ) { _, item ->
                    ItemRow(item = item)
                }
            }
        }
    }
}



