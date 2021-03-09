package com.example.testarcore;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button btnOpenAR;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // by ID we can use each component which id is assign in xml file
        // use findViewById() to get the Button
        btnOpenAR = (Button)findViewById(R.id.btnOpenAR);

        // Add_button add clicklistener
        btnOpenAR.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                // Intents are objects of the android.content.Intent type. Your code can send them
                // to the Android system defining the components you are targeting.
                // Intent to start an activity called SecondActivity with the following code:

                Intent intent = new Intent(MainActivity.this, ArMenu.class);

                // start the activity connect to the specified class
                startActivity(intent);
            }
        });
    }


}