package com.frimapp.smartmath;

import java.util.Random;
import java.util.concurrent.TimeUnit;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.Context;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Vibrator;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Materi5testActivity extends Activity {


    final Context context = this;
    TextView counttext;
    int sudahdijawab=0;
    int soaldijawab=0;
    int soalbenar=0;
    int soalsalah=0;
    private static final String FORMAT = "%02d:%02d:%02d";
    int Hasil;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_materi005test);
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(context);
        alertDialogBuilder.setTitle("Mulai Tes");
        alertDialogBuilder
                .setMessage("Anda sudah menyatakan paham. Kami akan mengetest anda hingga 1 menit.")
                .setCancelable(false)
                .setPositiveButton("Oke", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {

                        Timerstart();

                    }
                })
                .setNegativeButton("Tidak, saya belum paham.", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        final Intent i = new Intent(getApplicationContext(), Materi5Activity.class);
                        startActivity(i);
                    }
                });
        AlertDialog alertDialog = alertDialogBuilder.create();
        alertDialog.show();
    }

    public void Timerstart() {
        sudahdijawab=0;
        generate();
        counttext = (TextView) findViewById(R.id.counttext1);
        new CountDownTimer(60000, 1000) { // adjust the milli seconds here
            public void onTick(long millisUntilFinished) {
                counttext.setText("" + String.format(FORMAT,
                        TimeUnit.MILLISECONDS.toHours(millisUntilFinished),
                        TimeUnit.MILLISECONDS.toMinutes(millisUntilFinished) - TimeUnit.HOURS.toMinutes(
                                TimeUnit.MILLISECONDS.toHours(millisUntilFinished)),
                        TimeUnit.MILLISECONDS.toSeconds(millisUntilFinished) - TimeUnit.MINUTES.toSeconds(
                                TimeUnit.MILLISECONDS.toMinutes(millisUntilFinished))));
            }

            public void onFinish() {
                counttext.setText("WAKTU HABIS!");
                AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(context);
                alertDialogBuilder.setTitle("WAKTU HABIS");
                alertDialogBuilder
                        .setMessage("Selamat! Anda telah berhasil melakukan tes. Anda telah menjawab " + soaldijawab + " soal, dan mampu menjawab " + soalbenar + " soal dengan benar. Anda menjawab dengan tidak benar sebanyak " + soalsalah + " soal. Skor anda adalah " + (soaldijawab-soalsalah) + " .")
                        .setCancelable(false)
                        .setPositiveButton("MANTAP!", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                final Intent i = new Intent(getApplicationContext(), ListMenu.class);
                                startActivity(i);
                            }
                        });
                AlertDialog alertDialog = alertDialogBuilder.create();
                alertDialog.show();
            }
        }.start();
    }

    public void onBackPressed() {
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(context);
        alertDialogBuilder.setTitle("Akhiri Tes");
        alertDialogBuilder
                .setMessage("Yakin ingin mengakhiri tes?")
                .setCancelable(true)
                .setPositiveButton("Yakin", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        final Intent i = new Intent(getApplicationContext(), ListMenu.class);
                        startActivity(i);
                        overridePendingTransition(R.anim.slide_kiri, R.anim.slideout_kanan);
                        finish();
                    }
                })
                .setNegativeButton("Tidak, saya mau lanjut.", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        dialog.cancel();
                    }
                });
        AlertDialog alertDialog = alertDialogBuilder.create();
        alertDialog.show();

    }
    public void generate() {
        if (sudahdijawab==0) {
            Random r = new Random();
            int pertama = r.nextInt(9 - 1) + 1;
            Random z = new Random();
            int kedua = z.nextInt(9 - 1) + 1;
            Hasil=(pertama - kedua);
            while ((9 < Hasil) || (Hasil<1)) {
                Random x = new Random();
                pertama = x.nextInt(9 - 1) + 1;
                Random y = new Random();
                kedua = y.nextInt(9 - 1) + 1;
                Hasil=(pertama - kedua);
            }
            String pertamas = Integer.toString(pertama);
            String keduas = Integer.toString(kedua);
            String soal = pertamas + " - " + keduas + " = " + " " + "...";
            TextView textsoal = (TextView) findViewById(R.id.textView2);
            textsoal.setText(soal);
            Random s = new Random();
            int jawaban = s.nextInt(4 - 1) + 1;
            final Button mButtonA = (Button) findViewById(R.id.buttonA);
            final Button mButtonB = (Button) findViewById(R.id.buttonB);
            final Button mButtonC = (Button) findViewById(R.id.buttonC);
            final Button mButtonD = (Button) findViewById(R.id.buttonD);
            if (jawaban==1) {
                String Hasila = Integer.toString(Hasil);
                mButtonA.setText(Hasila);
                Random b = new Random();
                int jawabanb = b.nextInt(9 - 1) + 1;
                Random c = new Random();
                int jawabanc = c.nextInt(9 - 1) + 1;
                while((jawabanb== jawabanc) || (jawabanb==Hasil) || (jawabanc==Hasil)){
                    Random e = new Random();
                    jawabanb = e.nextInt(9 - 1) + 1;
                    Random f = new Random();
                    jawabanc = f.nextInt(9 - 1) + 1;
                }
                Random d = new Random();
                int jawaband = d.nextInt(9 - 1) + 1;
                while ((jawabanb==jawaband) || (jawabanc==jawaband) || (Hasil==jawaband)) {
                    Random g = new Random();
                    jawaband = g.nextInt(9 - 1) + 1;
                }
                String jawabanbs = Integer.toString(jawabanb);
                String jawabancs = Integer.toString(jawabanc);
                String jawabands = Integer.toString(jawaband);
                mButtonB.setText(jawabanbs);
                mButtonC.setText(jawabancs);
                mButtonD.setText(jawabands);
                sudahdijawab+=1;
            }
            if (jawaban==2) {
                String Hasila = Integer.toString(Hasil);
                mButtonB.setText(Hasila);
                Random a = new Random();
                int jawabana = a.nextInt(9 - 1) + 1;
                Random c = new Random();
                int jawabanc = c.nextInt(9 - 1) + 1;
                while((jawabana== jawabanc) || (jawabana==Hasil) || (jawabanc==Hasil)){
                    Random e = new Random();
                    jawabana = e.nextInt(9 - 1) + 1;
                    Random f = new Random();
                    jawabanc = f.nextInt(9 - 1) + 1;
                }
                Random d = new Random();
                int jawaband = d.nextInt(9 - 1) + 1;
                while((jawabana==jawaband) || (jawabanc==jawaband) || (jawaband==Hasil)) {
                    Random g = new Random();
                    jawaband = g.nextInt(9 - 1) + 1;
                }
                String jawabanas = Integer.toString(jawabana);
                String jawabancs = Integer.toString(jawabanc);
                String jawabands = Integer.toString(jawaband);
                mButtonA.setText(jawabanas);
                mButtonC.setText(jawabancs);
                mButtonD.setText(jawabands);
                sudahdijawab+=1;
            }
            if (jawaban==3) {
                String Hasila = Integer.toString(Hasil);
                mButtonC.setText(Hasila);
                Random b = new Random();
                int jawabanb = b.nextInt(9 - 1) + 1;
                Random a = new Random();
                int jawabana = a.nextInt(9 - 1) + 1;
                while((jawabanb== jawabana) || (jawabanb==Hasil) || (jawabana==Hasil)){
                    Random e = new Random();
                    jawabanb = e.nextInt(9 - 1) + 1;
                    Random f = new Random();
                    jawabana = f.nextInt(9 - 1) + 1;
                }
                Random d = new Random();
                int jawaband = d.nextInt(9 - 1) + 1;
                while((jawabanb==jawaband) || (jawabana==jawaband) || (jawaband==Hasil)) {
                    Random g = new Random();
                    jawaband = g.nextInt(9 - 1) + 1;
                }
                String jawabanas = Integer.toString(jawabanb);
                String jawabanbs = Integer.toString(jawabana);
                String jawabands = Integer.toString(jawaband);
                mButtonB.setText(jawabanbs);
                mButtonA.setText(jawabanas);
                mButtonD.setText(jawabands);
                sudahdijawab+=1;
            }
            if (jawaban==4) {
                String Hasila = Integer.toString(Hasil);
                mButtonD.setText(Hasila);
                Random b = new Random();
                int jawabanb = b.nextInt(9 - 1) + 1;
                Random c = new Random();
                int jawabanc = c.nextInt(9 - 1) + 1;
                while((jawabanb== jawabanc) || (jawabanb==Hasil) || (jawabanc==Hasil)){
                    Random e = new Random();
                    jawabanb = e.nextInt(9 - 1) + 1;
                    Random f = new Random();
                    jawabanc = f.nextInt(9 - 1) + 1;
                }
                Random a = new Random();
                int jawabana = a.nextInt(9 - 1) + 1;
                while((jawabanb==jawabana) || (jawabanc==jawabana) || (jawabana==Hasil)) {
                    Random d = new Random();
                    jawabana = d.nextInt(9 - 1) + 1;
                }
                String jawabanas = Integer.toString(jawabanb);
                String jawabanbs = Integer.toString(jawabana);
                String jawabancs = Integer.toString(jawabanc);
                mButtonB.setText(jawabanbs);
                mButtonC.setText(jawabancs);
                mButtonD.setText(jawabanas);
                sudahdijawab+=1;
            }

        }

    }
    public void jawabanA (View v) {
        Button mButtonA= (Button) findViewById(R.id.buttonA);
        String buttonText = mButtonA.getText().toString();
        int intbutton = Integer.parseInt(buttonText);
        soaldijawab += 1;
        if (intbutton==Hasil) {
            sudahdijawab-=1;
            generate();
            soalbenar+=1;
            Vibrator vib = (Vibrator) this.context.getSystemService(Context.VIBRATOR_SERVICE);
            vib.vibrate(100);
        } else {
            soalsalah+=1;
            Vibrator vib = (Vibrator) this.context.getSystemService(Context.VIBRATOR_SERVICE);
            vib.vibrate(1000);
        }
    }
    public void jawabanB (View v) {
        Button mButtonB= (Button) findViewById(R.id.buttonB);
        String buttonText = mButtonB.getText().toString();
        int intbutton = Integer.parseInt(buttonText);
        soaldijawab += 1;
        if (intbutton==Hasil) {
            sudahdijawab-=1;
            generate();
            soalbenar+=1;
            Vibrator vib = (Vibrator) this.context.getSystemService(Context.VIBRATOR_SERVICE);
            vib.vibrate(100);
        } else {
            soalsalah+=1;
            Vibrator vib = (Vibrator) this.context.getSystemService(Context.VIBRATOR_SERVICE);
            vib.vibrate(1000);
        }
    }
    public void jawabanC (View v) {
        Button mButtonC= (Button) findViewById(R.id.buttonC);
        String buttonText = mButtonC.getText().toString();
        soaldijawab += 1;
        int intbutton = Integer.parseInt(buttonText);
        if (intbutton==Hasil) {
            sudahdijawab-=1;
            generate();
            soalbenar+=1;
            Vibrator vib = (Vibrator) this.context.getSystemService(Context.VIBRATOR_SERVICE);
            vib.vibrate(100);
        } else {
            soalsalah+=1;
            Vibrator vib = (Vibrator) this.context.getSystemService(Context.VIBRATOR_SERVICE);
            vib.vibrate(1000);
        }
    }
    public void jawabanD (View v) {
        Button mButtonD= (Button) findViewById(R.id.buttonD);
        String buttonText = mButtonD.getText().toString();
        int intbutton = Integer.parseInt(buttonText);
        soaldijawab += 1;
        if (intbutton==Hasil) {
            sudahdijawab-=1;
            generate();
            soalbenar+=1;
            Vibrator vib = (Vibrator) this.context.getSystemService(Context.VIBRATOR_SERVICE);
            vib.vibrate(100);
        } else {
            soalsalah+=1;
            Vibrator vib = (Vibrator) this.context.getSystemService(Context.VIBRATOR_SERVICE);
            vib.vibrate(1000);
        }
    }

}