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
public class FoodFragment extends Fragment {


    public FoodFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        //instance the root list view
        View rootView = inflater.inflate(R.layout.general_list_view, container, false);

        //create list object
        final ArrayList<GenericLocationInfoObject> itemsListArray = new ArrayList<GenericLocationInfoObject>();
        itemsListArray.add(new GenericLocationInfoObject(getString(R.string.food_food1_name),getString(R.string.food_food1_address),getString(R.string.food_food1_description),getString(R.string.food_food1_phone), R.drawable.baseline_fastfood_black_48));
        itemsListArray.add(new GenericLocationInfoObject(getString(R.string.food_food2_name),getString(R.string.food_food2_address),getString(R.string.food_food2_description),getString(R.string.food_food2_phone), R.drawable.baseline_fastfood_black_48));
        itemsListArray.add(new GenericLocationInfoObject(getString(R.string.food_food3_name),getString(R.string.food_food3_address),getString(R.string.food_food3_description),getString(R.string.food_food3_phone), R.drawable.baseline_fastfood_black_48));
        itemsListArray.add(new GenericLocationInfoObject(getString(R.string.food_food4_name),getString(R.string.food_food4_address),getString(R.string.food_food4_description),getString(R.string.food_food4_phone), R.drawable.baseline_fastfood_black_48));
        itemsListArray.add(new GenericLocationInfoObject(getString(R.string.food_food5_name),getString(R.string.food_food5_address),getString(R.string.food_food5_description),getString(R.string.food_food5_phone), R.drawable.baseline_fastfood_black_48));

        //instance adapter
        GenericItemAdapter adapter = new GenericItemAdapter(getActivity(), itemsListArray);

        //find the list view
        ListView listView = rootView.findViewById(R.id.list);

        //set adapter
        listView.setAdapter(adapter);

        return rootView;
    }

}
