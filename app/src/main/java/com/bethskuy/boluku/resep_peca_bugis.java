package com.bethskuy.boluku;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class resep_peca_bugis extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resep_peca_bugis);

        ImageButton imageButton24 = findViewById(R.id.imageButton24);
        imageButton24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(resep_peca_bugis.this, list_resep.class);
                startActivity(intent);
            }
        });

        ImageButton imageButton25 = findViewById(R.id.imageButton25);
        imageButton25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(resep_peca_bugis.this, langkah_peca_bugis.class);
                startActivity(intent);
            }
        });
    }
}