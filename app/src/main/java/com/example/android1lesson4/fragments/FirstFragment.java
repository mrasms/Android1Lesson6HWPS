package com.example.android1lesson4.fragments;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

import com.example.android1lesson4.MainActivity;
import com.example.android1lesson4.R;
import com.example.android1lesson4.SplashScreenActivity;
import com.example.android1lesson4.databinding.FragmentFirstBinding;


public class FirstFragment extends Fragment {
    private FragmentFirstBinding binding;
    Animation fragmentAnim;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentFirstBinding.inflate(inflater, container, false);
        setupListener();
        fragmentAnim = AnimationUtils.loadAnimation(FirstFragment.this.getContext(), R.anim.fragment_first_anim);
        binding.fragmentFirst.setAnimation(fragmentAnim);
        return (binding.getRoot());
    }

    private void setupListener() {
        binding.btnOpen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                SecondFragment secondFragment = new SecondFragment();
                getParentFragmentManager().beginTransaction().replace(R.id.container_fragment, secondFragment).commit();


            }
        });
    }
}