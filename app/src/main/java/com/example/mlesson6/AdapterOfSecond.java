package com.example.mlesson6;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mlesson6.databinding.LayoutItemSecondFragmentBinding;

import java.util.ArrayList;

public class AdapterOfSecond extends RecyclerView.Adapter<AdapterOfSecond.ViewHolder> {
    private ArrayList<ModelOfSecondFragment> list;

    public void updateData(ArrayList<ModelOfSecondFragment> list){
        this.list = new ArrayList<>();
        this.list = list;
        notifyDataSetChanged();
    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutItemSecondFragmentBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.bind(list.get(position));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        private LayoutItemSecondFragmentBinding binding;

        public ViewHolder(@NonNull LayoutItemSecondFragmentBinding itemView) {
            super(itemView.getRoot());
            binding = itemView;

        }
        public void bind(ModelOfSecondFragment modelOfSecondFragment){

            binding.imageStart.setImageResource(modelOfSecondFragment.getImageStart());
            binding.imageEnd.setImageResource(modelOfSecondFragment.getImageEnd());
            binding.infoText.setText(modelOfSecondFragment.getInfoComment());
            binding.timeInfo.setText(modelOfSecondFragment.getTimeInfo());
        }
    }

}
