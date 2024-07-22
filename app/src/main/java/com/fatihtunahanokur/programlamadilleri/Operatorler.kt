package com.fatihtunahanokur.programlamadilleri

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class Operatorler : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_operatorler)

        var webView = findViewById<WebView>(R.id.webView)
        val htmlText = """
          <html>
<body>
    <h2>Operatörler</h2>
    <p>Operatörler, değişkenler ve sabitler üzerinde işlem yapmak için kullanılır. C++'da yaygın olarak kullanılan operatörler ve örnekleri şunlardır:</p>
    <ul>
        <li><b>Atama Operatörü (=)</b>: Değişkene değer atar. Örnek: <code>int a = 10;</code></li>
        <li><b>Aritmetik Operatörler</b>: Matematiksel işlemler yapar. Örnekler:
            <ul>
                <li>Toplama (+): <code>int c = a + b;</code></li>
                <li>Çıkarma (-): <code>int d = a - b;</code></li>
                <li>Çarpma (*): <code>int e = a * b;</code></li>
                <li>Bölme (/): <code>int f = a / b;</code></li>
                <li>Modulus (%): <code>int g = a % b;</code></li>
            </ul>
        </li>
        <li><b>Karşılaştırma Operatörleri</b>: Değerleri karşılaştırır ve boolean sonuç döner. Örnekler:
            <ul>
                <li>Eşittir (==): <code>if (a == b)</code></li>
                <li>Eşit Değildir (!=): <code>if (a != b)</code></li>
                <li>Küçüktür (<): <code>if (a < b)</code></li>
                <li>Büyüktür (>): <code>if (a > b)</code></li>
                <li>Küçük Eşittir (<=): <code>if (a <= b)</code></li>
                <li>Büyük Eşittir (>=): <code>if (a >= b)</code></li>
            </ul>
        </li>
        <li><b>Mantıksal Operatörler</b>: Mantıksal işlemler yapar. Örnekler:
            <ul>
                <li>Ve (&&): <code>if (a > b && b > c)</code></li>
                <li>Veya (||): <code>if (a > b || b > c)</code></li>
                <li>Değil (!): <code>if (!a)</code></li>
            </ul>
        </li>
    </ul>
    <p>Operatörler, programın akışını ve mantığını oluştururken kritik öneme sahiptir.</p>
</body>
</html>



        """.trimIndent()

        webView.loadData(htmlText, "text/html; charset=utf-8", "UTF-8")



    }
}