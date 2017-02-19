package com.frimapp.smartmath;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;

public class Materi39Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_materi039);
        WebView wv = (WebView) findViewById(R.id.webView);
        final String mimeType = "text/html";
        final String encoding = "UTF-8";
        String html = "<html lang=\"en\">\n" +
                " <html>\n" +
                "<p><b>Persegi panjang</b> adalah bangun datar 2 dimensi yang memiliki 2 pasang rusuk yang sejajar dan sama panjang antara rusuk yang sejajar dan berbeda panjang antara rusuk yang tidak sejajar. Berikut adalah contoh dari persegi panjang : </p>\n" +
                "<img src=\"file:///android_res/drawable/materi030201.png\" width=\"256\" height=\"150\" alt=\"\" title=\"\" />\n" +
                "<p>Perhatikan persegi panjang diatas. Garis berwarna <font color=\"#FF8800\"></color>oranye<font color=\"black\"></color> menunjukan <font color=\"#FF8800\"></color><b>lebar</b><font color=\"black\"></color>, dan garis berwarna <font color=\"green\"></color>hijau<font color=\"black\"></color> menunjukan <font color=\"green\"></color><b>panjang</b><font color=\"black\"></color>. <font color=\"#FF8800\"></color>Lebar<font color=\"black\"></color> lebih besar dibandingkan <font color=\"green\"></color>panjang<font color=\"black\"></color>.</p> \n" +
                "<p><b>Cara Menghitung Keliling :</b></p>\n" +
                "<p>Keliling =  <font color=\"#FF8800\">L + L</color><font color=\"black\"></color> + <font color=\"green\">P + P</color><font color=\"black\"></color></p>\n" +
                "<p><b>Contoh Soal :</b></p>\n" +
                "<img src=\"file:///android_res/drawable/materi030201.png\" width=\"256\" height=\"150\" alt=\"\" title=\"\" />\n" +
                "<p>Diketahui :</p>\n" +
                "<p>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;&nbsp; &nbsp; &nbsp; &nbsp; <font color=\"#FF8800\">L = 10</color><font color=\"black\"></color></p>\n" +
                "<p>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;&nbsp; &nbsp; &nbsp; &nbsp; <font color=\"green\">P = 5</color><font color=\"black\"></color></p>\n" +
                "<p>Ditanyakan : Keliling = ?</p>\n" +
                "<p>Jawab :</p>\n" +
                "<p>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; Keliling =  <font color=\"#FF8800\">L + L</color><font color=\"black\"></color> + <font color=\"green\">P + P</color><font color=\"black\"></color></p>\n" +
                "<p>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; Keliling =  <font color=\"#FF8800\">10 + 10</color><font color=\"black\"></color> + <font color=\"green\">5 + 5</color><font color=\"black\"></color></p>\n" +
                "<p>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; Keliling = 30cm</p>\n" +
                "</html>";


        wv.loadDataWithBaseURL("", html, mimeType, encoding, "");

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(R.anim.slide_kiri, R.anim.slideout_kanan);
    }
    public void PAHAM (View v) {
        final Intent i = new Intent(getApplicationContext(), Materi39testActivity.class);
        startActivity(i);
    }
}