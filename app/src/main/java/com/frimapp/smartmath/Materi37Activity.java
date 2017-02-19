package com.frimapp.smartmath;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;

public class Materi37Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_materi037);
        WebView wv = (WebView) findViewById(R.id.webView);
        final String mimeType = "text/html";
        final String encoding = "UTF-8";
        String html = "\n" +
                "<html lang=\"en\">\n" +
                "<p>Persegi adalah bangun datar yang <b>terdiri dari 4 sisi yang panjangnya sama</b>. Berikut adalah contoh gambar dari bangun Persegi :</p>\n" +
                "<p><img src=\"file:///android_res/drawable/materi030101.png\" alt=\"\" width=\"181\" height=\"181\" /></p>\n" +
                "<p>&nbsp;&nbsp;&nbsp; Apabila ukuran salah satu sisinya tidak sama dengan ukuran sisi yang lainnya, maka itu bukanlah persegi. Dapat kita lihat, sisi merah, kuning, hijau, dan biru ukurannya adalah <strong>sama</strong> maka kita dapat menyebutnya <strong>persegi.</strong></p>\n" +
                "<p><b>Cara menghitung keliling persegi :</b></p>\n" +
                "<p>Sebelum belajar menghitung keliling pada bangun datar, ada baiknya anda mengenal apa itu keliling. Keliling adalah jumlah seluruh sisi yang dimiliki oleh suatu bangun datar. Cara mudah memahaminya adalah bayangkan saja anda mengelilingi sebuah kotak berbentuk persegi dengan sisi 4meter.</p>\n" +
                "<p><img src=\"file:///android_res/drawable/materi030104.png\" alt=\"\" width=\"181\" height=\"181\" /></p>\n" +
                "<p>Bayangkanlah anda berdiri di titik berwarna coklat, lalu anda berjalan melalui garis coklat tersebut hingga kembali lagi ke awal. Seberapa jauh kamu berjalan itulah kelilingnya. Tetapi bedanya kali ini kita menghitung keliling persegi secara utuh. Maksudnya, apabila anda bayangkan maka anda harus berada tepat di <font color=\"red\">g</color><font color=\"#FF8800\">a</color><font color=\"green\">r</color><font color=\"blue\">i<font color=\"red\">s</color></color><font color=\"black\"></color> persegi tersebut.</p>\n" +
                "<p><b>Cara menghitung keliling : </b></p>\n" +
                "<p>keliling = <font color=\"red\">sisi</color> <font color=\"black\">+</color> <font color=\"#FF8800\">sisi</color> <font color=\"black\">+</color> <font color=\"green\">sisi</color> <font color=\"black\">+</color> <font color=\"blue\">sisi</color><font color=\"black\"></color></p>\n" +
                "<p><b>Contoh Soal : </b></p>\n" +
                "<p><img src=\"file:///android_res/drawable/materi030101.png\" alt=\"\" width=\"181\" height=\"181\" /></p>\n" +
                "<p>Diketahui : Sisi = <font color=\"red\">4</color><font color=\"#FF8800\">c</color><font color=\"green\">m</color><font color=\"black\"></color></p>\n" +
                "<p>Ditanyakan : Keliling = ..?</p>\n" +
                "<p>Jawab : </p>\n" +
                "<p>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; keliling = <font color=\"red\">sisi</color> <font color=\"black\">+</color> <font color=\"#FF8800\">sisi</color> <font color=\"black\">+</color> <font color=\"green\">sisi</color> <font color=\"black\">+</color> <font color=\"blue\">sisi</color><font color=\"black\"></color></p>\n" +
                "<p>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; keliling = <font color=\"red\">4</color> <font color=\"black\">+</color> <font color=\"#FF8800\">4</color> <font color=\"black\">+</color> <font color=\"green\">4</color> <font color=\"black\">+</color> <font color=\"blue\">4</color><font color=\"black\"></color></p>\n" +
                "<p>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; keliling = 16cm</p>\n" +
                "</html>";


        wv.loadDataWithBaseURL("", html, mimeType, encoding, "");

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(R.anim.slide_kiri, R.anim.slideout_kanan);
    }
    public void PAHAM (View v) {
        final Intent i = new Intent(getApplicationContext(), Materi37testActivity.class);
        startActivity(i);
    }
}