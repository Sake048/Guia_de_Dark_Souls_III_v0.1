package com.ks.guiadedarksoulsiii;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

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

    public void Milagros(View view){
        Toast.makeText(conjuros.this,"Proximamente...",Toast.LENGTH_SHORT).show();
    }

    public void Piromancias(View view){
        Toast.makeText(conjuros.this,"Proximamente...",Toast.LENGTH_SHORT).show();
    }
}