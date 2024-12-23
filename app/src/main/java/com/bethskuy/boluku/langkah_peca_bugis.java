package com.bethskuy.boluku;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class langkah_peca_bugis extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_langkah_peca_bugis);

        ImageButton imageButton26 = findViewById(R.id.imageButton26);
        imageButton26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(langkah_peca_bugis.this, resep_peca_bugis.class);
                startActivity(intent);
            }
        });
    }
}