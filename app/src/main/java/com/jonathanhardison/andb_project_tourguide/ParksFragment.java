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
        itemsListArray.add(new ParkInfoObject("Park McParky Face","300 E Park Rd, SpecialTown, MO 61234","Amphitheater, Benches, Grill, Parking", R.drawable.park1));
        itemsListArray.add(new ParkInfoObject("Pocket Park","213 N Main, SpecialTown, MO 61234","Benches", R.drawable.park2));
        itemsListArray.add(new ParkInfoObject("D' Lake Park","440 N Bailey Avenue, SpecialTown, MO 61234","Paved Parking Area, Picnic Tables, Lake", R.drawable.park3));
        itemsListArray.add(new ParkInfoObject("PaaaaarrK Park","440 N Bailey Avenue, SpecialTown, MO 61234","Grass To Sits On", R.drawable.park4));

        //instance adapter
        ParkItemAdapter adapter = new ParkItemAdapter(getActivity(), itemsListArray);

        //find the list view
        ListView listView = rootView.findViewById(R.id.list);

        //set adapter
        listView.setAdapter(adapter);

        return rootView;
    }

}
