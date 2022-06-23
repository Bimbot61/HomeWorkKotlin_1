package com.example.homeworkkotlin_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val catOne = Cat("Barsik", 3)
        val catTwo = Cat("Pupsik", 2)
        val catThree = catTwo.copy("Tom")
        Log.d("TestOne", catThree.toString())

        Test()
    }

    // 4 задание
    fun onClickStart(view: View) {
        val tvTest = findViewById<TextView>(R.id.textView2)
        tvTest.text = "Привет всем!!!"
    }

    // 5 задание
    data class Cat(val name: String, var age: Int)

    fun Test() {
        val cats = arrayListOf("Barsik", "Pupsik", "Tom")
        for (cat in cats) {
            Log.d("TestOne", cat)
        }
        Log.d("TestOne", "------------------")

        cats.forEach {
            Log.d("TestOne", it)
        }

        repeat(2) {
            Log.d("TestOne", "$cats два раза")
        }


    }


}