
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
public class MuseumFragment extends Fragment {


    public MuseumFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.place_list, container, false);


        // Create an array list of places objects:
        ArrayList<Place> places = new ArrayList<Place>();
        places.add(new Place(getString(R.string.historical_museum_name), getString(R.string.historical_museum_address), getString(R.string.historical_museum_description), R.drawable.historical_museum));
        places.add(new Place(getString(R.string.earth_man_museum_name), getString(R.string.earth_man_museum_adress), getString(R.string.earth_man_museum_description), R.drawable.earth_man_museum));
        places.add(new Place(getString(R.string.natural_museum_name), getString(R.string.natural_museum_address), getString(R.string.natural_museum_description), R.drawable.natural_museum));
        places.add(new Place(getString(R.string.military_museum_name), getString(R.string.military_museum_address), getString(R.string.military_museum_description), R.drawable.military_museum));
        places.add(new Place(getString(R.string.soc_museum_name), getString(R.string.soc_museum_address), getString(R.string.soc_museum_description), R.drawable.soc_museum));
        places.add(new Place(getString(R.string.sofia_history_museum_name), getString(R.string.sofia_history_museum_address), getString(R.string.sofia_history_museum_description), R.drawable.sofia_history_museum));


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
