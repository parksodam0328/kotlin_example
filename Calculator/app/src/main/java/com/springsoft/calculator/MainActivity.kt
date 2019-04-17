package com.springsoft.calculator

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast


/* 계산이 제대로 안이뤄짐! 추후 수정 디버깅 예정 */
class MainActivity : AppCompatActivity() {
    private lateinit var tvNumber: TextView
    private var isFirst = true

    private var firstNumber: Int = 0
    private var secondNumber: Int = 0

    private var result: Int? = null

    private var operator: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tvNumber = findViewById(R.id.testView)
    }

    fun onCalculator(view: View) {
        operator = (view as Button).text.toString()
        tvNumber.append((view as Button).text)
    }

    fun onNumber(view: View) {
        if (isFirst) {
            tvNumber.append((view as Button).text)
            firstNumber = ((view as Button).text).toString().toInt()
            isFirst = false
        } else {
            tvNumber.append((view as Button).text)
            secondNumber = ((view as Button).text).toString().toInt()
            isFirst = true
        }
    }

    fun onResult(view: View) {
        when (operator) {
            "+" -> {
                result = firstNumber + secondNumber
                tvNumber.append((view as Button).text)
            }
            "-" -> {
                result = firstNumber - secondNumber
                tvNumber.append((view as Button).text)
            }
            "/" -> {
                if (firstNumber != 0 && secondNumber != 0) {
                    result = firstNumber / secondNumber
                    tvNumber.append((view as Button).text)
                } else {
                    Toast.makeText(applicationContext, "나누기 error", Toast.LENGTH_SHORT).show()
                }
            }
            else -> {
                result = firstNumber * secondNumber
                tvNumber.append((view as Button).text)
            }
        }
        tvNumber.text = result.toString()
    }

    fun onClear(view: View) {
        tvNumber.text = ""
        firstNumber = 0
        secondNumber = 0
    }
}
