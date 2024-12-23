package com.bethskuy.boluku;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class resep_bolu_lapis_legit extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resep_bolu_lapis_legit);

        ImageButton imageButton18 = findViewById(R.id.imageButton18);
        imageButton18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(resep_bolu_lapis_legit.this, list_resep.class);
                startActivity(intent);
            }
        });

        ImageButton imageButton19 = findViewById(R.id.imageButton19);
        imageButton19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(resep_bolu_lapis_legit.this, langkah_bolu_lapis_legit.class);
                startActivity(intent);
            }
        });
    }
}