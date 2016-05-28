package com.aroraemc.sahil.getplaced;

        import android.content.Intent;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;

public class Ericson extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ericson);
    }

    public void EricsonKnowHow(View view)
    {
        Intent intent = new Intent(this, EricsonKnowHow.class);
        startActivity(intent);
    }
    public void EricsonPrerequisites(View view)
    {
        Intent intent = new Intent(this, EricsonPrerequisites.class);
        startActivity(intent);
    }
    public void EricsonAluminiReviews(View view) {
        Intent intent = new Intent(this, EricsonAluminiReviews.class);
        startActivity(intent);
    }
}
