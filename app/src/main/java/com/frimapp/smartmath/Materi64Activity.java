package com.frimapp.smartmath;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;

public class Materi64Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_materi64);
        WebView wv = (WebView) findViewById(R.id.webView);
        final String mimeType = "text/html";
        final String encoding = "UTF-8";
        String html = "<html lang=\"en\">\n" +
                "<p>Materi kedua tentang trapesium yaitu <b>Menghitung luas</b></p>\n" +
                "<p><b>RUMUS:</b></p>\n" +
                "<img src=\"file:///android_res/drawable/materi031002.png\" width=\"256\" height=\"150\" alt=\"\" title=\"\" />\n" +
                "<p><b>CONTOH SOAL:</b></p>\n" +
                "<img src=\"file:///android_res/drawable/materi031003.png\" width=\"356\" height=\"200\" alt=\"\" title=\"\" />\n" +
                "<p>Diketahui: </p>\n" +
                "<ul><font color=\"#FF0000\">a <font color=\"black\"> = <font color=\"#FF0000\">7cm\n" +
                "</ul> \n" +
                "<ul><font color=\"#FF8000\">b <font color=\"black\"> = <font color=\"#FF8000\">12cm\n" +
                "</ul>\n" +
                "<ul><font color=\"blue\">t <font color=\"black\"> = <font color=\"blue\">12cm\n" +
                "<font color=\"black\"> </color></ul>\n" +
                "<p>Ditanyakan : Luas?\n" +
                "</p> \n" +
                "<p><b>Jawab:</b></p>\n" +
                "<ul>&nbsp;&nbsp;&nbsp; L = 1\\2 x <font color=\"blue\">t <font color=\"black\">( <font color=\"#FF0000\">a<font color=\"black\"> + <font color=\"#FF8800\">b<font color=\"black\"> </color> )\n" +
                "</ul> \n" +
                "<ul>&nbsp;&nbsp;&nbsp; L = 1\\2 x <font color=\"blue\">10 <font color=\"black\">( <font color=\"#FF0000\">7<font color=\"black\"> + <font color=\"#FF8800\">12<font color=\"black\"> </color> )\n" +
                "</ul> \n" +
                "<ul>&nbsp; &nbsp; L = 1\\2 x <font color=\"blue\">10 <font color=\"black\"> </color>  x19\n" +
                "</ul> \n" +
                "</ul> \n" +
                "<ul>&nbsp; &nbsp; L = 1\\2 x 190 = 95cm<sup>2</sup>\n" +
                "</ul> ";


        wv.loadDataWithBaseURL("", html, mimeType, encoding, "");

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(R.anim.slide_kiri, R.anim.slideout_kanan);
    }
    public void PAHAM (View v) {
        final Intent i = new Intent(getApplicationContext(), Materi64testActivity.class);
        startActivity(i);
    }
}
