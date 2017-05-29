package com.example.android.funnyapp.Adapter;

import android.app.Activity;
import android.app.Dialog;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import com.example.android.funnyapp.R;

import com.example.android.funnyapp.Model.AddressSearchModel;

import java.util.List;

/**
 * Created by hussein on 1/16/17.
 */

public class Montakhab_Adapter extends RecyclerView.Adapter<Montakhab_Adapter.MyHolder> {
    private List<AddressSearchModel> doctorList;

    public Activity activity;
    public Montakhab_Adapter(List<AddressSearchModel> doctorList, Activity activity)
    {
        this.activity=activity;
        this.doctorList=doctorList;
    }
    class MyHolder extends RecyclerView.ViewHolder{
        public ImageView mArticleImage;
        public TextView drugstore_desc;
        public Button DeleteFavorite;
        public MyHolder(View itemView) {
            super(itemView);
            mArticleImage=(ImageView)itemView.findViewById(R.id.im_article);
            drugstore_desc=(TextView)itemView.findViewById(R.id.drugstore_desc);
            DeleteFavorite=(Button)itemView.findViewById(R.id.DeleteFavorite);

        }
    }

    @Override
    public MyHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext())
                .inflate(R.layout.cardview_address_montakhab,parent,false);

        return new MyHolder(view);
    }

    @Override
    public void onBindViewHolder(final MyHolder holder, final int position) {
        final AddressSearchModel addressSearchModel =doctorList.get(position);
        Log.d("Doctore_Size", String.valueOf(doctorList.size()));
        //holder.ImageView.setText(addressSearchModel.getName());
        holder.drugstore_desc.setText(addressSearchModel.getRegions());
        /*holder.DeleteAddress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AskQuestion();
            }
        });*/
        holder.DeleteFavorite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fav_GetAddress(addressSearchModel.getName(), addressSearchModel.getRegions());
            }
        });
    }
    public  void fav_GetAddress(String place,String PlaceAddress){
        final Dialog dialog = new Dialog(activity);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);

        dialog.setContentView(R.layout.dialog_add_address);
        dialog.getWindow().setBackgroundDrawableResource(R.drawable.draw_radius_cost_info);
        // set the custom dialog components - text, image and button
        EditText placeName=(EditText)dialog.findViewById(R.id.placeName);
        EditText StreetAddress=(EditText)dialog.findViewById(R.id.StreetAddress);

        placeName.setText(place);
        StreetAddress.setText(PlaceAddress);

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
    private boolean state=true;
    public  boolean AskQuestion(){

        final Dialog dialog = new Dialog(activity);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);

        dialog.setContentView(R.layout.dialog_ask_v1);
        dialog.getWindow().setBackgroundDrawableResource(R.drawable.draw_radius_nocolor);
        int width = (int)(activity.getResources().getDisplayMetrics().widthPixels*0.90);
        dialog.getWindow().setLayout(width, ViewGroup.LayoutParams.WRAP_CONTENT);
        Button dialogButton = (Button) dialog.findViewById(R.id.btnno);
        // if button is clicked, close the custom dialog
        dialogButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                state=false;
                dialog.dismiss();
            }
        });
        dialog.show();
// custom dialog
        return state;
    }
    @Override
    public int getItemCount() {
        return doctorList.size();
    }
}
