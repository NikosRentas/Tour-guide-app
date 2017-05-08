package com.example.nikolas.ioanninacity;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


public class TabFragmentThree extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tab_fragment_layout, container, false);

        ArrayList<Items> itemList = new ArrayList<>();
        itemList.add(new Items(getString(R.string.Bar_1), getString(R.string.Bar_Addr_1), getString(R.string.Bar_Phone_1), R.drawable.montage));
        itemList.add(new Items(getString(R.string.Bar_2), getString(R.string.Bar_Addr_2), getString(R.string.Bar_Phone_2), R.drawable.spitaki));
        itemList.add(new Items(getString(R.string.Bar_3), getString(R.string.Bar_Addr_3), getString(R.string.Bar_Phone_3), R.drawable.route));
        itemList.add(new Items(getString(R.string.Bar_4), getString(R.string.Bar_Addr_4), getString(R.string.Bar_Phone_4), R.drawable.marche));
        itemList.add(new Items(getString(R.string.Bar_5), getString(R.string.Bar_Addr_5), getString(R.string.Bar_Phone_5), R.drawable.ras));


        ItemsAdapter adapter = new ItemsAdapter(this.getContext(), itemList);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }
}
