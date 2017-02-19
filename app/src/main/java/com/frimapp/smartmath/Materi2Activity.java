package com.frimapp.smartmath;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;

public class Materi2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_materi002);
        WebView wv = (WebView) findViewById(R.id.webView);
        final String mimeType = "text/html";
        final String encoding = "UTF-8";
        String html = "<html>\n" +
                "<p>Materi pertambahan tingkat kedua cara pengerjaannya sama seperti yang pertama, tetapi kali ini menggunakan puluhan hingga ratusan.</p>\n" +
                "<p>10 + 12 = 22 (dibaca : \"sepuluh ditambah dua belas sama dengan dua puluh dua\")</p>\n" +
                "<p>152 + 254 = 406 (dibaca : \"seratus lima puluh dua ditambah dua ratus lima puluh empat sama dengan empat ratus enam\")\n" +
                "<p><strong>Cara mengerjakan :</strong></p>\n" +
                "<p>Contoh :</p>\n" +
                "<p>27 + 32 = ....</p>\n" +
                "<p>Buatlah seperti gambar dibawah ini</p>\n" +
                "<p><img src=\"file:///android_res/drawable/materi010102.png\" alt=\"\" width=\"100\" height=\"100\" /></p>\n" +
                "<p>Tambahkan angka yang berwarna oranye. Maka, <font color=#FFAA0B>7</color><font color=black>+</color><font color=#FFAA0B>2</color> <font color=black>adalah</color> <font color=#FFAA0B>9</color><font color=black></color>. \n" +
                "<p><img src=\"file:///android_res/drawable/materi010103.png\" alt=\"\" width=\"100\" height=\"100\" /></p>\n" +
                "<p>Tambahkan angka yang berwarna biru. Maka <font color=blue>2</color><font color=black>+</color><font color=blue>3</color> <font color=black>adalah</color> <font color=blue>5</color><font color=black></color>\n" +
                "<p><img src=\"file:///android_res/drawable/materi010104.png\" alt=\"\" width=\"100\" height=\"100\" /></p>\n" +
                "<p>Berikut hasilnya : </p>\n" +
                "<p><img src=\"file:///android_res/drawable/materi010110.png\" alt=\"\" width=\"100\" height=\"100\" /></p>\n" +
                "<p>Maka hasil dari <font color=blue>2</color><font color=#FFAA0B>7</color><font color=black>+</color><font color=blue>3</color><font color=#FFAA0B>2</color><font color=black>=</color>59</p>\n" +
                "<br>\n" +
                "<p>Contoh kedua :</p>\n" +
                "<p>135 + 137=\n" +
                "<p>Buatlah seperti gambar dibawah ini</p>\n" +
                "<p><img src=\"file:///android_res/drawable/materi010105.png\" alt=\"\" width=\"100\" height=\"100\" /></p>\n" +
                "<p>Tambahkan angka berwarna hijau, yakni <font color=green>5+7 </color> <font color=black>hasilnya adalah</color> <font color=green>12</color><font color=black></color>.</p>\n" +
                "<p><img src=\"file:///android_res/drawable/materi010106.png\" alt=\"\" width=\"100\" height=\"100\" /></p>\n" +
                "<p>Taruhlah <font color=#FFAA0B>1</color><font color=#0BFBFF>2</color><font color=black></color> tadi ke tempat seperti di gambar. Angka <font color=#0BFBFF>2</color><font color=black></color> di bawah, angka <font color=#FFAA0B>1</color><font color=black></color> di sebelah kiri atas dari 5+7.</p>\n" +
                "<p><img src=\"file:///android_res/drawable/materi010107.png\" alt=\"\" width=\"100\" height=\"100\" /></p>\n" +
                "<p>Tambahkan angka yang di atas alias angka <font color=#FFAA0B>1</color><font color=black></color> dari angka <font color=#FFAA0B>1</color><font color=#0BFBFF>2</color><font color=black></color> tadi dengan <font color=blue>3+3</color><font color=black></color>. Jadi, <font color=blue>3+3</color><font color=black></color>=<font color=#FF00BB>6</color><font color=black></color>, lalu <font color=#FF00BB>6</color><font color=black></color>+<font color=#FFAA0B>1</color><font color=black></color>=<font color=blue>7</color><font color=black></color>. Tulis angka tujuh di bawah.</p>\n" +
                "<p><img src=\"file:///android_res/drawable/materi010108.png\" alt=\"\" width=\"100\" height=\"100\" /></p>\n" +
                "<p>Terakhir, tambahkan baris terakir yakni angka berwarna merah, <font color=red>1+1=2</color><font color=black></color> maka tulislah angka <font color=red>2</color><font color=black></color> dibawahnya. Maka hasilna adalah 135+137=272.</p>\n" +
                "<p><img src=\"file:///android_res/drawable/materi010109.png\" alt=\"\" width=\"100\" height=\"100\" /></p>\n" +
                "\n";
        wv.loadDataWithBaseURL("", html, mimeType, encoding, "");

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(R.anim.slide_kiri, R.anim.slideout_kanan);
    }
    public void PAHAM (View v) {
        final Intent i = new Intent(getApplicationContext(), Materi2testActivity.class);
        startActivity(i);
    }
}
