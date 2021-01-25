package com.example.diplomacgpacalculatorkotlin

class Calculation {

    var grade:String?=null;

    fun result(first:Float,second:Float,three: Float, four: Float,
               five: Float, six: Float, seven: Float, eight: Float):String?{


        val first_parcent_reasult = first * 5 / 100
        val second_parcent_reasult = second * 5 / 100
        val three_parcent_reasult = three * 5 / 100
        val four_parcent_reasult = four * 10 / 100
        val five_parcent_reasult = five * 15 / 100
        val six_parcent_reasult = six * 20 / 100
        val seven_parcent_reasult = seven * 25 / 100
        val eight_parcent_reasult = eight * 15 / 100

        val total_cgpa =
            (first_parcent_reasult + second_parcent_reasult + three_parcent_reasult
                    + four_parcent_reasult + five_parcent_reasult + six_parcent_reasult +
                    seven_parcent_reasult + eight_parcent_reasult);

        val cgpaString = String.format("%.3g%n", total_cgpa)
        val Cgpa = cgpaString.toFloat()
          if (Cgpa >= 4) {
              grade= "(A+)"
        } else if (Cgpa < 4 && Cgpa >= 3.75) {
              grade=  "(A)"
        } else if (Cgpa < 3.75 && Cgpa >= 3.5) {
              grade= "(A-)"
        } else if (Cgpa < 3.5 && Cgpa >= 3.25) {
              grade=  "(B+)"
        } else if (Cgpa < 3.25 && Cgpa >= 3.00) {
              grade=  "(B)"
        } else if (Cgpa < 3.00 && Cgpa >= 2.75) {
              grade=  "(B-)"
        } else if (Cgpa < 2.75 && Cgpa >= 2.5) {
              grade= "(C+)"
        } else if (Cgpa < 2.5 && Cgpa >= 2.25) {
              grade= "(C)"
        } else if (Cgpa < 2.25 && Cgpa >= 2.00) {
              grade= "(D)"
        } else {
              grade= "(F)"
        }

        return Cgpa.toString()+ "\t\t" + grade ;
    }




}