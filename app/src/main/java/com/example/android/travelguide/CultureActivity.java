package com.example.android.travelguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class CultureActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_culture);

        ArrayList<Item> cultures = new ArrayList<>();
        cultures.add(new Item(getString(R.string.culture_one), getString(R.string.culture_one_content), R.drawable.camel));
        cultures.add(new Item(getString(R.string.culture_two), getString(R.string.culture_two_content), R.drawable.trekking));
        cultures.add(new Item(getString(R.string.culture_three), getString(R.string.culture_three_content), R.drawable.cuisine));
        cultures.add(new Item(getString(R.string.culture_four), getString(R.string.culture_four_content), R.drawable.festival));
        cultures.add(new Item(getString(R.string.culture_five), getString(R.string.culture_five_content), R.drawable.sports));
        cultures.add(new Item(getString(R.string.culture_six), getString(R.string.culture_six_content), R.drawable.medicine));

        ListView cultures_list = (ListView) findViewById(R.id.activity_culture_list);
        cultures_list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                View item = view;
                CardView card = (CardView) item.findViewById(R.id.description_card);
                if (card.getVisibility() == View.VISIBLE)
                    card.setVisibility(View.GONE);
                else
                    card.setVisibility(View.VISIBLE);
            }
        });

        AttractionAdapter cultureAdapter = new AttractionAdapter(this, cultures);
        cultures_list.setAdapter(cultureAdapter);
    }
}
