package com.example.android1lesson4.ui.fragments.second.for_recycler.adapter;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.android1lesson4.databinding.FirstFragmentListHolderBinding;
import com.example.android1lesson4.ui.fragments.second.for_recycler.model.ModelSecondFragment;

import java.util.ArrayList;

public class AdapterSecondFragment extends RecyclerView.Adapter<AdapterSecondFragment.Holder> {

    private ArrayList<ModelSecondFragment> family = new ArrayList<>();

    public AdapterSecondFragment(ArrayList<ModelSecondFragment> family) {
        this.family = family;
    }

    @NonNull
    @Override
    public Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new Holder(FirstFragmentListHolderBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull Holder holder, int position) {
        holder.onBind(family.get(position));
    }

    @Override
    public int getItemCount() {
        return family.size();
    }

    public class Holder extends RecyclerView.ViewHolder {
        FirstFragmentListHolderBinding binding;

        public Holder(FirstFragmentListHolderBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }

        public void onBind(ModelSecondFragment modelSecondFragment) {
            binding.tvFirstFragmentRecycler.setText(modelSecondFragment.getFamily());

        }

    }
}
