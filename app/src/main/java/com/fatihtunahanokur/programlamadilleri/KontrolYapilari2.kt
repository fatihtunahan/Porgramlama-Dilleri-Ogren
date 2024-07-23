package com.fatihtunahanokur.programlamadilleri

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class KontrolYapilari2 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kontrol_yapilari2)
        var webView = findViewById<WebView>(R.id.webView)
        val htmlText = """
          <div>
  <h2>Kontrol Yapıları</h2>
  <p>C dilinde koşullu ifadeler ve döngüler kullanılarak programın akışı kontrol edilebilir:</p>
  <h3>Koşullu İfadeler</h3>
  <pre>
    <code>
int yaş = 20;

if (yaş >= 18) {
    printf("Reşitsiniz.\n");
} else {
    printf("Reşit değilsiniz.\n");
}

int puan = 85;
if (puan >= 90) {
    printf("A aldınız.\n");
} else if (puan >= 80) {
    printf("B aldınız.\n");
} else if (puan >= 70) {
    printf("C aldınız.\n");
} else {
    printf("D veya F aldınız.\n");
}
    </code>
  </pre>

  <h3>Döngüler</h3>
  <pre>
    <code>
// for döngüsü
for (int i = 0; i < 5; i++) {
    printf("%d\n", i);
}

// while döngüsü
int j = 0;
while (j < 5) {
    printf("%d\n", j);
    j++;
}

// do-while döngüsü
int k = 0;
do {
    printf("%d\n", k);
    k++;
} while (k < 5);
    </code>
  </pre>
</div>
  
           
         
        """.trimIndent()

        webView.loadData(htmlText, "text/html; charset=utf-8", "UTF-8")
    }
}