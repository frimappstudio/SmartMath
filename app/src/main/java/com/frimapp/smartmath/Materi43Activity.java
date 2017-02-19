package com.frimapp.smartmath;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;

public class Materi43Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_materi043);
        WebView wv = (WebView) findViewById(R.id.webView);
        final String mimeType = "text/html";
        final String encoding = "UTF-8";
        String html = "<!DOCTYPE html>\n" +
                "<html lang=\"en\">\n" +
                "<p>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; <b>Segitiga Sama Kaki</b> adalah sebuah bangun datar yang memiliki <font color=\"#FFE202\">dua sisi</color><font color=\"black\"></color> yang sama panjang. </b>\n" +
                "<p><img src=\"file:///android_res/drawable/materi030401.png\" width=\"256\" height=\"256\"></p>\n" +
                "<p><b>Rumus Keliling :</b> Keliling = <font color=\"#09D2FF\">A</color><font color=\"black\"></color> + <font color=\"#FFE202\">S</color><font color=\"black\"></color> + <font color=\"#FFE202\">S</color><font color=\"black\"></color></p>\n" +
                "<p></p>\n" +
                "\n" +
                "</html>";


        wv.loadDataWithBaseURL("", html, mimeType, encoding, "");

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(R.anim.slide_kiri, R.anim.slideout_kanan);
    }
    public void PAHAM (View v) {
        final Intent i = new Intent(getApplicationContext(), Materi43testActivity.class);
        startActivity(i);
    }
}