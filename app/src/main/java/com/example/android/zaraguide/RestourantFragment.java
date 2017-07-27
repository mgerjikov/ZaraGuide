package com.example.android.zaraguide;


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
public class RestourantFragment extends Fragment {


    public RestourantFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.place_list, container, false);


        // Create an array list of places objects:
        ArrayList<Place> places = new ArrayList<Place>();
        places.add(new Place(getString(R.string.spaghetti_kitchen_name), getString(R.string.spaghetti_kitchen_address), getString(R.string.spaghetti_kitchen_description), R.drawable.spaghetti_kitchen));
        places.add(new Place(getString(R.string.rakia_bar_name), getString(R.string.rakia_bar_address), getString(R.string.rakia_bar_description), R.drawable.rakia_bar));
        places.add(new Place(getString(R.string.made_in_home_name), getString(R.string.made_in_home_address), getString(R.string.made_in_home_description), R.drawable.made_in_home));
        places.add(new Place(getString(R.string.sasa_pub_name), getString(R.string.sasa_pub_address), getString(R.string.sasa_pub_description), R.drawable.sasa_pub));
        places.add(new Place(getString(R.string.marionet_bar_dinner_name), getString(R.string.made_in_home_address), getString(R.string.marionet_bar_dinner_description), R.drawable.marionet_bar_dinner));
        places.add(new Place(getString(R.string.la_bottega_centro_name), getString(R.string.la_bottega_centro_address), getString(R.string.la_bottega_centro_description), R.drawable.la_bottega_centro));

        // Create an array adapter
        PlaceAdapter place_list_adapter = new PlaceAdapter(getActivity(), places);
        /*
            Find the ListView object in the hierarchy of the Activity.
            The ListView with ID list , which is declared in the place_list.xml
         */
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        /*
            Make the ListView use the ArrayAdapter above, so that the ListView can
            display list items for each place in the list of places.
            Calling setAdapter on the ListView object and passing in 1 argument, which is the
            ArrayAdapter place_list_adapter
         */
        listView.setAdapter(place_list_adapter);

        return rootView;
    }

}
