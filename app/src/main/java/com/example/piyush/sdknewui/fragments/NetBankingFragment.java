package com.example.piyush.sdknewui.fragments;


import android.os.Bundle;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.support.v4.app.Fragment;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

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
        View mView = inflater.inflate(R.layout.fragment_net_banking, container, false);

        Spinner mSpinner = (Spinner)mView.findViewById(R.id.spinner);
        ArrayAdapter<CharSequence> mAdapter = ArrayAdapter.createFromResource(getActivity(), R.array.bank_names,
                android.R.layout.simple_spinner_item);

        mAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        mSpinner.setAdapter(mAdapter);



        return mView;

    }


}
