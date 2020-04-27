package com.example.getglamour;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class Glamour_Description extends AppCompatActivity{

    TextView titlepage, subtitlepage, fitonetitle, fitonedesc, btnexercise, desc;
    View divpage, bgprogress;

    LinearLayout fitone;

    Animation bttone, bttwo, bttthree, bttfour, bttfive;

    int sumworkout = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_glamour__description);

        // load animations
        bttone = AnimationUtils.loadAnimation(this, R.anim.bttone);
        bttwo = AnimationUtils.loadAnimation(this, R.anim.bttwo);
        bttthree = AnimationUtils.loadAnimation(this, R.anim.bttwo);
        bttfour = AnimationUtils.loadAnimation(this, R.anim.bttfour);
        bttfive = AnimationUtils.loadAnimation(this, R.anim.bttfive);

        titlepage = findViewById(R.id.titlepage);
        subtitlepage = findViewById(R.id.subtitlepage);

        fitone = findViewById(R.id.fitone);


        divpage = findViewById(R.id.divpage);
        bgprogress = findViewById(R.id.bgprogress);

        fitonetitle = findViewById(R.id.fitonetitle);
        fitonedesc = findViewById(R.id.fitonedesc);
        btnexercise = findViewById(R.id.btnexercise);
        desc =(TextView)findViewById(R.id.desc);




        // import font
        Typeface MLight = Typeface.createFromAsset(getAssets(), "fonts/MLight.ttf");
        Typeface MMedium = Typeface.createFromAsset(getAssets(), "fonts/MMedium.ttf");
        Typeface Vidaloka = Typeface.createFromAsset(getAssets(), "fonts/Vidaloka.ttf");

        // customize font
        titlepage.setTypeface(Vidaloka);
        subtitlepage.setTypeface(MLight);
        btnexercise.setTypeface(MMedium);
        fitonetitle.setTypeface(MMedium);
        desc.setTypeface(MMedium);
        fitonedesc.setTypeface(MLight);



        // assign the animations
        titlepage.startAnimation(bttone);
        subtitlepage.startAnimation(bttone);
        divpage.startAnimation(bttone);
        btnexercise.startAnimation(bttfive);
        fitone.startAnimation(bttwo);
        desc.startAnimation(bttthree);
        bgprogress.startAnimation(bttfive);
        bgprogress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), StartGlamour.class);
                startActivity(intent);

            }
        });
        desc.setText("Besan And Curd Face Pack\n" +
                "\n" +
                "You Need\n" +
                "1 ½ tablespoons of besan powder\n" +
                "1 tablespoon of curd\n" +
                "What You Need To Do\n" +
                "Add the besan powder and curd to the bowl and mix well.\n" +
                "Apply the paste to your face and neck and keep it on for 15-20 minutes.\n" +
                "Rinse well and pat dry with a clean towel.\n" +
                "How Often?\n" +
                "Apply this face pack 2-3 times a week.\n" +
                "\n" +
                "Why This Works?\n" +
                "Besan absorbs the excess oil from the face without drying it. It clears the pores of dirt and toxins and maintains the pH of the skin. Curd cleanses and moisturizes your skin.");


    }
}
