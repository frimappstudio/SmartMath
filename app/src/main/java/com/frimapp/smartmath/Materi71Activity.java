package com.frimapp.smartmath;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;

public class Materi71Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_materi71);
        WebView wv = (WebView) findViewById(R.id.webView);
        final String mimeType = "text/html";
        final String encoding = "UTF-8";
        String html = "<html=lang\"an\">\n" +
                "<p><b>Volume Kubus </b>yaitu isi dalam kubus. Yang dirumuskan : </p>\n" +
                "<p>&nbsp; &nbsp; <b>s<sup>3</b></sup> atau <b>s x s x s </b></p>\n" +
                "<p><b><u>Contoh soal : </b></u></p>\n" +
                "<p><img src=\"materi040104.PNG\" width=\"106\" height=\"119\" alt=\"\" title=\"\" /></p>\n" +
                "<p>Dari gambar di atas, tentukan  berapa volume kubus tersebut? </p>\n" +
                "<p><b>Penyelesaian : </b></p>\n" +
                "<p>Diketahui :<font color=\"red\"> s<font color=\"black\"> = <font color=\"red\">9 cm<font color=\"black\"> </p>\n" +
                "<p>Ditanya &nbsp;&nbsp; : Volume ? </p>\n" +
                "<p>Jawab &nbsp;&nbsp;&nbsp; &nbsp;   : V = <font color=\"red\">s<font color=\"black\"> x <font color=\"red\">s<font color=\"black\"> x <font color=\"red\">s<font color=\"black\"> </p>\n" +
                "<p>&nbsp;&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;&nbsp; &nbsp; &nbsp;&nbsp; = <font color=\"red\">9<font color=\"black\"> x <font color=\"red\">9<font color=\"black\"> x <font color=\"red\">9<font color=\"black\"> </p>\n" +
                "<p>&nbsp;&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;&nbsp; &nbsp; &nbsp;&nbsp; = 729 cm<sup>3</sup> </p> </html>";


        wv.loadDataWithBaseURL("", html, mimeType, encoding, "");

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(R.anim.slide_kiri, R.anim.slideout_kanan);
    }
    public void PAHAM (View v) {
        final Intent i = new Intent(getApplicationContext(), Materi71testActivity.class);
        startActivity(i);
    }
}
