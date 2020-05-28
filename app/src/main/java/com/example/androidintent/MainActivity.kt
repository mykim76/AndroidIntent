package com.example.androidintent

import android.content.Intent
import android.content.Intent.ACTION_CALL
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        dialBtn.setOnClickListener {
            val phoneNum = phoneNumEdt.text.toString()

            //val myUri = Uri.parse("tel:010-5599-4196")
            val myUri = Uri.parse("tel:${phoneNum}")
            val myIntent = Intent(Intent.ACTION_DIAL,myUri)
            startActivity(myIntent)
        }
        callBtn.setOnClickListener {

            val phoneNum = phoneNumEdt.text.toString()

            //val myUri = Uri.parse("tel:010-5599-4196")
            val myUri = Uri.parse("tel:${phoneNum}")
            val myIntent = Intent(Intent.ACTION_CALL,myUri)
            startActivity(myIntent)
        }
    }
}
