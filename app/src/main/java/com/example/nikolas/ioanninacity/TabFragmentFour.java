package com.example.nikolas.ioanninacity;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class TabFragmentFour extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tab_fragment_layout, container, false);

        ArrayList<Items> itemList = new ArrayList<>();
        itemList.add(new Items(getString(R.string.Event_1), getString(R.string.Event_Info_1)));
        itemList.add(new Items(getString(R.string.Event_2), getString(R.string.Event_Info_2)));
        itemList.add(new Items(getString(R.string.Event_3), getString(R.string.Event_Info_3)));
        itemList.add(new Items(getString(R.string.Event_4), getString(R.string.Event_Info_4)));
        itemList.add(new Items(getString(R.string.Event_5), getString(R.string.Event_Info_5)));

        ItemsAdapter adapter = new ItemsAdapter(this.getContext(), itemList);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }
}
