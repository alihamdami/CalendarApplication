package com.example.calendarapplication

import android.graphics.Color
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color.Companion.Blue
import androidx.compose.ui.graphics.Color.Companion.Red
import androidx.compose.ui.graphics.Color.Companion.White
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.calendarapplication.ui.theme.CalendarApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CalendarApplicationTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Box(modifier = Modifier
        .fillMaxSize()
    ){
        // tab bar
        Column(modifier = Modifier
            .padding(25.dp)
            .fillMaxWidth()
            .background(color = Blue)
            .align(alignment = Alignment.TopCenter)
        ){
            Text(text = "Hello, ", color = White)
            Text(text = name, color = White)
        }
        // calendar view
        // the items of each day
        Column(modifier = Modifier
            .fillMaxHeight()
        ) {
            Box(modifier = Modifier.background(color = Black) .align(alignment = Alignment.Center)){
                Box(modifier = Modifier.background(color = White) .size(200.dp))
                // padding 10dp
                Box(modifier = Modifier.background(color = White) .size(200.dp))
                Box(modifier = Modifier.background(color = White) .size(200.dp))
                // ...
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    CalendarApplicationTheme {
        Greeting("Android")
    }
}
