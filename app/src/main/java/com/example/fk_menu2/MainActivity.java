package com.example.fk_menu2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private Button lunchMenuButton;

    // Keeps track of current order's total price over all the items
    static public double totalPrice;
    static public ArrayList order = new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Setup main menu buttons
        lunchMenuButton = findViewById(R.id.lunch_Button);
        lunchMenuButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println("Opening lunch menu...");
                openLunchMenu();
            }
        });



    }

    // Helpers for each individual menu
    // TODO: create helper for dinner menu
    public void openLunchMenu(){
        Intent lunchMenuIntent = new Intent(this, lunchMenu.class);
        startActivity(lunchMenuIntent);
    }

}