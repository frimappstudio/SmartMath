package com.frimapp.smartmath;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;

public class Materi45Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_materi045);
        WebView wv = (WebView) findViewById(R.id.webView);
        final String mimeType = "text/html";
        final String encoding = "UTF-8";
        String html = "<html lang=\"en\">\n" +
                "<p><b>Segitiga Sembarang</b> adalah bangun datar yang memiliki 3 sisi <b>sama seperti segitiga pada umumnya</b>, tetapi <b>semua sisinya tidak sama panjang</b>.</p>\n" +
                "<p>Berikut adalah contoh segitiga sembarang :</p>\n" +
                "<img src=\"file:///android_res/drawable/materi030501.png\" width=\"256\" height=\"256\" alt=\"\" title=\"\" />\n" +
                "<p><b>Rumus Keliling = <font color=\"red\">sisi</color><font color=\"black\"></color> + <font color=\"#FF8800\">sisi</color><font color=\"black\"></color> + <font color=\"blue\">sisi</color><font color=\"black\"></color></b></p>\n" +
                "<p><b>Contoh Soal :</b></p>\n" +
                "<img src=\"file:///android_res/drawable/materi030501.png\" width=\"256\" height=\"256\" alt=\"\" title=\"\" />\n" +
                "<p>Diketahui :</p>\n" +
                "<p><font color=\"red\">Sisi = 8cm</color></p>\n" +
                "<p><font color=\"#FF8800\">Sisi = 10cm</color></p>\n" +
                "<p><font color=\"blue\">Sisi = 4cm</color><font color=\"black\"></color></p>\n" +
                "<p>Ditanyakan : keliling = ?</p>\n" +
                "<p>Jawab : Keliling = <font color=\"red\">sisi</color><font color=\"black\"></color> + <font color=\"#FF8800\">sisi</color><font color=\"black\"></color> + <font color=\"blue\">sisi</color><font color=\"black\"></color></p>\n" +
                "<p>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;Keliling = <font color=\"red\">8cm</color><font color=\"black\"></color> + <font color=\"#FF8800\">10cm</color><font color=\"black\"></color> + <font color=\"blue\">4cm</color><font color=\"black\"></color></p>\n" +
                "<p>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;Keliling = 22cm</p>\n" +
                "</html>";


        wv.loadDataWithBaseURL("", html, mimeType, encoding, "");

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(R.anim.slide_kiri, R.anim.slideout_kanan);
    }
    public void PAHAM (View v) {
        final Intent i = new Intent(getApplicationContext(), Materi45testActivity.class);
        startActivity(i);
    }
}