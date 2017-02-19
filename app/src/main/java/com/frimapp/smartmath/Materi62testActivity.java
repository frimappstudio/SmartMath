package com.frimapp.smartmath;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.CountDownTimer;
import android.os.Vibrator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Materi62testActivity extends AppCompatActivity {
    final Context context = this;
    TextView counttext;
    int sudahdijawab=0;
    int soaldijawab=0;
    int soalbenar=0;
    int soalsalah=0;
    int pertama;
    int kedua;

    private static final String FORMAT = "%02d:%02d:%02d";
    int Hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_materi62test);
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(context);
        alertDialogBuilder.setTitle("Mulai Tes");
        alertDialogBuilder
                .setMessage("Anda sudah menyatakan paham. Kami akan mengetest anda hingga 4 menit.")
                .setCancelable(false)
                .setPositiveButton("Oke", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        Timerstart();

                    }
                })
                .setNegativeButton("Tidak, saya belum paham.", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        final Intent i = new Intent(getApplicationContext(), Materi62Activity.class);
                        startActivity(i);
                        finish();
                    }
                });
        AlertDialog alertDialog = alertDialogBuilder.create();
        alertDialog.show();
    }

    public void Timerstart() {
        sudahdijawab=0;
        generate();
        counttext = (TextView) findViewById(R.id.counttext1);
        new CountDownTimer(240000, 500) { // adjust the milli seconds here
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
                if (soalbenar-soalsalah>4 && soaldijawab>4){
                    AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(context);
                    alertDialogBuilder.setTitle("WAKTU HABIS");
                    alertDialogBuilder
                            .setMessage("Selamat! Anda telah berhasil melakukan tes. Anda telah menjawab " + soaldijawab + " soal, dan mampu menjawab " + soalbenar + " soal dengan benar. Anda menjawab dengan tidak benar sebanyak " + soalsalah + " soal. Skor anda adalah " + (soaldijawab-soalsalah) + " Apakah anda ingin lanjut ke materi tingkat selanjutnya?.")
                            .setCancelable(false)
                            .setPositiveButton("Mantap!", new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int id) {
                                    final Intent i = new Intent(getApplicationContext(), ListMenu.class);
                                    startActivity(i);
                                    finish();
                                }
                            });
                    AlertDialog alertDialog = alertDialogBuilder.create();
                    alertDialog.show();
                }

                if ((soalbenar-soalsalah)<4 || soaldijawab<4){
                    AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(context);
                    alertDialogBuilder.setTitle("WAKTU HABIS");
                    alertDialogBuilder
                            .setMessage("Anda telah gagal lulus tes. Anda telah menjawab " + soaldijawab + " soal, dan mampu menjawab " + soalbenar + " soal dengan benar. Anda menjawab dengan tidak benar sebanyak " + soalsalah + " soal. Skor anda adalah " + (soaldijawab-soalsalah) + " Apakah anda ingin berlatih lagi?")
                            .setCancelable(false)
                            .setPositiveButton("Ya!", new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int id) {
                                    Intent intent = getIntent();
                                    finish();
                                    startActivity(intent);
                                }
                            })
                            .setNegativeButton("Tidak.", new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int id) {
                                    final Intent i = new Intent(getApplicationContext(), ListMenu.class);
                                    startActivity(i);
                                    finish();
                                }
                            });;
                    AlertDialog alertDialog = alertDialogBuilder.create();
                    alertDialog.show();
                }
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
            pertama = r.nextInt(30 - 4) + 1;
            kedua = r.nextInt(30 - 4) + 1;
            Hasil = (pertama*kedua);
            String pertamas = Integer.toString(pertama);
            String keduas = Integer.toString(kedua);
            TextView textsoal = (TextView) findViewById(R.id.textView5);
            textsoal.setText(pertamas);
            TextView textsoal2 = (TextView) findViewById(R.id.textView6);
            textsoal2.setText(keduas);
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
                int jawabanb = b.nextInt(4 - -4) + -4;
                int jawabanc = b.nextInt(4 - -4) + -4;
                int jawaband = b.nextInt(4 - -4) + -4;
                jawabanb*=10;
                jawabanc*=10;
                jawaband*=10;
                jawabanb = Hasil-jawabanb;
                jawabanc = Hasil-jawabanc;
                jawaband = Hasil-jawaband;
                while (jawabanb==Hasil || jawabanc==Hasil || jawaband==Hasil || jawabanb==jawabanc || jawabanb==jawaband || jawabanc==jawaband) {
                    jawabanb = b.nextInt(4 - -4) + -4;
                    jawabanc = b.nextInt(4 - -4) + -4;
                    jawaband = b.nextInt(4 - -4) + -4;
                    jawabanb*=10;
                    jawabanc*=10;
                    jawaband*=10;
                    jawabanb = Hasil-jawabanb;
                    jawabanc = Hasil-jawabanc;
                    jawaband = Hasil-jawaband;
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
                Random b = new Random();
                int jawabana = b.nextInt(4 - -4) + -4;
                int jawabanc = b.nextInt(4 - -4) + -4;
                int jawaband = b.nextInt(4 - -4) + -4;
                jawabana*=10;
                jawabanc*=10;
                jawaband*=10;
                jawabana = Hasil-jawabana;
                jawabanc = Hasil-jawabanc;
                jawaband = Hasil-jawaband;
                while (jawabana==Hasil || jawabanc==Hasil || jawaband==Hasil || jawabana==jawabanc || jawabana==jawaband || jawabanc==jawaband) {
                    jawabana = b.nextInt(4 - -4) + -4;
                    jawabanc = b.nextInt(4 - -4) + -4;
                    jawaband = b.nextInt(4 - -4) + -4;
                    jawabana*=10;
                    jawabanc*=10;
                    jawaband*=10;
                    jawabana = Hasil-jawabana;
                    jawabanc = Hasil-jawabanc;
                    jawaband = Hasil-jawaband;
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
                int jawabanb = b.nextInt(4 - -4) + -4;
                int jawabana = b.nextInt(4 - -4) + -4;
                int jawaband = b.nextInt(4 - -4) + -4;
                jawabanb*=10;
                jawabana*=10;
                jawaband*=10;
                jawabanb = Hasil-jawabanb;
                jawabana = Hasil-jawabana;
                jawaband = Hasil-jawaband;
                while (jawabanb==Hasil || jawabana==Hasil || jawaband==Hasil || jawabanb==jawabana || jawabanb==jawaband || jawabana==jawaband) {
                    jawabanb = b.nextInt(4 - -4) + -4;
                    jawabana = b.nextInt(4 - -4) + -4;
                    jawaband = b.nextInt(4 - -4) + -4;
                    jawabanb*=10;
                    jawabana*=10;
                    jawaband*=10;
                    jawabanb = Hasil-jawabanb;
                    jawabana = Hasil-jawabana;
                    jawaband = Hasil-jawaband;
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
                int jawabanb = b.nextInt(4 - -4) + -4;
                int jawabanc = b.nextInt(4 - -4) + -4;
                int jawabana = b.nextInt(4 - -4) + -4;
                jawabanb*=10;
                jawabanc*=10;
                jawabana*=10;
                jawabanb = Hasil-jawabanb;
                jawabanc = Hasil-jawabanc;
                jawabana = Hasil-jawabana;
                while (jawabanb==Hasil || jawabanc==Hasil || jawabana==Hasil || jawabana==jawabanc || jawabana==jawabanb || jawabanc==jawabanb) {
                    jawabanb = b.nextInt(4 - -4) + -4;
                    jawabanc = b.nextInt(4 - -4) + -4;
                    jawabana = b.nextInt(4 - -4) + -4;
                    jawabanb*=10;
                    jawabanc*=10;
                    jawabana*=10;
                    jawabanb = Hasil-jawabanb;
                    jawabanc = Hasil-jawabanc;
                    jawabana = Hasil-jawabana;
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
            vib.vibrate(500);
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
            vib.vibrate(500);
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
            vib.vibrate(500);
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
            vib.vibrate(500);
        }
    }

}