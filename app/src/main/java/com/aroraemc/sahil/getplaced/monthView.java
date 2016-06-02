package com.aroraemc.sahil.getplaced;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class monthView extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = getIntent();
        String monthSelected = intent.getExtras().getString("month");
        setContentView(R.layout.activity_month_view);

        TextView titleView = (TextView) findViewById(R.id.monthViewTitle);
        titleView.setText("List of the Companies in " + monthSelected);

        if (monthSelected.equals("June")) {

            TextView noCompanyText = (TextView) findViewById(R.id.NoCompanies) ;
            noCompanyText.setVisibility(View.GONE);

            TextView firstCompany = (TextView) findViewById(R.id.emc);
            firstCompany.setText("EMC");

            TextView secondCompany = (TextView) findViewById(R.id.ericsson);
            secondCompany.setText("Ericson");

            TextView firstCompanyDate = (TextView) findViewById(R.id.dateEmc);
            firstCompanyDate.setText("4th June 2016");

            TextView secondCompanyDate = (TextView) findViewById(R.id.dateEricson);
            secondCompanyDate.setText("15th June 2016");

            RelativeLayout flipkart = (RelativeLayout) findViewById(R.id.aboutFlipkart);
            flipkart.setVisibility(View.GONE);

            RelativeLayout inMobi = (RelativeLayout) findViewById(R.id.aboutInMobi);
            inMobi.setVisibility(View.GONE);

            RelativeLayout samsung = (RelativeLayout) findViewById(R.id.aboutSamsung);
            samsung.setVisibility(View.GONE);
        }

        else if(monthSelected.equals("July"))
        {
            RelativeLayout emc = (RelativeLayout) findViewById(R.id.aboutEmc);
            emc.setVisibility(View.GONE);

            RelativeLayout ericsson = (RelativeLayout) findViewById(R.id.aboutEricsson);
            ericsson.setVisibility(View.GONE);

            TextView noCompanyText = (TextView) findViewById(R.id.NoCompanies) ;
            noCompanyText.setVisibility(View.GONE);

            TextView firstCompany = (TextView) findViewById(R.id.company3);
            firstCompany.setText("Flipkart");

            TextView secondCompany = (TextView) findViewById(R.id.company4);
            secondCompany.setText("InMobi");

            TextView thirdCompany = (TextView) findViewById(R.id.company5);
            thirdCompany.setText("Samsung");

            TextView firstCompanyDate = (TextView) findViewById(R.id.dateFlipkart);
            firstCompanyDate.setText("4th July 2016");

            TextView secondCompanyDate = (TextView) findViewById(R.id.dateInMobi);
            secondCompanyDate.setText("15th July 2016");

            TextView thirdCompanyDate = (TextView) findViewById(R.id.dateSamsung);
            thirdCompanyDate.setText("25th July 2016");
        }
        else {

            ImageView emcImg = (ImageView) findViewById(R.id.emcLogo);
            emcImg.setVisibility(View.GONE);

            ImageView ericssonImg = (ImageView) findViewById(R.id.ericssonLogo);
            ericssonImg.setVisibility(View.GONE);

            TextView firstCompany = (TextView) findViewById(R.id.emc);
            firstCompany.setVisibility(View.GONE);

            TextView secondCompany = (TextView) findViewById(R.id.ericsson);
            secondCompany.setVisibility(View.GONE);

            TextView firstCompanyDate = (TextView) findViewById(R.id.dateEmc);
            firstCompanyDate.setVisibility(View.GONE);

            TextView secondCompanyDate = (TextView) findViewById(R.id.dateEricson);
            secondCompanyDate.setVisibility(View.GONE);

            TextView noCompanyText = (TextView) findViewById(R.id.NoCompanies);
            noCompanyText.setText("No Companies Yet");
        }
    }

    public void EMCInfo(View view) {
        Intent intent = new Intent(this, CompanyTemplate.class);
        intent.putExtra("companyName",view.getId());
        startActivity(intent);
    }

    /*public void EricsonInfo(View view) {
        Intent intent = new Intent(this, CompanyTemplate.class);
        startActivity(intent);
    }*/

}
