package com.aroraemc.sahil.getplaced;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class CompanyTemplate extends AppCompatActivity {

    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_company_template);

        Bundle extra =  getIntent().getExtras();
        if(extra!=null && extra.containsKey("companyName"))
        {
            int sourceId = extra.getInt("companyName");
            textView = (TextView) findViewById(R.id.companyName);

            if(sourceId == R.id.aboutEmc)
            {
                textView.setText("EMC");
            }
            if(sourceId == R.id.aboutEricsson)
            {
                textView.setText("Ericsson");
            }
            if(sourceId == R.id.aboutFlipkart)
            {
                textView.setText("Flipkart");
            }
            if(sourceId == R.id.aboutInMobi)
            {
                textView.setText("InMobi");
            }
            if(sourceId == R.id.aboutSamsung)
            {
                textView.setText("Samsung");
            }
        }
    }
    public void EMCPrerequisites(View view)
    {
        Intent intent = new Intent(this, PrerequisitesTemplate.class);
        intent.putExtra("company",textView.getText());
        startActivity(intent);
    }

    public void EMCKnowHow(View view)
    {
        Intent intent = new Intent(this, KnowhowTemplate.class);
        intent.putExtra("company",textView.getText());
        startActivity(intent);
    }

    public void EMCAluminiReviews(View view)
    {
        Intent intent = new Intent(this, AluminiReviewsTemplate.class);
        intent.putExtra("company",textView.getText());
        startActivity(intent);
    }

}
