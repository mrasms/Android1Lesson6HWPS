package com.example.android1lesson4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

import com.example.android1lesson4.databinding.ActivitySplashScreenBinding;

public class SplashScreenActivity extends AppCompatActivity {
private ActivitySplashScreenBinding binding;
private Animation startAnim;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        binding=ActivitySplashScreenBinding.inflate(getLayoutInflater());
        super.onCreate(savedInstanceState);
        setContentView(binding.getRoot());
        startAnim = AnimationUtils.loadAnimation(this,R.anim.start_anim);
        binding.imLogo.setAnimation(startAnim);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent (SplashScreenActivity.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        }, 3000);
    }
}