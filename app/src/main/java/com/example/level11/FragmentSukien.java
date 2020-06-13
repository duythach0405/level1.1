package com.example.level11;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;


public class FragmentSukien extends Fragment {
    private RecyclerView recyclerfile;
    private List<Face> faces;
    private recycleviewAdapterdk recycleviewAdapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
             View view =  inflater.inflate(R.layout.fragment_fragment_sukien, container, false);
             return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        recyclerfile = view.findViewById(R.id.recyclerfile);
        faces = new ArrayList<>();
        faces.add(new Face("Biên bản",R.drawable.ic_tuchoi));
        faces.add(new Face("ImageView",R.drawable.ic_tuchoi));
        recycleviewAdapter = new recycleviewAdapterdk(faces);
        recyclerfile.setHasFixedSize(true);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity(), RecyclerView.HORIZONTAL,false);
        recyclerfile.setLayoutManager(linearLayoutManager);
        recyclerfile.setAdapter(recycleviewAdapter);
    }
}
