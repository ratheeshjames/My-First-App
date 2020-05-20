package com.example.myfirstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.AlarmClock.EXTRA_MESSAGE
import android.widget.TextView

class DisplayMessageActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display_message)
        val message1 = intent.getStringExtra("MESSAGE_1")
        val message2 = intent.getStringExtra("MESSAGE_2")
        val textView = findViewById<TextView>(R.id.textView)
        textView.apply { text = message1 }
        val textView2 = findViewById<TextView>(R.id.textView2)
        textView2.apply { text = message2 }


    }
}
