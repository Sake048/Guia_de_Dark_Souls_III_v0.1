package com.ks.guiadedarksoulsiii;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class conjuros extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conjuros);
    }

    public void Hechizos(View view){
        Intent intent = new Intent(this, Hechizos.class);
        startActivity(intent);
    }


}