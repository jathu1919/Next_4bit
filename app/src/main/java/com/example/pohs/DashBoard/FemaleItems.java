package com.example.pohs.DashBoard;


import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.example.pohs.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class FemaleItems extends Fragment {


    public FemaleItems() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        final View view = inflater.inflate(R.layout.fragment_female_items, container, false);




        return view;
    }

}
