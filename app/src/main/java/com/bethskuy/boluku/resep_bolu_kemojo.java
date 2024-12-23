package com.bethskuy.boluku;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class resep_bolu_kemojo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resep_bolu_kemojo);

        ImageButton imageButton30 = findViewById(R.id.imageButton30);
        imageButton30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(resep_bolu_kemojo.this, list_resep.class);
                startActivity(intent);
            }
        });

        ImageButton imageButton31 = findViewById(R.id.imageButton31);
        imageButton31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(resep_bolu_kemojo.this, langkah_bolu_kemojo.class);
                startActivity(intent);
            }
        });
    }
}