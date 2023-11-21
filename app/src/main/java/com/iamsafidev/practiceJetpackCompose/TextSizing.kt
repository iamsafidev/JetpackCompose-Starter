package com.iamsafidev.practiceJetpackCompose

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun TestSizing() {
    Row(modifier = Modifier.background(Color(0xffcccccc))) {
    /*    Column(
            modifier = Modifier
                .width(200.dp)
                .height(100.dp)
                .background(Color.Blue)
        ) {}*/

        /*Column(
            modifier = Modifier
                .fillMaxWidth(0.75f)
                .height(100.dp)
                .background(Color.Red)
        ) {}*/
        Column(
            modifier = Modifier
                .weight(1f)
                .height(100.dp)
                .background(Color.Red)
        ) {}

    }
}