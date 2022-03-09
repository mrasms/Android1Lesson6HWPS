package com.example.android1lesson4.ui.activity.splash_screen;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

import com.example.android1lesson4.ui.activity.main.MainActivity;
import com.example.android1lesson4.R;
import com.example.android1lesson4.databinding.ActivitySplashScreenBinding;

@SuppressLint("CustomSplashScreen")
public class SplashScreenActivity extends AppCompatActivity {
    private ActivitySplashScreenBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        binding = ActivitySplashScreenBinding.inflate(getLayoutInflater());
        super.onCreate(savedInstanceState);
        setContentView(binding.getRoot());
        setupAnimation();
        transitions();

    }

    private void setupAnimation() {
        Animation startAnim = AnimationUtils.loadAnimation(this, R.anim.start_anim);
        binding.imLogo.setAnimation(startAnim);

    }

    private void transitions() {
        new Handler().postDelayed(() -> {
            Intent intent = new Intent(SplashScreenActivity.this, MainActivity.class);
            startActivity(intent);
            finish();
        }, 3000);
    }
}