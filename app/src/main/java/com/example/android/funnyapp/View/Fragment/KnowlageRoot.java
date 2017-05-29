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
public class KnowlageRoot extends Fragment {


    public KnowlageRoot() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_knowlage_root, container, false);
        FragmentTransaction transaction=getFragmentManager().beginTransaction();
        transaction.replace(R.id.root_knowlage_fragment,new KnowlageFragment());
        transaction.commit();
        return view;
    }

}
