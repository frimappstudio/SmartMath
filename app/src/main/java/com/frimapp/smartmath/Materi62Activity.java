package com.frimapp.smartmath;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;

public class Materi62Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_materi62);
        WebView wv = (WebView) findViewById(R.id.webView);
        final String mimeType = "text/html";
        final String encoding = "UTF-8";
        String html = "<html lang=\"en\">\n" +
                "<p>Materi kedua tentang jajargenjang yaitu <b>Menghitung luas</b></p>\n" +
                "<p><b>RUMUS:</b></p>\n" +
                "<img src=\"file:///android_res/drawable/materi030902.png\" width=\"105\" height=\"76\" alt=\"\" title=\"\" />\n" +
                "<p><b>KETERANGAN: </b></p>\n" +
                "<p><p>L = luas</p>\n" +
                "<p><font color=red>t = tinggi</p>\n" +
                "<p><font color=green>a = alas<font color=black></p>\n" +
                "<p>CONTOH SOAL:</p>\n" +
                "<img src=\"file:///android_res/drawable/materi030903.png\" width=\"400\" height=\"223\" alt=\"\" title=\"\" />\n" +
                "<p>Diketahui : </p>\n" +
                "<p><font color=green>a <font color= black> = <font color=green >15 </p>\n" +
                "<p><font color=red>t <font color= black> = <font color=red >12<font color= black> </color></p>\n" +
                "<p>Ditanyakan: Luas ?</p>\n" +
                "<p><b>Jawab :</b></p>\n" +
                "<p>L = <font color= green> a <font color= black>x <font color= red>t<font color= black> </color></p>\n" +
                "<p>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp <font color= green> 15<font color= black>x <font color= red>12<font color= black> </color>= 180</p>\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n";


        wv.loadDataWithBaseURL("", html, mimeType, encoding, "");

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(R.anim.slide_kiri, R.anim.slideout_kanan);
    }
    public void PAHAM (View v) {
        final Intent i = new Intent(getApplicationContext(), Materi62testActivity.class);
        startActivity(i);
    }
}
