package com.myapplicationdev.android.p13_ps

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textView
        buttonAdd
        buttonSub
        buttonMul
        buttonDiv

    }

    var num = ""
    var sign = ""
    var sum = ""

    fun btnOnClick(view : View) {

        val btnS = view as Button

        when (btnS.id) {
            button1.id -> num += "1"
            button2.id -> num += "2"
            button3.id -> num += "3"
            button4.id -> num += "4"
            button5.id -> num += "5"
            button6.id -> num += "6"
            button7.id -> num += "7"
            button8.id -> num += "8"
            button9.id -> num += "9"
            button0.id -> num += "0"
            buttonAC.id -> num += ""
            buttonAdd.id -> sign += "+"
            buttonSub.id -> sign += "-"
            buttonMul.id -> sign += "*"
            buttonDiv.id -> sign += "/"
            buttonDot.id -> num += "."


            buttonEqu.id -> {
                sum += num + sign + num
            }
        }
        textView.text = num

        textView.text = sum
    }


}