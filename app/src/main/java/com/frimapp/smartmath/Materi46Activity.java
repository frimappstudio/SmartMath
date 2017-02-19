package com.frimapp.smartmath;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;

public class Materi46Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_materi046);
        WebView wv = (WebView) findViewById(R.id.webView);
        final String mimeType = "text/html";
        final String encoding = "UTF-8";
        String html = "\n" +
                "<html>\n" +
                "<p>Materi kedua adalah cara menghitung luas.</p>\n" +
                "<p><b>Rumus Luas:</b></p>\n" +
                "<img src=\"file:///android_res/drawable/materi030502.png\" width=\"256\" height=\"40\" alt=\"\" title=\"\" />\n" +
                "<p>Dimana :</p>\n" +
                "<p><font color=\"green\">S</color><font color=\"black\"></color> = Keliling/2 = (<font color=\"red\">a</color><font color=\"black\"></color> + <font color=\"#FF8800\">b</color><font color=\"black\"></color> + <font color=\"blue\">c</color><font color=\"black\"></color>) / 2</p>\n" +
                "<p><b>Contoh Soal :</b></p>\n" +
                "<img src=\"file:///android_res/drawable/materi030501.png\" width=\"256\" height=\"256\" alt=\"\" title=\"\" />\n" +
                "<p>Diketahui :<font color=\"red\"></color> a = 8cm<font color=\"black\"></color></p>\n" +
                "<p>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp;&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; <font color=\"#FF8800\"></color>b = 10cm<font color=\"black\"></color></p>\n" +
                "<p>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp;&nbsp; &nbsp; &nbsp; &nbsp; &nbsp;<font color=\"blue\"></color> c = 4cm<font color=\"black\"></color></p>\n" +
                "<p>Ditanyakan : Luas=..?</p>\n" +
                "<p>Jawab :</p>\n" +
                "<p><font color=\"green\">S</color><font color=\"black\"></color> = Keliling/2 = (<font color=\"red\">a</color><font color=\"black\"></color> + <font color=\"#FF8800\">b</color><font color=\"black\"></color> + <font color=\"blue\">c</color><font color=\"black\"></color>) / 2</p>\n" +
                "<p><font color=\"green\">S</color><font color=\"black\"></color> = Keliling/2 = (<font color=\"red\">8</color><font color=\"black\"></color> + <font color=\"#FF8800\">10</color><font color=\"black\"></color> + <font color=\"blue\">4</color><font color=\"black\"></color>) / 2</p>\n" +
                "<p><font color=\"green\">S</color><font color=\"black\"></color> = 22/2 = 11cm</p> \n" +
                "<p>Luas = <img src=\"file:///android_res/drawable/materi030503.png\" width=\"189\" height=\"39\" alt=\"\" title=\"\" /></p>\n" +
                "<p>Luas = <img src=\"file:///android_res/drawable/materi030504.png\" width=\"266\" height=\"39\" alt=\"\" title=\"\" /></p>\n" +
                "<p>Luas = <img src=\"file:///android_res/drawable/materi030505.png\" width=\"175\" height=\"39\" alt=\"\" title=\"\" /></p>\n" +
                "<p>Luas = <img src=\"file:///android_res/drawable/materi030506.png\" width=\"175\" height=\"39\" alt=\"\" title=\"\" /></p>\n" +
                "<p>Luas = 231cm<sup>2</sup></p>\n" +
                "</html>";


        wv.loadDataWithBaseURL("", html, mimeType, encoding, "");

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(R.anim.slide_kiri, R.anim.slideout_kanan);
    }
    public void PAHAM (View v) {
        final Intent i = new Intent(getApplicationContext(), Materi46testActivity.class);
        startActivity(i);
    }
}