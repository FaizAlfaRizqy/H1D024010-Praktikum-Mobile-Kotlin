package com.pemmob.faizalfarizqy

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.pemmob.faizalfarizqy.ui.screen.DaftarProductScreen
import com.pemmob.faizalfarizqy.ui.theme.MyApplicationTheme

class HomeActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyApplicationTheme {
                DaftarProductScreen()
                }
            }
        }
    }