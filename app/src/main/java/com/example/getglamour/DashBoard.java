package com.example.getglamour;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class DashBoard extends AppCompatActivity implements View.OnClickListener {
    private Button workOut, face, health, dailyTips;
    private TextView about, fontTitle,fontSub;
    private ImageView dp;
    private View dev;
    Animation animimgpage, bttone, bttwo, btthree, ltr, ltr1, ltr2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dash_board);
        workOut = (findViewById(R.id.workOut));
        dev = (findViewById(R.id.divpage));
        dp = (findViewById(R.id.dp));
        face = (findViewById(R.id.face));
        health = (findViewById(R.id.health));
        dailyTips = (findViewById(R.id.tips));
        about = (findViewById(R.id.about));
        fontTitle = (findViewById(R.id.fitonetitle));
        fontSub  =(findViewById(R.id.fitonedesc));
        workOut.setOnClickListener(this);
        face.setOnClickListener(this);
        workOut.setOnClickListener(this);
        about.setOnClickListener(this);
        health.setOnClickListener(this);
        dailyTips.setOnClickListener(this);
        animimgpage = AnimationUtils.loadAnimation(this, R.anim.animimgpage);
        bttone = AnimationUtils.loadAnimation(this, R.anim.bttone);
        bttwo = AnimationUtils.loadAnimation(this, R.anim.bttwo);
        btthree = AnimationUtils.loadAnimation(this, R.anim.btthree);
        ltr = AnimationUtils.loadAnimation(this, R.anim.ltr);
        workOut.startAnimation(bttone);
        face.startAnimation(bttone);
        health.startAnimation(bttone);
        dailyTips.startAnimation(bttone);
        dev.startAnimation(animimgpage);
        about.startAnimation(animimgpage);
        fontTitle.startAnimation(animimgpage);
        fontSub.startAnimation(animimgpage);
        dp.startAnimation(animimgpage);

        Typeface MLight = Typeface.createFromAsset(getAssets(), "fonts/MLight.ttf");
        Typeface MMedium = Typeface.createFromAsset(getAssets(), "fonts/MMedium.ttf");
        Typeface Vidaloka = Typeface.createFromAsset(getAssets(), "fonts/Vidaloka.ttf");
        fontTitle.setTypeface(Vidaloka);
        fontSub.setTypeface(MLight);
        about.setTypeface(Vidaloka);
        workOut.setTypeface(MMedium);
        face.setTypeface(MMedium);
        health.setTypeface(MMedium);
        dailyTips.setTypeface(MMedium);
    }

    @Override
    public void onClick(View v) {
        if(v==about){
           Intent intent = new Intent(getApplicationContext(), AboutUs.class);
           startActivity(intent);
        }
        if(v==workOut){
            Intent intent = new Intent(getApplicationContext(), WorkOut.class);
            startActivity(intent);
        }
        if(v==face){
            Intent intent = new Intent(getApplicationContext(), Glamour_Activity.class);
            startActivity(intent);
        }
        if(v==health){
           Intent intent = new Intent(getApplicationContext(), Health.class);
            startActivity(intent);
        }
        if(v==dailyTips){
            Intent intent = new Intent(getApplicationContext(), DailyTips.class);
            startActivity(intent);
        }


    }
}
