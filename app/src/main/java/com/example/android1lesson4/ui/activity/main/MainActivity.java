package com.example.android1lesson4.ui.activity.main;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.android1lesson4.R;
import com.example.android1lesson4.databinding.ActivityMainBinding;
import com.example.android1lesson4.ui.fragments.first.FirstFragment;

public class MainActivity extends AppCompatActivity {
private ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        super.onCreate(savedInstanceState);
        setContentView(binding.getRoot());
        if (savedInstanceState == null){
            getSupportFragmentManager().beginTransaction().
                    add(R.id.container_fragment, FirstFragment.class, null).commit();
        }
    }
}