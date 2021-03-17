package com.example.servicescomponent

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val serviceClass = ServiceClass()
        val statButton:Button = findViewById(R.id.startBtn)
        val stopButton:Button = findViewById(R.id.stopBtn)

        statButton.setOnClickListener{
            fun onClick(v: View?) {
                serviceClass.onCreate()
            }

        }

        stopButton.setOnClickListener{
            fun onClick(view: View) {
                serviceClass.onDestroy()
            }
        }
    }
}