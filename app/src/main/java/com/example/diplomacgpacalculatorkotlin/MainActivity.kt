package com.example.diplomacgpacalculatorkotlin

import android.annotation.SuppressLint
import android.os.Bundle
import android.text.TextUtils
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    @SuppressLint("SetTextI18n")
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

        calculateBtn.setOnClickListener() {
            val string_first = first.text.toString()
            val string_second = second.text.toString()
            val string_three = three.text.toString()
            val string_four = four.text.toString()
            val  string_five = five.text.toString()
            val string_six = six.text.toString()
            val string_seven = seven.text.toString()
            val string_eight = eight.text.toString()

            if (TextUtils.isEmpty(string_first)) {
                first.error = "Enter a value"
                first.requestFocus()
                return@setOnClickListener

            }
            if (string_first.toFloat() > 4 || string_first.toFloat() < 2) {
                first.error = "Should not greater than 2 and less than 4"
                first.requestFocus()
                return@setOnClickListener
            }


            if (TextUtils.isEmpty(string_second)) {
                second.error = "Enter a value"
                second.requestFocus()
                return@setOnClickListener
            }
            if (string_second.toFloat() > 4 || string_second.toFloat() < 2) {
                second.error = "Should not greater than 2 and less than 4"
                second.requestFocus()
                return@setOnClickListener
            }

            if (TextUtils.isEmpty(string_three)) {
                three.error = "Enter a value"
                three.requestFocus()
                return@setOnClickListener
            }
            if (string_three.toFloat() > 4 || string_three.toFloat() < 2) {
                three.error = "Should not greater than 2 and less than 4"
                three.requestFocus()
                return@setOnClickListener
            }

            if (TextUtils.isEmpty(string_four)) {
                four.error = "Enter a value"
                four.requestFocus()
                return@setOnClickListener
            }
            if (string_four.toFloat() > 4 || string_four.toFloat() < 2) {
                four.error = "Should not greater than 2 and less than 4"
                four.requestFocus()
                return@setOnClickListener
            }
            if (TextUtils.isEmpty(string_five)) {
                five.error = "Enter a value"
                five.requestFocus()
                return@setOnClickListener
            }
            if (string_five.toFloat() > 4 || string_five.toFloat() < 2) {
                five.error = "Should not greater than 2 and less than 4"
                five.requestFocus()
                return@setOnClickListener
            }
            if (TextUtils.isEmpty(string_six)) {
                six.error = "Enter a value"
                six.requestFocus()
                return@setOnClickListener
            }
            if (string_six.toFloat() > 4 || string_six.toFloat() < 2) {
                six.error = "Should not greater than 2 and less than 4"
                six.requestFocus()
                return@setOnClickListener
            }
            if (TextUtils.isEmpty(string_seven)) {
                seven.error = "Enter a value"
                seven.requestFocus()
                return@setOnClickListener
            }
            if (string_seven.toFloat() > 4 || string_seven.toFloat() < 2) {
                seven.error = "Should not greater than 2 and less than 4"
                seven.requestFocus()
                return@setOnClickListener
            }
            if (TextUtils.isEmpty(string_eight)) {
                eight.error = "Enter a value"
                eight.requestFocus()
                return@setOnClickListener
            }
            if (string_eight.toFloat() > 4 || string_eight.toFloat() < 2) {
                eight.error = "Should not greater than 2 and less than 4"
                eight.requestFocus()
                return@setOnClickListener
            }

            Toast.makeText(this,"return",Toast.LENGTH_SHORT);

            val float_first = string_first.toFloat()
            val float_second = string_second.toFloat()
            val float_three = string_three.toFloat()
            val float_four = string_four.toFloat()
            val float_five = string_five.toFloat()
            val float_six = string_six.toFloat()
            val float_seven = string_seven.toFloat()
            val float_eight = string_eight.toFloat()





        }


        resetBtn.setOnClickListener {

            result.setText("Result")
            first.setText("")
            second.setText("")
            three.setText("")
            four.setText("")
            five.setText("")
            six.setText("")
            seven.setText("")
            eight.setText("")
           val totalCgpaAndGrade = null
        }


    }
}