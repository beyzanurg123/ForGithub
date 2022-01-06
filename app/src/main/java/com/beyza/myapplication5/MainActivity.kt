package com.beyza.myapplication5

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        ogrıd.setOnClickListener()
        {
            val intent= Intent(applicationContext,grsekrn1::class.java)
            startActivity(intent)
              Toast.makeText(this,"öğrenci girişi seçildi",Toast.LENGTH_LONG).show()
        }
        ogrtmnıd.setOnClickListener()
        {
            val intent= Intent(applicationContext,ogrtmngrs::class.java)
            startActivity(intent)
            Toast.makeText(this,"öğretmen girişi",Toast.LENGTH_LONG).show()
        }

    }
}