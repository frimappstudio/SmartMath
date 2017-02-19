package com.frimapp.smartmath;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;

public class Materi48Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_materi048);
        WebView wv = (WebView) findViewById(R.id.webView);
        final String mimeType = "text/html";
        final String encoding = "UTF-8";
        String html = "<html lang=\"en\">\n" +
                "<p>Materi kedua tentang lingkaran, yaitu luas :</p>\n" +
                "<p>Luas yaitu isi dari lingkaran.</p>\n" +
                "<img src=\"file:///android_res/drawable/materi030608.png\" />\n" +
                "<p> <b>Keterangan: </b> = daerah yang berwarna <font color=\"#FF8800\"></color>oranye<font color=\"black\"></color> itu adalah luas.</p>\n" +
                "<p>Rumus :</p>\n" +
                "<p>Luas = &pi; x </color><font color=\"green\"></color>r</color><font color=\"black\"></color> x </color><font color=\"green\"></color>r</color><font color=\"black\"></color></p>\n" +
                "<p><b>Contoh Soal :</b></p>\n" +
                "<img src=\"file:///android_res/drawable/materi030603.png\" width=\"128\" height=\"128\" alt=\"\" title=\"\" />\n" +
                "<p>Diketahui :</p>\n" +
                "<p>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; <font color=\"#FF8800\"></color>d = 14cm<font color=\"black\"></color></p>\n" +
                "<p>Ditanyakan : Luas=..?</p>\n" +
                "<p>Jawab :</p>\n" +
                "<p>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;Luas = &pi; x </color><font color=\"green\"></color>r</color><font color=\"black\"></color> x </color><font color=\"green\"></color>r</color><font color=\"black\"></color></p>\n" +
                "<p>Kita tidak memiliki <font color=\"green\"></color>r (jari-jari)<font color=\"black\"></color> tetapi kita hanya punya <font color=\"#FF8800\"></color>d (diameter)<font color=\"black\"></color>. Caranya adalah kita harus membagi <font color=\"#FF8800\"></color>diameter<font color=\"black\"></color> dengan 2, maka <font color=\"#FF8800\"></color>14cm<font color=\"black\"></color>/2=<font color=\"green\"></color>7cm<font color=\"black\"></color>. Jadi, <font color=\"green\"></color>r<font color=\"black\"></color> adalah <font color=\"green\"></color>7cm<font color=\"black\"></color>.</p>\n" +
                "<p>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;Luas = 3,14 x <font color=\"green\"></color>7cm<font color=\"black\"></color> x <font color=\"green\"></color>7cm<font color=\"black\"></color></p>\n" +
                "<p>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;Luas = 3,14 x <font color=\"black\"></color>49cm</p>\n" +
                "<p>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;<u>Luas = 153,86cm</u><sup>2</sup></p>\n" +
                "<p><b>Contoh Soal 2 :</b></p>\n" +
                "<img src=\"file:///android_res/drawable/materi030604.png\" width=\"128\" height=\"128\" alt=\"\" title=\"\" />\n" +
                "<p>Diketahui :</p>\n" +
                "<p>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; <font color=\"green\"></color>r = 14cm<font color=\"black\"></color></p>\n" +
                "<p>Ditanyakan : Luas=..?</p>\n" +
                "<p>Jawab :</p>\n" +
                "<p>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;Luas = &pi; x </color><font color=\"green\"></color>r</color><font color=\"black\"></color> x </color><font color=\"green\"></color>r</color><font color=\"black\"></color></p>\n" +
                "<p>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;Luas = 3,14 x <font color=\"green\"></color>14cm<font color=\"black\"></color> x <font color=\"green\"></color>14cm<font color=\"black\"></color></p>\n" +
                "<p>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;Luas = 3,14 x <font color=\"black\"></color>196cm</p>\n" +
                "<p>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;<u>Luas = 615,44cm<sup>2</sup></u></p>\n" +
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
        final Intent i = new Intent(getApplicationContext(), Materi48testActivity.class);
        startActivity(i);
    }
}