package com.springsoft.calculator

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private lateinit var tvNumber : TextView
    private var isStart = true
    private var isNumber = false
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tvNumber = findViewById(R.id.testView)
    }

    fun onNumber(view : View){
        if(isStart) {
            tvNumber.text = (view as Button).text
            isStart = false
            isNumber = true
        }else{
            tvNumber.append((view as Button).text)
            isNumber = true
        }
    }

    fun onCalculator(view: View){
        if(isNumber){
            tvNumber.append((view as Button).text)
            isNumber = false
        }else{
            Toast.makeText(applicationContext, "연속으로 연산자를 쓸 수 없습니다.", Toast.LENGTH_SHORT).show()
        }

    }

    fun onClear(view: View){
        tvNumber.text = ""
    }
}
