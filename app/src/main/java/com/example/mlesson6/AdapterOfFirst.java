package com.example.mlesson6;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AdapterOfFirst extends RecyclerView.Adapter<AdapterOfFirst.ViewHolder> {
    private ArrayList<ModelOfFirstFragment> listOfHome;

    public void updateData(ArrayList<ModelOfFirstFragment> listOfHome) {
        this.listOfHome = new ArrayList<>();
        this.listOfHome = listOfHome;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_item_first_fragment, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.bind(listOfHome.get(position));
    }

    @Override
    public int getItemCount() {
        return listOfHome.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView first, second;
        private ImageView photo;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            first = itemView.findViewById(R.id.first_tv);
            second = itemView.findViewById(R.id.second_tv);
            photo = itemView.findViewById(R.id.photos);
        }

        public void bind(ModelOfFirstFragment modelOfFirstFragment) {
            first.setText(modelOfFirstFragment.getFirst());
            second.setText(modelOfFirstFragment.getSecond());
            photo.setImageResource(modelOfFirstFragment.getPhotos());
        }

    }
}
