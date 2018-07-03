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
        itemsListArray.add(new GenericLocationInfoObject(getString(R.string.shop_shop1_name),getString(R.string.shop_shop1_address),getString(R.string.shop_shop1_description),getString(R.string.shop_shop1_phone), R.drawable.baseline_local_mall_black_48));
        itemsListArray.add(new GenericLocationInfoObject(getString(R.string.shop_shop2_name),getString(R.string.shop_shop2_address),getString(R.string.shop_shop2_description),getString(R.string.shop_shop2_phone), R.drawable.baseline_local_mall_black_48));
        itemsListArray.add(new GenericLocationInfoObject(getString(R.string.shop_shop3_name),getString(R.string.shop_shop3_address),getString(R.string.shop_shop3_description),getString(R.string.shop_shop3_phone), R.drawable.baseline_local_mall_black_48));
        itemsListArray.add(new GenericLocationInfoObject(getString(R.string.shop_shop4_name),getString(R.string.shop_shop4_address),getString(R.string.shop_shop4_description),getString(R.string.shop_shop4_phone), R.drawable.baseline_local_mall_black_48));
        itemsListArray.add(new GenericLocationInfoObject(getString(R.string.shop_shop5_name),getString(R.string.shop_shop5_address),getString(R.string.shop_shop5_description),getString(R.string.shop_shop5_phone), R.drawable.baseline_local_mall_black_48));
        itemsListArray.add(new GenericLocationInfoObject(getString(R.string.shop_shop6_name),getString(R.string.shop_shop6_address),getString(R.string.shop_shop6_description),getString(R.string.shop_shop6_phone), R.drawable.baseline_local_mall_black_48));
        itemsListArray.add(new GenericLocationInfoObject(getString(R.string.shop_shop7_name),getString(R.string.shop_shop7_address),getString(R.string.shop_shop7_description),getString(R.string.shop_shop7_phone), R.drawable.baseline_local_mall_black_48));
        itemsListArray.add(new GenericLocationInfoObject(getString(R.string.shop_shop8_name),getString(R.string.shop_shop8_address),getString(R.string.shop_shop8_description),getString(R.string.shop_shop8_phone), R.drawable.baseline_local_mall_black_48));

        //instance adapter
        GenericItemAdapter adapter = new GenericItemAdapter(getActivity(), itemsListArray);

        //find the list view
        ListView listView = rootView.findViewById(R.id.list);

        //set adapter
        listView.setAdapter(adapter);

        return rootView;
    }

}
