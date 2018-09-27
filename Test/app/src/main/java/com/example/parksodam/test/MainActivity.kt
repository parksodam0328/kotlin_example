package com.example.parksodam.test

import android.content.Intent
import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        var editView = findViewById(R.id.editText) as EditText
        button.setOnClickListener {
            val data = editView.text.toString()
            val intent = Intent(Intent.ACTION_DIAL, Uri.parse(data))
            startActivity(intent)
        }
    }
}
