package com.example.hardikgoyal_spin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Spinner;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    String s1[] = {"","HTML","CSS","Java","C++"};
    TextView t1,t2;
    Button b1;
    CheckBox c1;
    String checkStr = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t1 = findViewById(R.id.textView3);
        t2 = findViewById(R.id.textView);
        Spinner sp = findViewById(R.id.spinner);
        ArrayAdapter ar = new ArrayAdapter(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,s1);
        sp.setAdapter(ar);
        sp.setOnItemSelectedListener(this);
        c1 = findViewById(R.id.checkBox);

        b1 = findViewById(R.id.button);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String selectedStr = sp.getSelectedItem().toString();
                t1.setText(selectedStr);

                if(c1.isChecked()){
                    t2.setText(c1.getText().toString());
                }
                else
                {
                    t2.setText("Nothing Selected");


                }
            }
        });
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}