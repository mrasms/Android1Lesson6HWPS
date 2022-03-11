package com.example.android1lesson4.ui.fragments.third;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

import com.example.android1lesson4.R;
import com.example.android1lesson4.databinding.FragmentThirdBinding;


public class ThirdFragment extends Fragment {
private FragmentThirdBinding binding;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
    binding = FragmentThirdBinding.inflate(inflater,container, false);
        return binding.getRoot();
    }
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        setupAnimation();
        setData();
    }



    private void setupAnimation() {
        Animation fragmentAnim = AnimationUtils.loadAnimation(ThirdFragment.this.getContext(), R.anim.tv_anim);
        binding.fragmentThird.setAnimation(fragmentAnim);
    }
    private void setData() {
        //binding.

    }

}