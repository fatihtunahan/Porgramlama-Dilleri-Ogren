 package com.fatihtunahanokur.programlamadilleri

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

 class DegiskenlerVeriTurleri : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_degiskenler_veri_turleri)

        var webView = findViewById<WebView>(R.id.webView)
        val htmlText = """
          <html>
<body>
    <h2>Değişkenler ve Veri Türleri</h2>
    <p>Değişkenler, programlarda veri saklamak için kullanılan alanlardır. Veri türleri, değişkenlerin hangi türde veri saklayabileceğini belirler. C++'da temel veri türleri şunlardır:</p>
    <ul>
        <li><b>int</b>: Tamsayı değerler için kullanılır. Örnek: <code>int a = 5;</code></li>
        <li><b>float</b>: Ondalıklı sayılar için kullanılır. Örnek: <code>float b = 3.14;</code></li>
        <li><b>double</b>: Daha hassas ondalıklı sayılar için kullanılır. Örnek: <code>double c = 3.14159;</code></li>
        <li><b>char</b>: Tek karakterler için kullanılır. Örnek: <code>char d = 'A';</code></li>
        <li><b>bool</b>: Doğru veya yanlış değerler için kullanılır. Örnek: <code>bool e = true;</code></li>
        <li><b>string</b>: Metin verileri için kullanılır. Örnek: <code>string f = "Merhaba";</code></li>
    </ul>
    <p>Değişkenlerin türleri, bellek yönetimi ve programın performansı üzerinde doğrudan etkilidir. C++'da değişken tanımlarken tür belirlemek zorunludur.</p>
</body>
</html>


        """.trimIndent()

        webView.loadData(htmlText, "text/html; charset=utf-8", "UTF-8")
    }


    }
