package com.fatihtunahanokur.programlamadilleri

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class VeriTabani : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_veri_tabani)
        var webView = findViewById<WebView>(R.id.webView)
        val htmlText = """
            <html>
<body>
    <h2>Veritabanı İşlemleri</h2>
    <p>Veritabanı işlemleri, veri saklama ve erişim için kullanılır. C++'da veritabanı işlemleri için çeşitli kütüphaneler kullanılabilir, örneğin SQLite. Aşağıda basit bir SQLite kullanımı örneği verilmiştir:</p>
    <pre>
#include &lt;sqlite3.h&gt;

int main() {
    sqlite3* DB;
    int exit = 0;
    exit = sqlite3_open("example.db", &DB);

    if (exit) {
        cout << "Veritabanı açılamadı: " << sqlite3_errmsg(DB) << endl;
        return exit;
    } else {
        cout << "Veritabanı başarıyla açıldı." << endl;
    }

    string sql = "CREATE TABLE IF NOT EXISTS PERSON("
                 "ID INT PRIMARY KEY NOT NULL, "
                 "NAME TEXT NOT NULL);";
    
    char* errMsg;
    exit = sqlite3_exec(DB, sql.c_str(), NULL, 0, &errMsg);
    if (exit != SQLITE_OK) {
        cout << "SQL hatası: " << errMsg << endl;
        sqlite3_free(errMsg);
    } else {
        cout << "Tablo başarıyla oluşturuldu." << endl;
    }

    sqlite3_close(DB);
    return 0;
}
    </pre>
    <p>Veritabanı işlemleri, büyük miktarda verinin etkin bir şekilde saklanmasını ve yönetilmesini sağlar.</p>
</body>
</html>

        """.trimIndent()

        webView.loadData(htmlText, "text/html; charset=utf-8", "UTF-8")


    }
}