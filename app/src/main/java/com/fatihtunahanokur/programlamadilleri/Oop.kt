package com.fatihtunahanokur.programlamadilleri

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class Oop : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_oop)

        var webView = findViewById<WebView>(R.id.webView2)
        val htmlText = """
           <html>
<body>
    <h2>Nesne Yönelimli Programlama (OOP)</h2>
    <p>OOP, yazılım tasarımında nesneleri ve sınıfları kullanarak kodun daha düzenli ve tekrar kullanılabilir olmasını sağlar. OOP'nin dört temel prensibi şunlardır:</p>
    <ul>
        <li><b>Sınıflar ve Nesneler</b>: Sınıflar, nesnelerin şablonlarıdır. Nesneler, sınıflardan oluşturulan örneklerdir. Örnek:
            <pre>
class Araba {
public:
    string marka;
    int yil;

    void calistir() {
        cout << "Araba çalıştı." << endl;
    }
};

int main() {
    Araba araba1;
    araba1.marka = "Toyota";
    araba1.yil = 2020;
    araba1.calistir();
    return 0;
}
            </pre>
        </li>
        <li><b>Encapsulation (Kapsülleme)</b>: Veriyi ve fonksiyonları bir sınıfta birleştirir ve dışarıdan erişimi kontrol eder. Örnek:
            <pre>
class Kisi {
private:
    string isim;
    int yas;

public:
    void setIsim(string i) { isim = i; }
    string getIsim() { return isim; }
    void setYas(int y) { yas = y; }
    int getYas() { return yas; }
};
            </pre>
        </li>
        <li><b>Inheritance (Kalıtım)</b>: Bir sınıfın özelliklerini ve metotlarını başka bir sınıfa miras bırakmasını sağlar. Örnek:
            <pre>
class Hayvan {
public:
    void sesCikar() {
        cout << "Hayvan sesi" << endl;
    }
};

class Kopek : public Hayvan {
public:
    void havla() {
        cout << "Hav Hav" << endl;
    }
};

int main() {
    Kopek kopek1;
    kopek1.sesCikar();
    kopek1.havla();
    return 0;
}
            </pre>
        </li>
        <li><b>Polymorphism (Çok Biçimlilik)</b>: Aynı işlemin farklı biçimlerde gerçekleştirilmesini sağlar. Örnek:
            <pre>
class Sekil {
public:
    virtual void ciz() {
        cout << "Bir şekil çiziliyor" << endl;
    }
};

class Daire : public Sekil {
public:
    void ciz() override {
        cout << "Bir daire çiziliyor" << endl;
    }
};

int main() {
    Sekil* sekil;
    Daire daire;
    sekil = &daire;
    sekil->ciz();
    return 0;
}
            </pre>
        </li>
    </ul>
    <p>OOP, yazılım geliştirmede güçlü bir paradigmadır ve büyük projelerde kodun daha yönetilebilir ve sürdürülebilir olmasını sağlar.</p>
</body>
</html>

        """.trimIndent()

        webView.loadData(htmlText, "text/html; charset=utf-8", "UTF-8")


    }
}