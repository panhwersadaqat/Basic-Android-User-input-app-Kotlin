package com.thefuturestic.simpleuserinputappkotlin

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

        //declaring variables
        lateinit var firstValue: EditText
        lateinit var secondValue: EditText
        lateinit var result: TextView
        lateinit var add: Button
        lateinit var clear: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //creating link between UI and code

        //creating link between UI and code
        firstValue = findViewById<View>(R.id.first_value) as EditText
        secondValue = findViewById<View>(R.id.second_value) as EditText
        result = findViewById<View>(R.id.result) as TextView
        add = findViewById<View>(R.id.add_btn) as Button
        clear = findViewById<View>(R.id.clear_btn) as Button

        //adding action listener on add button

        //adding action listener on add button
        add.setOnClickListener {
            //checking edit text fields
            if (firstValue.text.toString().trim().length > 0 &&
                    secondValue.text.toString().trim().length > 0) {
                //calling method
                addValues()
            } else {
                Toast.makeText(this@MainActivity, "Please enter both values", Toast.LENGTH_LONG).show()
            }
        }

        //adding action listener on clear button
        clear.setOnClickListener {
            //checking edit text fields
            if (firstValue.text.toString().trim().length > 0 &&
                    secondValue.text.toString().trim().length > 0) {
                //calling method
                clearValues()
            } else {
                Toast.makeText(this@MainActivity, "Nothing to clear", Toast.LENGTH_LONG).show()
            }
        }
    }//end of oncreate

    //value addition method
    private fun addValues() {
        //parsing string values to integer
        val a = firstValue.text.toString().toInt()
        val b = secondValue.text.toString().toInt()
        //adding up int values
        val sum = a + b
        //displaying result
        result.text = "Result : $sum"
    }

    private fun clearValues() {
        firstValue.setText("")
        secondValue.setText("")
        result.text = "Result : "
    }
}