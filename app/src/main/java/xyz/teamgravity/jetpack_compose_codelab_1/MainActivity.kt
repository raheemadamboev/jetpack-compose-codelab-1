package xyz.teamgravity.jetpack_compose_codelab_1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.OutlinedButton
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import xyz.teamgravity.jetpack_compose_codelab_1.ui.theme.Jetpackcomposecodelab1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Jetpackcomposecodelab1Theme {
                MyApp()
            }
        }
    }
}

@Composable
private fun Greeting(name: String) {
    Surface(
        color = MaterialTheme.colors.primary,
        modifier = Modifier.padding(vertical = 4.dp, horizontal = 8.dp)
    ) {
        Row(modifier = Modifier.padding(24.dp)) {
            Column(modifier = Modifier.weight(1f)) {
                Text(text = "Hello,")
                Text(text = name)
            }
            OutlinedButton(onClick = {

            }) {
                Text(text = "Show more")
            }
        }
    }
}

@Composable
private fun MyApp(names: List<String> = listOf("Android", "Compose")) {
    Surface(color = MaterialTheme.colors.background) {
        Column {
            for (name in names) {
                Greeting(name = name)
            }
        }
    }
}