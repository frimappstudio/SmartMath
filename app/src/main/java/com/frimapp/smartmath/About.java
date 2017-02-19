package com.frimapp.smartmath;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class About extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.about);
    }
    public void Kembali(View v) {
        final Intent i = new Intent(getApplicationContext(), MainMenu.class);
        startActivity(i);
        overridePendingTransition(R.anim.slide_kiri, R.anim.slideout_kanan);
    }
}
