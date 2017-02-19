package com.frimapp.smartmath;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;

public class Materi13Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_materi013);
        WebView wv = (WebView) findViewById(R.id.webView);
        final String mimeType = "text/html";
        final String encoding = "UTF-8";
        String html = "<p>1. Pengertian</p>\n" +
                "<p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; Pembagian adalah operasi aritmetika dasar yang merupakan kebalikan dari operasi perkalian</p>\n" +
                "<p>&nbsp;</p>\n" +
                "<p>2. Contoh Soal</p>\n" +
                "<p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; a. 20 / 4 =...</p>\n" +
                "<p>&nbsp;&nbsp;&nbsp; penyelesaian:</p>\n" +
                "<p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; misalkan Anda mempunyai 20 kelereng lalu dibagikan ke 4 teman Anda. Nah berapa kelereng yang didapatkan setiap teman Anda. Jawabannya adalah 5</p>\n" +
                "<p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; b. 75 / 25 =...</p>\n" +
                "<p>&nbsp;&nbsp;&nbsp; Penyelesaian:</p>\n" +
                "<p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 75=(25+25+25)= Ada 3(25)</p>\n" +
                "<p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; Jadi jawabannya adalah 3</p>";


        wv.loadDataWithBaseURL("", html, mimeType, encoding, "");

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(R.anim.slide_kiri, R.anim.slideout_kanan);
    }
    public void PAHAM (View v) {
        final Intent i = new Intent(getApplicationContext(), Materi13testActivity.class);
        startActivity(i);
    }
}
