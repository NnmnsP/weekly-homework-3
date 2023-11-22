package com.example.myapp01

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class ExampleActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Column(modifier = Modifier.fillMaxWidth()) {
                    TopAppBar(title = { Text(stringResource(id = R.string.example)) })
                    Example()
                }
            }
        }
    }
}