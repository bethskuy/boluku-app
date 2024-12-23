package com.bethskuy.boluku;

import android.content.Intent; // Untuk berpindah aktivitas
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;

public class splash_screen extends AppCompatActivity {

    private static final int SPLASH_TIME_OUT = 3000; // 3 detik

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        // Delay 3 detik sebelum pindah ke HomePage
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                // Intent untuk berpindah ke halaman HomePage
                Intent intent = new Intent(splash_screen.this, home_page.class);
                startActivity(intent);
                finish(); // Tutup splash screen agar tidak bisa kembali ke halaman ini
            }
        }, SPLASH_TIME_OUT);
    }
}
