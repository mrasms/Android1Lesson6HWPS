package com.example.android1lesson4.ui.fragments.first;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

import com.example.android1lesson4.R;
import com.example.android1lesson4.databinding.FragmentFirstBinding;
import com.example.android1lesson4.ui.fragments.second.SecondFragment;

public class FirstFragment extends Fragment {
    private FragmentFirstBinding binding;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentFirstBinding.inflate(inflater, container, false);
        setupAnimation();
        setupListener();
        return (binding.getRoot());
    }

    private void setupAnimation() {
        Animation fragmentAnim = AnimationUtils.loadAnimation(FirstFragment.this.getContext(), R.anim.fragment_first_anim);
        binding.fragmentFirst.setAnimation(fragmentAnim);
    }

    private void setupListener() {
        binding.btnOpen.setOnClickListener(view -> {
            transitions();

        });
    }

    private void transitions() {
        SecondFragment secondFragment = new SecondFragment();
        getParentFragmentManager().beginTransaction().replace(R.id.container_fragment, secondFragment).commit();
    }
}