package com.example.demo3;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView result;
    EditText name;
    Button ok;
    String userName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        result = findViewById(R.id.resultText);
        ok=findViewById(R.id.okButton);
        name= findViewById(R.id.editTextName);

        ok.setOnClickListener(new View.OnClickListener() {
           @Override
          public void onClick(View view) {
               userName = name.getText().toString();
               result.setText(userName);
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
