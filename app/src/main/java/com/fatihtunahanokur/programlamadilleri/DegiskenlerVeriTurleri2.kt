package com.fatihtunahanokur.programlamadilleri

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class DegiskenlerVeriTurleri2 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_degiskenler_veri_turleri2)

        var webView = findViewById<WebView>(R.id.webView)
        val htmlText = """
            <div>
              <h2>Değişkenler ve Veri Türleri</h2>
              <p>C dilinde çeşitli veri türleri ve bu veri türlerine ait değişkenler bulunmaktadır:</p>
              <ul>
                <li><b>int</b>: Tam sayılar. Örneğin, <code>int yaş = 25;</code></li>
                <li><b>float</b>: Ondalıklı sayılar. Örneğin, <code>float sıcaklık = 36.6;</code></li>
                <li><b>double</b>: Daha yüksek hassasiyetli ondalıklı sayılar. Örneğin, <code>double pi = 3.14159;</code></li>
                <li><b>char</b>: Tek karakterler. Örneğin, <code>char harf = 'A';</code></li>
              </ul>
              <p>
                
            int yaş = 25;
            float sıcaklık = 36.6;
            double pi = 3.14159;
            char harf = 'A';
             
              </p>
            </div>

        """.trimIndent()

        webView.loadData(htmlText, "text/html; charset=utf-8", "UTF-8")
    }



    }
