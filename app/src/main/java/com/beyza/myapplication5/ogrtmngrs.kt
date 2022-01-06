package com.beyza.myapplication5

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth
import kotlinx.android.synthetic.main.activity_grsekrn1.*
import kotlinx.android.synthetic.main.activity_ogrtmngrs.*

class ogrtmngrs : AppCompatActivity() {
    private lateinit var auth: FirebaseAuth
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ogrtmngrs)

        auth= FirebaseAuth.getInstance()
    }
    fun grsogrtmn(view: View)
    {
        auth.signInWithEmailAndPassword(epostaıd.text.toString(),sifreııd.text.toString()).addOnCompleteListener { task->
            if(task.isSuccessful)
            {
                val guncelkullnıcı=auth.currentUser?.email.toString()
                Toast.makeText(this,"hoşgeldin:${guncelkullnıcı}", Toast.LENGTH_LONG).show()
                val intent= Intent(this,anaekrnogrtmn::class.java)
                startActivity(intent)
                finish()
            }
        }.addOnFailureListener { exception->
            Toast.makeText(applicationContext,exception.localizedMessage, Toast.LENGTH_LONG).show()
        }
    }

    fun ogrtmnkyt(view: View)
    {
        val okulnu=epostaıd.text.toString()
        val sifre=sifreııd.text.toString()
        auth.createUserWithEmailAndPassword(okulnu,sifre).addOnCompleteListener { task->
            if(task.isSuccessful){
                val intent= Intent(this,anaekrnogrtmn::class.java)
                startActivity(intent)
                finish()
            }
        }.addOnFailureListener { exception->
            Toast.makeText(applicationContext,exception.localizedMessage, Toast.LENGTH_LONG).show()
        }
    }
    fun geridnv(view:View)
    {
        val intent= Intent(applicationContext,MainActivity::class.java)
        startActivity(intent)
        finish()
    }
}