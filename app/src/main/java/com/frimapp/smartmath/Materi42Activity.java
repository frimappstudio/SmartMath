package com.frimapp.smartmath;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;

public class Materi42Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_materi042);
        WebView wv = (WebView) findViewById(R.id.webView);
        final String mimeType = "text/html";
        final String encoding = "UTF-8";
        String html = "<html>\n" +
                "<p>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; Seperti materi-materi sebelumnya, di materi segitiga sama sisi ini, untuk materi bagian II sama-sama membahas tentang cara mencari luas.</p>\n" +
                "<p><b>Rumus Luas :</b> (a x t) / 2</p>\n" +
                "<p>Keterangan :</p>\n" +
                "<p>L = Luas</p>\n" +
                "<p><img src=\"file:///android_res/drawable/materi030303.png\" alt=\"\" width=\"128\" height=\"128\" /></p>\n" +
                "<p>Semua yang berwarna <font color=\"#B67000\"></color>coklat<font color=\"black\"></color> adalah luas segi tiga.</p>\n" +
                "<p><span style=\\\"text-decoration: underline;\\\"><strong>CONTOH SOAL :</strong></span></p>\n" +
                "<p><img src=\"file:///android_res/drawable/materi030305.png\" alt=\"\" width=\"128\" height=\"128\" /></p>\n" +
                "<p>Diketahui : <font color=\"blue\"> a = 10cm</color></p>\n" +
                "<p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"green\"> t = 8cm</color><font color=\"black\"></color></p>\n" +
                "<p>Ditanyakan : Luas = ?</p>\n" +
                "<p>Jawab :</p>\n" +
                "<p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Luas = 1/2 x <font color=\"blue\">a</color><font color=\"black\"></color> x <font color=\"green\">t</color><font color=\"black\"></color></p>\n" +
                "<p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Luas = 1/2 x <font color=\"blue\">10cm</color><font color=\"black\"></color> x <font color=\"green\">8cm</color><font color=\"black\"></color></p>\n" +
                "<p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Luas = 1/2 x 80cm</p>\n" +
                "<p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Luas = 40cm<sup>2</sup></p>\n" +
                "</html>";


        wv.loadDataWithBaseURL("", html, mimeType, encoding, "");

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(R.anim.slide_kiri, R.anim.slideout_kanan);
    }
    public void PAHAM (View v) {
        final Intent i = new Intent(getApplicationContext(), Materi42testActivity.class);
        startActivity(i);
    }
}