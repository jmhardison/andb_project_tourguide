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
        itemsListArray.add(new GenericLocationInfoObject("testname","testaddress","testdescription","testphone","testwebsite","hours"));

        //instance adapter
        GenericItemAdapter adapter = new GenericItemAdapter(getActivity(), itemsListArray);

        //find the list view
        ListView listView = rootView.findViewById(R.id.list);

        //set adapter
        listView.setAdapter(adapter);

        return rootView;
    }

}
