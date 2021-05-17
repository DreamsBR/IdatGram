package com.example.idat;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;


public class IdatGram extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActionBar actionbar = getSupportActionBar();
        actionbar.hide();


        setContentView(R.layout.activity_idat_gram);
    }

    public void clickTextView(View view){
        Toast.makeText(getApplicationContext(), "Remplazar por tu codigo", Toast.LENGTH_LONG)
                .show();
    }
}