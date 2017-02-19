package com.frimapp.smartmath;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;

public class Materi61Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_materi61);
        WebView wv = (WebView) findViewById(R.id.webView);
        final String mimeType = "text/html";
        final String encoding = "UTF-8";
        String html = "<html lang=\"en\">\n" +
                "<p><b>JAJAR GENJANG</b> adalah bagun datar yang mempunyai 4 sisi dan jajar genjang seperti persegi panjang yang direndahkan.</p>\n" +
                "<p>RUMUS keliling jajar genjang = <font color=\"blue\">(a x 2 )<font color=\"#000000\"> +  <font color=\"orange\">( b x 2)<font color=\"000000\"></color></p>\n" +
                "<img src=\"file:///android_res/drawable/materi030901.png\" width=\"313\" height=\"152\" alt=\"\" title=\"\" />\n" +
                "<p><b>Contoh soal :</b></p>\n" +
                "<img src=\"file:///android_res/drawable/materi030905.png\" width=\"313\" height=\"152\" alt=\"\" title=\"\" />\n" +
                "<p>Diketahui : <font color=\"blue\"> a = 16</p>\n" +
                "<p>&nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp&nbsp <font color=\"orange\">b= 12<font color=\"000000\"></color></p>\n" +
                "<p>Ditanyakan: Keliling ?</p>\n" +
                "<p><b>Jawab :</b> keliling jajar genjang = <font color=\"blue\">(a x 2 )<font color=\"#000000\"> +  <font color=\"orange\">( b x 2)<font color=\"000000\"></color></p>\n" +
                "<p>&nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp = <font color=\"blue\">(16 x 2 )<font color=\"#000000\"> +  <font color=\"orange\">( 12 x 2)<font color=\"000000\"></color></p>\n" +
                "<p>&nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp = <font color=\"blue\">(32 )<font color=\"#000000\"> +  <font color=\"orange\">(24)<font color=\"000000\"> = 56</color></p>";


        wv.loadDataWithBaseURL("", html, mimeType, encoding, "");

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(R.anim.slide_kiri, R.anim.slideout_kanan);
    }
    public void PAHAM (View v) {
        final Intent i = new Intent(getApplicationContext(), Materi61testActivity.class);
        startActivity(i);
    }
}
