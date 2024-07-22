package com.fatihtunahanokur.programlamadilleri

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class KontrolYapilari : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kontrol_yapilari)

        var webView = findViewById<WebView>(R.id.webView)
        val htmlText = """
            <html>
            <body>
                <h2>Kontrol Yapıları</h2>
                <p>Kontrol yapıları, programın akışını belirlemek için kullanılır. C++'da yaygın olarak kullanılan kontrol yapıları şunlardır:</p>
                <ul>
                    <li><b>if</b>: Koşullu ifadeler için kullanılır. Örnek: 
                        <pre>
            if (a > b) {
                cout << "a, b'den büyüktür.";
            } else {
                cout << "a, b'den büyük değildir.";
            }
                        </pre>
                    </li>
                    <li><b>switch</b>: Birden fazla durumu kontrol etmek için kullanılır. Örnek:
                        <pre>
            switch (seçim) {
                case 1:
                    cout << "Seçim 1";
                    break;
                case 2:
                    cout << "Seçim 2";
                    break;
                default:
                    cout << "Geçersiz seçim";
            }
                        </pre>
                    </li>
                    <li><b>for</b>: Belirli sayıda tekrarlamak için kullanılır. Örnek:
                        <pre>
            for (int i = 0; i < 10; i++) {
                cout << i << endl;
            }
                        </pre>
                    </li>
                    <li><b>while</b>: Koşul doğru olduğu sürece tekrarlamak için kullanılır. Örnek:
                        <pre>
            int i = 0;
            while (i < 10) {
                cout << i << endl;
                i++;
            }
                        </pre>
                    </li>
                    <li><b>do-while</b>: En az bir kez çalıştırılan döngü için kullanılır. Örnek:
                        <pre>
            int i = 0;
            do {
                cout << i << endl;
                i++;
            } while (i < 10);
                        </pre>
                    </li>
                </ul>
                <p>Kontrol yapıları, programların karar verme yeteneklerini ve tekrarlı işlemleri gerçekleştirmelerini sağlar.</p>
            </body>
            </html>

        """.trimIndent()

        webView.loadData(htmlText, "text/html; charset=utf-8", "UTF-8")


    }
}