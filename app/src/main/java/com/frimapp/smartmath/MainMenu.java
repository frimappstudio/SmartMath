package com.frimapp.smartmath;

import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.Context;
import android.provider.ContactsContract;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.MobileAds;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.HashMap;
import java.util.Map;


public class MainMenu extends AppCompatActivity {
    final Context context = this;

    private FirebaseAuth mAuth;
    private DatabaseReference mNama;
    private FirebaseUser mCurrentUser;
    private int userdatabasebaru=0;
    TextView TextNama;
    TextView TextKoin;
    TextView TextLevel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);
        mAuth = FirebaseAuth.getInstance();
        mCurrentUser = mAuth.getCurrentUser();
        mNama = FirebaseDatabase.getInstance().getReference().child("User").child(mCurrentUser.getUid()).child("Nama");
        mNama.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String dbNama = dataSnapshot.getValue(String.class);
                if (dbNama == null && userdatabasebaru == 0) {
                    newuser();
                }
                if (dbNama == "" && userdatabasebaru == 0) {
                    newuser();
                }
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {
            }
        });
        setdatakegui();
        AdView mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
        MobileAds.initialize(this, "ca-app-pub-4794273081489592/7186411463");
    }

    public void Start(View v) {
        final Intent i = new Intent(getApplicationContext(), ListMenu.class);
        startActivity(i);
        overridePendingTransition(R.anim.slide_kanan, R.anim.slideout_kiri);
    }
    public void Keluar(View v) {
        mAuth.signOut();
        startActivity(new Intent(MainMenu.this, Splash.class));
        finish();
    }
    public void About(View v) {
            final Intent i = new Intent(getApplicationContext(), About.class);
            startActivity(i);
            overridePendingTransition(R.anim.slide_kanan, R.anim.slideout_kiri);
    }
    public void onBackPressed() {
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(context);
        alertDialogBuilder.setTitle("Keluar");
        alertDialogBuilder
                .setMessage("Yakin ingin keluar?")
                .setCancelable(true)
                .setPositiveButton("Ya",new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog,int id) {
                        android.os.Process.killProcess(android.os.Process.myPid());
                        System.exit(1);
                        finish();
                    }
                })
                .setNegativeButton("Tidak",new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog,int id) {
                        dialog.cancel();
                    }
                });
        AlertDialog alertDialog = alertDialogBuilder.create();
        alertDialog.show();
    }
public void newuser() {
    AlertDialog.Builder builder = new AlertDialog.Builder(this);
    builder.setCancelable(false);
    builder.setTitle("Pengguna Baru");
    builder.setMessage("Masukan nama atau nama panggilan anda!");
    final EditText input = new EditText(this);
    input.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_CLASS_TEXT);
    builder.setView(input);
    builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
        @Override
        public void onClick(DialogInterface dialog, int which) {
            Map<String, String> userData = new HashMap<String, String>();
            userData.put("Nama", input.getText().toString());
            userData.put("Koin", "0");
            userData.put("XP", "0");
            userData.put("Level", "1");
            userdatabasebaru+=1;
            FirebaseDatabase.getInstance().getReference().child("User").child(mCurrentUser.getUid()).setValue(userData);
        }
    });
    builder.show();
    }
    public void Kokgitu(View v) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setCancelable(false);
        builder.setMessage("COMING SOON!");
        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
            }
        });
        builder.show();
    }
    public void Rumus(View v) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setCancelable(false);
        builder.setMessage("COMING SOON!");
        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
            }
        });
        builder.show();
    }
    public void setdatakegui() {
        ProgressDialog progressa=new ProgressDialog(this);
        progressa.setMessage("Tunggu Sebentar, mengambil informasi data.");
        progressa.setIndeterminate(true);
        progressa.show();
        DatabaseReference mNama = FirebaseDatabase.getInstance().getReference().child("User").child(mCurrentUser.getUid()).child("Nama");
        DatabaseReference mXP = FirebaseDatabase.getInstance().getReference().child("User").child(mCurrentUser.getUid()).child("XP");
        DatabaseReference mLevel = FirebaseDatabase.getInstance().getReference().child("User").child(mCurrentUser.getUid()).child("Level");
        DatabaseReference mKoin = FirebaseDatabase.getInstance().getReference().child("User").child(mCurrentUser.getUid()).child("Koin");
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
                String xp = (String) dataSnapshot.getValue(String.class);

            }
            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        mLevel.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String Level = (String) dataSnapshot.getValue(String.class);
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
                String Koin = (String) dataSnapshot.getValue(String.class);
                TextKoin = (TextView)findViewById(R.id.textView11);
                TextKoin.setText(Koin);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        TextView TextNama=(TextView)findViewById(R.id.textView12);
        String TextNamastring =(String)TextNama.getText();
        while (TextNamastring=="NAMA") {
            TextNamastring =(String)TextNama.getText();
        }
        progressa.dismiss();
    }
}
