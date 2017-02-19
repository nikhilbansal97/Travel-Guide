package com.example.android.travelguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class FoodActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food);

        ArrayList<Item> food = new ArrayList<>();
        food.add(new Item(getString(R.string.food_one), getString(R.string.food_one_brief), getString(R.string.food_one_rating), R.drawable.cafe_jeevan));
        food.add(new Item(getString(R.string.food_two), getString(R.string.food_two_brief), getString(R.string.food_two_rating), R.drawable.old_town_caf));
        food.add(new Item(getString(R.string.food_four), getString(R.string.food_four_brief), getString(R.string.food_four_rating), R.drawable.norlakh_restaurant));
        food.add(new Item(getString(R.string.food_five), getString(R.string.food_five_brief), getString(R.string.food_five_rating), R.drawable.bon_appetit));
        food.add(new Item(getString(R.string.food_nine), getString(R.string.food_nine_brief), getString(R.string.food_nine_rating), R.drawable.summer_harvest));

        AttractionAdapter myAdapter = new AttractionAdapter(this, food);
        ListView my_view = (ListView) findViewById(R.id.activity_food_list);
        my_view.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                View item = view;
                CardView description = (CardView) view.findViewById(R.id.description_card);
                if (description.getVisibility() == View.GONE)
                    description.setVisibility(View.VISIBLE);
                else
                    description.setVisibility(View.GONE);
            }
        });
        my_view.setAdapter(myAdapter);


    }
}
