package com.example.launchmodes

import android.content.Intent
import android.graphics.Typeface
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarColors
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.launchmodes.ui.theme.LaunchModesTheme
import com.google.accompanist.systemuicontroller.rememberSystemUiController

class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LaunchModesTheme {

                val systemUiColor = rememberSystemUiController()
                val darkTheme = isSystemInDarkTheme()

                SideEffect {
                    systemUiColor.setSystemBarsColor(
                        color = if (darkTheme) Color.Transparent else Color.Black
                    )
                }

                TopAppBar(
                    modifier = Modifier
                        .fillMaxWidth(),
                    colors = TopAppBarDefaults.mediumTopAppBarColors(Color.Black),
                    title = {
                        Text(
                            modifier = Modifier.padding(8.dp),
                            text = "Launch Modes",
                            style = TextStyle(
                                color = Color.White,
                                fontFamily = FontFamily(typeface = Typeface.MONOSPACE),
                                fontSize = 20.sp
                            )
                        )
                    })

                Column(
                    modifier = Modifier.fillMaxSize(),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {

                    Text(
                        text = "Select Your Launch Mode",
                        modifier = Modifier
                            .padding(8.dp)
                            .fillMaxWidth(),
                        style = TextStyle(
                            color = Color.Black,
                            fontFamily = FontFamily.SansSerif,
                            fontSize = 22.sp
                        ),
                        textAlign = TextAlign.Center
                    )

                    Spacer(modifier = Modifier.padding(16.dp))

                    Button(
                        onClick = {
                            val intent = Intent()
                            intent.setClassName(
                                this@MainActivity,
                                "com.example.standard.FirstActivity"
                            )
                            startActivity(intent)
                        },
                        modifier = Modifier
                            .padding(16.dp)
                            .width(200.dp)
                            .height(50.dp),
                        colors = ButtonDefaults.buttonColors(Color.Black),
                        shape = RoundedCornerShape(20.dp)
                    ) {
                        Text(
                            text = "Standard",
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
                            val intent = Intent()
                            intent.setClassName(
                                this@MainActivity,
                                "com.example.singletop.FirstActivity"
                            )
                            startActivity(intent)
                        },
                        modifier = Modifier
                            .padding(16.dp)
                            .width(200.dp)
                            .height(50.dp),
                        colors = ButtonDefaults.buttonColors(Color.Black),
                        shape = RoundedCornerShape(20.dp)
                    ) {
                        Text(
                            text = "Single Top",
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
                            val intent = Intent()
                            intent.setClassName(
                                this@MainActivity,
                                "com.example.singletask.FirstActivity"
                            )
                            startActivity(intent)
                        },
                        modifier = Modifier
                            .padding(16.dp)
                            .width(200.dp)
                            .height(50.dp),
                        colors = ButtonDefaults.buttonColors(Color.Black),
                        shape = RoundedCornerShape(20.dp)
                    ) {
                        Text(
                            text = "Single Task",
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
                            val intent = Intent()
                            intent.setClassName(
                                this@MainActivity,
                                "com.example.singleinstance.FirstActivity"
                            )
                            startActivity(intent)
                        },
                        modifier = Modifier
                            .padding(16.dp)
                            .width(200.dp)
                            .height(50.dp),
                        colors = ButtonDefaults.buttonColors(Color.Black),
                        shape = RoundedCornerShape(20.dp)
                    ) {
                        Text(
                            text = "Single Instance",
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
}