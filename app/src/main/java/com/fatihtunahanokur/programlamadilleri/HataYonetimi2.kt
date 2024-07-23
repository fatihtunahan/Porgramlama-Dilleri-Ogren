package com.fatihtunahanokur.programlamadilleri

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class HataYonetimi2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hata_yonetimi2)
        var webView = findViewById<WebView>(R.id.webView)
        val htmlText = """
            
           <div>
  <h2>Hata Yönetimi ve İstisnalar</h2>
  <p>C dilinde hata yönetimi genellikle dönüş değerleri ve <code>errno</code> kullanılarak yapılır.</p>
  <pre>
    <code>
#include &lt;stdio.h&gt;
#include &lt;errno.h&gt;

int main() {
    FILE *dosya = fopen("olmayan_dosya.txt", "r");

    if (dosya == NULL) {
        perror("Dosya açma hatası");
        return errno;
    }

    fclose(dosya);
    return 0;
}
    </code>
  </pre>
  <p>Yukarıdaki örnekte, <code>fopen</code> fonksiyonu ile bir dosya açılmaya çalışılır. Dosya açılamazsa, <code>perror</code> fonksiyonu ile hata mesajı yazdırılır.</p>
</div>

         
        """.trimIndent()

        webView.loadData(htmlText, "text/html; charset=utf-8", "UTF-8")
    }
}