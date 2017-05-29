package com.example.android.funnyapp.View.Fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.example.android.funnyapp.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * A simple {@link Fragment} subclass.
 */
public class LoginFragment extends Fragment{


    public LoginFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_login, container, false);
        ButterKnife.bind(this,view);

        return view;
    }
    @OnClick(R.id.btn_login)
    public void btnLogin_onClick(){
        FragmentTransaction transaction=getFragmentManager().beginTransaction();
        transaction.replace(R.id.root_profile_fragment,new ProfileFragment());
        transaction.commit();
    }

}
