package com.example.level11;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;
import java.util.zip.Inflater;

public class recycleviewAdapter extends RecyclerView.Adapter<recycleviewAdapter.faceHolder> {
    private List<Face> faceList;

    public recycleviewAdapter(List<Face> faceList) {
        this.faceList = faceList;
    }

    @Override
    public faceHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.files,parent,false);
        return new faceHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull faceHolder holder, int position) {
        Face face = faceList.get(position);
        holder.textView.setText(face.getName());
        holder.imageView.setImageResource(face.getId());
    }

    @Override
    public int getItemCount() {
        return faceList.size();
    }

    public static class faceHolder extends RecyclerView.ViewHolder {
        public TextView textView;
        public ImageView imageView;
        public faceHolder(View view) {
            super(view);
            textView = view.findViewById(R.id.tvfile);
            imageView = view.findViewById(R.id.ivFile);
        }
    }


}
