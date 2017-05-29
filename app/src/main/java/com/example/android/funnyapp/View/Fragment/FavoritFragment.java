package com.example.android.funnyapp.View.Fragment;


import android.app.Dialog;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.SpannableString;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.android.funnyapp.Adapter.AddressSearchAdapter;
import com.example.android.funnyapp.Adapter.Montakhab_Adapter;
import com.example.android.funnyapp.Model.AddressSearchModel;
import com.example.android.funnyapp.R;

import java.util.ArrayList;

import info.hoang8f.android.segmented.SegmentedGroup;

/**
 * A simple {@link Fragment} subclass.
 */
public class FavoritFragment extends Fragment {

    ArrayList<AddressSearchModel> lst_SearchResult;
    Button registerAddress;
    public FavoritFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_address, container, false);

        lst_SearchResult=new ArrayList<>();
        PreparData();
        RecyclerView recyclerView=(RecyclerView)view.findViewById(R.id.address_recyclerview);
        Montakhab_Adapter adapterClass;
        adapterClass=new Montakhab_Adapter(lst_SearchResult,getActivity());
        RecyclerView.LayoutManager LayoutManager= new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(LayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.addItemDecoration(new
                DividerItemDecoration(view.getContext(),LinearLayoutManager.VERTICAL));



        recyclerView.setAdapter(adapterClass);
        adapterClass.notifyDataSetChanged();


    return view;
    }
    private void PreparData() {
        AddressSearchModel model=new AddressSearchModel();
        model.setName("ستارخان");
        model.setAddress("کوکب-داد-پلاک ۱۰");
        model.setRegions("ستارخان-توحید-کوکب-داد-پلاکستارخان-توحید-کوکب-داد-پلاک ۱۰۱۰");
        model.setWorkingHours("24 ساعت");
        model.setTelephone("22211111");

        lst_SearchResult.add(model);
        model=new AddressSearchModel();
        model.setName("باقرخانباقرخانباقرخان ");
        model.setAddress("کوکب-داد-پلاک ۱۰");
        model.setRegions("ستارخان-توحید-کوکب-داد-پلاکستارخان-توحید-کوکب-داد-پلاک ۱۰۱۰");
        model.setWorkingHours("24 ساعت");
        model.setTelephone("15667111");
        lst_SearchResult.add(model);
        model=new AddressSearchModel();
        model.setName("باقرخانباقرخانباقرخان ");
        model.setAddress("کوکب-داد-پلاک ۱۰");
        model.setRegions("ستارخان-توحید-کوکب-داد-پلاکستارخان-توحید-کوکب-داد-پلاک ۱۰۱۰");
        model.setWorkingHours("24 ساعت");
        model.setTelephone("15667111");
        lst_SearchResult.add(model);
        model=new AddressSearchModel();
        model.setName("باقرخانباقرخانباقرخان ");
        model.setAddress("کوکب-داد-پلاک ۱۰");
        model.setRegions("ستارخان-توحید-کوکب-داد-پلاکستارخان-توحید-کوکب-داد-پلاک ۱۰۱۰");
        model.setWorkingHours("24 ساعت");
        model.setTelephone("15667111");
        lst_SearchResult.add(model);
        model=new AddressSearchModel();
        model.setName("باقرخانباقرخانباقرخان ");
        model.setAddress("کوکب-داد-پلاک ۱۰");
        model.setRegions("ستارخان-توحید-کوکب-داد-پلاکستارخان-توحید-کوکب-داد-پلاک ۱۰۱۰");
        model.setWorkingHours("24 ساعت");
        model.setTelephone("15667111");
        lst_SearchResult.add(model);
        model=new AddressSearchModel();
        model.setName("باقرخانباقرخانباقرخان ");
        model.setAddress("کوکب-داد-پلاک ۱۰");
        model.setRegions("ستارخان-توحید-کوکب-داد-پلاکستارخان-توحید-کوکب-داد-پلاک ۱۰۱۰");
        model.setWorkingHours("24 ساعت");
        model.setTelephone("15667111");
        lst_SearchResult.add(model);
        model=new AddressSearchModel();
        model.setName("باقرخانباقرخانباقرخان ");
        model.setAddress("کوکب-داد-پلاک ۱۰");
        model.setRegions("ستارخان-توحید-کوکب-داد-پلاکستارخان-توحید-کوکب-داد-پلاک ۱۰۱۰");
        model.setWorkingHours("24 ساعت");
        model.setTelephone("15667111");
        lst_SearchResult.add(model);
        model=new AddressSearchModel();
        model.setName("باقرخانباقرخانباقرخان ");
        model.setAddress("کوکب-داد-پلاک ۱۰");
        model.setRegions("ستارخان-توحید-کوکب-داد-پلاکستارخان-توحید-کوکب-داد-پلاک ۱۰۱۰");
        model.setWorkingHours("24 ساعت");
        model.setTelephone("15667111");
        lst_SearchResult.add(model);
        model=new AddressSearchModel();
        model.setName("باقرخانباقرخانباقرخان ");
        model.setAddress("کوکب-داد-پلاک ۱۰");
        model.setRegions("ستارخان-توحید-کوکب-داد-پلاکستارخان-توحید-کوکب-داد-پلاک ۱۰۱۰");
        model.setWorkingHours("24 ساعت");
        model.setTelephone("15667111");
        lst_SearchResult.add(model);
        model=new AddressSearchModel();
        model.setName("باقرخانباقرخانباقرخان ");
        model.setAddress("کوکب-داد-پلاک ۱۰");
        model.setRegions("ستارخان-توحید-کوکب-داد-پلاکستارخان-توحید-کوکب-داد-پلاک ۱۰۱۰");
        model.setWorkingHours("24 ساعت");
        model.setTelephone("15667111");
        lst_SearchResult.add(model);
        model=new AddressSearchModel();
        model.setName("باقرخانباقرخانباقرخان ");
        model.setAddress("کوکب-داد-پلاک ۱۰");
        model.setRegions("ستارخان-توحید-کوکب-داد-پلاکستارخان-توحید-کوکب-داد-پلاک ۱۰۱۰");
        model.setWorkingHours("24 ساعت");
        model.setTelephone("15667111");
        lst_SearchResult.add(model);
        model=new AddressSearchModel();
        model.setName("باقرخانباقرخانباقرخان ");
        model.setAddress("کوکب-داد-پلاک ۱۰");
        model.setRegions("ستارخان-توحید-کوکب-داد-پلاکستارخان-توحید-کوکب-داد-پلاک ۱۰۱۰");
        model.setWorkingHours("24 ساعت");
        model.setTelephone("15667111");
        lst_SearchResult.add(model);
        model=new AddressSearchModel();
        model.setName("باقرخانباقرخانباقرخان ");
        model.setAddress("کوکب-داد-پلاک ۱۰");
        model.setRegions("ستارخان-توحید-کوکب-داد-پلاکستارخان-توحید-کوکب-داد-پلاک ۱۰۱۰");
        model.setWorkingHours("24 ساعت");
        model.setTelephone("15667111");
        lst_SearchResult.add(model);
        model=new AddressSearchModel();
        model.setName("باقرخانباقرخانباقرخان ");
        model.setAddress("کوکب-داد-پلاک ۱۰");
        model.setRegions("ستارخان-توحید-کوکب-داد-پلاکستارخان-توحید-کوکب-داد-پلاک ۱۰۱۰");
        model.setWorkingHours("24 ساعت");
        model.setTelephone("15667111");
        lst_SearchResult.add(model);
    }

    public  void fav_GetAddress(){
        final Dialog dialog = new Dialog(getActivity());
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);

        dialog.setContentView(R.layout.dialog_add_address);
        dialog.getWindow().setBackgroundDrawableResource(R.drawable.draw_radius_cost_info);
        // set the custom dialog components - text, image and button

        TextView dialogButton = (TextView) dialog.findViewById(R.id.dialogOK);
        // if button is clicked, close the custom dialog
        dialogButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });
        dialog.show();
// custom dialog

    }
}
