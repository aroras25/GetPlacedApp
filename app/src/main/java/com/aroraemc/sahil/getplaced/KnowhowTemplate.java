package com.aroraemc.sahil.getplaced;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class KnowhowTemplate extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_knowhow_template);

        Bundle extra =  getIntent().getExtras();
        if(extra!=null && extra.containsKey("company"))
        {
            String sourceId = extra.getString("company");
            TextView knowHow = (TextView) findViewById(R.id.knowHow);
            TextView aboutText = (TextView) findViewById(R.id.aboutText);
            TextView wikiLink = (TextView) findViewById(R.id.wikiHyperlink);
            TextView samplePapersLink = (TextView) findViewById(R.id.samplePapersHyperlink);


            if(sourceId.equals("EMC"))
        {
            aboutText.setText("About EMC");
            knowHow.setText("EMC KnowHow");
            wikiLink.setText("https://en.wikipedia.org/wiki/EMC_Corporation");
            samplePapersLink.setText("http://www.vyoms.com/placement-papers/companies/details/emc2-1505.asp");
        }
            if(sourceId.equals("Ericsson"))
            {
                knowHow.setText("Ericsson KnowHow");
                aboutText.setText("About Ericsson");
                wikiLink.setText("https://en.wikipedia.org/wiki/Ericsson");
                samplePapersLink.setText("http://www.indiabix.com/placement-papers/ericsson/");
            }
            if(sourceId.equals("InMobi"))
            {
                knowHow.setText("InMobi KnowHow");
                aboutText.setText("About InMobi");
                wikiLink.setText("https://en.wikipedia.org/wiki/InMobi");
                samplePapersLink.setText("http://www.iitplacementpapers.com/2012/09/inmobi-previous-placment-papers.html");
            }
            if(sourceId.equals("Flipkart"))
            {
                knowHow.setText("Flipkart KnowHow");
                aboutText.setText("About Flipkart");
                wikiLink.setText("https://en.wikipedia.org/wiki/Flipkart");
                samplePapersLink.setText("http://placement.freshersworld.com/flipkart-question-papers-and-answers/3314000071");
            }
            if(sourceId.equals("Samsung"))
            {
                knowHow.setText("Samsung KnowHow");
                aboutText.setText("About Samsung");
                wikiLink.setText("https://en.wikipedia.org/wiki/Samsung");
                samplePapersLink.setText("http://www.indiabix.com/placement-papers/samsung/");
            }
        }
    }
}
