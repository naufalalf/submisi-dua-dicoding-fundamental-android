package com.naufalalf.submisiondua;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class TVShowFragment extends Fragment {

    private RecyclerView recyclerView;
    private ArrayList<TVModel> listTV;

    public TVShowFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_tvshow, container, false);
        recyclerView = view.findViewById(R.id.rv_tvshow);
        recyclerView.setHasFixedSize(true);
        listTV = new ArrayList<>();
        listTV.addAll(DataTVShow.getData());
        loadRecyclerTV();

        return view;
    }

    private void loadRecyclerTV() {
        recyclerView.setLayoutManager(new LinearLayoutManager(this.getContext()));
        AdapterTVShow adapterTVShow = new AdapterTVShow(this.getContext());
        adapterTVShow.setListTV(listTV);
        recyclerView.setAdapter(adapterTVShow);
    }


}
