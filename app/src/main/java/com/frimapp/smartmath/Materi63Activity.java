package com.frimapp.smartmath;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;

public class Materi63Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_materi63);
        WebView wv = (WebView) findViewById(R.id.webView);
        final String mimeType = "text/html";
        final String encoding = "UTF-8";
        String html = "<html lang=\"en\">\n" +
                "<p><b>TRAPESIUM</b> adalah bagun datar seperti atap rumah yang biasa kita lihat sehari-hari.</p>\n" +
                "<img src=\"file:///android_res/drawable/materi031001.png\" width=\"356\" height=\"200\" alt=\"\" title=\"\" />\n" +
                "<p><b>KETERANGAN:</b></p>\n" +
                "<p><FONT COLOR=\"RED\">a <FONT COLOR=\"black\"> = garis pertama yang berada di atas</p>\n" +
                "<p><FONT COLOR=\"FF8040\">b <FONT COLOR=\"black\"> = garis kedua yang berada di bawah</p>\n" +
                "<p><FONT COLOR=\"#00FFFF\">t <FONT COLOR=\"black\"> =  garis lurus berwarna biru yaitu tinggi</p>\n" +
                "<p><b>RUMUS:</b> Keliling =  (<FONT COLOR=\"red\">a <FONT COLOR=\"black\">+ <FONT COLOR=\"orange\"> b) <FONT COLOR=\"black\">+ (<FONT COLOR=\"#green\"> c <FONT COLOR=\"black\">x 2 ) </p> </p>\n" +
                "<img src=\"file:///android_res/drawable/materi031004.png\" width=\"356\" height=\"200\" alt=\"\" title=\"\" />\n" +
                "<p><b>Contoh soal :</b></p>\n" +
                "<img src=\"file:///android_res/drawable/materi031005.png\" width=\"356\" height=\"200\" alt=\"\" title=\"\" />\n" +
                "<p>Diketahui : <FONT COLOR=\"RED\">a = 10cm</p>\n" +
                "<p>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; <FONT COLOR=\"orange\">b = 14cm</p>\n" +
                "<p>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; <FONT COLOR=\"green\">c = 16cm<FONT COLOR=\"black\"></color></p>\n" +
                "<p><b>Jawab </b>:  Keliling = (<FONT COLOR=\"red\">a <FONT COLOR=\"black\">+ <FONT COLOR=\"orange\"> b) <FONT COLOR=\"black\">+ (<FONT COLOR=\"green\"> c <FONT COLOR=\"black\">x 2 ) </p><b></b> </\n" +
                "<p>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;&nbsp; &nbsp; &nbsp; (<FONT COLOR=\"red\">10 <FONT COLOR=\"black\">+ <FONT COLOR=\"orange\"> 14) <FONT COLOR=\"black\">+ (<FONT COLOR=\"green\"> 16 <FONT COLOR=\"black\">x 2 ) </p>\n" +
                "<p>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;&nbsp; &nbsp; &nbsp; (24) <FONT COLOR=\"black\">+ (32 ) = 56cm<sup>2</sup> </p>\n";


        wv.loadDataWithBaseURL("", html, mimeType, encoding, "");

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(R.anim.slide_kiri, R.anim.slideout_kanan);
    }
    public void PAHAM (View v) {
        final Intent i = new Intent(getApplicationContext(), Materi63testActivity.class);
        startActivity(i);
    }
}
