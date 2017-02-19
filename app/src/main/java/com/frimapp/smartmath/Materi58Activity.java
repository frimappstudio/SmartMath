package com.frimapp.smartmath;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;

public class Materi58Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_materi058);
        WebView wv = (WebView) findViewById(R.id.webView);
        final String mimeType = "text/html";
        final String encoding = "UTF-8";
        String html = "<html lang=\"en\">\n" +
                "<p>Materi kedua tentang layang layang yaitu <b>Menghitung luas</b> </p>\n" +
                "<p><strong> <b>Rumus Luas Layang-layang</b>:</strong><strong><img src=\"file:///android_res/drawable/materi030704.png\" alt=\"\" width=\"113\" height=\"50\" /></strong></p>\n" +
                "<p>Keterangan :</n>\n" +
                "<p>L = Luas</p>\n" +
                "<p>D1 = Diagonal 1</p>\n" +
                "<p>D2 = Diagonal 2</p>\n" +
                "<p>&nbsp;</p>\n" +
                "<p><strong>CONTOH SOAL: </strong></p>\n" +
                "<p><strong><img src=\"file:///android_res/drawable/materi030702.png\" alt=\"\" width=\"133\" height=\"193\" /></strong></p>\n" +
                "<p>&nbsp;</p>\n" +
                "<p> Diketahui : </p>\n" +
                "<p><font color=\"#F49F00\">Diagonal 1 = 10cm</color></p>\n" +
                "<p><font color=\"#12F43F\">Diagonal 2 = 15cm</color></p>\n" +
                "<p><font color=\"black\">Ditanyakan : Luas =...?</color></p>\n" +
                "<p> Jawab : </p>\n" +
                "<p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;L = 1/2 x <font color=\"#F49F00\">D1</color> <font color=\"black\">x</color> <font color=\"#12F43F\">D2</color> <font color=\"black\"></color></p>\n" +
                "<p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;L = 1/2 x <font color=\"#F49F00\">10cm</color> <font color=\"black\">x</color> <font color=\"#12F43F\">15cm</color><font color=\"black\"></color></p>\n" +
                "<p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;L = 1/2 x <font color=\"#0602F4\">120cm</color> <font color=\"black\"></color></p>\n" +
                "<p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;L = 75cm<sup>2</sup></p>\n" +
                "\n";


        wv.loadDataWithBaseURL("", html, mimeType, encoding, "");

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(R.anim.slide_kiri, R.anim.slideout_kanan);
    }
    public void PAHAM (View v) {
        final Intent i = new Intent(getApplicationContext(), Materi58testActivity.class);
        startActivity(i);
    }
}