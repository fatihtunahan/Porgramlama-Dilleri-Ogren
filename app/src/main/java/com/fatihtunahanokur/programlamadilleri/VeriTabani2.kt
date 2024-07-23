package com.fatihtunahanokur.programlamadilleri

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class VeriTabani2 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_veri_tabani2)
        var webView = findViewById<WebView>(R.id.webView)
        val htmlText = """
            
           <div>
  <h2>Veritabanı İşlemleri</h2>
  <p>C dilinde veritabanı işlemleri genellikle SQL kitaplıkları kullanılarak yapılır. Örneğin, SQLite veritabanı için <code>sqlite3</code> kütüphanesi kullanılabilir.</p>
  <pre>
    <code>
#include &lt;stdio.h&gt;
#include &lt;sqlite3.h&gt;

int main() {
    sqlite3 *db;
    int durum = sqlite3_open("test.db", &amp;db);

    if (durum) {
        printf("Veritabanı açılamadı: %s\n", sqlite3_errmsg(db));
        return durum;
    } else {
        printf("Veritabanı başarıyla açıldı.\n");
    }

    sqlite3_close(db);
    return 0;
}
    </code>
  </pre>
  <p>Yukarıdaki örnekte, <code>sqlite3_open</code> fonksiyonu ile bir SQLite veritabanı açılır. Eğer veritabanı açılamazsa, hata mesajı yazdırılır. Veritabanı başarılı bir şekilde açıldığında, <code>sqlite3_close</code> fonksiyonu ile veritabanı kapatılır.</p>
</div>

         
        """.trimIndent()

        webView.loadData(htmlText, "text/html; charset=utf-8", "UTF-8")
    }
}