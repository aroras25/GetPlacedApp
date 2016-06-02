package com.aroraemc.sahil.getplaced;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class PrerequisitesTemplate extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prerequisites_template);

        Bundle extra =  getIntent().getExtras();
        if(extra!=null && extra.containsKey("company"))
        {
            String sourceId = extra.getString("company");
            TextView textView = (TextView) findViewById(R.id.PrerequisiteTitle);

            if(sourceId.equals("EMC"))
            {
                textView.setText("EMC Prerequisites");
            }
            if(sourceId.equals("Ericsson"))
            {
                textView.setText("Ericsson Prerequisites");
            }
            if(sourceId.equals("InMobi"))
            {
                textView.setText("InMobi Prerequisites");
            }
            if(sourceId.equals("Flipkart"))
            {
                textView.setText("Flipkart Prerequisites");
            }
            if(sourceId.equals("Samsung"))
            {
                textView.setText("Samsung Prerequisites");
            }
        }
    }
}
