package com.example.tab;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class KenmaAdapter extends RecyclerView.Adapter<KenmaAdapter.ViewHolder> {

private ArrayList<Kenma> kenma;

    public KenmaAdapter(ArrayList<Kenma> kenma) {
        this.kenma = kenma;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = View.inflate(parent.getContext(), R.layout.kenmaimage, null);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.imageView.setImageResource(kenma.get(position).getGambarKenma());
    }

    @Override
    public int getItemCount() {
        return kenma.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView imageView;

        public ViewHolder(@NonNull View parent) {
            super(parent);
            imageView = itemView.findViewById(R.id.imageView);
        }
    }
}
