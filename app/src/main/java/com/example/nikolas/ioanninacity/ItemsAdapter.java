package com.example.nikolas.ioanninacity;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ItemsAdapter extends ArrayAdapter<Items> {

    public ItemsAdapter(Context context, ArrayList<Items> location) {
        super(context, 0, location);
    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;

        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item_layout, parent, false);
        }

        Items currentObject = getItem(position);


        // First text view
        TextView textView1 = (TextView) listItemView.findViewById(R.id.name_text_view);
        textView1.setText(currentObject.getmName());

        // Second text view
        TextView textView2 = (TextView) listItemView.findViewById(R.id.info_text_view);
        textView2.setText(currentObject.getmInfo());

        // Third text view
        TextView textView3 = (TextView) listItemView.findViewById(R.id.odd_text_view);
        if (currentObject.hasmTextExist()) {
            Log.v("heehhe", "exw text view 3");
            textView3.setText("Tel. " + currentObject.getmOdd());
            textView3.setVisibility(View.VISIBLE);
        } else {
            Log.v("heehhe", " DEN exw text view 3");
            textView3.setVisibility(View.GONE);
        }

        // Image view
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image_view);
        if (currentObject.hasImage()) {
            imageView.setImageResource(currentObject.getmImageResourceID());
            imageView.setVisibility(View.VISIBLE);
        } else {
            imageView.setVisibility(View.GONE);
        }


        return listItemView;
    }
}
