package com.injiri.MeetupRegistry;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Toolbar toolbar;
    EditText FirstName;
    EditText LastName;
    EditText Date;
    EditText RegNo;
    Button submitbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar= findViewById(R.id.registration_toolbar);
        FirstName= findViewById(R.id.firstname);
        LastName = findViewById(R.id.lastname);
        Date = findViewById(R.id.date);
        RegNo = findViewById(R.id.regNo);
        submitbtn = findViewById(R.id.submit);

       setSupportActionBar(toolbar);
       if (getActionBar() != null)
       {
           getSupportActionBar().setTitle(getResources().getString(R.string.reg_title));
       }

       submitbtn.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {

               String fname = FirstName.getText().toString();
               String lname = LastName.getText().toString();
               String date = Date.getText().toString();
               String Regno = RegNo.getText().toString();

               Toast.makeText(getApplicationContext() ,"Fname"+fname+" "+"Lname"+lname,Toast.LENGTH_LONG).show();
           }
       });
    }
}
