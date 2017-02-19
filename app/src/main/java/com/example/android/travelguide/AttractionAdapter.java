package com.example.android.travelguide;

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
 * Created by NIKHIL on 03-02-2017.
 */

public class AttractionAdapter extends ArrayAdapter<Item> {

    public AttractionAdapter(Activity context, ArrayList<Item> attractions) {
        super(context, 0, attractions);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.attractions_item, parent, false);
        }
        Item currentItem = getItem(position);

        ImageView attractions_image = (ImageView) listItemView.findViewById(R.id.attraction_image);
        attractions_image.setImageResource(currentItem.getResourceId());

        TextView attractions_text = (TextView) listItemView.findViewById(R.id.attraction_text);
        attractions_text.setText(currentItem.getName());

        TextView description = (TextView) listItemView.findViewById(R.id.description_card_text);
        description.setText(currentItem.getBrief());

        TextView rating = (TextView) listItemView.findViewById(R.id.rating_text_view);
        rating.setText(currentItem.getRating());

        TextView address = (TextView) listItemView.findViewById(R.id.address);
        address.setText(currentItem.getAddress());

        return listItemView;
    }
}
