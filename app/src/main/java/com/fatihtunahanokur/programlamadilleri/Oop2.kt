package com.fatihtunahanokur.programlamadilleri

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class Oop2 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_oop2)
        var webView = findViewById<WebView>(R.id.webView)
        val htmlText = """
            
           <div>
  <h2>Nesne Yönelimli Programlama (OOP)</h2>
  <p>C dili, doğrudan nesne yönelimli programlama desteği sağlamaz. Ancak, yapılar (struct) kullanılarak nesne benzeri yapılar oluşturulabilir.</p>
  <pre>
    <code>
#include &lt;stdio.h&gt;
#include &lt;string.h&gt;

struct Araba {
    char marka[20];
    int yıl;
};

int main() {
    struct Araba benimArabam;

    strcpy(benimArabam.marka, "Toyota");
    benimArabam.yıl = 2020;

    printf("Marka: %s\n", benimArabam.marka);
    printf("Yıl: %d\n", benimArabam.yıl);
    return 0;
}
    </code>
  </pre>
  <p>Yukarıdaki örnekte, <code>Araba</code> adında bir yapı tanımlanmış ve bu yapı kullanılarak bir araba nesnesi oluşturulmuştur.</p>
</div>

         
        """.trimIndent()

        webView.loadData(htmlText, "text/html; charset=utf-8", "UTF-8")
    }
}