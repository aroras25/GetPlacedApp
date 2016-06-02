package com.aroraemc.sahil.getplaced;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class AluminiReviewsTemplate extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alumini_reviews_template);

        Bundle extra =  getIntent().getExtras();
        if(extra!=null && extra.containsKey("company"))
        {
            String sourceId = extra.getString("company");
            TextView textView = (TextView) findViewById(R.id.AluminiReviewTitle);

            if(sourceId.equals("EMC"))
            {
                textView.setText("EMC Alumini Reeviews");
            }
            if(sourceId.equals("Ericsson"))
            {
                textView.setText("Ericsson Alumini Reviews");
            }
            if(sourceId.equals("Flipkart"))
            {
                textView.setText("Flipkart Alumini Reeviews");
            }
            if(sourceId.equals("InMobi"))
            {
                textView.setText("InMobi Alumini Reviews");
            }
            if(sourceId.equals("Samsung"))
            {
                textView.setText("Samsung Alumini Reviews");
            }

        }
    }
}
