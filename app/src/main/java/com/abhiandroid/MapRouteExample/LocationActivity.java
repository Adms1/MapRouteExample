package com.abhiandroid.MapRouteExample;

import android.content.Context;
import android.content.Intent;
import android.location.Address;
import android.location.Geocoder;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.android.gms.maps.model.LatLng;

import java.io.IOException;
import java.util.List;

public class LocationActivity extends AppCompatActivity implements View.OnClickListener {
    EditText source_txt, destination_txt;
    Button search_btn;
    LatLng origin;//= new LatLng(23.050832800000002, 72.66754159999999);
    LatLng dest;
    String source, desti;
    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_location);
        context = this;
        source_txt = (EditText) findViewById(R.id.source_txt);
        destination_txt = (EditText) findViewById(R.id.destination_txt);
        search_btn = (Button) findViewById(R.id.search_btn);

        search_btn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.search_btn:
                source = source_txt.getText().toString();
                desti = destination_txt.getText().toString();
//                getLocationFromAddress(context, source, desti);
                Intent intent = new Intent(context, MainActivity.class);
                intent.putExtra("source", source);
                intent.putExtra("desti", desti);
                startActivity(intent);
                break;
        }
    }



}
