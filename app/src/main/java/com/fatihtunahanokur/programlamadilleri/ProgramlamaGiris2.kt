package com.fatihtunahanokur.programlamadilleri

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class ProgramlamaGiris2 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_programlama_giris2)

        var webView = findViewById<WebView>(R.id.WebView)
        val htmlText = """
<div>
  <h2>Programlamaya Giriş</h2>
  <p>C programlama dili, sistem programlama ve düşük seviyeli programlama için tasarlanmış, genel amaçlı ve yüksek verimli bir dildir.</p>
  <pre>
    <code>
#include &lt;stdio.h&gt;

int main() {
    printf("Merhaba, Dünya!\n");
    return 0;
}
    </code>
  </pre>
</div>

        """.trimIndent()

        webView.loadData(htmlText, "text/html; charset=utf-8", "UTF-8")
    }

    }
