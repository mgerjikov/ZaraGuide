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
public class SightsFragment extends Fragment {


    public SightsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.place_list, container, false);


        // Create an array list of places objects:
        ArrayList<Place> places = new ArrayList<Place>();
        places.add(new Place(getString(R.string.alexander_nevsky_name), getString(R.string.alexander_nevsky_address), getString(R.string.alexander_nevsky_description), R.drawable.alexander_nevsky_cathedral));
        places.add(new Place(getString(R.string.boyana_church_name), getString(R.string.boyana_church_address), getString(R.string.boyana_church_description), R.drawable.boyana_church));
        places.add(new Place(getString(R.string.sofia_university_name), getString(R.string.sofia_university_address), getString(R.string.sofia_university_description), R.drawable.sofia_university));
        places.add(new Place(getString(R.string.vazov_theatre_name), getString(R.string.vazov_theatre_address), getString(R.string.vazov_theatre_description), R.drawable.vazov_theatre));
        places.add(new Place(getString(R.string.russian_church_name), getString(R.string.russian_church_address), getString(R.string.russian_church_description), R.drawable.rusian_church));
        places.add(new Place(getString(R.string.art_gallery_name), getString(R.string.art_gallery_address), getString(R.string.art_gallery_description), R.drawable.art_gallery));


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
