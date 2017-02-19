package com.frimapp.smartmath;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;

public class Materi38Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_materi038);
        WebView wv = (WebView) findViewById(R.id.webView);
        final String mimeType = "text/html";
        final String encoding = "UTF-8";
        String html = "<html>\n" +
                "<p>Materi kedua tentang <font color=\"red\">p</color><font color=\"#FF8800\">e</color><font color=\"green\">r</color><font color=\"blue\">s</color><font color=\"#FF8800\">e</color><font color=\"green\">g</color><font color=\"blue\">i</color><font color=\"black\">  yaitu cara menghitung luas. Luas yaitu persegi yang berukuran 1cm<sup>2</sup> yang memenuhi bidang datar tersebut.</p>\n" +
                "<img src=\"file:///android_res/drawable/materi030105.png\" width=\"333\" height=\"333\" alt=\"\" title=\"\" />\n" +
                "<p>Persegi hitam dan berangka 1,2,3,4 tersebut adalah berukuran 1cm<sup>2</sup>. Banyak persegi berukuran 1cm<sup>2</sup> itu berdasarkan berapa ukuran <font color=\"red\">p</color><font color=\"#FF8800\">e</color><font color=\"green\">r</color><font color=\"blue\">s</color><font color=\"#FF8800\">e</color><font color=\"green\">g</color><font color=\"blue\">i</color><font color=\"black\"> yang dibahas.</color></p>\n" +
                "<p>&nbsp;&nbsp;&nbsp; Cara menghitung luas <font color=\"red\">p</color><font color=\"#FF8800\">e</color><font color=\"green\">r</color><font color=\"blue\">s</color><font color=\"#FF8800\">e</color><font color=\"green\">g</color><font color=\"blue\">i</color><font color=\"black\">  yaitu : <font color =\"red\">s</color><font color=\"#FF8800\">i</color><font color =\"green\">s</color><font color=\"blue\">i</color><font color=\"black\"> x <font color =\"red\">s</color><font color=\"#FF8800\">i</color><font color =\"green\">s</color><font color=\"blue\">i</color><font color=\"black\"><br /><strong>Contoh :</strong></p>\n" +
                "<p><b>1. Perhatikan <font color=\"red\">p</color><font color=\"#FF8800\">e</color><font color=\"green\">r</color><font color=\"blue\">s</color><font color=\"#FF8800\">e</color><font color=\"green\">g</color><font color=\"blue\">i</color><font color=\"black\">  dibawah ini.</b></p>\n" +
                "<p><strong><img src=\"file:///android_res/drawable/materi030102.png\" alt=\"\" width=\"403\" height=\"197\" /></strong></p>\n" +
                "<p>Dapat kita ketahui bahwa ukuran sisi 4 cm. Sisi biru juga 4cm karena semua sisi <font color=\"red\">p</color><font color=\"#FF8800\">e</color><font color=\"green\">r</color><font color=\"blue\">s</color><font color=\"#FF8800\">e</color><font color=\"green\">g</color><font color=\"blue\">i</color><font color=\"black\">  adalah <strong>sama</strong>.</p>\n" +
                "<p><b>2. Hitunglah dengan rumus tadi.</b></p>\n" +
                "<p><font color=\"red\">4</color><font color=\"#FF8800\">c</color><font color=\"green\">m</color> <font color=\"black\">x</color> <font color=\"blue\">4</color><font color=\"red\">c</color><font color=\"#FF8800\">m</color> <font color=\"black\"></color> = 16cm<sup>2</sup></p>\n" +
                "<p>Maka hasilnya adalah 16cm<sup>2</sub>. </p>\n" +
                "<p>Hitunglah persegi hitam yang ada didalam <font color=\"red\">p</color><font color=\"#FF8800\">e</color><font color=\"green\">r</color><font color=\"blue\">s</color><font color=\"#FF8800\">e</color><font color=\"green\">g</color><font color=\"blue\">i</color><font color=\"black\"> di bawah ini apakah sama dengan hasil yang anda hitung?</p>\n" +
                "<img src=\"file:///android_res/drawable/materi030106.png\" width=\"333\" height=\"333\" alt=\"\" title=\"\" />\n" +
                "\n" +
                "</html>\n";

        wv.loadDataWithBaseURL("", html, mimeType, encoding, "");

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(R.anim.slide_kiri, R.anim.slideout_kanan);
    }
    public void PAHAM (View v) {
        final Intent i = new Intent(getApplicationContext(), Materi38testActivity.class);
        startActivity(i);
    }
}