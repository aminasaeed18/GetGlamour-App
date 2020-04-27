package com.example.getglamour;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

public class WorkoutTip extends AppCompatActivity {
    Animation btthree, bttfour;
    TextView fitonetitle, subtitle, myTips;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_workout_tip);
        btthree = AnimationUtils.loadAnimation(this, R.anim.btthree);
        bttfour = AnimationUtils.loadAnimation(this, R.anim.bttfour);
        Typeface MLight = Typeface.createFromAsset(getAssets(), "fonts/MLight.ttf");
        Typeface MMedium = Typeface.createFromAsset(getAssets(), "fonts/MMedium.ttf");
        Typeface Vidaloka = Typeface.createFromAsset(getAssets(), "fonts/Vidaloka.ttf");
        fitonetitle = (TextView) findViewById(R.id.titlepage);
        myTips = (TextView)findViewById(R.id.tips);
        subtitle = (TextView)findViewById(R.id.subtitlepage);
        fitonetitle.setTypeface(Vidaloka);
        subtitle.setTypeface(Vidaloka);
        myTips.setTypeface(MMedium);
        fitonetitle.startAnimation(bttfour);
        subtitle.startAnimation(bttfour);
        myTips.startAnimation(btthree);
        myTips.setText("To recap quickly:\n" +
                        "\n" +
                        "* You can sometimes get sore muscles immediately after or during a workout\n" +
                        "\n" +
                        "* This is called acute muscle soreness\n" +
                        "\n" +
                        "* It’s caused by a build up of lactic acid in your muscles (burning sensation)\n" +
                        "\n" +
                        "* Usually goes away fairly quickly"+
                "\n" +
                "\n" +
                "\n" +
                "\n" +

                "Tips" +
                "\n" +
                "\n" +
                "1. Warm up properly" +
                "\n" +
                "2. Hydrate like crazy" +
                "\n" +
                "3. Use better form during your leg workouts" +
                "\n" +
                "4. Stretch out those quads and hammies!" +
                "\n" +
                "5. Hit the stationary bike the next day" +
                "\n" +
                "6. Walk through the pain" +
                "\n" +
                "7. Ice those legs down" +
                "\n" +
                "8. Take an over the counter pain killer" +
                "\n" +
                "9. Use a foam roller" +
                "\n" +
                "10. Use a high-quality BCAA (branch chain amino acids) for recovery" +
                "\n" +
                "11. Quit ego lifting" +
                "\n" +
                "\n" +
                "\n"
        );
    }
}
