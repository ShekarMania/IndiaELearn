package com.example.chandu.indiaelearn;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.design.widget.AppBarLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Window;
import android.view.animation.AccelerateInterpolator;
import android.widget.Button;

public class CourseDetail extends AppCompatActivity {

    Button takeThisCourse;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course_detail);

        ActionBar actionBar=getSupportActionBar();
        actionBar.hide();


    takeThisCourse =(Button)findViewById(R.id.takeThisCourse);


    }

    public void proceed(View v){
        Intent i =new Intent(this,TakeThisCourse.class);
        startActivity(i);
    }



}
