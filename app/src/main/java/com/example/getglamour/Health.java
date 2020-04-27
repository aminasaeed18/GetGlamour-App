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

public class Health extends AppCompatActivity{

    TextView titlepage, subtitlepage, fitonetitle, fitonedesc, desc;
    View divpage;

    LinearLayout fitone;

    Animation bttone, bttwo, bttthree, bttfour, bttfive;

    int sumworkout = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_health);

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
        fitonetitle = findViewById(R.id.fitonetitle);
        fitonedesc = findViewById(R.id.fitonedesc);
        desc =(TextView)findViewById(R.id.desc);




        // import font
        Typeface MLight = Typeface.createFromAsset(getAssets(), "fonts/MLight.ttf");
        Typeface MMedium = Typeface.createFromAsset(getAssets(), "fonts/MMedium.ttf");
        Typeface Vidaloka = Typeface.createFromAsset(getAssets(), "fonts/Vidaloka.ttf");

        // customize font
        titlepage.setTypeface(Vidaloka);
        subtitlepage.setTypeface(MLight);
        fitonetitle.setTypeface(MMedium);
        desc.setTypeface(MMedium);
        fitonedesc.setTypeface(MLight);



        // assign the animations
        titlepage.startAnimation(bttone);
        subtitlepage.startAnimation(bttone);
        divpage.startAnimation(bttone);
        fitone.startAnimation(bttwo);
        desc.startAnimation(bttthree);

        desc.setText("1. ENERGETIC AND FOCUSED." +
                "\n" +
                "\n" +
                "'CONTROL STRESS'\n" +
                "Stress-induced emotions consume huge amounts of energy. Talking with a friend or relative, " +
                "joining a support group, or seeing a psychotherapist can all help diffuse stress. \n" +
                "\n" +
                " 'AVOID SMOKING ' \n" +
                "You know smoking threatens your health. But you may not know that smoking actually siphons off" +
                " your energy by causing insomnia. " +
                "\n" +
                "\n" +
                "'RESTRICT YOUR SLEEP' \n" +
                "If you think you may be sleep-deprived, try getting less sleep. Here's how to do it:\n" +
                "Avoid napping during the day.\n" +
                "The first night, go to bed later than normal and get just four hours of sleep.\n" +
                "If you feel that you slept well during that four-hour period, add another 15–30 minutes of sleep the next night.\n" +
                "As long as you're sleeping soundly the entire time you're in bed, slowly keep adding sleep on successive nights." +
                "\n" +
                "\n" +
                "'DRINK WATER'" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "2.HEALTHY STOMACH." +
                "\n" +
                "\n" +
                "'EAT A HIGH-FIBER DIET'" +
                "\n" +
                "A high-fiber diet helps to keep food moving through your digestive tract, " +
                "making you less likely to get constipated." +
                "\n" +
                "\n" +
                        " 'CHOOSE LEAN MEALS' " +
                "\n" +
                        "Protein is an essential part of a healthful diet, but fatty cuts of meat can lead to uncomfortable digestion. " +
                        "When you eat meat, select lean cuts, such as pork loin and skinless poultry." +
                        "\n" +
                "\n" +
                        "'STAY HYDRATED'" +
                "\n" +
                        "Drinking plenty of water is good for your digestive health" +
                        "\n" +
                        " 'MANAGE STRESS' " +
                "\n" +
                        "Too much stress or anxiety can cause your digestive system to go into overdrive" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                        "3. ACIDITY." +

                "\n" +
                "\n" +
                        "'COLD MILK and ICE CREAMS'" +
                "\n" +
                        "Cold milk can neutralize acids in your stomach and can give you relief from acidity.\n" +
                        "Drink a glass of cold milk which will prevent your troubles. \n" +
                        "Also, you can eat a cup of ice creams if you are not susceptible to cold and cough." +
                "\n" +
                "\n" +
                        "'ALMONDS'" +
                "\n" +
                        "It helps for heartburn since it neutralizes the juices in your stomach, " +
                        "relieving and preventing acidity overall. " +
                        "\n" +
                "\n" +
                        "'EAT A BANANA OR AN APPLE'" +
                "\n" +
                        "Bananas contain natural antacids that act as a factor to fight acidity.\n" +
                        "And have few slices of apple before bedtime to relieve heartburn or reflux." +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "4. IRREGULAR PERIODS (PCOD)" +
                        "\n" +
                "\n" +
                "Fenugreek" +
                "\n" +
                        "Fenugreek (Meethi Dana) is not less thana miracle for so many health problems, girls with hormonal imbalance, pcod's, irregural mestural cycles " +
                        "should consume Fenugreek seeds. It can be consumed in many ways like:" +
                "\n" +
                        "- eat whole seeds" +
                "\n" +
                "- soak some seeds in water over night, separate seeds from water in the and drink empty stomach" +
                "\n" +
                "- make powder of it, soak over night in the water or milk and drink empty stomach in the morning" +
                "\n" +
                "\n" +
                "\n"
        );


    }
}
