package com.aroraemc.sahil.getplaced;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class EMC extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_emc);
    }

    public void EMCKnowHow(View view) {
        Intent intent = new Intent(this, EMCKnowHow.class);
        startActivity(intent);
    }

    public void EMCPrerequisites(View view) {
        Intent intent = new Intent(this, EMCPrerequisites.class);
        startActivity(intent);
    }

    public void EMCAluminiReviews(View view) {
        Intent intent = new Intent(this, EMCAluminiReviews.class);
        startActivity(intent);
    }

}
