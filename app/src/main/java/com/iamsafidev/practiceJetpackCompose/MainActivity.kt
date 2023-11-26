package com.iamsafidev.practiceJetpackCompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
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
fun MainContainer() {
    Column(
        horizontalAlignment = Alignment.Start,
        modifier = Modifier
            .fillMaxWidth()
            .padding(10.dp)
    ) {
        ProfileImageAndStats()
        Spacer(modifier = Modifier.height(15.dp))
        ProfileDetails()
        Spacer(modifier = Modifier.height(15.dp))
        Button(   modifier = Modifier.fillMaxWidth(),
            colors = ButtonDefaults.buttonColors(containerColor = Color.LightGray),
            shape = RoundedCornerShape(8.dp),
            onClick = { /*TODO*/ }) {
                BoldText(
                    text = stringResource(id = R.string.edit_profile),
                    modifier = Modifier.fillMaxWidth().padding(8.dp)
                )
        }
    }
}

@Composable
fun ProfileDetails() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 5.dp),
        verticalArrangement = Arrangement.SpaceEvenly
    ) {
        BoldText(text = stringResource(id = R.string.person_name))
        Text(text = stringResource(id = R.string.person_hobbie1))
        Text(text = stringResource(id = R.string.person_hobbie2))
        Text(text = stringResource(id = R.string.person_hobbie3))

    }
}


@Composable
fun ProfileImageAndStats() {
    Row(
        horizontalArrangement = Arrangement.SpaceBetween,
        modifier = Modifier
            .fillMaxWidth()
    ) {
        Image(
            painter = painterResource(id = R.drawable.profile_pic),
            modifier = Modifier
                .size(100.dp)
                .clip(CircleShape),
            contentScale = ContentScale.Fit,
            contentDescription = null
        )

        StatsCounter(120, "Posts")
        StatsCounter(1234, "Followers")
        StatsCounter(567, "Following")
    }
}

@Composable
fun StatsCounter(statsCount: Int = 26, statsText: String = "Posts") {
    Column(
        modifier = Modifier.padding(top = 20.dp),
        verticalArrangement = Arrangement.SpaceEvenly,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        BoldText(statsCount.toString())
        Text(text = statsText, color = Color.Black)
    }
}

@Composable
private fun BoldText(text: String, modifier: Modifier = Modifier) {
    Text(text = text, fontWeight = FontWeight.Bold, color = Color.Black, modifier = Modifier)
}
