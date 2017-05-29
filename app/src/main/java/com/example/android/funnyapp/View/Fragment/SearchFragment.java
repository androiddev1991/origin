package com.example.android.funnyapp.View.Fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

import com.example.android.funnyapp.Model.CLinicModel;
import com.example.android.funnyapp.Model.SearchModel;
import com.example.android.funnyapp.R;
import com.toptoche.searchablespinnerlibrary.SearchableSpinner;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * A simple {@link Fragment} subclass.
 */
public class SearchFragment extends Fragment implements View.OnClickListener {

    LinearLayout cityAround;
    LinearLayout nearest_place;
    LinearLayout dayNight;

    ToggleButton nearhospital;
    ToggleButton environment;
    ToggleButton nearest_for_me;

    TextView tvss;
    SearchableSpinner spRegion;

    EditText search_keyword;
    List<Map<String, String>> myMap;


    TextView search_button;

    ArrayList<CLinicModel> cLinicModels;

    ArrayList<String> proficiency, spetiality;
    String[] region = {"همه محله ها ", "ازگل", "اقدسیه", "الهيه", "امامزاده قاسم",
            "اوین", "باغ فردوس", "تجریش", "جماران", "چیذر", "دارآباد", "دربند",
            "درکه", "دزاشیب - جوزستان", "زعفرانیه", "سوهانک", "شهرک نفت", "شهرک محلاتی", "فرمانیه",
            "فرشته", "قیطریه", "کاشانک", "کامرانیه", "محمودیه", "نیاوران", "ولنجک",
            "برق آلستوم", "تهران ویلا", "ستارخان", "سعادت آباد",
            "شهرک غرب", "شهرک مخابرات", "شهرآرا", "صادقیه", "طرشت", "فرحزاد", "گیشا",
            "همایونشهر", "مرزداران"};

    SearchModel person;

    public SearchFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_search, container, false);
        findbyId(view);

        myMap = new ArrayList<Map<String, String>>();

        proficiency = new ArrayList<>();
        spetiality = new ArrayList<>();
        cLinicModels = new ArrayList<>();

        String[] city = {"تهران", "تبریز", "اصفهان", "شیراز"};
        ArrayAdapter<String> adapteRregion1 = new ArrayAdapter<String>(getActivity(), R.layout.spinner_item_city, city);
        adapteRregion1.setDropDownViewResource(android.R.layout.

                simple_spinner_dropdown_item);


        nearhospital.setOnClickListener(this);
        environment.setOnClickListener(this);
        nearest_for_me.setOnClickListener(this);

        nearest_place.setOnClickListener(this);
        cityAround.setOnClickListener(this);
        dayNight.setOnClickListener(this);





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
        TextView search_button=(TextView) view.findViewById(R.id.search_button);

        return view;
    }
    public void findbyId(View view) {
        tvss= (TextView) view.findViewById(R.id.tvss);

        search_button = (TextView) view.findViewById(R.id.search_button);
        search_keyword = (EditText) view.findViewById(R.id.search_keyword);

        spRegion = (SearchableSpinner) view.findViewById(R.id.region);
        nearest_for_me = (ToggleButton) view.findViewById(R.id.nearest_for_me);
        nearhospital = (ToggleButton) view.findViewById(R.id.nearhospital);
        environment = (ToggleButton) view.findViewById(R.id.environment);

        nearest_place = (LinearLayout) view.findViewById(R.id.nearest_place);
        cityAround = (LinearLayout) view.findViewById(R.id.cityAround);
        dayNight = (LinearLayout) view.findViewById(R.id.dayNight);



    }
    public static boolean nearest=true,enviroment=true,neartome=true;
    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.search_button:
                FragmentTransaction transaction=getFragmentManager().beginTransaction();
                
                break;
            case R.id.nearhospital:
            case R.id.nearest_place:
                if (nearest) {
                    nearest=false;
                    nearhospital.setChecked(false);
                    nearhospital.setBackgroundDrawable(getResources().getDrawable(R.drawable.toggled_off));
                } else {
                    nearest=true;
                    nearhospital.setChecked(true);
                    nearhospital.setBackgroundDrawable(getResources().getDrawable(R.drawable.toggled_on));
                }
                break;

            case R.id.environment:
            case R.id.cityAround:
                if (!spRegion.getSelectedItem().toString().equalsIgnoreCase("")) {

                    if (enviroment) {
                        enviroment=false;
                        environment.setChecked(false);
                        environment.setBackgroundDrawable(getResources().getDrawable(R.drawable.toggled_off));
                    } else {
                        enviroment=true;
                        environment.setChecked(true);
                        environment.setBackgroundDrawable(getResources().getDrawable(R.drawable.toggled_on));
                    }
                }else{
                    Toast.makeText(getActivity(),"شما هیچ محله ای را انتخاب نکرده اید.", Toast.LENGTH_LONG).show();
                }
                break;
            case R.id.nearest_for_me:
            case R.id.dayNight:
                if (!spRegion.getSelectedItem().toString().equalsIgnoreCase("")) {
                    if (neartome) {
                        neartome=false;
                        nearest_for_me.setChecked(false);
                        nearest_for_me.setBackgroundDrawable(getResources().getDrawable(R.drawable.toggled_off));
                    } else {
                        neartome=true;
                        nearest_for_me.setChecked(true);
                        nearest_for_me.setBackgroundDrawable(getResources().getDrawable(R.drawable.toggled_on));
                    }
                }else{
                    Toast.makeText(getActivity(),"شما هیچ محله ای را انتخاب نکرده اید.", Toast.LENGTH_LONG).show();
                }
                break;
            default:
                break;
        }
    }
}
