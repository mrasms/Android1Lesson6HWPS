package com.example.android1lesson4.ui.fragments.first.for_recycler.adapter;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.android1lesson4.databinding.FirstFragmentListHolderBinding;
import com.example.android1lesson4.ui.fragments.first.for_recycler.model.ModelFirstFragment;

import java.util.ArrayList;

public class AdapterFirstFragment extends RecyclerView.Adapter<AdapterFirstFragment.Holder> {

    private ArrayList<ModelFirstFragment> firstNames = new ArrayList<>();

    public AdapterFirstFragment(ArrayList<ModelFirstFragment> firstNames) {
        this.firstNames = firstNames;
    }

    @NonNull
    @Override
    public Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new Holder(FirstFragmentListHolderBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false));
    }

    @SuppressLint("NotifyDataSetChanged")
    @Override
    public void onBindViewHolder(@NonNull Holder holder, int position) {
        holder.onBind(firstNames.get(position));
    }

    @Override
    public int getItemCount() {
        return firstNames.size();
    }

    public class Holder extends RecyclerView.ViewHolder {
        FirstFragmentListHolderBinding binding;

        public Holder(FirstFragmentListHolderBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }

        public void onBind(ModelFirstFragment modelFirstFragment) {
            binding.tvFirstFragmentRecycler.setText(modelFirstFragment.getFirstName());

        }

    }
}
