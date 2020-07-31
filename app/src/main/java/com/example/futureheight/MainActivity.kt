package com.example.futureheight

import android.content.pm.ActivityInfo
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.view.View
import android.widget.*
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestedOrientation =  (ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        setContentView(R.layout.activity_main)
    }

    fun Calc(v: View)
    {
        val dadh = findViewById<EditText>(R.id.dadheight)as EditText
        val momh = findViewById<EditText>(R.id.momheight)as EditText
        val Dis = findViewById<TextView>(R.id.display)as TextView
        val Dad : Float
        val Mom : Float
        val display : Float

        //null
        if (dadheight != null && dadheight.length() < 2) {
            dadh.error = "กรุณากรอกข้อมูล"
            return
        }
        if (momheight != null && momheight.length() < 2) {
            momh.error = "กรุณากรอกข้อมูล"
            return
        }

        //error
        if (TextUtils.isEmpty(dadh.text.toString())){
            dadh.error = "กรุณากรอกข้อมูล"
            return
        }
        else{
            Dad = dadh.text.toString().toFloat()
        }
        if (TextUtils.isEmpty(momh.text.toString())){
            dadh.error = "กรุณากรอกข้อมูล"
            return
        }
        else{
            Mom = momh.text.toString().toFloat()
        }

        //Calc
        when (v.id){
            R.id.male ->{
                display = ((Dad + Mom) + 13) / 2
                Dis.text = display.toString()
            }
            R.id.female ->{
                display = ((Dad + Mom) - 13) / 2
                Dis.text = display.toString()
            }
        }
    }
}