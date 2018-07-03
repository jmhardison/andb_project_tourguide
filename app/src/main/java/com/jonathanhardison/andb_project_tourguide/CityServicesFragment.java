package com.jonathanhardison.andb_project_tourguide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class CityServicesFragment extends Fragment {


    public CityServicesFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        //instance the root list view
        View rootView = inflater.inflate(R.layout.general_list_view, container, false);

        //create list object
        final ArrayList<GenericLocationInfoObject> itemsListArray = new ArrayList<GenericLocationInfoObject>();
        itemsListArray.add(new GenericLocationInfoObject(getString(R.string.city_city1_name),getString(R.string.city_city1_address),getString(R.string.city_city1_description),getString(R.string.city_city1_phone), R.drawable.baseline_local_shipping_black_48));
        itemsListArray.add(new GenericLocationInfoObject(getString(R.string.city_city2_name),getString(R.string.city_city2_address),getString(R.string.city_city2_description),getString(R.string.city_city2_phone), R.drawable.baseline_local_taxi_black_48));
        itemsListArray.add(new GenericLocationInfoObject(getString(R.string.city_city3_name),getString(R.string.city_city3_address),getString(R.string.city_city3_description),getString(R.string.city_city3_phone), R.drawable.baseline_local_library_black_48));

        //instance adapter
        GenericItemAdapter adapter = new GenericItemAdapter(getActivity(), itemsListArray);

        //find the list view
        ListView listView = rootView.findViewById(R.id.list);

        //set adapter
        listView.setAdapter(adapter);

        return rootView;
    }

}
