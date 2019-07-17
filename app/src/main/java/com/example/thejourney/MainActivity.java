package com.example.thejourney;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button buttonAbout;
    private Button buttonProfile;
    private Button buttonLinkedIn;
    private Button buttonContact;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonAbout = (Button) findViewById(R.id.buttonAbout);
        buttonAbout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openAboutUs();
            }
        });

        buttonProfile = (Button) findViewById(R.id.buttonProfile);
        buttonProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openProfile();
            }
        });

        buttonLinkedIn = (Button) findViewById(R.id.buttonLinkedIn);
        buttonLinkedIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openLinkedIn();
            }
        });

//        buttonContact = (Button) findViewById(R.id.buttonContact);
//        buttonContact.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                openContact();
//            }
//        });
    }
    public void openAboutUs() {
        Intent intent = new Intent(this, AboutActivity.class);
        startActivity(intent);
    }

    public void openProfile() {
        Intent intent = new Intent(this, ProfileActivity.class);
        startActivity(intent);
    }

    public void openLinkedIn() {
        Intent intent = new Intent(this, LinkedIn.class);
        startActivity(intent);
    }

    public void openContact() {
        Intent intent = new Intent(this, ContactActivity.class);
        startActivity(intent);
    }
}
