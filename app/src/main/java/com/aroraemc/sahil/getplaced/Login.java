package com.aroraemc.sahil.getplaced;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }
    public void login(View view)
    {
        EditText username = (EditText)findViewById(R.id.userName);
        EditText password = (EditText)findViewById(R.id.password);

        if(username.getText().toString().equals("admin") && password.getText().toString().equals("admin"))
        {

            Toast.makeText(getApplicationContext(), "Redirecting...",Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(this, UpcomingCompanies.class);
            startActivity(intent);
        }
        else
        {
            Toast.makeText(getApplicationContext(), "Wrong Password", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(this, Login.class);
            startActivity(intent);

        }


    }

}
