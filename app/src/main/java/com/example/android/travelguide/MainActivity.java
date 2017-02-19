package com.example.android.travelguide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_NAVIGATION);

        ImageView main_background = (ImageView) findViewById(R.id.main_background);
        ImageView attractions_image = (ImageView) findViewById(R.id.attractions_image);
        ImageView food_image = (ImageView) findViewById(R.id.food_image);
        ImageView culture_image = (ImageView) findViewById(R.id.culture_image);
        ImageView rooms_image = (ImageView) findViewById(R.id.rooms_image);

        Picasso.with(getApplicationContext()).load(R.drawable.attractions).into(attractions_image);
        Picasso.with(getApplicationContext()).load(R.drawable.culture).into(culture_image);
        Picasso.with(getApplicationContext()).load(R.drawable.room).into(rooms_image);
        Picasso.with(getApplicationContext()).load(R.drawable.food).into(food_image);
        Picasso.with(getApplicationContext()).load(R.drawable.background).into(main_background);

        attractions_image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent attractions_activity = new Intent(MainActivity.this, AttractionsActivity.class);
                startActivity(attractions_activity);
            }
        });
        food_image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent food_activity = new Intent(MainActivity.this, FoodActivity.class);
                startActivity(food_activity);
            }
        });

        rooms_image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent rooms_activity = new Intent(MainActivity.this, HotelsActivity.class);
                startActivity(rooms_activity);
            }
        });

        culture_image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent culture_activity = new Intent(MainActivity.this, CultureActivity.class);
                startActivity(culture_activity);
            }
        });
    }
}
