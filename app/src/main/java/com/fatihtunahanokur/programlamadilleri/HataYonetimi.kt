package com.fatihtunahanokur.programlamadilleri

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class HataYonetimi : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hata_yonetimi)


        var webView = findViewById<WebView>(R.id.webView)
        val htmlText = """
            <html>
<body>
    <h2>Hata Yönetimi ve İstisnalar</h2>
    <p>Hata yönetimi, programın hatalarla başa çıkmasını sağlar. İstisnalar, hataları yakalamak ve işlemek için kullanılır. C++'da istisna yönetimi şu şekilde yapılır:</p>
    <pre>
try {
    // Hata oluşturabilecek kod
    throw "Bir hata oluştu!";
} catch (const char* msg) {
    cout << "Hata: " << msg << endl;
}
    </pre>
    <p>İstisnalar, beklenmedik durumlarla başa çıkmayı kolaylaştırır ve programın güvenilirliğini artırır. C++'da istisnaların kullanımı:</p>
    <pre>
#include &lt;stdexcept&gt;

void bolme(int a, int b) {
    if (b == 0) {
        throw std::runtime_error("Sıfıra bölme hatası");
    }
    cout << a / b << endl;
}

int main() {
    try {
        bolme(10, 0);
    } catch (const std::runtime_error& e) {
        cout << "Hata: " << e.what() << endl;
    }
    return 0;
}
    </pre>
    <p>İstisnalar, kodun daha temiz ve okunabilir olmasını sağlar ve hata durumlarında uygun tepki vermeyi kolaylaştırır.</p>
</body>
</html>

        """.trimIndent()

        webView.loadData(htmlText, "text/html; charset=utf-8", "UTF-8")


    }
}