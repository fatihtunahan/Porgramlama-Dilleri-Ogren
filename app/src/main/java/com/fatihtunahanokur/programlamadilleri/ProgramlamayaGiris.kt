package com.fatihtunahanokur.programlamadilleri

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class ProgramlamayaGiris : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_programlamaya_giris)

        var webView = findViewById<WebView>(R.id.WebView)
        val htmlText = """
            <html>
            <body>
                <h2>C++ Programlamaya Giriş</h2>
                <p>C++, 1979'da Bjarne Stroustrup tarafından geliştirilen ve günümüzde geniş bir kullanım alanına sahip olan, güçlü ve performans odaklı bir programlama dilidir. Özellikle sistem programlama, oyun geliştirme ve yüksek performans gerektiren uygulamalarda yaygın olarak kullanılır.</p>
                <h3>Temel Özellikler</h3>
                <ul>
                    <li><b>Nesne Yönelimli Programlama (OOP)</b>: Kodun daha düzenli ve tekrar kullanılabilir olmasını sağlar.</li>
                    <li><b>Bellek Yönetimi</b>: Geliştiricilere bellek üzerinde tam kontrol sağlar.</li>
                    <li><b>Standart Kütüphane (STL)</b>: Sık kullanılan veri yapıları ve algoritmaları içerir.</li>
                    <li><b>Yüksek Performans</b>: Sistem kaynaklarına doğrudan erişim imkanı sunar.</li>
                </ul>
                <h3>Basit Bir Örnek</h3>
                <p>int main() {
    std::cout << "Merhaba, Dünya!" << std::endl;
    return 0;
}</p>
                <p>Bu program, ekrana "Merhaba, Dünya!" mesajını yazar ve C++ dilinin temel bileşenlerini gösterir.</p>
                <p>C++ ile güçlü ve verimli uygulamalar geliştirebilirsiniz. Başarılar dileriz!</p>
            </body>
            </html>
        """.trimIndent()

        webView.loadData(htmlText, "text/html; charset=utf-8", "UTF-8")
    }
}