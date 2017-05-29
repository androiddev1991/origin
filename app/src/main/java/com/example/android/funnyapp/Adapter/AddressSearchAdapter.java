package com.example.android.funnyapp.Adapter;

import android.app.Activity;
import android.content.Context;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.android.funnyapp.Helper.ItemClickListener;
import com.example.android.funnyapp.Model.AddressSearchModel;
import com.example.android.funnyapp.R;
import com.example.android.funnyapp.View.Fragment.ArticleFragment;

import java.util.List;


/**
 * Created by hussein on 1/15/17.
 */

public class AddressSearchAdapter extends RecyclerView.Adapter<AddressSearchAdapter.MyHolder> {
    private List<AddressSearchModel> doctorList;
    FragmentTransaction mFragmentTransition;

    public AddressSearchAdapter(FragmentTransaction fragmentTransaction,List<AddressSearchModel> doctorList)
    {
        this.doctorList=doctorList;
        this.mFragmentTransition=fragmentTransaction;
    }


    class MyHolder extends RecyclerView.ViewHolder {
        public TextView tvname,tvRegions,tvAddress,tvTelephone,tvWorkingHours;
        public Button button;
        public MyHolder(View itemView) {
            super(itemView);
            button=(Button)itemView.findViewById(R.id.button);

        }


    }

    @Override
    public MyHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext())
                .inflate(R.layout.cardview_address_search,parent,false);
        return new MyHolder(view);
    }
    @Override
    public void onBindViewHolder(MyHolder holder, final int position) {
        AddressSearchModel addressSearchModel =doctorList.get(position);
        /*holder.tvname.setText(addressSearchModel.getName());
        holder.tvRegions.setText(addressSearchModel.getRegions());
        holder.tvAddress.setText(addressSearchModel.getAddress());
        holder.tvTelephone.setText(addressSearchModel.getTelephone());
        holder.tvWorkingHours.setText(addressSearchModel.getWorkingHours());*/
        holder.button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mFragmentTransition.addToBackStack("back");
                mFragmentTransition.commit();

            }
        });

    }

    @Override
    public int getItemCount() {
        return doctorList.size();
    }

}
