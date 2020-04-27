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

public class DailyTips extends AppCompatActivity{

    TextView titlepage, subtitlepage, fitonetitle, fitonedesc, desc;
    View divpage;

    LinearLayout fitone;

    Animation bttone, bttwo, bttthree, bttfour, bttfive;

    int sumworkout = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daily_tips);

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
        desc.setText("1. MYTHS ABOUT DRINKING WATER HABBITS" +
                "\n" +
                "\n" +
                "Most people believe that we should drink water only in the first half of day, which is a complete fallacy" +
                "\n" +
                "we can take water any time but it has some different constraints" +
                "\n" +
                "a) Drink a glass water half an hour before taking your meals" +
                "\n" +
                "b) Again a glass of water 1.5 hour after taking your meals" +
                "\n" +
                "c) Strictly avoid water while having meal, because water is absorbed withinseconds and when it gets mixed in the stomach with other food" +
                "it can make it poisoness" +
                "\n" +
                "d) Always drink water in small sips" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "2. AVOID ALUMINIUM FOILS/ WRAPS AND UTENSILS" +
                "\n" +
                "\n" +
                "No doubt aluminium keeps our food warm and give us hygienic feeling, but when we put hot food in aluminium, some amount of aluminium" +
                "get mixed with food and when we consume it, alumimium reduces the production of zinc in our body, Zinc deficiency may manifest as acne," +
                " non-specific oral ulceration, stomatitis, pneumonia, severity of diarrhea eczema, xerosis, contribute to this phenomenon of malnutrition-induced malnutrition" +
                "Zinc is required to produce testosterone. Thus, zinc deficiency can lead to reduced circulating testosterone, which could " +
                "lead to sexual immaturity (Ananda Parsad, et al) hypogonadism, and delayed puberty." +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "3. SUGAR IS A SLOW POISON" +
                "\n" +
                "\n" +
                "Refined Sugar: Sugar contains a lot of calories, with no essential nutrients & because of that it " +
                "is considered as part of ‘empty’ calories. It can have harmful effects on metabolism and " +
                "contribute to all sorts of diseases like Cancer, type 2 diabetes, Overweight/Obesity, Liver diseases." +
                " Before sugar enters the bloodstream from the digestive tract, it is broken down into two simple sugars: " +
                "glucose and fructose. For people who are inactive, large amounts of fructose from added sugars get turned" +
                " into fat in the liver. Because of the harmful effects of sugar on the function of insulin, it leads to type " +
                "II diabetes.Recommended intake: Worldwide, it is recommended that men can have 9 teaspoons of sugar per day and" +
                " women can have 6 teaspoons of sugar per day. However, considering the tendency of Indians towards sugar" +
                " intolerance and diabetes, it is recommended not to go beyond 5" +
                " teaspoons of added sugar per day which includes sugar available in cookies, fruit juices etc. " +
                "\n" +
                "'Replace suger with honey or jaggery.'" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "4. NON STICK / TEFLON COATED" +
                "\n" +
                "\n" +
                "Disposable yet convenient,  it can scratch, chip and flake. " +
                "“Exposure to Teflon resins at temperatures above 393ºF may produce a condition termed polymer fume fever characterized" +
                " by flu-like symptoms such as chills, fever, body aches, nausea and occasional vomiting.”" +
                " Federal Aviation Agency Occupational Health & Safety Bulletin.  " +
                "A chemical, C-8, used to make non-stick coated pans has been linked to birth defects in humans to cancer" +
                " in laboratory animals. " +
                "The chemical is also present in the blood for up to 4 years and can show up in breast milk."+
                "\n" +
                        "\n"



        );


    }
}
