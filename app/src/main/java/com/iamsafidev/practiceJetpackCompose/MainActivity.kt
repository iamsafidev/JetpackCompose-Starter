package com.iamsafidev.practiceJetpackCompose

import android.os.Bundle
import android.view.View
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.iamsafidev.practiceJetpackCompose.ui.theme.MyApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApplicationTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    MainContainer()
                }
            }
        }
    }
}

@Composable
fun  MainContainer() {
    Column(
        modifier = Modifier
            .background(Color.Gray)
            .padding(20.dp, 10.dp, 20.dp, 10.dp),
        verticalArrangement = Arrangement.SpaceAround,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        FirstRow()
        ColorBar(0xffffff00)
        ColorBar(0xffffaa00)
        ColorBar(0xffff00ff)
        BoxView()
    }
}

@Composable
fun BoxView() {
    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier
            .fillMaxWidth()
            .background(Color(0xff0055ff))
            .height(200.dp)
            .padding(20.dp)
    ) {
        Row(
            modifier = Modifier
                .background(Color(0xff0099ff))
                .fillMaxWidth()
                .height(200.dp)
                .padding(20.dp)
        ) {
            Box(contentAlignment = Alignment.Center) {
                Row(
                    modifier = Modifier
                        .background(Color(0xff00ccff))
                        .fillMaxWidth()
                        .height(200.dp)
                ) {

                }
            }

        }
    }
}

@Composable
fun ColorBar(colorCode: Long) {
    Column(
        modifier = Modifier
            .background(Color(colorCode))
            .fillMaxWidth()
            .height(50.dp)
    ) {

    }
}

@Composable
fun FirstRow() {
    Row(horizontalArrangement = Arrangement.SpaceBetween, modifier = Modifier.fillMaxWidth()) {
        Row(
            modifier = Modifier
                .background(Color(0xffff0000))
                .width(100.dp)
                .height(50.dp)
        ) {

        }

        Row(
            modifier = Modifier
                .background(Color(0xff00ff00))
                .width(100.dp)
                .height(50.dp)
        ) {

        }
        Row(
            modifier = Modifier
                .background(Color(0xff0000ff))
                .width(100.dp)
                .height(50.dp)
        ) {

        }


    }
}
