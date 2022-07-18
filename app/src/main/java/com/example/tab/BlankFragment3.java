package com.example.tab;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


public class BlankFragment3 extends Fragment {

    private RecyclerView rvKenma;
    private ArrayList<Kenma> list = new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_blank3, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        rvKenma = view.findViewById(R.id.Recyclerview2);
        rvKenma.setHasFixedSize(true);


        rvKenma = view.findViewById(R.id.Recyclerview2);
        rvKenma.setHasFixedSize(true);

        list.addAll(KenmaData.getListData());
        showRecyclerGrid();

        int spanCount = 2; // 3 columns
        int spacing = 20; // 50px
        boolean includeEdge = true;
        rvKenma.addItemDecoration(new GridSpacingItemDecoration(spanCount, spacing, includeEdge));
    }
    private void showRecyclerGrid() {
        rvKenma.setLayoutManager(new GridLayoutManager(getActivity(), 2));
        KenmaAdapter kenmaAdapter = new KenmaAdapter(list);
        rvKenma.setAdapter(kenmaAdapter);
    }

}