package com.frimapp.smartmath;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;

public class Materi41Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_materi041);
        WebView wv = (WebView) findViewById(R.id.webView);
        final String mimeType = "text/html";
        final String encoding = "UTF-8";
        String html = "<html lang=\"en\">\n" +
                "<p>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; Sesuai dengan namanya, <strong>segitiga</strong> berarti bagun datar itu memiliki <strong>tiga sisi</strong> dan <strong>sama sisi</strong> berarti bangun datar tersebut <strong>semua sisinya sama panjang</strong>. Jadi<strong> segitiga sama sisi adalah sebuah bangun datar yang memiliki 3 sisi dan semua sisinya sama panjang.</strong> Berikut adalah contoh gambar segitiga sama sisi :</p>\n" +
                "<p><img src=\"file:///android_res/drawable/materi030301.png\" alt=\"\" width=\"149\" height=\"149\"</p>\n" +
                "<p>Semua sisi di segitiga tersebut panjangnya adalah sama-sama 10.</p>\n" +
                "<p><img src=\"file:///android_res/drawable/materi030304.png\" alt=\"\" width=\"113\" height=\"113\" /></p>\n" +
                "<p><font color=\"#FFA4EC\"></color>a = Alas, ditunjukkan oleh garis berwarna pink/merah muda.<font color=\"black\"></color></p>\n" +
                "<p><font color=\"green\"></color>t = Tinggi, ditunjukan oleh garis berwarna hijau.<font color=\"black\"></color></p>\n" +
                "<p><font color=\"red\"></color>s = sisi<font color=\"black\"></color></p>\n" +
                "<p><font color=\"#FF8800\"></color>s = sisi<font color=\"black\"></color></p>\n" +
                "<p><b>Rumus Keliling :</b> keliling = <font color=\"#FFA4EC\">a</color><font color=\"black\"></color> + <font color=\"red\">s</color><font color=\"black\"></color> + <font color=\"#FF8800\">s</color><font color=\"black\"></color></p>\n" +
                "<p><b>Contoh Soal :</b></p>\n" +
                "<p><img src=\"file:///android_res/drawable/materi030301.png\" alt=\"\" width=\"149\" height=\"149\" /></p>\n" +
                "<p>Diketahui :</p>\n" +
                "<p><img src=\"file:///android_res/drawable/materi030301.png\" alt=\"\" width=\"149\" height=\"149\" /></p>\n" +
                "<p>Ditanyakan : Keliling = ?</p>\n" +
                "<p>Jawab :</p>\n" +
                "<p>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;  Keliling = <font color=\"#FFA4EC\">alas</color> <font color=\"black\">+</color> <font color=\"#FF8800\">sisi</color> <font color=\"black\">+ </color> <font color=\"red\"> sisi</color> <font color=\"black\"></color></p>\n" +
                "<p>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;  Keliling = <font color=\"#FFA4EC\">10cm</color> <font color=\"black\">+</color> <font color=\"#FF8800\">10cm</color> <font color=\"black\">+ </color> <font color=\"red\"> 10cm</color> <font color=\"black\"></color></p>\n" +
                "<p>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;  Keliling = 30cm</p>\n" +
                "</html>";


        wv.loadDataWithBaseURL("", html, mimeType, encoding, "");

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(R.anim.slide_kiri, R.anim.slideout_kanan);
    }
    public void PAHAM (View v) {
        final Intent i = new Intent(getApplicationContext(), Materi41testActivity.class);
        startActivity(i);
    }
}