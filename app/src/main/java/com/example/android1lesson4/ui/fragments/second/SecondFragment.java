package com.example.android1lesson4.ui.fragments.second;

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
import com.example.android1lesson4.databinding.FragmentSecondBinding;
import com.example.android1lesson4.ui.fragments.first.FirstFragment;
import com.example.android1lesson4.ui.fragments.first.for_recycler.adapter.AdapterFirstFragment;
import com.example.android1lesson4.ui.fragments.first.for_recycler.list_data.DataFirstFragment;
import com.example.android1lesson4.ui.fragments.second.for_recycler.adapter.AdapterSecondFragment;
import com.example.android1lesson4.ui.fragments.second.for_recycler.list_data.DataSecondFragment;
import com.example.android1lesson4.ui.fragments.second.for_recycler.model.ModelSecondFragment;

import java.util.ArrayList;

public class SecondFragment extends Fragment {

    private FragmentSecondBinding binding;
    private ArrayList<ModelSecondFragment> family;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentSecondBinding.inflate(inflater, container, false);

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
        family.clear();
    }

    private void setupAnimation() {
        Animation fragmentAnim = AnimationUtils.loadAnimation(SecondFragment.this.getContext(), R.anim.fragment_second_anim);
        binding.fragmentSecond.setAnimation(fragmentAnim);
    }

    private void setData() {
        family = DataSecondFragment.getFamily();
        AdapterSecondFragment adapter = new AdapterSecondFragment(family);
        binding.recyclerSecondFragment.setAdapter(adapter);
    }
}