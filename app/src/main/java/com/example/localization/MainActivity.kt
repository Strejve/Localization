package com.example.localization

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var greetingTextView: TextView
    var name = "David"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        greetingTextView = findViewById(R.id.textView2)
    }
    fun buttonPressed(view: View){
        greetingTextView.text = getString(R.string.new_greeting, name)
    }
}

//1. Översätt text i xml
//2. översätt text som finns i kotlin-filer
//3. anpassa bilder