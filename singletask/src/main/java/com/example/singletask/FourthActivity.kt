package com.example.singletask

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.singletask.ui.theme.LaunchModesTheme

class FourthActivity : ComponentActivity() {


    private val TAG: String = this@FourthActivity::class.java.simpleName
    private var mCalledLifeCycleMethods: StringBuilder? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            mCalledLifeCycleMethods = StringBuilder()

            updateLifeCycleMethod("Called onCreate()")

            LaunchModesTheme {

                Column(
                    modifier = Modifier.fillMaxSize(),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(
                        text = "This is Fourth Activity of Single Task Module",
                        modifier = Modifier.padding(16.dp),
                        style = TextStyle(
                            fontFamily = FontFamily.SansSerif, fontSize = 22.sp, color = Color.Black
                        ),
                        textAlign = TextAlign.Center
                    )

                    Button(
                        onClick = {
                            val intent = Intent(this@FourthActivity, SecondActivity::class.java)
                            startActivity(intent)
                        },
                        modifier = Modifier
                            .padding(16.dp)
                            .height(50.dp),
                        colors = ButtonDefaults.buttonColors(Color.Black),
                        shape = RoundedCornerShape(20.dp)
                    ) {
                        Text(
                            text = "Go to Second Activity",
                            style = TextStyle(
                                fontSize = 16.sp,
                                fontFamily = FontFamily.Monospace,
                                color = Color.White,
                            ),
                            textAlign = TextAlign.Center
                        )
                    }

                    Button(
                        onClick = {
                            val intent = Intent(this@FourthActivity, ThirdActivity::class.java)
                            startActivity(intent)
                        },
                        modifier = Modifier
                            .padding(16.dp)
                            .height(50.dp),
                        colors = ButtonDefaults.buttonColors(Color.Black),
                        shape = RoundedCornerShape(20.dp)
                    ) {
                        Text(
                            text = "Go to Third Activity",
                            style = TextStyle(
                                fontSize = 16.sp,
                                fontFamily = FontFamily.Monospace,
                                color = Color.White,
                            ),
                            textAlign = TextAlign.Center
                        )
                    }

                }

            }
        }
    }


    override fun onStart() {
        super.onStart()
        updateLifeCycleMethod("Called onStart()")
    }

    override fun onResume() {
        super.onResume()
        updateLifeCycleMethod("Called onResume()")
    }

    override fun onPause() {
        super.onPause()
        updateLifeCycleMethod("Called onPause()")
    }

    override fun onStop() {
        super.onStop()
        updateLifeCycleMethod("Called onStop()")
    }

    override fun onRestart() {
        super.onRestart()
        updateLifeCycleMethod("Called onRestart()")
    }

    override fun onDestroy() {
        super.onDestroy()
        updateLifeCycleMethod("Called onDestroy()")
    }

    override fun onNewIntent(intent: Intent?) {
        super.onNewIntent(intent)
        updateLifeCycleMethod("Called onNewIntent()")
    }

    private fun updateLifeCycleMethod(methodName: String) {
        mCalledLifeCycleMethods?.append(TAG)?.append(" : ")?.append(methodName)?.append("\n")

        Log.e(TAG, mCalledLifeCycleMethods.toString())
    }

}