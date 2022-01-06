package com.beyza.myapplication5

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_anamenuogrnc.*
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.ogrtmnıd

class anamenuogrnc : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_anamenuogrnc)

        notıd.setOnClickListener()
        {
            val intent= Intent(applicationContext,notogrn::class.java)
            startActivity(intent)
        }
        button4.setOnClickListener()
        {
            val intent= Intent(applicationContext,devmzlksyfa::class.java)
            startActivity(intent)
        }
    }
}