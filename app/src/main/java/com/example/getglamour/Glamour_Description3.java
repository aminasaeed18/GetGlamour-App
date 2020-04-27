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

public class Glamour_Description3 extends AppCompatActivity{

    TextView titlepage, subtitlepage, fitonetitle, fitonedesc, btnexercise, desc;
    View divpage, bgprogress;

    LinearLayout fitone;

    Animation bttone, bttwo, bttthree, bttfour, bttfive;

    int sumworkout = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_glamour__description3);

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
            desc.setText("Dried Orange Peels And Yogurt\n" +
                            "\n" +
                    "What You Need\n" +
                    "A few orange peels\n" +
                    "1 tablespoon unflavored yogurt\n" +
                    "What You Have To Do\n" +
                    "1. Dry the orange peels in the sun for two to three days.\n" +
                    "2. Once they become almost crisp, grind them till they turn into powder.\n" +
                    "3. Mix one tablespoon of this powder with the yogurt till you get a smooth paste.\n" +
                    "4. Apply the paste to your skin (after cleansing it) and keep it on for about 15-20 minutes.\n" +
                    "5. Rinse with warm water.\n" +
                    "\n" +
                    "How Often You Need To Do This\n" +
                    "You can do this every alternate day before going to bed.\n" +
                    "\n" +
                    "Best Suited For\n" +
                    "All skin types\n" +
                    "\n");

    }
}
