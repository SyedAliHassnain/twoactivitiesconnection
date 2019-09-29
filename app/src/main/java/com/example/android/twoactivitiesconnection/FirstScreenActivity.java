package com.example.android.twoactivitiesconnection;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class FirstScreenActivity extends AppCompatActivity {
    EditText InputName;
    EditText InputEmail;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.screen1);

        InputName=(EditText) findViewById(R.id.name);
        InputEmail=(EditText) findViewById(R.id.email);
        Button btnNextScreen=(Button) findViewById(R.id.btnNextScreen);

        btnNextScreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent nextscreen= new Intent(getApplicationContext(),SecondScreenActivity.class);
                nextscreen.putExtra("name",InputName.getText().toString());
                nextscreen.putExtra("Email",InputEmail.getText().toString());
                Log.e("n",InputName.getText()+"."+InputEmail.getText());
                startActivity(nextscreen);
            }
        });

    }
}
