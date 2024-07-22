package com.fatihtunahanokur.programlamadilleri

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class DosyaIslemleri : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dosya_islemleri)

        var webView = findViewById<WebView>(R.id.webView)
        val htmlText = """
            <<html>
<body>
    <h2>Dosya İşlemleri</h2>
    <p>Dosya işlemleri, dosyalardan veri okuma ve yazma işlemlerini içerir. C++'da dosya işlemleri için <code>fstream</code> kütüphanesi kullanılır. Aşağıda dosya yazma ve okuma işlemleri gösterilmektedir:</p>
    <h3>Dosya Yazma</h3>
    <pre>
#include &lt;fstream&gt;

int main() {
    ofstream dosyaYaz("ornek.txt");
    if (dosyaYaz.is_open()) {
        dosyaYaz << "Merhaba, Dünya!" << endl;
        dosyaYaz.close();
    } else {
        cout << "Dosya açılamadı." << endl;
    }
    return 0;
}
    </pre>
    <h3>Dosya Okuma</h3>
    <pre>
#include &lt;fstream&gt;

int main() {
    ifstream dosyaOku("ornek.txt");
    if (dosyaOku.is_open()) {
        string satir;
        while (getline(dosyaOku, satir)) {
            cout << satir << endl;
        }
        dosyaOku.close();
    } else {
        cout << "Dosya açılamadı." << endl;
    }
    return 0;
}
    </pre>
    <p>Dosya işlemleri, verilerin kalıcı olarak saklanmasını ve daha sonra işlenmesini sağlar.</p>
</body>
</html>

        """.trimIndent()

        webView.loadData(htmlText, "text/html; charset=utf-8", "UTF-8")

    }
}