package com.frimapp.smartmath;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;

public class Materi59Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_materi059);
        WebView wv = (WebView) findViewById(R.id.webView);
        final String mimeType = "text/html";
        final String encoding = "UTF-8";
        String html = "<html lang=\"en\">\n" +
                "<p><b>Belah ketupat</b> adalah bangun datar yang memiliki <b>dua diagonal yang sama panjang dan sisi-sisinya sama panjang</b>.</p>\n" +
                "<img  src=\"file:///android_res/drawable/materi030801.png\" />\n" +
                "<p>Keliling belah ketupat yaitu panjang keseluruhan garis yang menyelimuti belah ketupat.</p>\n" +
                "<img src=\"file:///android_res/drawable/materi030803.png\" />\n" +
                "<p><b>Rumus: K</b> = <font color= \"green\">S x 4  atau ( S + S + S + S )<font color= \"#000000\"></p>\n" +
                "<p>Contoh soal :</p>\n" +
                "<img src=\"file:///android_res/drawable/materi030804.png\" />\n" +
                "<p>Diketahui: <font color= \"green\">S = 10<font color= \"#000000\"></p>\n" +
                "<p>Ditanyakan: Keliling ?</p>\n" +
                "<p>jawab: Keliling </b> = <font color= \"green\">S x 4 <font color= \"#000000\"></p>\n" +
                "<p>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;Keliling = <font color=\"green\">10 x 4 = 40<font color= \"#000000\"></p>\n" +
                "\n";


        wv.loadDataWithBaseURL("", html, mimeType, encoding, "");

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(R.anim.slide_kiri, R.anim.slideout_kanan);
    }
    public void PAHAM (View v) {
        final Intent i = new Intent(getApplicationContext(), Materi59testActivity.class);
        startActivity(i);
    }
}