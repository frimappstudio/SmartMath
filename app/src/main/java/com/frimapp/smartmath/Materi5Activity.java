package com.frimapp.smartmath;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;

public class Materi5Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_materi005);
        WebView wv = (WebView) findViewById(R.id.webView);
        final String mimeType = "text/html";
        final String encoding = "UTF-8";
        String html = "<p>1. Pengertian</p>\n" +
                "<p>&nbsp;&nbsp;&nbsp;&nbsp; Pengurangan adalah salah satu dari empat operasi dasar aritmatika dan pada prinsipnya merupakan kebalikan dari operasi penjumlahan. Operasi pengurangan dinyatakan dengan tanda minus ( - ). Contoh soal :</p>\n" +
                "<p>&nbsp;</p>\n" +
                "<p>2. Contoh Soal</p>\n" +
                "<p>&nbsp;&nbsp;&nbsp;&nbsp; a.&nbsp; 5 - 3 =...</p>\n" +
                "<p>&nbsp;&nbsp;&nbsp; Penyelesaian:</p>\n" +
                "<p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; kalau belum tau apa-apa, untuk menyelesaikannya Anda harus membuka lima jari Anda. setelah itu, Anda tutup tiga jari. lalu hitunglah berapa jari yang masih terbuka. kalau jari yang masih terbuka ada 2, berarti anda telah memahaminya.</p>\n" +
                "<p>&nbsp;&nbsp;&nbsp; &nbsp; b. 10 - 5 =...</p>\n" +
                "<p>&nbsp;&nbsp;&nbsp; Penyelesaian:</p>\n" +
                "<p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; Anda harus membuka sepuluh jari tangan kanan dan kiri, lalu Anda tutuplah lima jari dan hitunglah berapa jari yang terbuka. Kalau jari yang masih terbuka ada 5, berarti Anda telah memahaminya.</p>";
        wv.loadDataWithBaseURL("", html, mimeType, encoding, "");

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(R.anim.slide_kiri, R.anim.slideout_kanan);
    }
    public void PAHAM (View v) {
        final Intent i = new Intent(getApplicationContext(), Materi5testActivity.class);
        startActivity(i);
    }
}
