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

public class Glamour_Description4 extends AppCompatActivity{

    TextView titlepage, subtitlepage, fitonetitle, fitonedesc, btnexercise, desc;
    View divpage, bgprogress;

    LinearLayout fitone;

    Animation bttone, bttwo, bttthree, bttfour, bttfive;

    int sumworkout = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_glamour__description4);

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

            desc.setText("For Black Heads- Baking Soda And Lemon \n" +
                    "\n" +
                    "You Will Need\n" +
                    "1 tablespoon of baking soda\n" +
                    "1/4 – 1/2 tablespoon of lemon juice\n" +
                    "What You Have To Do\n" +
                    "Mix a tablespoon of baking soda with enough lemon juice to form a thick paste.\n" +
                    "Apply this mask on your nose and let it dry. You can also apply this paste to the entire face.\n" +
                    "Wash your face thoroughly.\n" +
                    "How Often You Should Do This\n" +
                    "Do this once a week. \n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "For Dark Circles- Castor Oil For Dark Circles\n" +
                    "What You Need\n" +
                    "Organic castor oil\n" +
                    "\n" +
                    "What You Have To Do\n" +
                    "Apply castor oil under the eyes and leave it on overnight.\n" +
                    "\n" +
                    "How Often You Should Do This\n" +
                    "Do this every night."
            );
    }
}
