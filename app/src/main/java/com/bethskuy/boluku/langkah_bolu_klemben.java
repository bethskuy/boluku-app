package com.bethskuy.boluku;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class langkah_bolu_klemben extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_langkah_bolu_klemben);

        ImageButton imageButton29 = findViewById(R.id.imageButton29);
        imageButton29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(langkah_bolu_klemben.this, resep_bolu_klemben.class);
                startActivity(intent);
            }
        });
    }
}