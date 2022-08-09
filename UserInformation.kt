package com.example.bestfit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView

class UserInformation : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user_information)
    }


   fun bmicalculate(view: View){

       val edtxt1= findViewById<EditText>(R.id.Weight)
       val wt= (edtxt1.text.toString()).toFloat()
       val edtxt2= findViewById<EditText>(R.id.height)
       val ht=((edtxt2.text.toString()).toFloat())/100
       val bmi = wt/(ht*ht)
       val message= " your bmi is $bmi"
       val textView = findViewById<TextView>(R.id.textView).apply {
           text=message }

       val msg2: String
       if(bmi<=18.4){
           msg2=" You are Underweight , Malnutrition risk"
       }
       else if(bmi>18.4 && bmi<= 24.9){
           msg2="Normal weight, Low risk"
       }
       else if(bmi>24.9 && bmi<= 29.9){
           msg2="Overweight, Enchanced risk"
       }

       else if(bmi>29.9 && bmi<=34.9){
           msg2=" Moderately obese, Medium risk"
       }
       else if(bmi>34.9 && bmi<=39.9){
           msg2="Severely obese, High risk"
       }
       else{
           msg2="Very severely obese, Very high risk"
       }
       val text=findViewById<TextView>(R.id.textView2).apply {
           text=msg2
       }
    }

}