package com.example.taskmanager2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.taskmanager2.ui.theme.TaskManager2Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TaskManager2Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    TaskManagerApp()
                }
            }
        }
    }
}

@Composable
fun TaskManagerApp(){
    TaskManagerInfo(image = painterResource(id = R.drawable.ic_task_completed), note1 = "All tasks completed", note2 ="Nice work!" )
}
@Composable
fun TaskManagerInfo(image: Painter, note1: String, note2: String) {
Column {
    Image(painter = image, contentDescription = "logo" )
    Text(text = note1)
    Text(text = note2)
}

}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    TaskManager2Theme {
       TaskManagerApp()
    }
}