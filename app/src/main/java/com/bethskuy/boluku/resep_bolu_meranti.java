package com.bethskuy.boluku;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class resep_bolu_meranti extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.resep_bolu_meranti);

        ImageButton imageButton14 = findViewById(R.id.imageButton14);
        imageButton14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(resep_bolu_meranti.this, langkah_bolu_meranti.class);
                startActivity(intent);
            }
        });

        ImageButton imageButton12 = findViewById(R.id.imageButton12);
        imageButton12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(resep_bolu_meranti.this, list_resep.class);
                startActivity(intent);
            }
        });
    }
}