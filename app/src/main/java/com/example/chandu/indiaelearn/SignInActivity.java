package com.example.chandu.indiaelearn;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.annotation.NonNull;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.Volley;
import com.bumptech.glide.Glide;
import com.google.android.gms.auth.api.Auth;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.GoogleSignInResult;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.SignInButton;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;


import org.json.JSONArray;
import org.json.JSONObject;

public class SignInActivity extends AppCompatActivity {

    private final String url = "https://stooped-modem.000webhostapp.com/Sample/LoginCheck.php";
    private EditText user, pass;
    private Button log,bypass;


    RequestQueue mQueue;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);

        //Appbar hide

        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();


        mQueue = Volley.newRequestQueue(getApplicationContext());
        user = (EditText) findViewById(R.id.login_emailid);
        pass = (EditText) findViewById(R.id.login_password);

        log = (Button) findViewById(R.id.loginBtn);

        log.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final ProgressDialog pd = new ProgressDialog(SignInActivity.this);
                final String username = user.getText().toString();
                final String password = pass.getText().toString();

                pd.setMessage("Signing In..");
                pd.show();
                pd.setCancelable(false);

                if (username.equals("") || password.equals("")) {
                    Toast.makeText(getApplicationContext(), "All fields are mandatory", Toast.LENGTH_LONG).show();
                    pd.dismiss();
                } else {

                    JsonArrayRequest jsonArrayRequest = new JsonArrayRequest(url, new Response.Listener<JSONArray>() {
                        @Override
                        public void onResponse(JSONArray response) {
                            int val = 0;
                            for (int i = 0; i < response.length(); i++) {
                                try {
                                    JSONObject object = response.getJSONObject(i);
                                    String emai = object.getString("Email");
                                    String pass_w = object.getString("Password");

                                    if (emai.equals(username) && pass_w.equals(password)) {
                                        val = 1;
                                        Intent intent = new Intent(SignInActivity.this, HomeActivity.class);
                                        startActivity(intent);
                                        finish();
                                        pd.dismiss();
                                    }
                                } catch (Exception er) {
                                    er.printStackTrace();
                                }
                            }
                            if (val == 0) {
                                pd.dismiss();
                                Toast.makeText(getApplicationContext(), "Wrong Credentials", Toast.LENGTH_LONG).show();
                            }
                        }
                    }, new Response.ErrorListener() {
                        @Override
                        public void onErrorResponse(VolleyError error) {
                            Toast.makeText(getApplicationContext(), "" + error.toString(), Toast.LENGTH_LONG).show();
                            pd.dismiss();
                        }
                    });

                    mQueue.add(jsonArrayRequest);
                }
            }
        });


    }

    public void GotoRegister(View v) {
        Intent i = new Intent(this, RegisterPage.class);
        startActivity(i);
    }
    public void bypass(View v){
        Intent i = new Intent(this,HomeActivity.class);
        startActivity(i);
    }


}