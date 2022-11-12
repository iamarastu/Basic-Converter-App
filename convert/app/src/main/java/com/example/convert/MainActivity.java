package com.example.convert;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textView,textview2,textview3;
    EditText editTextNumber;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView=findViewById(R.id.textView);
        textview2=findViewById(R.id.textView2);
        textview3=findViewById(R.id.textView3);
        editTextNumber=findViewById(R.id.editTextNumber);
        button=findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String kg= editTextNumber.getText().toString();
                Double kilo=Double.parseDouble(kg);
                double pounds=kilo*2.205;
                textview3.setText(""+pounds);

            }
        });



    }
}