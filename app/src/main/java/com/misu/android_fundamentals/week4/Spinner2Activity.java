package com.misu.android_fundamentals.week4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import com.misu.android_fundamentals.R;

import java.util.ArrayList;
import java.util.List;

public class Spinner2Activity extends AppCompatActivity {

    private List<String> mFruits;
    private Spinner mSpinnerFruits;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner2);

        // get data source
        mFruits = getFruits();

        // get the Spinne from xml
        mSpinnerFruits = findViewById(R.id.spinnerFruits);

        // set the adaptor on the Spinner
        mSpinnerFruits.setAdapter(getAdaptor());
    }

    /**
     * @return the data source
     */

    private List<String> getFruits() {
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Strawberries");
        fruits.add("Pineapple");
        fruits.add("Lemon");

        return fruits;

    }

    private ArrayAdapter<String> getAdaptor() {
        return new ArrayAdapter<>(this,
                android.R.layout.simple_spinner_item, mFruits);
    }
}
