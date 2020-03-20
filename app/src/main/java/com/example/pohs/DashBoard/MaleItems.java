package com.example.pohs.DashBoard;


import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.pohs.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class MaleItems extends Fragment {


    public MaleItems() {
        // Required empty public constructor
    }

    private ListView storeList ;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        final View  view = inflater.inflate(R.layout.fragment_male_items,container,false);







        return view;
    }





}
