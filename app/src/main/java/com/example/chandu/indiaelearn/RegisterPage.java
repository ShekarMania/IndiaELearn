package com.example.chandu.indiaelearn;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class RegisterPage extends AppCompatActivity {

    ActionBar actionBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_page);

        actionBar.setDisplayHomeAsUpEnabled(true);




    }
    public void onSignUpSuccess(View v){
        Intent i = new Intent(this,SignInActivity.class);
        startActivity(i);
        Toast.makeText(RegisterPage.this, "User Registered Successfully!", Toast.LENGTH_SHORT).show();
    }
}
