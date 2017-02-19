package com.frimapp.smartmath;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;

public class Materi72Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_materi72);
        WebView wv = (WebView) findViewById(R.id.webView);
        final String mimeType = "text/html";
        final String encoding = "UTF-8";
        String html = "<html=lang \"an\">\n" +
                "<p><b>Balok</b> adalah bangun ruang yang memiliki tiga pasang sisi berhadapan yang sama bentuk dan ukurannya, dimana setiap sisinya berbentuk persegipanjang.</p>\n" +
                "<p><b>Bentuk :</b></p>\n" +
                "<p><img src=\"materi040201.PNG\" width=\"201\" height=\"142\" alt=\"\" title=\"\" /></p>\n" +
                "<p><b>Sifat : </b></p>\n" +
                "<p>a. Sisi-sisi balok berbentuk persegipanjang.</p>\n" +
                "<p>b. Rusuk-rusuk yang sejajar memiliki ukuran sama panjang.</p>\n" +
                "<p>c. Setiap diagonal bidang pada sisi yang berhadapan memiliki ukuran sama panjang.</p>\n" +
                "<p>d. Setiap diagonal ruang pada balok memiliki ukuran sama panjang. </p>\n" +
                "<p>e. Setiap bidang diagonal pada balok memiliki bentuk persegipanjang. </p>\n" +
                "<p><b>Jaring-jaring :</b></p>\n" +
                "<p><img src=\"materi040202.PNG\" width=\"144\" height=\"146\" alt=\"\" title=\"\" /></p>\n" +
                "<p><u><b>Luas permukaan balok</u></b></p>\n" +
                "<p>Luas permukaan balok dirumuskan :<b> 2 (pl + lt + pt)</b> </p>\n" +
                "<p><b><u>Contoh soal :</b></u></p>\n" +
                "<p><img src=\"materi040203.PNG\" width=\"217\" height=\"129\" alt=\"\" title=\"\" /></p>\n" +
                "<p>Gambar di atas adalah sebuah balok . Tentukan luas permukaan balok tersebut. </p>\n" +
                "<p><b>Penyelesaian :</b></p>\n" +
                "<p>Diketahui :<font color=\"red\"> p<font color=\"black\"> = <font color=\"red\">10 cm<font color=\"black\"></p>\n" +
                "<p>&nbsp;&nbsp; &nbsp; &nbsp;&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;<font color=\"#FF8800\"> l<font color=\"black\"> = <font color=\"#FF8800\">4 cm<font color=\"black\"></p>\n" +
                "<p>&nbsp;&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;<font color=\"blue\">t<font color=\"black\"> = <font color=\"blue\">5 cm<font color=\"black\"></p>\n" +
                "<p>Ditanya&nbsp;&nbsp;&nbsp; : Luas permukaan balok? </p>\n" +
                "<p>Jawab &nbsp;&nbsp; &nbsp;&nbsp;:  Luas permukaan balok = 2 (<font color=\"red\">p<font color=\"#FF8800\">l<font color=\"black\"> + <font color=\"#FF8800\">l<font color=\"blue\">t<font color=\"black\"> + <font color=\"red\">p<font color=\"blue\">t<font color=\"black\">) </p>\n" +
                "<p>&nbsp;&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; = 2 (<font color=\"red\">10<font color=\"black\"> x <font color=\"#FF8800\">4<font color=\"black\"> + <font color=\"#FF8800\">4<font color=\"black\"> x <font color=\"blue\">5<font color=\"black\"> + <font color=\"red\">10<font color=\"black\"> x <font color=\"blue\">5<font color=\"black\">)</p>\n" +
                "<p>&nbsp;&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; = 2 (40 + 20 + 50)</p>\n" +
                "<p>&nbsp;&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; = 2 (110)</p>\n" +
                "<p>&nbsp;&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; = 220 cm<sup>2</sup></p>\n" +
                "</html>\n";


        wv.loadDataWithBaseURL("", html, mimeType, encoding, "");

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(R.anim.slide_kiri, R.anim.slideout_kanan);
    }
    public void PAHAM (View v) {
        final Intent i = new Intent(getApplicationContext(), Materi72testActivity.class);
        startActivity(i);
    }
}