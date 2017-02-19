package com.example.android.travelguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;


public class HotelsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotels);

        getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);

        ArrayList<Item> hotels = new ArrayList<>();
        hotels.add(new Item(R.drawable.hotel_charu_palace, getString(R.string.hotel_one), getString(R.string.hotel_one_content), getString(R.string.hotel_one_address)));
        hotels.add(new Item(R.drawable.hotel_grand_dragon, getString(R.string.hotel_two), getString(R.string.hotel_two_content), getString(R.string.hotel_two_address)));
        hotels.add(new Item(R.drawable.hotel_druk_ladakh, getString(R.string.hotel_three), getString(R.string.hotel_three_content), getString(R.string.hotel_three_address)));
        hotels.add(new Item(R.drawable.hotel_ladakh_residency, getString(R.string.hotel_four), getString(R.string.hotel_four_content), getString(R.string.hotel_four_address)));
        hotels.add(new Item(R.drawable.hotel_sarai, getString(R.string.hotel_five), getString(R.string.hotel_five_content), getString(R.string.hotel_five_address)));

        AttractionAdapter myAdapter = new AttractionAdapter(this, hotels);
        ListView hotels_list = (ListView) findViewById(R.id.activity_hotels_list);
        hotels_list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                View item = view;
                CardView description = (CardView) item.findViewById(R.id.description_card);
                if (description.getVisibility() == View.GONE)
                    description.setVisibility(View.VISIBLE);
                else
                    description.setVisibility(View.GONE);
            }
        });
        hotels_list.setAdapter(myAdapter);
    }
}
