package com.frimapp.smartmath;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;

public class Materi47Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_materi047);
        WebView wv = (WebView) findViewById(R.id.webView);
        final String mimeType = "text/html";
        final String encoding = "UTF-8";
        String html = "<html lang=\"en\">\n" +
                "<p><b>Lingkaran</b> adalah sebuah garis lengkung yang bertemu kedua ujungnya dan mengelilingi satu titik yang disebut titik pusat lingkaran. Berikut adalah contoh gambar lingkaran :</p>\n" +
                "<img src=\"file:///android_res/drawable/materi030601.png\" width=\"128\" height=\"128\" alt=\"\" title=\"\" />\n" +
                "<img src=\"file:///android_res/drawable/materi030602.png\" width=\"128\" height=\"128\" alt=\"\" title=\"\" />\n" +
                "<p>Keterangan :</p>\n" +
                "<p><font color=\"red\">Titik pusat (titik berwarna merah) = titik yang tepat berada di tengah-tengah lingkaran</color><font color=\"black\"></color></p>\n" +
                "<p><font color=\"green\">Jari-jari (garis berwarna hijau) = Garis antara titik pusat dengan suatu titik pada lingkaran</color><font color=\"black\"></color></p>\n" +
                "<p><font color=\"#FF8800\">Diameter (garis berwarna oranye) = Garis tengah pada lingkaran yang membuat lingkaran menjadi 2 bagian</color><font color=\"black\"></color></p>\n" +
                "<p>Catatan :</p>\n" +
                "<p>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &pi; = 3,14 (untuk bilangan selain kelipatan tujuh:1,2,3,4,5,6,8,9,10 )</p>\n" +
                "<p>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &pi; = <u>22</u> (untuk bilangan kelipatan tujuh: 7,14,21,28,35.....)</p>\n" +
                "<p>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;7</p>\n" +
                "<p><font color=\"green\">r = jari-jari</color><font color=\"black\"></color></p>\n" +
                "<p><font color=\"green\">r = </color><font color=\"black\"></color></color><font color=\"#FF8800\"></color>diameter</color><font color=\"black\"></color>/2</p>\n" +
                "<p><font color=\"#FF8800\"></color>d = diameter</color><font color=\"black\"></color></p>\n" +
                "<p>Materi pertama tentang lingkaran, yaitu Keliling :</p>\n" +
                "<ul>Keliling yaitu  panjang garis yang mengelilingi lingkaran:</ul> \n" +
                "<img src=\"file:///android_res/drawable/materi030606.png\" />\n" +
                "<p>RUMUS : Keliling = 2  x &pi; x <font color=\"green\"> r <font color=\"#000000\" </p>\n" +
                "<p>Contoh soal :</p>\n" +
                "<img src=\"file:///android_res/drawable/materi030607.png\" />\n" +
                "<p>Diketahui: </p>\n" +
                "<ul><font color=\"#FF8800\"> d<font color=\"#000000\"> = <font color=\"#FF8800\">14cm<font color=\"#000000\"> </c/color></ul>\n" +
                "<ul><font color=\"green\"> r <font color=\"#000000\"> =<font color=\"#FF8800\"> d<font color=\"#000000\">  \\2 = <font color=\"#FF8800\"> 14cm<font color=\"#000000\">\\2 = <font color=\"green\"> 7cm <font color=\"000000\"> </color>\n" +
                "</ul> \n" +
                "<p>Jawab:</p>\n" +
                "<p>Keliling = &nbsp; 2  x &pi; x <font color=\"green\"> r <font color=\"#000000\"></color>\n" +
                "</p> \n" +
                "&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; <img src=\"file:///android_res/drawable/materi030605.png\" width=\"108\" height=\"100\" alt=\"\" title=\"\" />\n" +
                "<p>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; = 44cm<sup>2</sup</p>";


        wv.loadDataWithBaseURL("", html, mimeType, encoding, "");

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(R.anim.slide_kiri, R.anim.slideout_kanan);
    }
    public void PAHAM (View v) {
        final Intent i = new Intent(getApplicationContext(), Materi47testActivity.class);
        startActivity(i);
    }
}