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

public class Glamour_description2 extends AppCompatActivity{

    TextView titlepage, subtitlepage, fitonetitle, fitonedesc, btnexercise, desc;
    View divpage, bgprogress;

    LinearLayout fitone;

    Animation bttone, bttwo, bttthree, bttfour, bttfive;

    int sumworkout = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_glamour_description2);

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
        desc.setText("Yogurt And Tomato Pack\n " +
                "                       \n" +
                "You Will Need\n" +
                "1 tablespoon plain yogurt\n" +
                "1 tablespoon tomato pulp/juice\n" +
                "What You Have To Do\n" +
                "Mix the ingredients and apply the paste on your face.\n" +
                "Let it dry for 30 minutes. Cleanse with water.\n" +
                "How Often You Should Do This\n" +
                "Repeat this twice or thrice a week.\n" +
                "\n" +
                "Why This Works\n" +
                "The citric properties of tomato act as a natural tan remover. If you wish to reduce pigmentation and dark spots, this pack is worth a try. The tomato extract works on spots and pigmentation. It also works as a toner and opens up the pores on the skin and reduces oiliness naturally (6). Yogurt moisturizes and soothes the skin (12).\n" +
                "\n" +
                "Caution\n" +
                "You may experience a slight tingling sensation, but be assured that the pack is beginning to work.");


    }
}
