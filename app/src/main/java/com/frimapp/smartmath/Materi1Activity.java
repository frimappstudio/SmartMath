package com.frimapp.smartmath;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;

public class Materi1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_materi001);
        WebView wv = (WebView) findViewById(R.id.webView);
        final String mimeType = "text/html";
        final String encoding = "UTF-8";
        String html = "<p><strong>Pertambahan </strong>merupakan salah satu operasi matematika dasar. Pertambahan dilambangkan dengan tanda + .<br /><br /><strong>Cara membaca pertambahan :</strong><br />1 + 1 = 2 (dibaca : \"satu ditambah satu sama dengan dua\")</p>\n" +
                "<p>2 + 2 = 4 (dibaca : \"dua ditambah dua sama dengan empat\")<br /><br /></p>\n" +
                "<p><strong>Cara mengerjakan pertambahan :</strong></p>\n" +
                "<p>Contoh :</p>\n" +
                "<p>2 + 2 = ....</p>\n" +
                "<p><img src=\"file:///android_res/drawable/materi010101.png\" alt=\"\" width=\"225\" height=\"52\" /></p>\n" +
                "<p>&nbsp;</p>\n" +
                "<font color=blue>2</color> <font color=black>+</color> <font color=RED>2</color> <font color=black>=</color>\n" +
                "<p>Bayangkanlah <font color=blue>2</color> <font color=black></color> apel. Lalu masukan <font color=RED>2</color> <font color=black></color> apel lagi di bayangan anda. Maka hitunglah dan hasilnya adalah <font color=GREE>4</color> <font color=black></color>.\n" +
                "<p>Jadi 2+2=4</p>\n";


        wv.loadDataWithBaseURL("", html, mimeType, encoding, "");

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(R.anim.slide_kiri, R.anim.slideout_kanan);
    }
    public void PAHAM (View v) {
        final Intent i = new Intent(getApplicationContext(), Materi1testActivity.class);
        startActivity(i);
    }
}
