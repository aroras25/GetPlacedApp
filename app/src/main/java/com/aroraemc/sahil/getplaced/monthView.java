package com.aroraemc.sahil.getplaced;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
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

            TextView secondCompany = (TextView) findViewById(R.id.ericson);
            secondCompany.setText("Ericson");

            TextView firstCompanyDate = (TextView) findViewById(R.id.dateEmc);
            firstCompanyDate.setText("4th June 2016");

            TextView secondCompanyDate = (TextView) findViewById(R.id.dateEricson);
            secondCompanyDate.setText("15th June 2016");
        } else {

            ImageView emcImg = (ImageView) findViewById(R.id.emcLogo);
            emcImg.setVisibility(View.GONE);

            ImageView ericssonImg = (ImageView) findViewById(R.id.ericssonLogo);
            ericssonImg.setVisibility(View.GONE);

            TextView firstCompany = (TextView) findViewById(R.id.emc);
            firstCompany.setVisibility(View.GONE);

            TextView secondCompany = (TextView) findViewById(R.id.ericson);
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
        Intent intent = new Intent(this, EMC.class);
        startActivity(intent);
    }

    public void EricsonInfo(View view) {
        Intent intent = new Intent(this, Ericson.class);
        startActivity(intent);
    }

}
