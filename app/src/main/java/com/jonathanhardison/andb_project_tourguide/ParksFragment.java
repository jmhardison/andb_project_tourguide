package com.jonathanhardison.andb_project_tourguide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class ParksFragment extends Fragment {


    public ParksFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        //instance the root list view
        View rootView = inflater.inflate(R.layout.general_list_view, container, false);

        //create list object
        final ArrayList<ParkInfoObject> itemsListArray = new ArrayList<ParkInfoObject>();
        itemsListArray.add(new ParkInfoObject(getString(R.string.park_park1_name),getString(R.string.park_park1_address),getString(R.string.park_park1_amenities), getString(R.string.park_default_description), R.drawable.park1));
        itemsListArray.add(new ParkInfoObject(getString(R.string.park_park2_name),getString(R.string.park_park2_address),getString(R.string.park_park2_amenities), getString(R.string.park_default_description), R.drawable.park2));
        itemsListArray.add(new ParkInfoObject(getString(R.string.park_park3_name),getString(R.string.park_park3_address),getString(R.string.park_park3_amenities), getString(R.string.park_default_description), R.drawable.park3));
        itemsListArray.add(new ParkInfoObject(getString(R.string.park_park4_name),getString(R.string.park_park4_address),getString(R.string.park_park4_amenities), getString(R.string.park_default_description), R.drawable.park4));

        //instance adapter
        ParkItemAdapter adapter = new ParkItemAdapter(getActivity(), itemsListArray);

        //find the list view
        ListView listView = rootView.findViewById(R.id.list);

        //set adapter
        listView.setAdapter(adapter);

        return rootView;
    }

}
