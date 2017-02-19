package com.frimapp.smartmath;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;

public class Materi44Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_materi044);
        WebView wv = (WebView) findViewById(R.id.webView);
        final String mimeType = "text/html";
        final String encoding = "UTF-8";
        String html = "<html lang=en\">\n" +
                "<p>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; Bagian kedua tentang segitiga sama kaki adalah membahas cara menghitung luas. Cara menghitung luas segitiga sama kaki <b>SAMA SAJA</b> dengan menghitung luas segitiga sama sisi.</p>\n" +
                "<p><img src=\"file:///android_res/drawable/materi030401.png\" width=\"256\" height=\"256\"></p>\n" +
                "<p><b>RUMUS LUAS :</b></p>\n" +
                "<p>Luas = <font color=\"#00BFFF\">a</color><font color=\"black\"> x <font color=\"#FF8800\">t</color><font color=\"black\"></color> / 2</p>\n" +
                "<p>Keterangan :</p>\n" +
                "<p><font color=\"#00BFFF\">a = alas</color><font color=\"black\"></color></p>\n" +
                "<p><font color=\"#FF8800\">t = tinggi</color><font color=\"black\"></color></p>\n" +
                "<p><b>CONTOH SOAL:</b></p>\n" +
                "<p>Diketahui : <font color=#00BFFF>a <font color=Black>=<font color=#00BFFF> 7<font color=Black></color> </p>\n" +
                "<p>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp; <font <font color=#FF8800>t <font color=Black>=<font color=#FF8800> 10<font color=Black></color></p>\n" +
                "<p>Ditanyakan : Luas = ..?</p>\n" +
                "<p>Jawab : Luas =  <font color=#00BFFF>a <font color=Black>x <font color=#FF8800> t <font color=\"black\"> / 2</color></p>\n" +
                "<p>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;Luas = <font color=\"#00BFFF\">7</color> <font color=\"black\"></color> x <font color=\"#FF8800\">10</color> <font color=\"black\">/ 2</color></p>\n" +
                "<p>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;Luas = 70<font color=\"black\"> / 2</color></p>\n" +
                "<p>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;Luas = 35</p>";


        wv.loadDataWithBaseURL("", html, mimeType, encoding, "");

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(R.anim.slide_kiri, R.anim.slideout_kanan);
    }
    public void PAHAM (View v) {
        final Intent i = new Intent(getApplicationContext(), Materi44testActivity.class);
        startActivity(i);
    }
}