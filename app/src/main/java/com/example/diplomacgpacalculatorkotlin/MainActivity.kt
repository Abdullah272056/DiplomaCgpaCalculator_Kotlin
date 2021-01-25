package com.example.diplomacgpacalculatorkotlin

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //button finding
        val calculateBtn = findViewById<Button>(R.id.calculateButtonId)
        val  resetBtn = findViewById<Button>(R.id.resetButtonId)
        //layout finding
        val mainLinearLayout = findViewById<LinearLayout>(R.id.mainLayoutId)
        //textViewFinding
        val result = findViewById<TextView>(R.id.resultTextViewId)
        //editText finding
        val first = findViewById<EditText>(R.id.firstSemesterEditTextId);
        val second = findViewById<EditText>(R.id.secondSemesterEditTextId)
        val three = findViewById<EditText>(R.id.thirdSemesterEditTextId)
        val four = findViewById<EditText>(R.id.fourthSemesterEditTextId)
        val five = findViewById<EditText>(R.id.fifthSemesterEditTextId)
        val six = findViewById<EditText>(R.id.sixthSemesterEditTextId)
        val seven = findViewById<EditText>(R.id.seventhSemesterEditTextId)
        val eight = findViewById<EditText>(R.id.eighthSemesterEditTextId)

        calculateBtn.setOnClickListener {
            val string_first = first.text.toString()
            val string_second = second.text.toString()
            val string_three = three.text.toString()
            val string_four = four.text.toString()
            val  string_five = five.text.toString()
            val string_six = six.text.toString()
            val string_seven = seven.text.toString()
            val string_eight = eight.text.toString()



        }



    }
}