package com.example.chandu.indiaelearn;


import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.text.Spanned;
import android.text.method.ScrollingMovementMethod;
import android.view.Gravity;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.view.View;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayer.Provider;
import com.google.android.youtube.player.YouTubePlayerView;

import static android.support.v7.appcompat.R.styleable.View;

public class Leadership extends YouTubeBaseActivity implements YouTubePlayer.OnInitializedListener {

    private TextView textout, h2, h3, h4, h5, h6, h7, h8, h9, h10, h11, h12, h13, h14, h15;
    private Button bt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_leadership);
        youTubeView = (YouTubePlayerView) findViewById(R.id.youtube_view);
        youTubeView.initialize("AIzaSyBqE39PS0DD3qmWqQhRrXmh1j_lWNI0T68 ", this);


//        textout = (TextView) findViewById(R.id.textout);
//        textout.setTextSize(30);
//        textout.setText("       IndiaElearn - SLAP");
//
//        //textout.setMovementMethod(new ScrollingMovementMethod());
//        h2 = (TextView) findViewById(R.id.textView2);
//        h2.setTextSize(15);
//        h2.setText("Student Leadership skills & Ambassador");
//        h3 = (TextView) findViewById(R.id.textView3);
//        h3.setTextSize(15);
//        h3.setPadding(200,0,0,0);
//        h3.setText("Program");
        bt = (Button) findViewById(R.id.button2);
//
        onConfigurationChanged(this.getResources().getConfiguration());

    }

    private static final int RECOVERY_REQUEST = 1;
    private YouTubePlayerView youTubeView;


    @Override
    public void onInitializationSuccess(Provider provider, YouTubePlayer player, boolean wasRestored) {
        if (!wasRestored) {
            player.cueVideo("kOmOnQ1DvUs"); // Plays https://www.youtube.com/watch?v=fhWaJi1Hsfo
        }
    }

    @Override
    public void onInitializationFailure(Provider provider, YouTubeInitializationResult errorReason) {
        if (errorReason.isUserRecoverableError()) {
            errorReason.getErrorDialog(this, RECOVERY_REQUEST).show();
        } else {
            String error = String.format(getString(R.string.player_error), errorReason.toString());
            Toast.makeText(this, error, Toast.LENGTH_LONG).show();
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == RECOVERY_REQUEST) {
            // Retry initialization if user performed a recovery action
            getYouTubePlayerProvider().initialize("AIzaSyBqE39PS0DD3qmWqQhRrXmh1j_lWNI0T68 ", this);
        }
    }

    protected Provider getYouTubePlayerProvider() {
        return youTubeView;
    }


    public void goToSo(View view) {
        goToUrl("https://www.payumoney.com/paybypayumoney/#/5410243B8CA6EA3107FB017B5D3CD911");
    }

    private void goToUrl(String url) {
        Uri uriUrl = Uri.parse(url);
        Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
        startActivity(launchBrowser);
    }


    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        if (newConfig.orientation == Configuration.ORIENTATION_PORTRAIT) {

            textout = (TextView) findViewById(R.id.textout);
            textout.setTextSize(30);
            textout.setGravity(Gravity.CENTER_VERTICAL | Gravity.CENTER_HORIZONTAL);
            textout.setText("       IndiaElearn - SLAP");
            h2 = (TextView) findViewById(R.id.textView2);
            h2.setTextSize(23);
            h2.setGravity(Gravity.CENTER_VERTICAL | Gravity.CENTER_HORIZONTAL);
            h2.setText("Student Leadership skills & Ambassador Program");
            h3 = (TextView) findViewById(R.id.textView3);
            h3.setTextSize(20);
            h3.setGravity(Gravity.CENTER_VERTICAL | Gravity.CENTER_HORIZONTAL);

            h3.setText("Mission :");
            h4 = (TextView) findViewById(R.id.textView4);
            h4.setTextSize(15);
//
            h4.setText("SLAP brings together students from various academic disciplines and cultural backgrounds, serves to enrich and enhance leadership and communication skills, personal growth, and professional development for its membership while creating long lasting ties with their future alma matter.");

            h5 = (TextView) findViewById(R.id.textView5);
            h5.setTextSize(20);
//            );
            h5.setText("Criteria for Membership :");
            h6 = (TextView) findViewById(R.id.textView6);
            h6.setTextSize(15);
            h6.setGravity(Gravity.LEFT);
            h6.setText("Academic Achievement – 50%( up to now)\n" +
                    "Enthusiastic and positive attitude\n" +
                    "A sincere desire to represent SLAP\n" +
                    "The ability to work well with others and to be a successful team player\n" +
                    "The ability and desire to learn strong communication and leadership skills\n" +
                    "Knowledge of IndiaElearn-SLAP");
            h7 = (TextView) findViewById(R.id.textView9);
            h7.setTextSize(20);
//
            h7.setText("Selection Process :");
            h8 = (TextView) findViewById(R.id.textView11);
            h8.setTextSize(15);
            h8.setText("If approved, the student is then scheduled for an interview with the selection committee.One more step after this will goes.");
            h9 = (TextView) findViewById(R.id.textView12);
            h9.setTextSize(20);

            h9.setText("Ethical Standards:");
            h10 = (TextView) findViewById(R.id.textView18);
            h10.setTextSize(15);

            h10.setText("In the case of a exit in a Student Ambassador’s behavior status, it is expected that the student will immediately discuss this issue with the program advisors.\n" +
                    "Following this consultation, appropriate actions will be taken in accordance with standards of conduct required by the program.\n" +
                    "This action could include termination of the student’s participation in the Student Ambassador Program.\n");
            h11 = (TextView) findViewById(R.id.textView19);
            h11.setTextSize(20);

            h11.setText("Commitment:");
            h12 = (TextView) findViewById(R.id.textView20);
            h12.setTextSize(15);

            h12.setText("\n" +
                    "Required attendance at the two-day training session (14 days each).\n" +
                    "Required attendance at any Student Ambassador monthly meetings.\n" +
                    "SLAP attire is to be worn at all events being worked.\n" +
                    "Demonstration of high standard of professionalism at all times.");
            h13 = (TextView) findViewById(R.id.textView7);
            h13.setTextSize(17);

            h13.setText("PURPOSE DIVIDING OF SLAP CATEGORIES:");
            h14 = (TextView) findViewById(R.id.textView8);
            h14.setTextSize(15);
            Spanned text3 = Html.fromHtml("Terms: <br>" +
                    "Events & trainings & workshops will be mostly conducted on weekends holidays doesn’t disturb any academic calender. <br>" +
                    "Student undergoes each level with grading system according to performance. <br>" +
                    "Each level makes every student a clear vision to his career through by team leading & networking & mentoring etc. <br><br>" +
                    "Cost & where to pay:<br>" +
                    "Each Level Application Cost is 499/- <br>" +
                    "Cost of Red- SLAP :- 120/- <br>" +
                    "Cost of Green-SLAP :- 120/- <br>" +
                    "Cost of Blue-SLAP :- 120/- <br>");
            Spanned text = Html.fromHtml("<b><u>Purpose: </u></b>");
            Spanned text2 = Html.fromHtml("Free access to all IndiaElearn courses <br>" +
                    "Free Networking <br>" +
                    "Free Mentoring <br>" +
                    "Gift voucher & T-shirt. <br>" +
                    "2 Technical & Non Technical Event. <br>" +
                    "workshop on technical. <br>" +
                    "2 Days training on Ten Rules for Leadership. ");
            h14.setText("Each duration 9 days\n" +
                    "1. BEGINNER-RED SLAP \n" +
                    "2. INTERMEDIATE-GREEN SLAP \n" +
                    "3. ADVANCED-BLUE SLAP \n\n ");
            h15 = (TextView) findViewById(R.id.textView13);
            h15.setText(text + "\n\n" + text2 + "\n\n" + text3);
//

        } else {

            textout = (TextView) findViewById(R.id.textout);
            textout.setTextSize(45);
            textout.setPadding(40, 0, 0, 0);

            textout.setText("       IndiaElearn - SLAP");


            h2 = (TextView) findViewById(R.id.textView2);
            h2.setTextSize(30);
            h2.setText("Student Leadership skills & Ambassador Program");
            h2.setGravity(Gravity.CENTER_VERTICAL | Gravity.CENTER_HORIZONTAL);
            h3 = (TextView) findViewById(R.id.textView3);
            h3.setTextSize(25);
            h3.setGravity(Gravity.CENTER_VERTICAL | Gravity.CENTER_HORIZONTAL);
            h3.setText("Mission :");

            h4 = (TextView) findViewById(R.id.textView4);
            h4.setTextSize(15);
//
            h4.setText("SLAP brings together students from various academic disciplines and cultural backgrounds, serves to enrich and enhance leadership and communication skills, personal growth, and professional development for its membership while creating long lasting ties with their future alma matter.");

            h5 = (TextView) findViewById(R.id.textView5);
            h5.setTextSize(25);
//
            h5.setText("Criteria for Membership :");
            h6 = (TextView) findViewById(R.id.textView6);
            h6.setTextSize(15);
//
            h6.setText("Academic Achievement – 50%( up to now)\n" +
                    "Enthusiastic and positive attitude\n" +
                    "A sincere desire to represent SLAP\n" +
                    "The ability to work well with others and to be a successful team player\n" +
                    "The ability and desire to learn strong communication and leadership skills\n" +
                    "Knowledge of IndiaElearn-SLAP");
            h7 = (TextView) findViewById(R.id.textView9);
            h7.setTextSize(25);
//
            h7.setText("Selection Process :");
            h8 = (TextView) findViewById(R.id.textView11);
            h8.setTextSize(15);
            h8.setText("If approved, the student is then scheduled for an interview with the selection committee.One more step after this will goes.");
            h9 = (TextView) findViewById(R.id.textView12);
            h9.setTextSize(25);

            h9.setText("Ethical Standards:");
            h10 = (TextView) findViewById(R.id.textView18);
            h10.setTextSize(15);

            h10.setText("In the case of a exit in a Student Ambassador’s behavior status, it is expected that the student will immediately discuss this issue with the program advisors.\n" +
                    "Following this consultation, appropriate actions will be taken in accordance with standards of conduct required by the program.\n" +
                    "This action could include termination of the student’s participation in the Student Ambassador Program.\n");
            h11 = (TextView) findViewById(R.id.textView19);
            h11.setTextSize(25);

            h11.setText("Commitment:");
            h12 = (TextView) findViewById(R.id.textView20);
            h12.setTextSize(15);

            h12.setText("\n" +
                    "Required attendance at the two-day training session (14 days each).\n" +
                    "Required attendance at any Student Ambassador monthly meetings.\n" +
                    "SLAP attire is to be worn at all events being worked.\n" +
                    "Demonstration of high standard of professionalism at all times.");
            h13 = (TextView) findViewById(R.id.textView7);
            h13.setTextSize(25);

            h13.setText("PURPOSE DIVIDING OF SLAP CATEGORIES:");
            h14 = (TextView) findViewById(R.id.textView8);
            h14.setTextSize(15);
            Spanned text3 = Html.fromHtml("Terms: <br>" +
                    "Events & trainings & workshops will be mostly conducted on weekends holidays doesn’t disturb any academic calender. <br>" +
                    "Student undergoes each level with grading system according to performance. <br>" +
                    "Each level makes every student a clear vision to his career through by team leading & networking & mentoring etc. <br><br>" +
                    "Cost & where to pay:<br>" +
                    "Each Level Application Cost is 499/- <br>" +
                    "Cost of Red- SLAP :- 120/- <br>" +
                    "Cost of Green-SLAP :- 120/- <br>" +
                    "Cost of Blue-SLAP :- 120/- <br>");
            Spanned text = Html.fromHtml("<b><u>Purpose: </u></b>");
            Spanned text2 = Html.fromHtml("Free access to all IndiaElearn courses <br>" +
                    "Free Networking <br>" +
                    "Free Mentoring <br>" +
                    "Gift voucher & T-shirt. <br>" +
                    "2 Technical & Non Technical Event. <br>" +
                    "workshop on technical. <br>" +
                    "2 Days training on Ten Rules for Leadership. ");
            h14.setText("Each duration 9 days\n" +
                    "1. BEGINNER-RED SLAP \n" +
                    "2. INTERMEDIATE-GREEN SLAP \n" +
                    "3. ADVANCED-BLUE SLAP \n\n ");
            h15 = (TextView) findViewById(R.id.textView13);
            h15.setText(text + "\n\n" + text2 + "\n\n" + text3);


        }


        super.onConfigurationChanged(newConfig);
    }
}
