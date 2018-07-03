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
        itemsListArray.add(new GenericLocationInfoObject("The Olive Spice","123 N Foodie St, SpecialTown, MO 61234","Italian","111-411-1234", R.drawable.baseline_fastfood_black_48));
        itemsListArray.add(new GenericLocationInfoObject("The Charming Rose","3786 Woodrow Way, SpecialTown, MO 61234","Pizza","111-411-1232", R.drawable.baseline_fastfood_black_48));
        itemsListArray.add(new GenericLocationInfoObject("The Hummingbird","3947 Eagle Lane, SpecialTown, MO 61234","Wings and Beer","111-411-1233", R.drawable.baseline_fastfood_black_48));
        itemsListArray.add(new GenericLocationInfoObject("Atlas","2729 Martha Street, SpecialTown, MO 61234","Burgers","111-411-1231", R.drawable.baseline_fastfood_black_48));
        itemsListArray.add(new GenericLocationInfoObject("The Hive","1193 Nutter Street, SpecialTown, MO 61234","Pub with a side of chips","111-411-1221", R.drawable.baseline_fastfood_black_48));

        //instance adapter
        GenericItemAdapter adapter = new GenericItemAdapter(getActivity(), itemsListArray);

        //find the list view
        ListView listView = rootView.findViewById(R.id.list);

        //set adapter
        listView.setAdapter(adapter);

        return rootView;
    }

}
