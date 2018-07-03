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
        itemsListArray.add(new GenericLocationInfoObject("Fire Department","2483 Black Stallion Road, SpecialTown, MO 61234","Fire and Rescue","111-411-2311", R.drawable.baseline_local_shipping_black_48));
        itemsListArray.add(new GenericLocationInfoObject("Police Department","3434 Turkey Pen Lane, SpecialTown, MO 61234","Police and Jail","111-411-2322", R.drawable.baseline_local_taxi_black_48));
        itemsListArray.add(new GenericLocationInfoObject("Library","3432 Leroy Lane, SpecialTown, MO 61234","We have the books.","111-411-2333", R.drawable.baseline_local_library_black_48));

        //instance adapter
        GenericItemAdapter adapter = new GenericItemAdapter(getActivity(), itemsListArray);

        //find the list view
        ListView listView = rootView.findViewById(R.id.list);

        //set adapter
        listView.setAdapter(adapter);

        return rootView;
    }

}
