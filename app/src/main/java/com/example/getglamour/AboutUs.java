package com.example.getglamour;

import android.content.Intent;
import android.graphics.Typeface;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

public class AboutUs extends AppCompatActivity {
    Animation btthree, bttfour;
    TextView fitonetitle, subtitle, subtitle2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_us);
        btthree = AnimationUtils.loadAnimation(this, R.anim.btthree);
        bttfour = AnimationUtils.loadAnimation(this, R.anim.bttfour);
        Typeface MLight = Typeface.createFromAsset(getAssets(), "fonts/MLight.ttf");
        Typeface MMedium = Typeface.createFromAsset(getAssets(), "fonts/MMedium.ttf");
        Typeface Vidaloka = Typeface.createFromAsset(getAssets(), "fonts/Vidaloka.ttf");
        fitonetitle = (TextView) findViewById(R.id.titlepage);
        subtitle = (TextView)findViewById(R.id.subtitlepage);
        subtitle2 = (TextView)findViewById(R.id.subtitlepage2);
        fitonetitle.setTypeface(Vidaloka);
        subtitle.setTypeface(MLight);
        subtitle2.setTypeface(MLight);
        fitonetitle.startAnimation(bttfour);
        subtitle.startAnimation(btthree);
        subtitle2.startAnimation(btthree);
        subtitle2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("https://artificialintelligencereviewedbyamina.blogspot.com"));
                startActivity(intent);
            }
        });
    }
}
