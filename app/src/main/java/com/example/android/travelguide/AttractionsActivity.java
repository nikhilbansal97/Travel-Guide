package com.example.android.travelguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class AttractionsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_attractions);

        getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);

        final ArrayList<Item> attractions = new ArrayList<>();
        attractions.add(new Item(getString(R.string.attraction_one), getString(R.string.attraction_one_content), R.drawable.khardung_la_pass));
        attractions.add(new Item(getString(R.string.attraction_two), getString(R.string.attraction_two_content), R.drawable.monastery));
        attractions.add(new Item(getString(R.string.attraction_three), getString(R.string.attraction_three_content), R.drawable.pangong_tso));
        attractions.add(new Item(getString(R.string.attraction_four), getString(R.string.attraction_four_content), R.drawable.shanti_stupa));
        attractions.add(new Item(getString(R.string.attraction_five), getString(R.string.attraction_five_content), R.drawable.tso_moriri_lake));


        ListView attractions_list = (ListView) findViewById(R.id.activity_attractions_list);
        attractions_list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                View listItem = view;
                CardView card = (CardView) listItem.findViewById(R.id.description_card);
                if (card.getVisibility() == View.GONE)
                    card.setVisibility(View.VISIBLE);
                else
                    card.setVisibility(View.GONE);
            }
        });
        AttractionAdapter myAdapter = new AttractionAdapter(this, attractions);
        attractions_list.setAdapter(myAdapter);

    }
}
