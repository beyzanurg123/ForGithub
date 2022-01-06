package com.beyza.myapplication5

import android.database.DatabaseErrorHandler
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import com.google.firebase.database.FirebaseDatabase
import kotlinx.android.synthetic.main.activity_anamenuogrnc.*
import kotlinx.android.synthetic.main.activity_notekleme.*

class notekleme : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_notekleme)

        val id=ogrno.text.toString()
        val puan=ogrpuan.text.toString()
    }
    }
