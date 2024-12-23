package com.bethskuy.boluku;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class resep_bolu_macan extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resep_bolu_macan);

        ImageButton imageButton21 = findViewById(R.id.imageButton21);
        imageButton21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(resep_bolu_macan.this, list_resep.class);
                startActivity(intent);
            }
        });

        ImageButton imageButton22 = findViewById(R.id.imageButton22);
        imageButton22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(resep_bolu_macan.this, langkah_bolu_macan.class);
                startActivity(intent);
            }
        });
    }
}