package com.frimapp.smartmath;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;

public class Materi57Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_materi057);
        WebView wv = (WebView) findViewById(R.id.webView);
        final String mimeType = "text/html";
        final String encoding = "UTF-8";
        String html = "<html lang=\"en\">\n" +
                "<p><b>Layang-layang</b> adalah bangun datar yang menyerupai layang-layang yang biasa kita mainkan sehari hari. Layang-layang mempunyai dua diagonal yang berbeda ukuran .</p>\n" +
                "<img src=\"file:///android_res/drawable/materi030701.png\"></p>\n" +
                "<p>Keliling layang-layang adalah panjang garis yang membentuk layang-layang.</p>\n" +
                "<img src=\"file:///android_res/drawable/materi030705.png\">\n" +
                "<p><b>Rumus:</b>  Keliling = <font color=\"##0080FF\">a + a<font color=\"#000000\"> +  <font color=\"green\">b + b<font color=\"000000\"></color></p>\n" +
                "<p><b>Contoh soal :</b></p>\n" +
                "<img src=\"file:///android_res/drawable/materi030706.png\">\n" +
                "<p>Diketahui : <font color=\"##0080FF\">a = 8cm</p>\n" +
                "<p>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;<font color=\"green\">b = 10cm<font color=\"black\"></p>\n" +
                "<p>Jaawab: Keliling = <font color=\"##0080FF\">a + a<font color=\"#000000\"> +  <font color=\"green\">b + b<font color=\"000000\"></color></p>\n" +
                "<p>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;<font color=\"##0080FF\">8cm + 8cm<font color=\"#000000\"> +  <font color=\"green\">10cm + 10cm<font color=\"000000\"></color></p>\n" +
                "<p>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;<font color=\"##0080FF\">16cm <font color=\"#000000\"> +  <font color=\"green\"> 20cm <font color=\"000000\">= 36cm</color></p>\n" +
                "\n";


        wv.loadDataWithBaseURL("", html, mimeType, encoding, "");

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(R.anim.slide_kiri, R.anim.slideout_kanan);
    }
    public void PAHAM (View v) {
        final Intent i = new Intent(getApplicationContext(), Materi57testActivity.class);
        startActivity(i);
    }
}