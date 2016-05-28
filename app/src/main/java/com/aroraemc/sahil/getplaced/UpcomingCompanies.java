package com.aroraemc.sahil.getplaced;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class UpcomingCompanies extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_upcoming_companies);
    }
    public void EMCInfo(View view)
    {
        Intent intent = new Intent(this, EMC.class);
        startActivity(intent);
    }
    public void EricsonInfo(View view)
    {
        Intent intent = new Intent(this, Ericson.class);
        startActivity(intent);
    }

    public void calender(View view)
    {
        Intent intent = new Intent(this, Calender.class);
        startActivity(intent);
    }


}
