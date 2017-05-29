package com.example.android.funnyapp.View.Fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.android.funnyapp.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class MainProfileFragment extends Fragment {


    public MainProfileFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_main_profile, container, false);
        FragmentTransaction transaction=getFragmentManager().beginTransaction();
        transaction.replace(R.id.root_profile_fragment,new LoginFragment());
        transaction.commit();
        return view;
    }

}
