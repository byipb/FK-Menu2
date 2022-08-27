package com.example.fk_menu2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class lunchMenu extends AppCompatActivity{

    // Lunch menu has 12 options which each having their own clickable TextView
    // Using clickable TextViews instead of Buttons because text inside Buttons do not auto-scale to fit while TextViews do
    private TextView item1, item2, item3, item4, item5, item6, item7, item8, item9, item10, item11, item12;

    // All lunch menu prices are the same
    private final double lunchPrice = 12.25;

    private View.OnClickListener lunchClickHandler = new View.OnClickListener(){
        @Override
        public void onClick(View v){
            lunchClicked(v);
        }
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lunch_menu);

        // Setup TextView clickables with their respective listeners
        // optimization consideration: loop, might need to change out of using R.id's
        item1  = findViewById(R.id.lunch_item_1);
        item2  = findViewById(R.id.lunch_item_2);
        item3  = findViewById(R.id.lunch_item_3);
        item4  = findViewById(R.id.lunch_item_4);
        item5  = findViewById(R.id.lunch_item_5);
        item6  = findViewById(R.id.lunch_item_6);
        item7  = findViewById(R.id.lunch_item_7);
        item8  = findViewById(R.id.lunch_item_8);
        item9  = findViewById(R.id.lunch_item_9);
        item10 = findViewById(R.id.lunch_item_10);
        item11 = findViewById(R.id.lunch_item_11);
        item12 = findViewById(R.id.lunch_item_12);

        item1.setOnClickListener(lunchClickHandler);
        item2.setOnClickListener(lunchClickHandler);
        item3.setOnClickListener(lunchClickHandler);
        item4.setOnClickListener(lunchClickHandler);
        item5.setOnClickListener(lunchClickHandler);
        item6.setOnClickListener(lunchClickHandler);
        item7.setOnClickListener(lunchClickHandler);
        item8.setOnClickListener(lunchClickHandler);
        item9.setOnClickListener(lunchClickHandler);
        item10.setOnClickListener(lunchClickHandler);
        item11.setOnClickListener(lunchClickHandler);
        item12.setOnClickListener(lunchClickHandler);
    }

    public void lunchClicked(View view){

        // Gets id of pressed item
        int id = view.getId();

        // Add $12.25 to the total price immediately because all items on this menu are the same
        MainActivity.totalPrice += 12.25;

        // If/else used as alternative to a switch statement here because resource ids are not longer final since API 14
        if (id == R.id.lunch_item_1) {
            // 1. Curry Chicken or Beef
            MainActivity.order.add(view.getResources().getString(R.string.lunch_item_1));
        } else if (id == R.id.lunch_item_2) {
            // 2. Sweet and Sour Boneless Pork
            MainActivity.order.add(view.getResources().getString(R.string.lunch_item_2));
        } else if (id == R.id.lunch_item_3) {
            // 3. Mongolian Beef
            MainActivity.order.add(view.getResources().getString(R.string.lunch_item_3));
        } else if (id == R.id.lunch_item_4) {
            // 4. Beef or Chicken Chop Suey
            MainActivity.order.add(view.getResources().getString(R.string.lunch_item_4));
        } else if (id == R.id.lunch_item_5) {
            // 5. Breaded Almond Chicken
            MainActivity.order.add(view.getResources().getString(R.string.lunch_item_5));
        } else if (id == R.id.lunch_item_6){
            // 6. Orange Chicken or Beef
            MainActivity.order.add(view.getResources().getString(R.string.lunch_item_6));
        } else if (id == R.id.lunch_item_7){
            // 7. Spicy Thai Basil Chicken or Beef
            MainActivity.order.add(view.getResources().getString(R.string.lunch_item_7));
        } else if (id == R.id.lunch_item_8){
            MainActivity.order.add(view.getResources().getString(R.string.lunch_item_8));
        } else if (id == R.id.lunch_item_9){
            MainActivity.order.add(view.getResources().getString(R.string.lunch_item_9));
        } else if (id == R.id.lunch_item_10){
            MainActivity.order.add(view.getResources().getString(R.string.lunch_item_10));
        } else if (id == R.id.lunch_item_11){
            MainActivity.order.add(view.getResources().getString(R.string.lunch_item_11));
        } else if (id == R.id.lunch_item_12){
            MainActivity.order.add(view.getResources().getString(R.string.lunch_item_12));
        } else {
            System.out.println("this should never be outputted");
        }

    }

}