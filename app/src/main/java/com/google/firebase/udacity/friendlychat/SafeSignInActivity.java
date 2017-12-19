package com.google.firebase.udacity.friendlychat;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.view.View.OnClickListener;

public class SafeSignInActivity extends AppCompatActivity implements OnClickListener{


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_safe_sign_in);

        // Set up click listeners for all the buttons
        View msafesignin_button = findViewById(R.id.safesignin_button);
        msafesignin_button.setOnClickListener(this);
    }

    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.safesignin_button:
                Intent i = new Intent(SafeSignInActivity.this, MainActivity.class);
                startActivity(i);
                break;

        }
    }

}
