package com.example.getglamour;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

public class BeautyTip extends AppCompatActivity {
    Animation btthree, bttfour;
    TextView fitonetitle, subtitle, myTips;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beauty_tip);
        btthree = AnimationUtils.loadAnimation(this, R.anim.btthree);
        bttfour = AnimationUtils.loadAnimation(this, R.anim.bttfour);
        Typeface MLight = Typeface.createFromAsset(getAssets(), "fonts/MLight.ttf");
        Typeface MMedium = Typeface.createFromAsset(getAssets(), "fonts/MMedium.ttf");
        Typeface Vidaloka = Typeface.createFromAsset(getAssets(), "fonts/Vidaloka.ttf");
        fitonetitle = (TextView) findViewById(R.id.titlepage);
        subtitle = (TextView)findViewById(R.id.subtitlepage);
        myTips = (TextView)findViewById(R.id.tips);
        fitonetitle.setTypeface(Vidaloka);
        subtitle.setTypeface(Vidaloka);
        myTips.setTypeface(MMedium);
        fitonetitle.startAnimation(bttfour);
        subtitle.startAnimation(bttfour);
        myTips.startAnimation(btthree);
        myTips.setText("1. Cleansing – Once you have washed your face, cleanse it. \n You do not use an expensive cleanser for that." +
                " Take a cotton ball and dip it in non-boiled fresh milk. \n Squeeze the extra milk and rub the ball gently on your \n" +
                "face in circular motion. " +
                "It will not only cleanse your face but will also give it a natural glow." +
                "\n" +
                "\n" +
                "\n" +
                "2. Toning – Use rosewater to tone your face." +
                " Toning is a vital step that should not be voided as it lets the moisturizer work properly."+
                "\n" +
                "\n" +
                "\n" +
                "3. Moisturizing – You may use coconut oil for \n dry skin and aloe vera gel/jojoba oil for oily skin as a natural \n moisturizer." +
                "\n" +
                "\n" +
                "\n" +
                "4. Vitamin C – Start your day with some fresh fruits juices that contain vitamin C. " +
                "It helps you get a natural glow in your skin."+
                "\n" +
                "\n" +
                "\n" +
                "5. Sufficient Water – Drink at least 10-12 glasses of water to keep your skin hydrated." +
                " Remember, a well-hydrated skin means a younger looking skin!"+
                "\n" +
                "\n" +
                "\n" +
                "6. Include More Fruits & Vegetables in Your Diet – This is one of the best fitness tips for women! " +
                "It helps you get a beautiful skin and aids in weight management too.\n" +
                "\n" +
                "\n" +
                "\n" +
                "7. Avoid Junk Food – Junk food is not at all healthy. It gives you unwanted fat and unhealthy skin. So just avoid it!\n" +
                "\n" +
                "\n" +
                "\n" +
                "8. Follow Healthy Eating Habits – Eat at a proper time, do not keep munching at late hours, and similarly, " +
                "many other eating habits can affect your skin and health to a great extent. " +
                "The point is to eat healthy food and in a healthy way!"+
                "\n" +
                "\n" +
                "\n"
        );
    }
}
