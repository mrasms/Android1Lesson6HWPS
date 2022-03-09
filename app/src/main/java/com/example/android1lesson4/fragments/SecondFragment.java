package com.example.android1lesson4.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

import com.example.android1lesson4.R;
import com.example.android1lesson4.databinding.FragmentSecondBinding;


public class SecondFragment extends Fragment {

    private FragmentSecondBinding binding;
    Animation fragmentAnim;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentSecondBinding.inflate(inflater, container, false);
        setupListener();

        fragmentAnim = AnimationUtils.loadAnimation(SecondFragment.this.getContext(), R.anim.fragment_second_anim);
        binding.fragmentSecond.setAnimation(fragmentAnim);

        return (binding.getRoot());
    }

    private void setupListener() {
        binding.btnOpen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {





                FirstFragment firstFragment = new FirstFragment();
                getParentFragmentManager().beginTransaction().replace(R.id.container_fragment, firstFragment).commit();


            }
        });
    }


}