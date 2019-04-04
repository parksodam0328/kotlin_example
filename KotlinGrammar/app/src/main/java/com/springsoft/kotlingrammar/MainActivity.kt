package com.springsoft.kotlingrammar

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /*
        코틀린은 파이썬과 같이 문장끝에 세미콜론 기호를 붙이지 않는다.

        코틀린의 기본 문법은 다음과 같다.

        //변수 선언
        코틀린에는 2가지 변수 선언 방식이 있음

        1. val : 읽기만 가능 -> java의 const, final
        2. var : 읽기/쓰기 가능 -> 일반적인 변수
        */

        //다음과 같이 변수 선언과 동시에 값을 할당하면 따로 type을 명시하지 않아도 된다.
        //그러나 선언과 동시에 값을 할당하지 않으면 반드시 type을 명시한다.
        val a = 1 // 수정 불가
        var b = 1 // 수정 가능

        /*

        //함수 정의
        자바에서 함수를 선언할 때는
        [접근제한자] 반환형 함수이름(매개변수타입 매개변수이름, ...){
            return 반환값;
        }

        코틀린에서 함수를 선언할 때는
        fun 함수이름(매개변수이름 : 매개변수타입, ...) : 반환타입{
            return 반환값
        }
         */
        fun add(addNum:Int): Int {
            return (b+addNum)
        }

        println(add(3))

        /*
        //문자열 형식 지정
       코틀린은 문자열 템플릿을 지원



        */
    }
}
