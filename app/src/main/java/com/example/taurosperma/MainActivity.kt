package com.example.taurosperma

import android.content.Context
import android.graphics.fonts.Font
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.taurosperma.ui.theme.TauroSpermaTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TauroSpermaTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {
                    Greeting("Android", this)
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, context: Context? = null) {
    Surface(color = colorResource(id = R.color.trizna), modifier = Modifier.fillMaxSize()) {

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(18.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                color = colorResource(id = R.color.trizna),
                text = "Hello $name!",


            )


            val bybiai = " Hello World "
            Text(
                color = colorResource(id = R.color.purple_500),
                text = bybiai,
                modifier = Modifier.clickable {
                    context?.let {
                        Toast.makeText(context, bybiai, Toast.LENGTH_SHORT).show()

                    }
                }
            )



            Text(text = "Sventezeris $name!")

            val ImageButton = android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:src="@drawable/button_icon"
            android:contentDescription="@string/button_icon_desc"
            >


            Text(

                text = " Justo namas ",
                modifier = Modifier.clickable { context?.let {
                    Toast.makeText(
                        context,
                        "namas",

                        Toast.LENGTH_SHORT
                    ).show() } }


            )

        }
    }
}

@Composable
fun Makarai(textas: String, context: Context? = null) {
    Column {
        Text(text = textas)
        Greeting(name = "Hello", context = context)
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    TauroSpermaTheme {
        Makarai("Masonai")
    }
}