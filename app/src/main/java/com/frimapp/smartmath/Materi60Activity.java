package com.frimapp.smartmath;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;

public class Materi60Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_materi060);
        WebView wv = (WebView) findViewById(R.id.webView);
        final String mimeType = "text/html";
        final String encoding = "UTF-8";
        String html = "<html lang=\"en\">\n" +
                "<p><b>Belah ketupat</b> adalah bangun datar yang memiliki <b>dua diagonal yang sama panjang.</b></p>\n" +
                "<img  src=\"file:///android_res/drawable/materi030801.png\" />\n" +
                "<p><b>RUMUS: L = <font color= #FF9900>D1 <font color=BLACK>x <font color= GREEN>D2<font color=BLACK> </b> / 2</p>\n" +
                "<p><b>Keterangan :</b></p>\n" +
                "<p>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp L = Luas</p>\n" +
                "<p>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp <font color=\"#FF9900\">D1 = Diagonal 1</color><font color=\"black\"></color></p>\n" +
                "<p>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp <font color=\"GREEN\">D2 = Diagonal 2</color><font color=\"black\"></color> </p>\n" +
                "<p><b>Contoh Soal:</b></p>\n" +
                "<img src=\"file:///android_res/drawable/materi030802.png\" />\n" +
                "<p>Diketahui : <font color= #FF9900>D1 <font color=BLACK>=<font color=#FF9900> 10cm</p>\n" +
                "<p>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;<font color= GREEN>D2 <font color=BLACK>=<font color=GREEN> 10cm <font color=BLACK></p>\n" +
                "<p>Ditanyakan: Luas=?</p>\n" +
                "<p>Jawab: L=1\\2 x <font color= #FF9900>D1 <font color=BLACK>x <font color= GREEN>D2<font color=BLACK> </p>\n" +
                "<P>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp 1\\2 x <font color= #FF9900>10cm <font color=BLACK>x <font color= GREEN>10cm<font color=BLACK> </p>\n" +
                "<p>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp 1\\2 x 100cm</p>\n" +
                "<p>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp 100\\2 = 50cm<sup>2</sup></p>\n";
        wv.loadDataWithBaseURL("", html, mimeType, encoding, "");
    }
    @Override
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(R.anim.slide_kiri, R.anim.slideout_kanan);
    }
    public void PAHAM (View v) {
        final Intent i = new Intent(getApplicationContext(), Materi60testActivity.class);
        startActivity(i);
    }
}