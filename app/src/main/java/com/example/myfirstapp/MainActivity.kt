package com.example.myfirstapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.AlarmClock.EXTRA_MESSAGE
import android.view.View
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun sendMessage(view: View){
        val editText = findViewById<EditText>(R.id.editText)
        val editText2 = findViewById<EditText>(R.id.editText2)
        val message1 = editText.text.toString()
        val message2 = editText2.text.toString()
        val intent = Intent(this, DisplayMessageActivity::class.java)
        intent.apply {
            putExtra("MESSAGE_1", message1)
            putExtra("MESSAGE_2", message2)
        }
        startActivity(intent)
    }

}
