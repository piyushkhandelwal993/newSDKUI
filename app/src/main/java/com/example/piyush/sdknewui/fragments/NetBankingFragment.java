package com.example.piyush.sdknewui.fragments;


import android.os.Bundle;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.support.v4.app.Fragment;
import com.example.piyush.sdknewui.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class NetBankingFragment extends Fragment {


    public NetBankingFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_net_banking, container, false);
    }


}
