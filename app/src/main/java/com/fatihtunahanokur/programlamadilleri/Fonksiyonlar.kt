package com.fatihtunahanokur.programlamadilleri

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class Fonksiyonlar : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fonksiyonlar)

        var webView = findViewById<WebView>(R.id.webView)
        val htmlText = """
            <html>
            <body>
                <h2>Fonksiyonlar ve Metotlar</h2>
                <p>Fonksiyonlar, belirli bir görevi yerine getiren kod bloklarıdır. Metotlar ise sınıf içindeki fonksiyonlardır. Fonksiyonlar ve metotlar, kodun daha modüler ve tekrar kullanılabilir olmasını sağlar. C++'da fonksiyonlar şu şekilde tanımlanır:</p>
                <pre>
            int toplama(int a, int b) {
                return a + b;
            }

            int main() {
                int sonuc = toplama(5, 3);
                cout << "Sonuç: " << sonuc << endl;
                return 0;
            }
                </pre>
                <p>Metotlar, sınıflar içinde tanımlanır ve sınıfın üyeleri ile etkileşime girer. Örnek:</p>
                <pre>
            class HesapMakinesi {
            public:
                int toplama(int a, int b) {
                    return a + b;
                }
            };

            int main() {
                HesapMakinesi hm;
                int sonuc = hm.toplama(5, 3);
                cout << "Sonuç: " << sonuc << endl;
                return 0;
            }
                </pre>
                <p>Fonksiyonlar ve metotlar, yazılım geliştirme sürecinde kodun daha anlaşılır ve yönetilebilir olmasını sağlar.</p>
            </body>
            </html>

        """.trimIndent()

        webView.loadData(htmlText, "text/html; charset=utf-8", "UTF-8")


    }
}