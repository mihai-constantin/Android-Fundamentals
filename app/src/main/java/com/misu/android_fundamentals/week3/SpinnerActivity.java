package com.misu.android_fundamentals.week3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import com.misu.android_fundamentals.R;

import java.util.ArrayList;
import java.util.List;

public class SpinnerActivity extends AppCompatActivity implements
        AdapterView.OnItemSelectedListener {

    private Spinner mSpinner;
    private List<String> mDataSourceSpinner;
    private ArrayAdapter<String> mAdaptorSpinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner);

        init();

        mSpinner.setOnItemSelectedListener(this);

    }

    private void init() {
        mSpinner = findViewById(R.id.spinner);
        mDataSourceSpinner = getSource();
        mAdaptorSpinner = getAdaptor();
        mSpinner.setAdapter(mAdaptorSpinner);
    }

    private List<String> getSource() {
        List<String> androids = new ArrayList<>();

        androids.add("Cupcake");
        androids.add("Donut");
        androids.add("Eclair");
        androids.add("KitKat");
        androids.add("Pie");

        return androids;
    }

    private ArrayAdapter<String> getAdaptor() {
        return new ArrayAdapter<>(this,
                android.R.layout.simple_spinner_item,
                mDataSourceSpinner);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        Toast.makeText(SpinnerActivity.this,
                "Selected: " + mSpinner.getSelectedItem().toString(),
                Toast.LENGTH_LONG).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
