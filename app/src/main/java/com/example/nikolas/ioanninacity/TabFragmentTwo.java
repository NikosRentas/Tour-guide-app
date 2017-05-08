package com.example.nikolas.ioanninacity;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class TabFragmentTwo extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tab_fragment_layout, container, false);

        ArrayList<Items> itemList = new ArrayList<>();
        itemList.add(new Items(getString(R.string.Restaurant_1), getString(R.string.Restaurant_Addr_1), getString(R.string.Restaurant_Phone_1), R.drawable.metsovitiki));
        itemList.add(new Items(getString(R.string.Restaurant_2), getString(R.string.Restaurant_Addr_2), getString(R.string.Restaurant_Phone_2), R.drawable.frotzou));
        itemList.add(new Items(getString(R.string.Restaurant_3), getString(R.string.Restaurant_Addr_3), getString(R.string.Restaurant_Phone_3), R.drawable.mpoukia));
        itemList.add(new Items(getString(R.string.Restaurant_4), getString(R.string.Restaurant_Addr_4), getString(R.string.Restaurant_Phone_4), R.drawable.stoa));
        itemList.add(new Items(getString(R.string.Restaurant_5), getString(R.string.Restaurant_Addr_5), getString(R.string.Restaurant_Phone_5), R.drawable.balsamico));
        itemList.add(new Items(getString(R.string.Restaurant_6), getString(R.string.Restaurant_Addr_6), getString(R.string.Restaurant_Phone_6), R.drawable.fisaroufa));
        itemList.add(new Items(getString(R.string.Restaurant_7), getString(R.string.Restaurant_Addr_7), getString(R.string.Restaurant_Phone_7), R.drawable.presvia));
        itemList.add(new Items(getString(R.string.Restaurant_8), getString(R.string.Restaurant_Addr_8), getString(R.string.Restaurant_Phone_8), R.drawable.mistagogia));
        itemList.add(new Items(getString(R.string.Restaurant_9), getString(R.string.Restaurant_Addr_9), getString(R.string.Restaurant_Phone_9), R.drawable.cafe));
        itemList.add(new Items(getString(R.string.Restaurant_10), getString(R.string.Restaurant_Addr_10), getString(R.string.Restaurant_Phone_10), R.drawable.miam));
        itemList.add(new Items(getString(R.string.Restaurant_11), getString(R.string.Restaurant_Addr_11), getString(R.string.Restaurant_Phone_11), R.drawable.sirios));
        itemList.add(new Items(getString(R.string.Restaurant_12), getString(R.string.Restaurant_Addr_12), getString(R.string.Restaurant_Phone_12), R.drawable.noties));

        ItemsAdapter adapter = new ItemsAdapter(this.getContext(), itemList);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }
}
