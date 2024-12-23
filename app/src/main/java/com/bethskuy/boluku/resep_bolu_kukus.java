package com.bethskuy.boluku;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class resep_bolu_kukus extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resep_bolu_kukus);

        ImageButton imageButton36 = findViewById(R.id.imageButton36);
        imageButton36.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(resep_bolu_kukus.this, list_resep.class);
                startActivity(intent);
            }
        });

        ImageButton imageButton37 = findViewById(R.id.imageButton37);
        imageButton37.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(resep_bolu_kukus.this, langkah_bolu_kukus.class);
                startActivity(intent);
            }
        });
    }
}