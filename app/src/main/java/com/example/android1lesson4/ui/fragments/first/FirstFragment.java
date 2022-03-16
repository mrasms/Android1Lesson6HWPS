package com.example.android1lesson4.ui.fragments.first;

import android.annotation.SuppressLint;
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
import com.example.android1lesson4.databinding.FragmentFirstBinding;
import com.example.android1lesson4.ui.fragments.first.for_recycler.adapter.AdapterFirstFragment;
import com.example.android1lesson4.ui.fragments.first.for_recycler.list_data.DataFirstFragment;
import com.example.android1lesson4.ui.fragments.first.for_recycler.model.ModelFirstFragment;
import com.example.android1lesson4.ui.fragments.second.SecondFragment;

import java.util.ArrayList;

public class FirstFragment extends Fragment {
    private FragmentFirstBinding binding;

    private ArrayList<ModelFirstFragment> firstNames;
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentFirstBinding.inflate(inflater, container, false);
        return (binding.getRoot());
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        setupAnimation();
        setData();
    }

    @Override
    public void onStop() {
        super.onStop();
        firstNames.clear();
    }

    private void setupAnimation() {
        Animation fragmentAnim = AnimationUtils.loadAnimation(FirstFragment.this.getContext(), R.anim.fragment_first_anim);
        binding.fragmentFirst.setAnimation(fragmentAnim);
    }


    private void setData() {
        firstNames= DataFirstFragment.getFirstNames();
        AdapterFirstFragment adapter = new AdapterFirstFragment(firstNames);
        binding.recyclerFirstFragment.setAdapter(adapter);
    }
}