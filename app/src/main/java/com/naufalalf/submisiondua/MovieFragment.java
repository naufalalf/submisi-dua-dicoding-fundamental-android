package com.naufalalf.submisiondua;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class MovieFragment extends Fragment {

    private RecyclerView recyclerView;
    private ArrayList<MovieModel> listMovie;

    public MovieFragment() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root = inflater.inflate(R.layout.fragment_movie, container, false);
        recyclerView = root .findViewById(R.id.rv_movie);
        recyclerView.setHasFixedSize(true);
        listMovie = new ArrayList<>();
        listMovie.addAll(DataMovie.getData());
        loadRecyclerMovie();

        return root;

    }
    private void loadRecyclerMovie(){
        recyclerView.setLayoutManager(new LinearLayoutManager(this.getContext()));
        AdapterMovie adapterMovie = new AdapterMovie(this.getContext());
        adapterMovie.setListMovie(listMovie);
        recyclerView.setAdapter(adapterMovie);
    }

}
