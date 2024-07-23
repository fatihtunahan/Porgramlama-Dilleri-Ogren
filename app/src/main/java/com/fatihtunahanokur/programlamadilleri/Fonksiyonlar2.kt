package com.fatihtunahanokur.programlamadilleri

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class Fonksiyonlar2 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fonksiyonlar2)
        var webView = findViewById<WebView>(R.id.webView)
        val htmlText = """
            
           <div>
  <h2>Fonksiyonlar ve Metotlar</h2>
  <p>Fonksiyonlar, belirli bir görevi yerine getiren ve kodun tekrar kullanılabilirliğini sağlayan kod bloklarıdır.</p>
  <pre>
    <code>
// Fonksiyon tanımı
int topla(int a, int b) {
    return a + b;
}

// Fonksiyon çağrımı
int main() {
    int sonuç = topla(3, 5);
    printf("Toplam: %d\n", sonuç);
    return 0;
}
    </code>
  </pre>
  <p>Fonksiyonlar, parametre alabilir ve bir değer döndürebilir. Yukarıdaki örnekte, <code>topla</code> fonksiyonu iki tam sayı alır ve bunların toplamını döndürür.</p>
</div>

        """.trimIndent()

        webView.loadData(htmlText, "text/html; charset=utf-8", "UTF-8")
    }
}