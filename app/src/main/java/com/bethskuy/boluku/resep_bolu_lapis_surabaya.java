package com.bethskuy.boluku;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class resep_bolu_lapis_surabaya extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resep_bolu_lapis_surabaya);

        ImageButton imageButton15 = findViewById(R.id.imageButton15);
        imageButton15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(resep_bolu_lapis_surabaya.this, list_resep.class);
                startActivity(intent);
            }
        });

        ImageButton imageButton16 = findViewById(R.id.imageButton16);
        imageButton16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(resep_bolu_lapis_surabaya.this, langkah_bolu_surabaya.class);
                startActivity(intent);
            }
        });
    }
}