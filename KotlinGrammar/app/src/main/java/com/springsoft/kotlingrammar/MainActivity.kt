package com.springsoft.kotlingrammar

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    private var text : String = "Hello!"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /*
        코틀린은 파이썬과 같이 문장끝에 세미콜론 기호를 붙이지 않는다.

        코틀린의 기본 문법은 다음과 같다.

        //#변수 선언
        코틀린에는 2가지 변수 선언 방식이 있음

        1. val : 읽기만 가능 -> java의 const, final
        2. var : 읽기/쓰기 가능 -> 일반적인 변수
        */

        //다음과 같이 변수 선언과 동시에 값을 할당하면 따로 type을 명시하지 않아도 된다.
        //그러나 선언과 동시에 값을 할당하지 않으면 반드시 type을 명시한다.
        val a = 1 // 수정 불가
        var b = 1 // 수정 가능

        /*

        //#함수 정의
        자바로 함수를 선언할 때는
        [접근제한자] 반환형 함수이름(매개변수타입 매개변수이름, ...){
            return 반환값;
        }

        코틀린으로 함수를 선언할 때는
        fun 함수이름(매개변수이름 : 매개변수타입, ...) : 반환타입{
            return 반환값
        }
         */
        fun add(addNum:Int): Int {
            return (b+addNum)
        }

        println(add(3))

        //#문자열 형식 지정
        //자바
        println("사과 "+a+" 개")

        //코틀린
        println("사과 $a 개")

        /*

        //#배열 선언

        코틀린으로 배열을 생성하는 방법은 2가지가 있다.

        1. 라이브러리 함수 이용

        2. Array 클래스 이용

        다음 각 각 예제를 참고
         */

        // 라이브러리 함수 이용
        val arrNumber = arrayOf(1,2,3) // -> 따로 타입 지정 X, value 값을 보고 타입유추 가능하기 때문

        //배열 선언과 동시에 초기화 할 경우 arrayOf(value) 함수 이용,

        for(i in 0 until arrNumber.size)
        {
            println(arrNumber[i])
        }

        // 생성자 이용
        val arrNumber2 = Array(5,  {k -> k})

        for(k in 0 until arrNumber2.size)
        {
            println(arrNumber2[k])
        }

        /*
        Null Safety - 코틀린은 NullPointerException(NPE) 발생 빈도를 줄이기 위해 기본적으로 null이 허용되지 않는다.
        따라서 null 허용을 할 수 있도록 명시적으로 표시해야한다.(?)

        ※ 참고
        코틀린은 변수 선언과 동시에 초기화가 이뤄져야한다
       !
        */

        //var test : Int = 10 -> error
        var test : Int? = 10

        test = null

        /*
        클래스 선언

        자바로 클래스를 선언할 때에는

        [접근제한자] class 클래스명 {
        [접근제한자] 타입 변수명;
        }

        코틀린으로 클래스를 선언할 때에는

        [접근제한자] class 클래스명 {
            [접근제한자] var 변수명 : 타입 = 초기값
        }

        자바와 다르게 코틀린은 주생성자는 생략 가능하다. 코틀린은 변수 선언 시 자동으로 set/get을 생성해준다.
        */

        class Test(val name : String, val gender : String, val age : Int) // 클래스 선언과 동시에 주생성자 선언

        //부생성자
         //constructor(name : String, gender : String) : this(name, gender, 20) -> constructor 생략 x


    }
}
