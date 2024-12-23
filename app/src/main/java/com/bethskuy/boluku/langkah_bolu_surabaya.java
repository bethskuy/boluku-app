package com.bethskuy.boluku;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class langkah_bolu_surabaya extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_langkah_bolu_surabaya);

        ImageButton imageButton17 = findViewById(R.id.imageButton17);
        imageButton17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(langkah_bolu_surabaya.this, resep_bolu_lapis_surabaya.class);
                startActivity(intent);
            }
        });
    }
}