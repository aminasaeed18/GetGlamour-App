package com.example.getglamour;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Locale;

public class StartGlamour extends AppCompatActivity {

    TextView fitonetitle, fitonedesc, timerValue, btnexercise;
    View divpage, bgprogress;
    ImageView imgtimer;
    LinearLayout fitone;

    private static final long START_TIME_IN_MILLIS = 800000;
    private CountDownTimer countDownTimer;
    private boolean mTimerRunning;
    private long mTimeLeftInMillis = START_TIME_IN_MILLIS;

    Animation btthree, bttfour, ttbone, ttbtwo, alphagogo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_glamour);

        // load animations
        btthree = AnimationUtils.loadAnimation(this, R.anim.btthree);
        bttfour = AnimationUtils.loadAnimation(this, R.anim.bttfour);
        ttbone = AnimationUtils.loadAnimation(this, R.anim.ttbone);
        ttbtwo = AnimationUtils.loadAnimation(this, R.anim.ttbtwo);
        alphagogo = AnimationUtils.loadAnimation(this, R.anim.alphagogo);


        // import font
        Typeface MLight = Typeface.createFromAsset(getAssets(), "fonts/MLight.ttf");
        Typeface MMedium = Typeface.createFromAsset(getAssets(), "fonts/MMedium.ttf");
        Typeface Vidaloka = Typeface.createFromAsset(getAssets(), "fonts/Vidaloka.ttf");

        btnexercise = (TextView) findViewById(R.id.btnexercise);
        fitonetitle = (TextView) findViewById(R.id.fitonetitle);
        fitonedesc = (TextView) findViewById(R.id.fitonedesc);
        timerValue = (TextView) findViewById(R.id.timerValue);
        btnexercise = (TextView) findViewById(R.id.btnexercise);

        divpage = (View) findViewById(R.id.divpage);
        bgprogress = (View) findViewById(R.id.bgprogress);
        fitone = (LinearLayout) findViewById(R.id.fitone);
        imgtimer = (ImageView) findViewById(R.id.imgtimer);

        // change customize font

        btnexercise.setTypeface(MMedium);
        timerValue.setTypeface(MMedium);
        fitonedesc.setTypeface(MLight);
        fitonetitle.setTypeface(MMedium);

        // assign animation
        btnexercise.startAnimation(btthree);
        bgprogress.startAnimation(bttfour);
        fitone.startAnimation(ttbone);

        divpage.startAnimation(ttbtwo);
        timerValue.startAnimation(alphagogo);
        imgtimer.startAnimation(alphagogo);

        startTimer();

        // give an event to another page
        btnexercise.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(StartGlamour.this,DashBoard.class);
                startActivity(a);
            }
        });

    }

    private void startTimer(){
        countDownTimer = new CountDownTimer(mTimeLeftInMillis, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                mTimeLeftInMillis = millisUntilFinished;
                updateCountDowntText();
            }

            @Override
            public void onFinish() {
                Toast.makeText(getApplicationContext(), "Congratulations!", Toast.LENGTH_SHORT).show();
            }
        }.start();
        mTimerRunning = true;
    }

    private void updateCountDowntText(){
        int minutes = (int) (mTimeLeftInMillis / 1000) / 60;
        int seconds = (int) (mTimeLeftInMillis / 1000) % 60;

        String timeLeft = String.format(Locale.getDefault(), "%02d:%02d", minutes, seconds);
        timerValue.setText(timeLeft);
    }

}
