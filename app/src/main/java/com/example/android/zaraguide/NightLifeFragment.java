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
public class NightLifeFragment extends Fragment {


    public NightLifeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.place_list, container, false);


        // Create an array list of places objects:
        ArrayList<Place> places = new ArrayList<Place>();
        places.add(new Place(getString(R.string.sputnik_bar_name), getString(R.string.sputnik_bar_address), getString(R.string.sputnik_bar_description), R.drawable.sputnik_bar));
        places.add(new Place(getString(R.string.petuk_bar_name), getString(R.string.petuk_bar_address), getString(R.string.petuk_bar_description), R.drawable.petuk_bar));
        places.add(new Place(getString(R.string.hambara_bar_name), getString(R.string.hambara_bar_adress), getString(R.string.hambara_bar_description), R.drawable.hambara_bar));
        places.add(new Place(getString(R.string.sterling_bar_name), getString(R.string.sterling_bar_address), getString(R.string.sterling_bar_description), R.drawable.sterling_bar));
        places.add(new Place(getString(R.string.ink_bar_name), getString(R.string.ink_bar_address), getString(R.string.ink_bar_description), R.drawable.ink_bar));
        places.add(new Place(getString(R.string.ome_more_bar_name), getString(R.string.one_more_bar_address), getString(R.string.one_more_bar_description), R.drawable.one_more_bar));

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
