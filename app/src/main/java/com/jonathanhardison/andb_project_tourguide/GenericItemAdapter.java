package com.jonathanhardison.andb_project_tourguide;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class GenericItemAdapter extends ArrayAdapter<GenericLocationInfoObject> {

    /**
     * base init
     * @param context
     * @param inListObject
     */
    public GenericItemAdapter(@NonNull Context context, ArrayList<GenericLocationInfoObject> inListObject) {
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
                    R.layout.general_list_item, parent, false);
        }

        final GenericLocationInfoObject currentListItem = getItem(position);

        //Get the views and set them.
        //name
        TextView nameTextView = listItemView.findViewById(R.id.name_text);
        nameTextView.setText(currentListItem.getName());
        //description
        TextView descriptionTextView = listItemView.findViewById(R.id.description_text);
        descriptionTextView.setText(currentListItem.getDescription());
        //address
        TextView addressTextView = listItemView.findViewById(R.id.address_text);
        addressTextView.setText(currentListItem.getAddress());
        //phone
        TextView phoneTextView = listItemView.findViewById(R.id.phone_text);
        phoneTextView.setText(currentListItem.getPhoneNumber());
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

        //get the linear layout right
        //LinearLayout rightLayout = (LinearLayout) listItemView.findViewById(R.id.rightLinearLayout);
        //int colortouse = ContextCompat.getColor(getContext(), backgroundColor);
        //rightLayout.setBackgroundColor(colortouse);

        //LinearLayout rightLayout2 = (LinearLayout) listItemView.findViewById(R.id.rightLinearLayout2);
        //rightLayout2.setBackgroundColor(colortouse);

        // Return the whole list item layout (containing 2 TextViews) so that it can be shown in
        // the ListView.
        return listItemView;



    }
}
