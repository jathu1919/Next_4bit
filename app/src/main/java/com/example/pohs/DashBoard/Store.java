package com.example.pohs.DashBoard;


import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import com.example.pohs.R;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 *
 *
 *
 */


public class Store extends Fragment {


    public Store() {
        // Required empty public constructor
    }


    private ListView storeList ;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        final View view = inflater.inflate(R.layout.fragment_store, container, false);




        return view;
    }
}
