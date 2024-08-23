package com.example.buoi_03;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class SupportAdapter extends RecyclerView.Adapter<SupportAdapter.SupportViewHolder>{

    private List<Support> support;

    public SupportAdapter(List<Support> support) {
        this.support = support;
    }

    @NonNull
    @Override
    public SupportViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_support, parent, false);
        return new SupportViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull SupportViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return support.size();
    }

    public List<Support> getSupport() {
        return support;
    }

    public void setSupport(List<Support> support) {
        this.support = support;
    }

    class SupportViewHolder extends RecyclerView.ViewHolder {
        private TextView tvSupport;
        public SupportViewHolder(@NonNull View itemView) {
            super(itemView);
            tvSupport = itemView.findViewById(R.id.tvSupport);
        }

        public void setData(Support support){
            tvSupport.setText(support.getSupport());
        }
    }
}
