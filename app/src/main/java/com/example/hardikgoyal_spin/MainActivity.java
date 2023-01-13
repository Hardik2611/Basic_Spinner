package com.example.hardikgoyal_spin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    String s1[] = {"","HTML","CSS","Java","C++"};
    String def = "Options";
    TextView t1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t1 = findViewById(R.id.textView3);
        Spinner sp = findViewById(R.id.spinner);
        ArrayAdapter ar = new ArrayAdapter(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,s1);
        sp.setAdapter(ar);
        sp.setOnItemSelectedListener(this);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        t1.setText(s1[position]);
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}