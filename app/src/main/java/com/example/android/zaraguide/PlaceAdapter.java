package com.example.android.zaraguide;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;


/**
 * {@link PlaceAdapter} is an {@link ArrayAdapter} that can provide the layout for each list item
 * based on data source, which is a list of {@link Place} objects
 */
public class PlaceAdapter extends ArrayAdapter<Place> {


    /**
     * CONSTRUCTOR
     * Create a new {@link PlaceAdapter} object
     *
     * @param context is the current context (i.e. Activity) that the adapter is being created in
     * @param places  is the list of {@link Place}s to be displayed
     */
    public PlaceAdapter(Activity context, ArrayList<Place> places) {
        super(context, 0, places);
    }


    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;

        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        // Get the Place object located at this position in the list
        Place currentPlace = getItem(position);

        // Get the name of the place from the currentPlace object
        String name = currentPlace.getmPlaceName();
        // Get the name of the address from the currentPlace object
        String address = currentPlace.getmPlaceAddress();
        // Get the description from the currentPlace object
        String description = currentPlace.getmPlaceDescription();
        // Get the current image
        int imageID = currentPlace.getmPlaceImageResourceID();

        // Find the ImageView in list_item.xml with ID list_image
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.list_image);
        // Set the current image
        imageView.setImageResource(imageID);

        // Find the TextView in list_item.xml with ID place_name
        TextView placeName = (TextView) listItemView.findViewById(R.id.place_name);
        // Set the current name
        placeName.setText(name);

        // Find the TextView in list_item.xml with ID place_address
        TextView placeAddress = (TextView) listItemView.findViewById(R.id.place_address);
        // Set the current address
        placeAddress.setText(address);

        // Find the TextView in list_item.xml with ID place_description
        TextView placeDescription = (TextView) listItemView.findViewById(R.id.place_description);
        // Set the current description
        placeDescription.setText(description);

        /*
         * Return the whole list item layout (containing 1 ImageView and 3 TextViews so that
         * it can be shown in ListView.
         */
        return listItemView;
    }

}
