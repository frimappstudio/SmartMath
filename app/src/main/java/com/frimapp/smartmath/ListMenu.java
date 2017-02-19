package com.frimapp.smartmath;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ExpandableListView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ListMenu extends AppCompatActivity {

    final Context context = this;
    private InterstitialAd mInterstitialAd;
    ExpandableListAdapter listAdapter;
    ExpandableListView expListView;
    List<String> listDataHeader;
    HashMap<String, List<String>> listDataChild;
    private FirebaseAuth mAuth;
    private FirebaseUser mCurrentUser;
    private DatabaseReference mKoin;
    private DatabaseReference m0102;

    TextView TextNama;
    TextView TextKoin;
    TextView TextLevel;
    String dbm0102 = "0102";
    String IDCHILD;
    String Koin;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_menu);
        mAuth = FirebaseAuth.getInstance();
        mCurrentUser = mAuth.getCurrentUser();
        setdatakegui();
        expListView = (ExpandableListView) findViewById(R.id.expandableListView);
        prepareListData();
        listAdapter = new ExpandableListAdapter(this, listDataHeader, listDataChild);
        expListView.setAdapter(listAdapter);
        expListView.setOnChildClickListener(new ExpandableListView.OnChildClickListener() {
            @Override
            public boolean onChildClick(ExpandableListView parent, View v,
                                        int groupPosition, int childPosition, long id) {
                if (childPosition==0 && groupPosition==0){
                    iklan();
                    mInterstitialAd.setAdListener(new AdListener() {
                        @Override
                        public void onAdClosed() {
                            final Intent i = new Intent(getApplicationContext(), Materi1Activity.class);
                            startActivity(i);
                            overridePendingTransition(R.anim.slide_kiri, R.anim.slideout_kanan);
                        }
                    });
                }
                if (childPosition==1 && groupPosition==0){
                    IDCHILD = "0102";
                    getdata();
                    if (dbm0102==null || Integer.parseInt(dbm0102)==0 ) {
                        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(context);
                        alertDialogBuilder.setTitle("Beli");
                        alertDialogBuilder
                                .setMessage("Ingin membeli materi ini ( 10 koin ) ?")
                                .setCancelable(true)
                                .setPositiveButton("Ya",new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog,int id) {
                                        int Koine = Integer.parseInt(Koin);
                                        int Koinnew = Koine-10;
                                        if (Koinnew >= 0) {
                                            mKoin.setValue(Integer.toString(Koinnew));
                                            m0102.setValue("1");
                                        } else {
                                            Toast toast = Toast.makeText(getApplicationContext(), "Gagal membeli materi.", Toast.LENGTH_SHORT);
                                            toast.show();
                                        }
                                    }
                                })
                                .setNegativeButton("Tidak",new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog,int id) {
                                        dialog.cancel();
                                    }
                                });
                        AlertDialog alertDialog = alertDialogBuilder.create();
                        alertDialog.show();
                    } else  {
                        iklan();
                        mInterstitialAd.setAdListener(new AdListener() {
                            @Override
                            public void onAdClosed() {
                                final Intent i = new Intent(getApplicationContext(), Materi5Activity.class);
                                startActivity(i);
                                overridePendingTransition(R.anim.slide_kiri, R.anim.slideout_kanan);
                            }
                        });
                    }
                }
                if (childPosition==2 && groupPosition==0){
                    IDCHILD = "0103";
                    getdata();
                    if (dbm0102==null || Integer.parseInt(dbm0102)==0 ) {
                        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(context);
                        alertDialogBuilder.setTitle("Beli");
                        alertDialogBuilder
                                .setMessage("Ingin membeli materi ini ( 12 koin ) ?")
                                .setCancelable(true)
                                .setPositiveButton("Ya",new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog,int id) {
                                        int Koine = Integer.parseInt(Koin);
                                        int Koinnew = Koine-12;
                                        if (Koinnew >= 0) {
                                            mKoin.setValue(Integer.toString(Koinnew));
                                            m0102.setValue("1");
                                        } else {
                                            Toast toast = Toast.makeText(getApplicationContext(), "Gagal membeli materi.", Toast.LENGTH_SHORT);
                                            toast.show();
                                        }
                                    }
                                })
                                .setNegativeButton("Tidak",new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog,int id) {
                                        dialog.cancel();
                                    }
                                });
                        AlertDialog alertDialog = alertDialogBuilder.create();
                        alertDialog.show();
                    } else  {
                        iklan();
                        mInterstitialAd.setAdListener(new AdListener() {
                            @Override
                            public void onAdClosed() {
                                final Intent i = new Intent(getApplicationContext(), Materi9Activity.class);
                                startActivity(i);
                                overridePendingTransition(R.anim.slide_kiri, R.anim.slideout_kanan);
                            }
                        });
                    }
                }
                if (childPosition==3 && groupPosition==0){
                    IDCHILD = "0104";
                    getdata();
                    if (dbm0102==null || Integer.parseInt(dbm0102)==0 ) {
                        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(context);
                        alertDialogBuilder.setTitle("Beli");
                        alertDialogBuilder
                                .setMessage("Ingin membeli materi ini ( 12 koin ) ?")
                                .setCancelable(true)
                                .setPositiveButton("Ya",new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog,int id) {
                                        int Koine = Integer.parseInt(Koin);
                                        int Koinnew = Koine-12;
                                        if (Koinnew >= 0) {
                                            mKoin.setValue(Integer.toString(Koinnew));
                                            m0102.setValue("1");
                                        } else {
                                            Toast toast = Toast.makeText(getApplicationContext(), "Gagal membeli materi.", Toast.LENGTH_SHORT);
                                            toast.show();
                                        }
                                    }
                                })
                                .setNegativeButton("Tidak",new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog,int id) {
                                        dialog.cancel();
                                    }
                                });
                        AlertDialog alertDialog = alertDialogBuilder.create();
                        alertDialog.show();
                    } else  {
                        iklan();
                        mInterstitialAd.setAdListener(new AdListener() {
                            @Override
                            public void onAdClosed() {
                                final Intent i = new Intent(getApplicationContext(), Materi13Activity.class);
                                startActivity(i);
                                overridePendingTransition(R.anim.slide_kiri, R.anim.slideout_kanan);
                            }
                        });
                    }
                }
                if (childPosition==0 && groupPosition==2){
                    IDCHILD = "0301";
                    getdata();
                    if (dbm0102==null || Integer.parseInt(dbm0102)==0 ) {
                        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(context);
                        alertDialogBuilder.setTitle("Beli");
                        alertDialogBuilder
                                .setMessage("Ingin membeli materi ini ( 15 koin ) ?")
                                .setCancelable(true)
                                .setPositiveButton("Ya",new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog,int id) {
                                        int Koine = Integer.parseInt(Koin);
                                        int Koinnew = Koine-15;
                                        if (Koinnew >= 0) {
                                            mKoin.setValue(Integer.toString(Koinnew));
                                            m0102.setValue("1");
                                        } else {
                                            Toast toast = Toast.makeText(getApplicationContext(), "Gagal membeli materi.", Toast.LENGTH_SHORT);
                                            toast.show();
                                        }
                                    }
                                })
                                .setNegativeButton("Tidak",new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog,int id) {
                                        dialog.cancel();
                                    }
                                });
                        AlertDialog alertDialog = alertDialogBuilder.create();
                        alertDialog.show();
                    } else  {
                        iklan();
                        mInterstitialAd.setAdListener(new AdListener() {
                            @Override
                            public void onAdClosed() {
                                final Intent i = new Intent(getApplicationContext(), Materi37Activity.class);
                                startActivity(i);
                                overridePendingTransition(R.anim.slide_kiri, R.anim.slideout_kanan);
                            }
                        });
                    }
                }
                if (childPosition==1 && groupPosition==2){
                    IDCHILD = "0302";
                    getdata();
                    if (dbm0102==null || Integer.parseInt(dbm0102)==0 ) {
                        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(context);
                        alertDialogBuilder.setTitle("Beli");
                        alertDialogBuilder
                                .setMessage("Ingin membeli materi ini ( 15 koin ) ?")
                                .setCancelable(true)
                                .setPositiveButton("Ya",new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog,int id) {
                                        int Koine = Integer.parseInt(Koin);
                                        int Koinnew = Koine-18;
                                        if (Koinnew >= 0) {
                                            mKoin.setValue(Integer.toString(Koinnew));
                                            m0102.setValue("1");
                                        } else {
                                            Toast toast = Toast.makeText(getApplicationContext(), "Gagal membeli materi.", Toast.LENGTH_SHORT);
                                            toast.show();
                                        }
                                    }
                                })
                                .setNegativeButton("Tidak",new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog,int id) {
                                        dialog.cancel();
                                    }
                                });
                        AlertDialog alertDialog = alertDialogBuilder.create();
                        alertDialog.show();
                    } else  {
                        iklan();
                        mInterstitialAd.setAdListener(new AdListener() {
                            @Override
                            public void onAdClosed() {
                                final Intent i = new Intent(getApplicationContext(), Materi39Activity.class);
                                startActivity(i);
                                overridePendingTransition(R.anim.slide_kiri, R.anim.slideout_kanan);
                            }
                        });
                    }
                }
                if (childPosition==2 && groupPosition==2){
                    IDCHILD = "0303";
                    getdata();
                    if (dbm0102==null || Integer.parseInt(dbm0102)==0 ) {
                        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(context);
                        alertDialogBuilder.setTitle("Beli");
                        alertDialogBuilder
                                .setMessage("Ingin membeli materi ini ( 20 koin ) ?")
                                .setCancelable(true)
                                .setPositiveButton("Ya",new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog,int id) {
                                        int Koine = Integer.parseInt(Koin);
                                        int Koinnew = Koine-20;
                                        if (Koinnew >= 0) {
                                            mKoin.setValue(Integer.toString(Koinnew));
                                            m0102.setValue("1");
                                        } else {
                                            Toast toast = Toast.makeText(getApplicationContext(), "Gagal membeli materi.", Toast.LENGTH_SHORT);
                                            toast.show();
                                        }
                                    }
                                })
                                .setNegativeButton("Tidak",new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog,int id) {
                                        dialog.cancel();
                                    }
                                });
                        AlertDialog alertDialog = alertDialogBuilder.create();
                        alertDialog.show();
                    } else  {
                        iklan();
                        mInterstitialAd.setAdListener(new AdListener() {
                            @Override
                            public void onAdClosed() {
                                final Intent i = new Intent(getApplicationContext(), Materi41Activity.class);
                                startActivity(i);
                                overridePendingTransition(R.anim.slide_kiri, R.anim.slideout_kanan);
                            }
                        });
                    }
                }
                if (childPosition==3 && groupPosition==2){
                    IDCHILD = "0304";
                    getdata();
                    if (dbm0102==null || Integer.parseInt(dbm0102)==0 ) {
                        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(context);
                        alertDialogBuilder.setTitle("Beli");
                        alertDialogBuilder
                                .setMessage("Ingin membeli materi ini ( 25 koin ) ?")
                                .setCancelable(true)
                                .setPositiveButton("Ya",new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog,int id) {
                                        int Koine = Integer.parseInt(Koin);
                                        int Koinnew = Koine-20;
                                        if (Koinnew >= 0) {
                                            mKoin.setValue(Integer.toString(Koinnew));
                                            m0102.setValue("1");
                                        } else {
                                            Toast toast = Toast.makeText(getApplicationContext(), "Gagal membeli materi.", Toast.LENGTH_SHORT);
                                            toast.show();
                                        }
                                    }
                                })
                                .setNegativeButton("Tidak",new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog,int id) {
                                        dialog.cancel();
                                    }
                                });
                        AlertDialog alertDialog = alertDialogBuilder.create();
                        alertDialog.show();
                    } else  {
                        iklan();
                        mInterstitialAd.setAdListener(new AdListener() {
                            @Override
                            public void onAdClosed() {
                                final Intent i = new Intent(getApplicationContext(), Materi43Activity.class);
                                startActivity(i);
                                overridePendingTransition(R.anim.slide_kiri, R.anim.slideout_kanan);
                            }
                        });
                    }
                }
                if (childPosition==4 && groupPosition==2){
                    IDCHILD = "0305";
                    getdata();
                    if (dbm0102==null || Integer.parseInt(dbm0102)==0 ) {
                        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(context);
                        alertDialogBuilder.setTitle("Beli");
                        alertDialogBuilder
                                .setMessage("Ingin membeli materi ini ( 50 koin ) ?")
                                .setCancelable(true)
                                .setPositiveButton("Ya",new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog,int id) {
                                        int Koine = Integer.parseInt(Koin);
                                        int Koinnew = Koine-50;
                                        if (Koinnew >= 0) {
                                            mKoin.setValue(Integer.toString(Koinnew));
                                            m0102.setValue("1");
                                        } else {
                                            Toast toast = Toast.makeText(getApplicationContext(), "Gagal membeli materi.", Toast.LENGTH_SHORT);
                                            toast.show();
                                        }
                                    }
                                })
                                .setNegativeButton("Tidak",new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog,int id) {
                                        dialog.cancel();
                                    }
                                });
                        AlertDialog alertDialog = alertDialogBuilder.create();
                        alertDialog.show();
                    } else  {
                        iklan();
                        mInterstitialAd.setAdListener(new AdListener() {
                            @Override
                            public void onAdClosed() {
                                final Intent i = new Intent(getApplicationContext(), Materi45Activity.class);
                                startActivity(i);
                                overridePendingTransition(R.anim.slide_kiri, R.anim.slideout_kanan);
                            }
                        });
                    }
                }
                if (childPosition==5 && groupPosition==2){
                    Toast toast = Toast.makeText(getApplicationContext(), "Coming Soon!", Toast.LENGTH_SHORT);
                    toast.show();
                }
                if (childPosition==6 && groupPosition==2){
                    IDCHILD = "0306";
                    getdata();
                    if (dbm0102==null || Integer.parseInt(dbm0102)==0 ) {
                        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(context);
                        alertDialogBuilder.setTitle("Beli");
                        alertDialogBuilder
                                .setMessage("Ingin membeli materi ini ( 30 koin ) ?")
                                .setCancelable(true)
                                .setPositiveButton("Ya",new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog,int id) {
                                        int Koine = Integer.parseInt(Koin);
                                        int Koinnew = Koine-30;
                                        if (Koinnew >= 0) {
                                            mKoin.setValue(Integer.toString(Koinnew));
                                            m0102.setValue("1");
                                        } else {
                                            Toast toast = Toast.makeText(getApplicationContext(), "Gagal membeli materi.", Toast.LENGTH_SHORT);
                                            toast.show();
                                        }
                                    }
                                })
                                .setNegativeButton("Tidak",new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog,int id) {
                                        dialog.cancel();
                                    }
                                });
                        AlertDialog alertDialog = alertDialogBuilder.create();
                        alertDialog.show();
                    } else  {
                        iklan();
                        mInterstitialAd.setAdListener(new AdListener() {
                            @Override
                            public void onAdClosed() {
                                final Intent i = new Intent(getApplicationContext(), Materi47Activity.class);
                                startActivity(i);
                                overridePendingTransition(R.anim.slide_kiri, R.anim.slideout_kanan);
                            }
                        });
                    }
                }
                if (childPosition==7 && groupPosition==2){
                    IDCHILD = "0307";
                    getdata();
                    if (dbm0102==null || Integer.parseInt(dbm0102)==0 ) {
                        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(context);
                        alertDialogBuilder.setTitle("Beli");
                        alertDialogBuilder
                                .setMessage("Ingin membeli materi ini ( 30 koin ) ?")
                                .setCancelable(true)
                                .setPositiveButton("Ya",new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog,int id) {
                                        int Koine = Integer.parseInt(Koin);
                                        int Koinnew = Koine-30;
                                        if (Koinnew >= 0) {
                                            mKoin.setValue(Integer.toString(Koinnew));
                                            m0102.setValue("1");
                                        } else {
                                            Toast toast = Toast.makeText(getApplicationContext(), "Gagal membeli materi.", Toast.LENGTH_SHORT);
                                            toast.show();
                                        }
                                    }
                                })
                                .setNegativeButton("Tidak",new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog,int id) {
                                        dialog.cancel();
                                    }
                                });
                        AlertDialog alertDialog = alertDialogBuilder.create();
                        alertDialog.show();
                    } else  {
                        iklan();
                        mInterstitialAd.setAdListener(new AdListener() {
                            @Override
                            public void onAdClosed() {
                                final Intent i = new Intent(getApplicationContext(), Materi57Activity.class);
                                startActivity(i);
                                overridePendingTransition(R.anim.slide_kiri, R.anim.slideout_kanan);
                            }
                        });
                    }
                }
                if (childPosition==8 && groupPosition==2){
                    IDCHILD = "0308";
                    getdata();
                    if (dbm0102==null || Integer.parseInt(dbm0102)==0 ) {
                        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(context);
                        alertDialogBuilder.setTitle("Beli");
                        alertDialogBuilder
                                .setMessage("Ingin membeli materi ini ( 25 koin ) ?")
                                .setCancelable(true)
                                .setPositiveButton("Ya",new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog,int id) {
                                        int Koine = Integer.parseInt(Koin);
                                        int Koinnew = Koine-25;
                                        if (Koinnew >= 0) {
                                            mKoin.setValue(Integer.toString(Koinnew));
                                            m0102.setValue("1");
                                        } else {
                                            Toast toast = Toast.makeText(getApplicationContext(), "Gagal membeli materi.", Toast.LENGTH_SHORT);
                                            toast.show();
                                        }
                                    }
                                })
                                .setNegativeButton("Tidak",new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog,int id) {
                                        dialog.cancel();
                                    }
                                });
                        AlertDialog alertDialog = alertDialogBuilder.create();
                        alertDialog.show();
                    } else  {
                        iklan();
                        mInterstitialAd.setAdListener(new AdListener() {
                            @Override
                            public void onAdClosed() {
                                final Intent i = new Intent(getApplicationContext(), Materi59Activity.class);
                                startActivity(i);
                                overridePendingTransition(R.anim.slide_kiri, R.anim.slideout_kanan);
                            }
                        });
                    }
                }
                if (childPosition==9 && groupPosition==2){
                    IDCHILD = "0309";
                    getdata();
                    if (dbm0102==null || Integer.parseInt(dbm0102)==0 ) {
                        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(context);
                        alertDialogBuilder.setTitle("Beli");
                        alertDialogBuilder
                                .setMessage("Ingin membeli materi ini ( 32 koin ) ?")
                                .setCancelable(true)
                                .setPositiveButton("Ya",new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog,int id) {
                                        int Koine = Integer.parseInt(Koin);
                                        int Koinnew = Koine-32;
                                        if (Koinnew >= 0) {
                                            mKoin.setValue(Integer.toString(Koinnew));
                                            m0102.setValue("1");
                                        } else {
                                            Toast toast = Toast.makeText(getApplicationContext(), "Gagal membeli materi.", Toast.LENGTH_SHORT);
                                            toast.show();
                                        }
                                    }
                                })
                                .setNegativeButton("Tidak",new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog,int id) {
                                        dialog.cancel();
                                    }
                                });
                        AlertDialog alertDialog = alertDialogBuilder.create();
                        alertDialog.show();
                    } else  {
                        iklan();
                        mInterstitialAd.setAdListener(new AdListener() {
                            @Override
                            public void onAdClosed() {
                                final Intent i = new Intent(getApplicationContext(), Materi61Activity.class);
                                startActivity(i);
                                overridePendingTransition(R.anim.slide_kiri, R.anim.slideout_kanan);
                            }
                        });
                    }
                }
                if (childPosition==10 && groupPosition==2){
                    IDCHILD = "0310";
                    getdata();
                    if (dbm0102==null || Integer.parseInt(dbm0102)==0 ) {
                        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(context);
                        alertDialogBuilder.setTitle("Beli");
                        alertDialogBuilder
                                .setMessage("Ingin membeli materi ini ( 35 koin ) ?")
                                .setCancelable(true)
                                .setPositiveButton("Ya",new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog,int id) {
                                        int Koine = Integer.parseInt(Koin);
                                        int Koinnew = Koine-35;
                                        if (Koinnew >= 0) {
                                            mKoin.setValue(Integer.toString(Koinnew));
                                            m0102.setValue("1");
                                        } else {
                                            Toast toast = Toast.makeText(getApplicationContext(), "Gagal membeli materi.", Toast.LENGTH_SHORT);
                                            toast.show();
                                        }
                                    }
                                })
                                .setNegativeButton("Tidak",new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog,int id) {
                                        dialog.cancel();
                                    }
                                });
                        AlertDialog alertDialog = alertDialogBuilder.create();
                        alertDialog.show();
                    } else  {
                        iklan();
                        mInterstitialAd.setAdListener(new AdListener() {
                            @Override
                            public void onAdClosed() {
                                final Intent i = new Intent(getApplicationContext(), Materi63Activity.class);
                                startActivity(i);
                                overridePendingTransition(R.anim.slide_kiri, R.anim.slideout_kanan);
                            }
                        });
                    }
                }
                if (childPosition==11 && groupPosition==2){
                    Toast toast = Toast.makeText(getApplicationContext(), "Coming Soon!", Toast.LENGTH_SHORT);
                    toast.show();
                }
                return false;
            }
        });
        mInterstitialAd = new InterstitialAd(this);
        mInterstitialAd.setAdUnitId("ca-app-pub-4794273081489592/7186411463");
        requestNewInterstitial();
    }
    private void requestNewInterstitial() {
        AdRequest adRequest = new AdRequest.Builder().build();
        mInterstitialAd.loadAd(adRequest);
    }

    private void prepareListData() {
        listDataHeader = new ArrayList<String>();
        listDataChild = new HashMap<String, List<String>>();

        listDataHeader.add("1. Bilangan Bulat");
        listDataHeader.add("2. Pecahan");
        listDataHeader.add("3. Bangun Datar");
        listDataHeader.add("4. Bangun Ruang Sisi Datar");
        listDataHeader.add("5. Bangun Ruang Sisi Lengkung");
        listDataHeader.add("6. Phytagoras");

        List<String> bilanganbulat = new ArrayList<String>();
        bilanganbulat.add("a. Pertambahan");
        bilanganbulat.add("b. Pengurangan");
        bilanganbulat.add("c. Perkalian");
        bilanganbulat.add("d. Pembagian");
        bilanganbulat.add("e. Kelipatan");
        bilanganbulat.add("f. Faktor");
        bilanganbulat.add("g. Pangkat");
        bilanganbulat.add("h. Hitung Campuran");

        List<String> Pecahan = new ArrayList<String>();
        Pecahan.add("a. Pengertian Pecahan");
        Pecahan.add("b. Perbandingan");
        Pecahan.add("c. Penyederhanaan");
        Pecahan.add("d. Pecahan Campuran");
        Pecahan.add("e. Pecahan & Desimal");
        Pecahan.add("f. Pecahan & Persen");
        Pecahan.add("g. Operasi Pecahan");

        List<String> BangunDatar = new ArrayList<String>();
        BangunDatar.add("a. Persegi");
        BangunDatar.add("b. Persegi Panjang");
        BangunDatar.add("c. Segitiga Sama Sisi");
        BangunDatar.add("d. Segitiga Sama Kaki");
        BangunDatar.add("e. Segitiga Sembarang");
        BangunDatar.add("f. Segitiga Siku-siku");
        BangunDatar.add("g. Lingkaran");
        BangunDatar.add("h. Layang-layang");
        BangunDatar.add("i. Belah ketupat");
        BangunDatar.add("j. Jajar Genjang");
        BangunDatar.add("k. Trapesium");
        BangunDatar.add("l. Gabungan");

        List<String> Bangunruang1 = new ArrayList<String>();
        Bangunruang1.add("a. Kubus");
        Bangunruang1.add("b. Balok");
        Bangunruang1.add("c. Prisma");
        Bangunruang1.add("d. Limas");

        List<String> Bangunruang2 = new ArrayList<String>();
        Bangunruang2.add("a. Tabung");
        Bangunruang2.add("b. Kerucut");
        Bangunruang2.add("c. Bola");

        List<String> Phytagoras = new ArrayList<String>();
        Phytagoras.add("a. Teorema Phytagoras");
        Phytagoras.add("b. Pada kehidupan sehari-hari");
        Phytagoras.add("c. Phytagoras pada bangun datar");
        Phytagoras.add("d. Garis-garis pada segitiga");

        listDataChild.put(listDataHeader.get(0), bilanganbulat);
        listDataChild.put(listDataHeader.get(1), Pecahan);
        listDataChild.put(listDataHeader.get(2), BangunDatar);
        listDataChild.put(listDataHeader.get(3), Bangunruang1);
        listDataChild.put(listDataHeader.get(4), Bangunruang2);
        listDataChild.put(listDataHeader.get(5), Phytagoras);
    }

    public void Back (View v) {
        Intent intent = new Intent(getApplicationContext(), MainMenu.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        overridePendingTransition(R.anim.slide_kiri, R.anim.slideout_kanan);
        startActivity(intent);
        }
    public void setdatakegui() {
        DatabaseReference mNama = FirebaseDatabase.getInstance().getReference().child("User").child(mCurrentUser.getUid()).child("Nama");
        DatabaseReference mXP = FirebaseDatabase.getInstance().getReference().child("User").child(mCurrentUser.getUid()).child("XP");
        DatabaseReference mLevel = FirebaseDatabase.getInstance().getReference().child("User").child(mCurrentUser.getUid()).child("Level");
        mKoin = FirebaseDatabase.getInstance().getReference().child("User").child(mCurrentUser.getUid()).child("Koin");
        mNama.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String Nama = (String) dataSnapshot.getValue(String.class);
                TextNama = (TextView)findViewById(R.id.textView12);
                TextNama.setText(Nama);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        mXP.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String xp = dataSnapshot.getValue(String.class);

            }
            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        mLevel.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String Level = dataSnapshot.getValue(String.class);
                TextLevel = (TextView)findViewById(R.id.Level);
                TextLevel.setText(Level);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        mKoin.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                Koin = dataSnapshot.getValue(String.class);
                TextKoin = (TextView)findViewById(R.id.textView11);
                TextKoin.setText(Koin);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
    }
    public void getdata() {
        m0102 = FirebaseDatabase.getInstance().getReference().child("User").child(mCurrentUser.getUid()).child("Materi").child(IDCHILD);
        m0102.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                dbm0102=dataSnapshot.getValue(String.class);
                if (dbm0102==null || dbm0102=="") {
                    m0102.setValue("0");
                }
            }
            @Override
            public void onCancelled(DatabaseError databaseError) {
            }
        });
    }
    public void iklan() {
        if (mInterstitialAd.isLoaded()) {
            mInterstitialAd.show();
        }
    }
}