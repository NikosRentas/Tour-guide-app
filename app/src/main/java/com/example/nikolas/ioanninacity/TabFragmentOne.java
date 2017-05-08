package com.example.nikolas.ioanninacity;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class TabFragmentOne extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tab_fragment_layout, container, false);

        ArrayList<Items> itemList = new ArrayList<>();
        itemList.add(new Items(getString(R.string.Museum_1), getString(R.string.Museum_Addr_1), getString(R.string.Museum_Phone_1)));
        itemList.add(new Items(getString(R.string.Museum_2), getString(R.string.Museum_Addr_2), getString(R.string.Museum_Phone_2)));
        itemList.add(new Items(getString(R.string.Museum_3), getString(R.string.Museum_Addr_3), getString(R.string.Museum_Phone_3)));
        itemList.add(new Items(getString(R.string.Museum_4), getString(R.string.Museum_Addr_4), getString(R.string.Museum_Phone_4)));
        itemList.add(new Items(getString(R.string.Museum_5), getString(R.string.Museum_Addr_5), getString(R.string.Museum_Phone_5)));
        itemList.add(new Items(getString(R.string.Museum_6), getString(R.string.Museum_Addr_6), getString(R.string.Museum_Phone_6)));
        itemList.add(new Items(getString(R.string.Museum_7), getString(R.string.Museum_Addr_7), getString(R.string.Museum_Phone_7)));
        itemList.add(new Items(getString(R.string.Museum_8), getString(R.string.Museum_Addr_8), getString(R.string.Museum_Phone_8)));
        itemList.add(new Items(getString(R.string.Museum_9), getString(R.string.Museum_Addr_9), getString(R.string.Museum_Phone_9)));
        itemList.add(new Items(getString(R.string.Museum_10), getString(R.string.Museum_Addr_10), getString(R.string.Museum_Phone_10)));
        itemList.add(new Items(getString(R.string.Museum_11), getString(R.string.Museum_Addr_11), getString(R.string.Museum_Phone_11)));
        itemList.add(new Items(getString(R.string.Museum_12), getString(R.string.Museum_Addr_12), getString(R.string.Museum_Phone_12)));
        itemList.add(new Items(getString(R.string.Museum_13), getString(R.string.Museum_Addr_13), getString(R.string.Museum_Phone_13)));
        itemList.add(new Items(getString(R.string.Museum_14), getString(R.string.Museum_Addr_14), getString(R.string.Museum_Phone_14)));
        itemList.add(new Items(getString(R.string.Museum_15), getString(R.string.Museum_Addr_15), getString(R.string.Museum_Phone_15)));
        itemList.add(new Items(getString(R.string.Museum_16), getString(R.string.Museum_Addr_16), getString(R.string.Museum_Phone_16)));
        itemList.add(new Items(getString(R.string.Museum_17), getString(R.string.Museum_Addr_17), getString(R.string.Museum_Phone_17)));
        itemList.add(new Items(getString(R.string.Museum_18), getString(R.string.Museum_Addr_18), getString(R.string.Museum_Phone_18)));
        itemList.add(new Items(getString(R.string.Museum_19), getString(R.string.Museum_Addr_19), getString(R.string.Museum_Phone_19)));

        ItemsAdapter adapter = new ItemsAdapter(this.getContext(), itemList);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }
}
