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
public class ShoppingFragment extends Fragment {


    public ShoppingFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        //instance the root list view
        View rootView = inflater.inflate(R.layout.general_list_view, container, false);

        //create list object
        final ArrayList<GenericLocationInfoObject> itemsListArray = new ArrayList<GenericLocationInfoObject>();
        itemsListArray.add(new GenericLocationInfoObject("Art a la Carte","3019 Hewes Avenue, SpecialTown, MO 61234","Art Store","111-411-2111", R.drawable.baseline_local_mall_black_48));
        itemsListArray.add(new GenericLocationInfoObject("Nemotors","3813 Gerald L. Bates Drive, SpecialTown, MO 61234","Motors and More","111-411-2112", R.drawable.baseline_local_mall_black_48));
        itemsListArray.add(new GenericLocationInfoObject("Houndhouse","1329 Ritter Avenue, SpecialTown, MO 61234","Pet Store","111-411-2121", R.drawable.baseline_local_mall_black_48));
        itemsListArray.add(new GenericLocationInfoObject("Relics and Riches","3807 Freedom Lane, SpecialTown, MO 61234","Pawn Shop","111-411-2122", R.drawable.baseline_local_mall_black_48));
        itemsListArray.add(new GenericLocationInfoObject("Stuff and Things","4752 Randall Drive, SpecialTown, MO 61234","Sewing Store","111-411-2123", R.drawable.baseline_local_mall_black_48));
        itemsListArray.add(new GenericLocationInfoObject("General Goods","2005 Horizon Circle, SpecialTown, MO 61234","Groceries","111-411-2131", R.drawable.baseline_local_mall_black_48));
        itemsListArray.add(new GenericLocationInfoObject("Matters of Time","4317 Patterson Road, SpecialTown, MO 61234","Clock Store","111-411-2132", R.drawable.baseline_local_mall_black_48));
        itemsListArray.add(new GenericLocationInfoObject("The Seam Theme","768 Lunetta Street, SpecialTown, MO 61234","Pants Repair","111-411-2133", R.drawable.baseline_local_mall_black_48));

        //instance adapter
        GenericItemAdapter adapter = new GenericItemAdapter(getActivity(), itemsListArray);

        //find the list view
        ListView listView = rootView.findViewById(R.id.list);

        //set adapter
        listView.setAdapter(adapter);

        return rootView;
    }

}
