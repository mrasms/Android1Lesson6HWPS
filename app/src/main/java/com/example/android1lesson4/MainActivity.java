package com.example.android1lesson4;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;

import com.example.android1lesson4.databinding.ActivityMainBinding;
import com.example.android1lesson4.fragments.FirstFragment;

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