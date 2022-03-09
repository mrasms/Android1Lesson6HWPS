package com.example.android1lesson4.ui.fragments.second;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

import com.example.android1lesson4.R;
import com.example.android1lesson4.databinding.FragmentSecondBinding;
import com.example.android1lesson4.ui.fragments.first.FirstFragment;

public class SecondFragment extends Fragment {

    private FragmentSecondBinding binding;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentSecondBinding.inflate(inflater, container, false);
        setupAnimation();
        setupListener();
        return (binding.getRoot());
    }

    private void setupAnimation() {
        Animation fragmentAnim = AnimationUtils.loadAnimation(SecondFragment.this.getContext(), R.anim.fragment_second_anim);
        binding.fragmentSecond.setAnimation(fragmentAnim);
    }

    private void setupListener() {
        binding.btnOpen.setOnClickListener(view -> {
            transitions();
        });
    }

    private void transitions() {
        FirstFragment firstFragment = new FirstFragment();
        getParentFragmentManager().beginTransaction().replace(R.id.container_fragment, firstFragment).commit();
    }
}