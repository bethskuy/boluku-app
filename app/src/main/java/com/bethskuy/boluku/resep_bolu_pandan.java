package com.bethskuy.boluku;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class resep_bolu_pandan extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resep_bolu_pandan);

        ImageButton imageButton33 = findViewById(R.id.imageButton33);
        imageButton33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(resep_bolu_pandan.this, list_resep.class);
                startActivity(intent);
            }
        });

        ImageButton imageButton34 = findViewById(R.id.imageButton34);
        imageButton34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(resep_bolu_pandan.this, langkah_bolu_pandan.class);
                startActivity(intent);
            }
        });
    }
}