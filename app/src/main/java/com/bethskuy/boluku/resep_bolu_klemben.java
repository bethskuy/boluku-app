package com.bethskuy.boluku;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class resep_bolu_klemben extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resep_bolu_klemben);

        ImageButton imageButton27 = findViewById(R.id.imageButton27);
        imageButton27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(resep_bolu_klemben.this, list_resep.class);
                startActivity(intent);
            }
        });

        ImageButton imageButton28 = findViewById(R.id.imageButton28);
        imageButton28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(resep_bolu_klemben.this, langkah_bolu_klemben.class);
                startActivity(intent);
            }
        });
    }
}