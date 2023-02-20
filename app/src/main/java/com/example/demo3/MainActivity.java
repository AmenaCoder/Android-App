package com.example.demo3;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    TextView result;
    EditText name;
    Button ok;
    String userName;
    ImageView image1;
    CheckBox male;
    CheckBox female;
    RadioGroup radioGroup;
    RadioButton green;
    RadioButton red;
    RadioButton yellow;
    LinearLayout relative1;
    ToggleButton toggleButton;
    Spinner spinner;
    ArrayAdapter adapter;
    String country;


    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        result = findViewById(R.id.resultCountry);
        ok=findViewById(R.id.okButton);
        name= findViewById(R.id.editTextName);
        image1 = findViewById(R.id.imageExample);
      //  male = findViewById(R.id.checkBoxMale);
      //  female = findViewById(R.id.checkBoxFemale);
        radioGroup = findViewById(R.id.radioGroup);
        green = findViewById(R.id.radioButtonGreen);
        red = findViewById(R.id.radioButtonRed);
        yellow = findViewById(R.id.radioButtonYellow);
        relative1 = findViewById(R.id.relativeLay);
       // toggleButton = findViewById(R.id.toggleButtonShow);
        spinner = findViewById(R.id.spinnerCountry);
        adapter=ArrayAdapter.createFromResource(this , R.array.countries,
                android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
               country= parent.getItemAtPosition(position).toString();
              result.setText(country);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        /*toggleButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked) image1.setVisibility(View.INVISIBLE);
                else image1.setVisibility(View.VISIBLE);
            }
        });*/

      /*  male.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (male.isChecked())
                {
                    result.setText("Male");
                    female.setChecked(false);
                }
                else result.setText("what is your gender?");
            }
        });

        female.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (female.isChecked())
                {
                    result.setText("Female");
                    male.setChecked(false);
                }
                else result.setText("what is your gender?");
            }
        });*/

        ok.setOnClickListener(new View.OnClickListener() {
           @Override
          public void onClick(View view) {
               if(green.isChecked()) relative1.setBackgroundColor(Color.GREEN);
               else if (red.isChecked()) relative1.setBackgroundColor(Color.RED);
               else if (yellow.isChecked()) relative1.setBackgroundColor(Color.YELLOW);
              /* userName = name.getText().toString();
               result.setText(userName);
               image1.setImageResource(R.drawable.a);*/
            }
        });

    //    button2=findViewById(R.id.hello);

    /*    myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myButton.setTextColor(Color.CYAN);
                myButton.setText("Changed");
                text1.setText("ana kman changed");
                text1.setVisibility(View.INVISIBLE);
                button2.setVisibility(View.INVISIBLE);
                myButton.setVisibility(View.INVISIBLE);
            }
        });

        text1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text1.setTextColor(Color.WHITE);
                text1.setBackgroundColor((Color.CYAN));
            }
        });*/
    }


}
