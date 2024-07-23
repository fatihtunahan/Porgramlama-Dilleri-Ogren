package com.fatihtunahanokur.programlamadilleri

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class CprogramlamaDili : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cprogramlama_dili)

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
            var intent = Intent(this,ProgramlamaGiris2::class.java)
            startActivity(intent)
        }
        degiskenler.setOnClickListener(){
            var intent = Intent(this,DegiskenlerVeriTurleri2::class.java)
            startActivity(intent)
        }
        operatörler.setOnClickListener(){
            var intent = Intent(this,Operatorler2::class.java)
            startActivity(intent)
        }
        kontrolYapilari.setOnClickListener(){
            var intent = Intent(this,KontrolYapilari2::class.java)
            startActivity(intent)
        }
        fonksiyonlar.setOnClickListener(){
            var intent = Intent(this,Fonksiyonlar2::class.java)
            startActivity(intent)
        }
        diziler.setOnClickListener(){
            var intent = Intent(this,Diziler2::class.java)
            startActivity(intent)
        }
        oop.setOnClickListener(){
            var intent = Intent(this,Oop2::class.java)
            startActivity(intent)
        }
        hataYönetimi.setOnClickListener(){
            var intent = Intent(this,HataYonetimi2::class.java)
            startActivity(intent)
        }
        dosyaIslem.setOnClickListener (){
            var intent = Intent(this,DosyaIslemleri2::class.java)
            startActivity(intent)
        }
        veriTabani.setOnClickListener (){
            var intent = Intent(this,VeriTabani2::class.java)
            startActivity(intent)
        }

    }
}