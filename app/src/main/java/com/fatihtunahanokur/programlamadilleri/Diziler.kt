package com.fatihtunahanokur.programlamadilleri

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class Diziler : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_diziler)

        var webView = findViewById<WebView>(R.id.webView2)
        val htmlText = """
            <html>
<body>
    <h2>Diziler ve Koleksiyonlar</h2>
    <p>Diziler, aynı türden birden fazla veriyi saklamak için kullanılır. Dizilerin boyutu sabittir ve başlangıçta belirlenir. Örnek:</p>
    <pre>
int sayilar[5] = {1, 2, 3, 4, 5};
for (int i = 0; i < 5; i++) {
    cout << sayilar[i] << endl;
}
    </pre>
    <p>Koleksiyonlar ise daha esnek veri yapılarıdır ve STL (Standard Template Library) tarafından sağlanır. En yaygın koleksiyon türleri arasında vektörler, listeler ve haritalar bulunur. Örnekler:</p>
    <h3>Vektör</h3>
    <pre>
#include &lt;vector&gt;
std::vector<int> v = {1, 2, 3, 4, 5};
for (int i = 0; i < v.size(); i++) {
    cout << v[i] << endl;
}
    </pre>
    <h3>Liste</h3>
    <pre>
#include &lt;list&gt;
std::list<int> l = {1, 2, 3, 4, 5};
for (int x : l) {
    cout << x << endl;
}
    </pre>
    <h3>Harita</h3>
    <pre>
#include &lt;map&gt;
std::map&lt;string, int&gt; m;
m["bir"] = 1;
m["iki"] = 2;
for (auto& kv : m) {
    cout << kv.first << ": " << kv.second << endl;
}
    </pre>
    <p>Diziler ve koleksiyonlar, verilerin saklanması ve işlenmesi için esnek ve güçlü araçlar sunar.</p>
</body>
</html>

        """.trimIndent()

        webView.loadData(htmlText, "text/html; charset=utf-8", "UTF-8")

    }
}