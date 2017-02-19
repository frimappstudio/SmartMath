package com.frimapp.smartmath;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;

public class Materi70Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_materi70);
        WebView wv = (WebView) findViewById(R.id.webView);
        final String mimeType = "text/html";
        final String encoding = "UTF-8";
        String html = "<html=lang\"an\"> \n" +
                "<p><b>Kubus</b> adalah bangun ruang yang semua sisinya berbentuk persegi dan semua rusuknya sama panjang. </p>\n" +
                "<p><b>Bentuk : </b></p> \n" +
                "<p><img src=\"file:///android_res/drawable/materi040101.png\" width=\"162\" height=\"159\" alt=\"\" title=\"\" /></p>\n" +
                "<p><b>Sifat : </b></p>\n" +
                "<p>a. Semua sisi kubus berbentuk persegi. </p>\n" +
                "<p>b. Semua rusuk kubus berukuran sama panjang. </p>\n" +
                "<p>c. setiap diagonal bidang pada kubus memiliki ukuran yang sama panjang. </p>\n" +
                "<p>d. Setiap diagonal ruang pada kubus memiliki ukuran sama panjang. </p>\n" +
                "<p>c. Setiap bidang diagonal pada kubus memiliki bentuk persegipanjang. </p>\n" +
                "<p><b>Jaring-jaring : </b></p>\n" +
                "<p><img src=\"file:///android_res/drawable/materi040102.PNG\" width=\"165\" height=\"217\" alt=\"\" title=\"\" /></p>\n" +
                "<p><b><u>Rumus Luas permukaan kubus </b></u></p> \n" +
                "<p>Luas permukaan kubus : (6 x s<sup>2</sup>)</p>\n" +
                "<p><u><b>Contoh soal :</u></b></p>\n" +
                "<p><img src=\"file:///android_res/drawable/materi040103.PNG\" width=\"164\" height=\"184\" alt=\"\" title=\"\" /></p>\n" +
                "<p>a. Gambar di atas adalah sebuah kubus dengan panjang rusuk 8 cm. Tentukan luas permukaan bangun tersebut. </p>\n" +
                "<p>b. Fachri ingin membeli kotak makanan berbentuk kubus dengan panjang<font color=\"red\"> rusuk 10 cm <font color=\"black\">. Berapakah <font color=\"green\">luas permukaan kotak makanan<font color=\"black\"> tersebut. </p>\n" +
                "<p><b>Penyelesaian : </b></p>\n" +
                "<p>a. Diketahui :<font color=\"red\"> Rusuk= 8 cm <font color=\"black\"></p>\n" +
                "<p>&nbsp;&nbsp;&nbsp;&nbsp;Ditanya&nbsp;&nbsp;&nbsp;:<font color=\"green\"> Luas permukaan kubus<font color=\"black\"> ? </p>\n" +
                "<p>&nbsp;&nbsp;&nbsp;&nbsp;Jawab&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;:<font color=\"green\"> Luas permukaan kubus<font color=\"black\"> = 6 x <font color=\"red\">s<sup>2</sup><font color=\"black\"> </p> \n" +
                "<p>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; = 6 x<font color=\"red\"> (8 x 8)<font color=\"black\"></p>\n" +
                "<p>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; = 6 x <font color=\"red\">64<font color=\"black\"></p>\n" +
                "<p>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; = <font color=\"green\">384 cm<sup>2</sup><font color=\"black\"></p>\n" +
                "<p>b. Diketahui :<font color=\"red\"> Rusuk= 10 cm<font color=\"black\"> </p>\n" +
                "<p>&nbsp;&nbsp;&nbsp;&nbsp; Ditanya&nbsp;&nbsp;&nbsp: <font color=\"green\"> luas permukaan kubus<font color=\"black\"> ? </p>\n" +
                "<p>&nbsp;&nbsp;&nbsp;&nbsp; Jawab&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;:<font color=\"green\"> Luas permukaan kubus<font color=\"black\"> = 6 x <font color=\"red\">s <sup>2</sup><font color=\"black\"> </p> \n" +
                "<p>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; = 6 x <font color=\"red\">(10 x 10)<font color=\"black\"></p>\n" +
                "<p>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; = 6 x<font color=\"red\"> 100<font color=\"black\"></p>\n" +
                "<p>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; = <font color=\"green\">600 cm<sup>2</sup><font color=\"black\"></p>";
        wv.loadDataWithBaseURL("", html, mimeType, encoding, "");

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(R.anim.slide_kiri, R.anim.slideout_kanan);
    }
    public void PAHAM (View v) {
        final Intent i = new Intent(getApplicationContext(), Materi70testActivity.class);
        startActivity(i);
    }
}
