package com.example.android.funnyapp.View.Fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.android.funnyapp.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class ProfileFragment extends Fragment {
    RelativeLayout llimgpic;
    ImageView imgpic;
    TextView tvnezam_number;
    TextView tvproficiency;
    TextView tvspeacialy;
    ImageView imgusersetting;
    TextView tvusersetting;
    ImageView imgmanageclerk;
    TextView tvmanageclerk;
    TextView tvservicelist;
    ImageView imgservicelist;
    ImageView imgfinancialreport;
    TextView tvfinancialreport;
    TextView tvaboutus;
    ImageView imgaboutus;
    TextView tvaccountinfo;
    ImageView imgaccountinfo;
    TextView tvguide;
    ImageView imgguide;
    TextView tvmanageofficee;
    ImageView imgmanageofficee;

    RelativeLayout rlone;
    RelativeLayout rltwo;
    RelativeLayout llspace;
    RelativeLayout llone;
    RelativeLayout lltwo;
    RelativeLayout llspacethree;
    RelativeLayout llthree;
    RelativeLayout llspacefour;
    RelativeLayout llspacetwo;
    RelativeLayout rlmargineright;


    TextView tvmrormiss;
    RelativeLayout img1;
    RelativeLayout img2;
    RelativeLayout img3;
    RelativeLayout img4;
    RelativeLayout img5;
    RelativeLayout img6;
    RelativeLayout img7;
    RelativeLayout img8;

    public ProfileFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_profile, container, false);
        findbyid(view);
        /*UIHelper.setImageViewVisibility(getActivity(), R.id.fav_GetAddress, "gone",null);*/
        /*UIHelper.setTvVisibility(getActivity(), R.id.google_header_address, "invisible");*/
        /*UIHelper.setTvVisibility(getActivity(), R.id.select_address, "visible")*/;


        Display display = getActivity().getWindowManager().getDefaultDisplay();
        int width = display.getWidth();
        int height = display.getHeight();

        RelativeLayout.LayoutParams params5 = new RelativeLayout.LayoutParams(width / 40, RelativeLayout.LayoutParams.MATCH_PARENT);
        params5.addRule(RelativeLayout.ALIGN_PARENT_RIGHT);
        rlmargineright.setLayoutParams(params5);

        RelativeLayout.LayoutParams params4 = new RelativeLayout.LayoutParams(width / 100 * 22, width / 100 * 29);
        params4.addRule(RelativeLayout.CENTER_IN_PARENT);
        llimgpic.setLayoutParams(params4);

        RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(width / 11 * 4, RelativeLayout.LayoutParams.MATCH_PARENT);
        rlone.setLayoutParams(params);

        RelativeLayout.LayoutParams params1 = new RelativeLayout.LayoutParams(width / 11 * 6, RelativeLayout.LayoutParams.MATCH_PARENT);
        params1.addRule(RelativeLayout.ALIGN_PARENT_RIGHT);
        rltwo.setLayoutParams(params1);

        RelativeLayout.LayoutParams paramsspace = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.MATCH_PARENT, height / 90);
        paramsspace.addRule(RelativeLayout.ALIGN_PARENT_TOP);

        RelativeLayout.LayoutParams paramsspace1 = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.MATCH_PARENT, height / 500);
        paramsspace1.addRule(RelativeLayout.BELOW, R.id.llone);

        RelativeLayout.LayoutParams paramsspace2 = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.MATCH_PARENT, height / 500);
        paramsspace2.addRule(RelativeLayout.BELOW, R.id.lltwo);

        RelativeLayout.LayoutParams paramsspace3 = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.MATCH_PARENT, height / 25);
        paramsspace3.addRule(RelativeLayout.BELOW, R.id.llthree);

        RelativeLayout.LayoutParams imgparams = new RelativeLayout.LayoutParams(height / 129 * 10, height / 130 * 10);
        imgparams.addRule(RelativeLayout.CENTER_IN_PARENT);
        img1.setLayoutParams(imgparams);
        img2.setLayoutParams(imgparams);
        img3.setLayoutParams(imgparams);
        img4.setLayoutParams(imgparams);
        img5.setLayoutParams(imgparams);
        img6.setLayoutParams(imgparams);
        img7.setLayoutParams(imgparams);
        img8.setLayoutParams(imgparams);
        llspace.setLayoutParams(paramsspace);
        llspacethree.setLayoutParams(paramsspace2);
        llspacefour.setLayoutParams(paramsspace3);
        llspacetwo.setLayoutParams(paramsspace1);

        RelativeLayout.LayoutParams paramstxt = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.MATCH_PARENT, height / 100 * 6);
        paramstxt.addRule(RelativeLayout.BELOW, R.id.llspace);
        paramstxt.addRule(RelativeLayout.LEFT_OF, R.id.rlmargineright);
        RelativeLayout.LayoutParams paramstxt1 = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.MATCH_PARENT, height / 100 * 6);
        paramstxt1.addRule(RelativeLayout.BELOW, R.id.llspacetwo);
        paramstxt1.addRule(RelativeLayout.LEFT_OF, R.id.rlmargineright);
        RelativeLayout.LayoutParams paramstxt2 = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.MATCH_PARENT, height / 100 * 6);
        paramstxt2.addRule(RelativeLayout.BELOW, R.id.llspacethree);
        paramstxt2.addRule(RelativeLayout.LEFT_OF, R.id.rlmargineright);

        llone.setLayoutParams(paramstxt);
        lltwo.setLayoutParams(paramstxt1);
        llthree.setLayoutParams(paramstxt2);





        return view;
    }
    public void findbyid(View rootView) {

        /*tv_proficiency = (TextView) rootView.findViewById(R.id.tv_proficiency);
        tv_speacialy = (TextView) rootView.findViewById(R.id.tv_speacialy);
        tv_nezamnumber = (TextView) rootView.findViewById(R.id.tv_nezamnumber);*/

        imgmanageofficee = (ImageView) rootView.findViewById(R.id.imgmanageofficce);
        imgguide = (ImageView) rootView.findViewById(R.id.imgguide);
        imgaccountinfo = (ImageView) rootView.findViewById(R.id.imgaccountinfo);
        imgaboutus = (ImageView) rootView.findViewById(R.id.imgaboutus);
        imgfinancialreport = (ImageView) rootView.findViewById(R.id.imgfinancialreport);
        imgservicelist = (ImageView) rootView.findViewById(R.id.imgservicelist);
        imgmanageclerk = (ImageView) rootView.findViewById(R.id.imgmanageclerk);
        imgusersetting = (ImageView) rootView.findViewById(R.id.imgusersetting);
        imgpic = (ImageView) rootView.findViewById(R.id.imgpic);
        llimgpic = (RelativeLayout) rootView.findViewById(R.id.llimgpic);

        tvnezam_number = (TextView) rootView.findViewById(R.id.tvnezam_number);
        tvproficiency = (TextView) rootView.findViewById(R.id.tvproficiency);
        tvproficiency = (TextView) rootView.findViewById(R.id.tvproficiency);
        tvspeacialy = (TextView)rootView.findViewById(R.id.tvspeacialy);
        tvusersetting = (TextView) rootView.findViewById(R.id.tvusersetting);
        tvmanageclerk = (TextView) rootView.findViewById(R.id.tvmanageclerk);
        tvservicelist = (TextView) rootView.findViewById(R.id.tvservicelist);
        tvfinancialreport = (TextView) rootView.findViewById(R.id.tvfinancialreport);
        tvaboutus = (TextView) rootView.findViewById(R.id.tvaboutus);
        tvaccountinfo = (TextView) rootView.findViewById(R.id.tvaccountinfo);
        tvguide = (TextView) rootView.findViewById(R.id.tvguide);
        tvmanageofficee = (TextView) rootView.findViewById(R.id.tvmanageofficee);
        rlone = (RelativeLayout) rootView.findViewById(R.id.rlone);
        rltwo = (RelativeLayout) rootView.findViewById(R.id.rltwo);
        llspace = (RelativeLayout) rootView.findViewById(R.id.llspace);
        llone = (RelativeLayout) rootView.findViewById(R.id.llone);
        lltwo = (RelativeLayout) rootView.findViewById(R.id.lltwo);
        llspacethree = (RelativeLayout) rootView.findViewById(R.id.llspacethree);
        llthree = (RelativeLayout) rootView.findViewById(R.id.llthree);
        llspacefour = (RelativeLayout) rootView.findViewById(R.id.llspacefour);
        llspacetwo = (RelativeLayout) rootView.findViewById(R.id.llspacetwo);
        rlmargineright = (RelativeLayout) rootView.findViewById(R.id.rlmargineright);
        img1 = (RelativeLayout) rootView.findViewById(R.id.img1);
        img2 = (RelativeLayout) rootView.findViewById(R.id.img2);
        img3 = (RelativeLayout) rootView.findViewById(R.id.img3);
        img4 = (RelativeLayout) rootView.findViewById(R.id.img4);
        img5 = (RelativeLayout) rootView.findViewById(R.id.img5);
        img6 = (RelativeLayout) rootView.findViewById(R.id.img6);
        img7 = (RelativeLayout) rootView.findViewById(R.id.img7);
        img8 = (RelativeLayout) rootView.findViewById(R.id.img8);

        /*tvmrormiss = (TextView) rootView.findViewById(R.id.tvmrormiss);*/


    }
}
