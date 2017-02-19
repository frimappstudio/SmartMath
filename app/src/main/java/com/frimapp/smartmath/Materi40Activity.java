package com.frimapp.smartmath;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;

public class Materi40Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_materi040);
        WebView wv = (WebView) findViewById(R.id.webView);
        final String mimeType = "text/html";
        final String encoding = "UTF-8";
        String html = "<html>\n" +
                "<p>Materi kedua mengenai persegi panjang adalah cara menghitung luas. </p>\n" +
                "<p><b>Rumus Luas : </b>  L = <font color=\"green\"></color>p<font color=\"black\"></color> x <font color=\"#FF8800\"></color>l<font color=\"black\"></color> </p>\n" +
                "<p><b>Keterangan</b></p>\n" +
                "<p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; L = Luas</p>\n" +
                "<p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <font color=\"green\"></color>p = Panjang<font color=\"black\"></color></p\n" +
                "<p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <font color=\"#FF8800\"></color>l = Lebar<font color=\"black\"></color></p>\n" +
                "<p><b>Contoh :</b></p>\n" +
                "<img src=\"materi030201.png\" width=\"256\" height=\"150\" alt=\"\" title=\"\" />\n" +
                "<p>Diketahui : <font color=\"green\"> p = 5cm</color><font color=\"black\"></color></p>\n" +
                "<p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <font color=\"#FF8800\">l = 10cm</color><font color=\"black\"></color></p>\n" +
                "<p>Ditanyakan: Luas = ?</p>\n" +
                "<p>Jawab : L = <font color=\"green\">p</color><font color=\"black\"></color> x <font color=\"#FF8800\">l</color><font color=\"black\"></color></p>\n" +
                "<p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;L = <font color=\"green\">5cm</color><font color=\"black\"></color> x <font color=\"#FF8800\">10cm</color><font color=\"black\"></color></p>\n" +
                "<p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;L = 10cm<sup>2</sup></p>\n" +
                "</html>";


        wv.loadDataWithBaseURL("", html, mimeType, encoding, "");

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(R.anim.slide_kiri, R.anim.slideout_kanan);
    }
    public void PAHAM (View v) {
        final Intent i = new Intent(getApplicationContext(), Materi40testActivity.class);
        startActivity(i);
    }
}