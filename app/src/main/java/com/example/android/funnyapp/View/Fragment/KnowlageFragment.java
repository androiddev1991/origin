package com.example.android.funnyapp.View.Fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.SpannableString;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.android.funnyapp.Adapter.AddressSearchAdapter;
import com.example.android.funnyapp.Model.AddressSearchModel;
import com.example.android.funnyapp.R;
import com.toptoche.searchablespinnerlibrary.SearchableSpinner;

import java.util.ArrayList;

import butterknife.OnClick;
import info.hoang8f.android.segmented.SegmentedGroup;

/**
 * A simple {@link Fragment} subclass.
 */
public class KnowlageFragment extends Fragment {
    RecyclerView rvdoctors;

    TextView llsearch;
    TextView  tvdelete;
    SearchableSpinner spRegion;
    ArrayList<AddressSearchModel> lst_SearchResult;
    RecyclerView recyclerView;
    LinearLayout llsearch2;

    AddressSearchAdapter adapterClass;
    String[] region = {"فیلتر بر اساس دسته بندی مطلب", "ازگل", "اقدسیه", "الهيه", "امامزاده قاسم",
            "اوین", "باغ فردوس", "تجریش", "جماران", "چیذر", "دارآباد", "دربند",
            "درکه", "دزاشیب - جوزستان", "زعفرانیه", "سوهانک", "شهرک نفت", "شهرک محلاتی", "فرمانیه",
            "فرشته", "قیطریه", "کاشانک", "کامرانیه", "محمودیه", "نیاوران", "ولنجک",
            "برق آلستوم", "تهران ویلا", "ستارخان", "سعادت آباد",
            "شهرک غرب", "شهرک مخابرات", "شهرآرا", "صادقیه", "طرشت", "فرحزاد", "گیشا",
            "همایونشهر", "مرزداران"};
    public KnowlageFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_knowlage, container, false);
        findbyid(view);

        lst_SearchResult=new ArrayList<>();
        PreparData();

        SegmentedGroup segmented3 = (SegmentedGroup) view.findViewById(R.id.segmented3);
        segmented3.setTintColor(getActivity().getResources().getColor(R.color.colorBlue));
        segmented3.setBackgroundColor(getActivity().getResources().getColor(R.color.colorWhite));
        segmented3.check(R.id.paytype);
        FragmentTransaction transaction=getFragmentManager().beginTransaction();
        transaction.replace(R.id.root_knowlage_fragment,new ArticleFragment());

        recyclerView=(RecyclerView)view.findViewById(R.id.recyclerview);
        adapterClass=new AddressSearchAdapter(transaction,lst_SearchResult);
        RecyclerView.LayoutManager LayoutManager= new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(LayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(adapterClass);
        adapterClass.notifyDataSetChanged();


        ArrayAdapter<String> adapteRregion = new ArrayAdapter<String>(getActivity(), R.layout.spineer_item, region);
        adapteRregion.setDropDownViewResource(android.R.layout.
                simple_spinner_dropdown_item);

        spRegion.setAdapter(adapteRregion);

        spRegion.setTitle("انتخاب");
        spRegion.setPositiveButton("خروج");
        spRegion.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> arg0, View arg1,
                                       int position, long id) {
            }

            @Override
            public void onNothingSelected(AdapterView<?> arg0) {

            }
        });
        //tvdelete.setOnClickListener(this);
        return view;
    }

    private void PreparData() {
        AddressSearchModel model=new AddressSearchModel();
        model.setName("دکتر صحرایی");
        model.setAddress("ازگل");
        model.setRegions("22222222");
        model.setWorkingHours("24 ساعت");
        model.setTelephone("خراب است");

        lst_SearchResult.add(model);
        model.setName("حسین");
        model.setAddress("24/05/2015");
        model.setRegions("نقدی-بانکی");
        model.setWorkingHours("24 ساعت");
        model.setTelephone("خراب است");
        lst_SearchResult.add(model);

    }
    public void findbyid(View view) {
        spRegion = (SearchableSpinner) view.findViewById(R.id.region);
        rvdoctors = (RecyclerView) view.findViewById(R.id.recyclerview);
       // llsearch = (TextView) view.findViewById(R.id.llseach);
        tvdelete = (TextView) view.findViewById(R.id.tvdelete);
        llsearch2 = (LinearLayout) view.findViewById(R.id.llsearch2);

    }

}
