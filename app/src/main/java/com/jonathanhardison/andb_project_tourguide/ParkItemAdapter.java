package com.jonathanhardison.andb_project_tourguide;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;


public class ParkItemAdapter extends ArrayAdapter<ParkInfoObject> {
    /**
     * base init
     * @param context
     * @param inListObject
     */
    public ParkItemAdapter(@NonNull Context context, ArrayList<ParkInfoObject> inListObject) {
        super(context, 0, inListObject);
    }

    /**
     * getView override
     * @param position
     * @param convertView
     * @param parent
     * @return
     */
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.park_list_item, parent, false);
        }

        final ParkInfoObject currentListItem = getItem(position);

        //Get the views and set them.
        //name
        TextView nameTextView = listItemView.findViewById(R.id.name_text);
        nameTextView.setText(currentListItem.getName());
        //address
        TextView addressTextView = listItemView.findViewById(R.id.address_text);
        addressTextView.setText(currentListItem.getAddress());
        //amenities
        TextView phoneTextView = listItemView.findViewById(R.id.amenities_text);
        phoneTextView.setText(currentListItem.getAmenities());
        //find the imageview
        ImageView iconImageView = listItemView.findViewById(R.id.image_view);
        //if has image, set it or remove it otherwise.
        if(currentListItem.hasImageID()) {
            iconImageView.setImageResource(currentListItem.getImageID());
        }
        else
        {
            iconImageView.setVisibility(View.GONE);
        }

        //finally return the view
        return listItemView;
    }
}
