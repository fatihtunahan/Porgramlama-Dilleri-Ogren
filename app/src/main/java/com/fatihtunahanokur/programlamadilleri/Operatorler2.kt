package com.fatihtunahanokur.programlamadilleri

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class Operatorler2 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_operatorler2)

        var webView = findViewById<WebView>(R.id.webView)
        val htmlText = """
            
            <div>
              <h2>Operatörler</h2>
              <p>C dilinde kullanılan bazı temel operatörler:</p>
              <ul>
                <li><b>+</b>: Toplama</li>
                <li><b>-</b>: Çıkarma</li>
                <li><b>*</b>: Çarpma</li>
                <li><b>/</b>: Bölme</li>
                <li><b>%</b>: Modulus (kalan bulma)</li>
                <li><b>==</b>: Eşitlik kontrolü</li>
                <li><b>!=</b>: Eşit olmama kontrolü</li>
                <li><b>&gt;</b>: Büyüktür</li>
                <li><b>&lt;</b>: Küçüktür</li>
                <li><b>&gt;=</b>: Büyük eşittir</li>
                <li><b>&lt;=</b>: Küçük eşittir</li>
              </ul>
              <pre>
                <code>
            int toplam = 5 + 3;
            int fark = 10 - 2;
            int çarpım = 4 * 7;
            float bölüm = 20.0 / 4.0;
            int kalan = 10 % 3;

            int a = 5, b = 10;
            int eşitMi = (a == b);
            int farklıMi = (a != b);
            int büyükMü = (a > b);
            int küçükMü = (a < b);
            int büyükEşitMi = (a >= b);
            int küçükEşitMi = (a <= b);
                </code>
              </pre>
            </div>

         
        """.trimIndent()

        webView.loadData(htmlText, "text/html; charset=utf-8", "UTF-8")
    }


    }
