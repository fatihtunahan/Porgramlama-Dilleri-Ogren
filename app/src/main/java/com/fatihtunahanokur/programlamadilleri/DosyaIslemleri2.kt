package com.fatihtunahanokur.programlamadilleri

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class DosyaIslemleri2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dosya_islemleri2)
        var webView = findViewById<WebView>(R.id.webView)
        val htmlText = """
            
     <div>
  <h2>Dosya İşlemleri</h2>
  <p>Dosya işlemleri, <code>fopen</code>, <code>fclose</code>, <code>fread</code>, <code>fwrite</code> gibi fonksiyonlar kullanılarak gerçekleştirilir.</p>
  <pre>
    <code>
#include &lt;stdio.h&gt;

int main() {
    FILE *dosya = fopen("dosya.txt", "w");

    if (dosya != NULL) {
        fprintf(dosya, "Merhaba, Dosya!\n");
        fclose(dosya);
    } else {
        printf("Dosya açılamadı.\n");
    }

    return 0;
}
    </code>
  </pre>
  <p>Yukarıdaki örnekte, <code>fopen</code> fonksiyonu ile bir dosya açılır veya oluşturulur. Dosya açıldıktan sonra, <code>fprintf</code> fonksiyonu ile dosyaya veri yazılır ve <code>fclose</code> fonksiyonu ile dosya kapatılır.</p>
</div>

         
        """.trimIndent()

        webView.loadData(htmlText, "text/html; charset=utf-8", "UTF-8")
    }
}