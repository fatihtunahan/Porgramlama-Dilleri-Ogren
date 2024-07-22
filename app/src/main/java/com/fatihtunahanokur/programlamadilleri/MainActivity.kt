package com.fatihtunahanokur.programlamadilleri

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.core.app.ShareCompat.IntentBuilder

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var c = findViewById<ImageView>(R.id.c)
        var cplusplus = findViewById<ImageView>(R.id.cplusplus)
        var csharp= findViewById<ImageView>(R.id.csharp)
        var java = findViewById<ImageView>(R.id.java)
        var kotlin = findViewById<ImageView>(R.id.kotlin)


        c.setOnClickListener(){
            var intent = Intent(this,CprogramlamaDili::class.java)
            startActivity(intent)
        }

        cplusplus.setOnClickListener(){
            var intent = Intent(this,CplusplusProgramlamaDili::class.java)
            startActivity(intent)
        }

        csharp.setOnClickListener(){
            var intent = Intent(this,CsharpProgramlamaDili::class.java)
            startActivity(intent)
        }

        java.setOnClickListener(){
            var intent = Intent(this,JavaProgramlamaDili::class.java)
            startActivity(intent)
        }

        kotlin.setOnClickListener(){
            var intent  =Intent(this,KotlinProgramlamaDili::class.java)
            startActivity(intent)
        }








    }
}