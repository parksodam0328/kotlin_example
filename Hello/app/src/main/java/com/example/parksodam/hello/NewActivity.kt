package com.example.parksodam.hello

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import android.widget.Toast

class NewActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new)
        var back = R.id.button4 as Button
        back.setOnClickListener{
            Toast.makeText(applicationContext, "돌아가기",Toast.LENGTH_LONG).show();
            finish()
        }
    }
}
