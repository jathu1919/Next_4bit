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
public class Orders extends Fragment {


    public Orders() {
        // Required empty public constructor
        // mental jathu
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_orders, container, false);
    }

}
