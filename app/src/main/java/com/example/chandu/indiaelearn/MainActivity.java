package com.example.chandu.indiaelearn;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.PopupMenu;
import android.support.v7.widget.Toolbar;
import android.view.MenuInflater;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;

import com.bumptech.glide.Glide;

public class MainActivity extends AppCompatActivity implements PopupMenu.OnMenuItemClickListener {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        compressimages();
    }

    public void opendetail(View view){

            Intent i = new Intent(this, CourseDetail.class);
            startActivity(i);

    }


    private void compressimages(){

//technology images
        ImageView techiv1 = (ImageView) findViewById(R.id.technology_image1);
        Glide.with(this)
                .load(R.drawable.digitalmarketing)
                .centerCrop()
                .into(techiv1);

        ImageView techiv2 = (ImageView) findViewById(R.id.image2);
        Glide.with(this)
                .load(R.drawable.blogging)
                .centerCrop()
                .into(techiv2);


        ImageView techiv3 = (ImageView) findViewById(R.id.image3);
        Glide.with(this)
                .load(R.drawable.ethicalhacking)
                .centerCrop()
                .into(techiv3);

//government images

        ImageView iv1 = (ImageView) findViewById(R.id.government_image1);
        Glide.with(this)
                .load(R.drawable.sbipo)
                .centerCrop()
                .into(iv1);

        ImageView iv2 = (ImageView) findViewById(R.id.government_image2);
        Glide.with(this)
                .load(R.drawable.ssccgl)
                .centerCrop()
                .into(iv2);

        ImageView iv3 = (ImageView) findViewById(R.id.government_image3);
        Glide.with(this)
                .load(R.drawable.rbigradeb)
                .centerCrop()
                .into(iv3);

        ImageView iv4 = (ImageView) findViewById(R.id.government_image4);
        Glide.with(this)
                .load(R.drawable.indianrailways)
                .centerCrop()
                .into(iv4);

        ImageView iv5 = (ImageView) findViewById(R.id.government_image5);
        Glide.with(this)
                .load(R.drawable.licaao)
                .centerCrop()
                .into(iv5);

        ImageView iv6 = (ImageView) findViewById(R.id.government_image6);
        Glide.with(this)
                .load(R.drawable.ibpsso)
                .centerCrop()
                .into(iv6);

        ImageView iv7 = (ImageView) findViewById(R.id.government_image7);
        Glide.with(this)
                .load(R.drawable.ibpsclerk)
                .centerCrop()
                .into(iv7);

        ImageView iv8 = (ImageView) findViewById(R.id.government_image8);
        Glide.with(this)
                .load(R.drawable.sbiclerk)
                .centerCrop()
                .into(iv8);

        ImageView iv9 = (ImageView) findViewById(R.id.government_image9);
        Glide.with(this)
                .load(R.drawable.tet)
                .centerCrop()
                .into(iv9);

        ImageView iv10 = (ImageView) findViewById(R.id.government_image10);
        Glide.with(this)
                .load(R.drawable.upsc)
                .centerCrop()
                .into(iv10);
//programming images
        ImageView progiv1 = (ImageView) findViewById(R.id.programming_image1);
        Glide.with(this)
                .load(R.drawable.css)
                .into(progiv1);

        ImageView progiv2 = (ImageView) findViewById(R.id.programming_image2);
        Glide.with(this)
                .load(R.drawable.html)
                .into(progiv2);

        ImageView progiv3 = (ImageView) findViewById(R.id.programming_image3);
        Glide.with(this)
                .load(R.drawable.android)
                .into(progiv3);

        ImageView progiv4 = (ImageView) findViewById(R.id.programming_image4);
        Glide.with(this)
                .load(R.drawable.python)
                .into(progiv4);

        ImageView progiv5 = (ImageView) findViewById(R.id.programming_image5);
        Glide.with(this)
                .load(R.drawable.java)
                .into(progiv5);

        ImageView progiv6 = (ImageView) findViewById(R.id.programming_image6);
        Glide.with(this)
                .load(R.drawable.c)
                .into(progiv6);



        ImageView progiv7 = (ImageView) findViewById(R.id.programming_image7);
        Glide.with(this)
                .load(R.drawable.cpp)
                .into(progiv7);

   //entrepreneur images

        ImageView entreiv1 = (ImageView) findViewById(R.id.entrepreneur_image1);
        Glide.with(this)
                .load(R.drawable.bplan)
                .into(entreiv1);


    //undergraduate courses images

        ImageView ugiv1 = (ImageView) findViewById(R.id.ug_image1);
        Glide.with(this)
                .load(R.drawable.cse)
                .into(ugiv1);

        ImageView ugiv2 = (ImageView) findViewById(R.id.ug_image2);
        Glide.with(this)
                .load(R.drawable.ece)
                .into(ugiv2);

        ImageView ugiv3 = (ImageView) findViewById(R.id.ug_image3);
        Glide.with(this)
                .load(R.drawable.mech)
                .into(ugiv3);

        ImageView ugiv4 = (ImageView) findViewById(R.id.ug_image4);
        Glide.with(this)
                .load(R.drawable.civil)
                .into(ugiv4);
        //homescreen images








    }

    public void showPopup(View v) {
        PopupMenu popup = new PopupMenu(this, v);
        MenuInflater inflater = popup.getMenuInflater();
        inflater.inflate(R.menu.menu_card, popup.getMenu());
        popup.show();
    }

    public void showMenu(View v) {
        PopupMenu popup = new PopupMenu(this, v);

        // This activity implements OnMenuItemClickListener
        popup.setOnMenuItemClickListener(this);
        popup.inflate(R.menu.menu_card);
        popup.show();
    }

    @Override
    public boolean onMenuItemClick(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action1:
                return true;
            case R.id.action2:
                return true;
            default:
                return false;
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
