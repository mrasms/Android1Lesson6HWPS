package com.example.android1lesson4.ui.fragments.third;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.ConcatAdapter;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.android1lesson4.R;
import com.example.android1lesson4.databinding.FragmentThirdBinding;
import com.example.android1lesson4.ui.fragments.first.for_recycler.adapter.AdapterFirstFragment;
import com.example.android1lesson4.ui.fragments.first.for_recycler.list_data.DataFirstFragment;
import com.example.android1lesson4.ui.fragments.first.for_recycler.model.ModelFirstFragment;
import com.example.android1lesson4.ui.fragments.second.for_recycler.adapter.AdapterSecondFragment;
import com.example.android1lesson4.ui.fragments.second.for_recycler.list_data.DataSecondFragment;
import com.example.android1lesson4.ui.fragments.second.for_recycler.model.ModelSecondFragment;

import java.util.ArrayList;


public class ThirdFragment extends Fragment {
    private FragmentThirdBinding binding;
    private ArrayList<ModelFirstFragment> firstNames;
    private ArrayList<ModelSecondFragment> family;
    private AdapterFirstFragment adapterFirstFragment;
    private AdapterSecondFragment adapterSecondFragment;
    private ConcatAdapter concatAdapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentThirdBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        setData();
    }


    private void setData() {
        final RecyclerView recyclerView = binding.recyclerView;
        firstNames = DataFirstFragment.getFirstNames();
        family = DataSecondFragment.getFamily();
        adapterFirstFragment = new AdapterFirstFragment(firstNames);
        adapterSecondFragment = new AdapterSecondFragment(family);
        concatAdapter = new ConcatAdapter(adapterFirstFragment, adapterSecondFragment);
        recyclerView.setAdapter(concatAdapter);

    }

    @Override
    public void onStop() {
        super.onStop();
        firstNames.clear();
        family.clear();
    }

}