package com.example.parksodam.hello

import android.content.Intent
import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var naver : Button = findViewById(R.id.button)
        var tel = findViewById(R.id.button2) as Button
        var intent = findViewById(R.id.button3) as Button
        naver.setOnClickListener { // 네이버로 이동
            //var naverIntent = Intent(Intent.ACTION_VIEW,Uri.parse("http://m.naver.com"))
            //startActivity(naverIntent)
            Toast.makeText(applicationContext, "네이버로 이동할 줄 알았지? 뻥이지롱~!", Toast.LENGTH_LONG).show()
        }

        tel.setOnClickListener { // 전화로 입력
            //var telIntent = Intent(Intent.ACTION_VIEW,Uri.parse("tel:010-0000-0000"))
            //startActivity(telIntent)
            Toast.makeText(applicationContext, "전화로 이동할 줄 알았지? 뻥이지롱~!", Toast.LENGTH_LONG).show()
        }

        intent.setOnClickListener { // 새 화면으로 전환
            var newActivityIntent = Intent(this, NewActivity::class.java)
            startActivity(newActivityIntent)
            //Toast.makeText(applicationContext, "전화로 이동할 줄 알았지? 뻥이지롱~!", Toast.LENGTH_LONG).show()
        }
    }
}
