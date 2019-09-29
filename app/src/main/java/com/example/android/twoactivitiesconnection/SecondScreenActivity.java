package com.example.android.twoactivitiesconnection;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class SecondScreenActivity extends Activity{

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.screen2);
        TextView txtName=(TextView)findViewById(R.id.txtName);
        TextView txtEmail=(TextView)findViewById(R.id.txtEmail);
        Button btnClose=(Button)findViewById(R.id.btnClose);

        Intent i=getIntent();

        String name=i.getStringExtra("name");
        String email=i.getStringExtra("email");
        Log.e("Second Sceen Activity",name+"."+email);
        txtName.setText(name);
        txtEmail.setText(email);

        btnClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });


    }
    }
