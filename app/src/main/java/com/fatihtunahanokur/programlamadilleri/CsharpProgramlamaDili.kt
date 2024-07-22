package com.fatihtunahanokur.programlamadilleri

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class CsharpProgramlamaDili : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_csharp_programlama_dili)

        var Geri = findViewById<ImageView>(R.id.Geri)
        Geri.setOnClickListener(){
            var intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        }
        var programlamaGiris = findViewById<TextView>(R.id.programlamaGiris)
        var degiskenler = findViewById<TextView>(R.id.Degiskenler)
        var operatörler = findViewById<TextView>(R.id.Operatörler)
        var kontrolYapilari = findViewById<TextView>(R.id.KontrolYapilari)
        var fonksiyonlar  = findViewById<TextView>(R.id.Fonksiyonlar)
        var diziler = findViewById<TextView>(R.id.Diziler)
        var oop = findViewById<TextView>(R.id.Oop)
        var hataYönetimi = findViewById<TextView>(R.id.HataYönetimi)
        var dosyaIslem = findViewById<TextView>(R.id.DosyaIslemleri)
        var veriTabani = findViewById<TextView>(R.id.VeriTabani)

        programlamaGiris.setOnClickListener(){

        }
        degiskenler.setOnClickListener(){

        }
        operatörler.setOnClickListener(){

        }
        kontrolYapilari.setOnClickListener(){

        }
        fonksiyonlar.setOnClickListener(){

        }
        diziler.setOnClickListener(){

        }
        oop.setOnClickListener(){

        }
        hataYönetimi.setOnClickListener(){

        }
        dosyaIslem.setOnClickListener (){

        }
        veriTabani.setOnClickListener (){

        }




    }
}