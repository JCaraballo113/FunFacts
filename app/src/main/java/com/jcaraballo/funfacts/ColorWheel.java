package com.jcaraballo.funfacts;

import android.graphics.Color;
import android.widget.Button;
import android.widget.RelativeLayout;

import java.util.Random;

/**
 * Created by John Caraballo on 10/22/2015.
 */
public class ColorWheel {

    private static String[] mColors = {
            "#39add1", // light blue
            "#3079ab", // dark blue
            "#c25975", // mauve
            "#e15258", // red
            "#f9845b", // orange
            "#838cc7", // lavender
            "#7d669e", // purple
            "#53bbb4", // aqua
            "#51b46d", // green
            "#e0ab18", // mustard
            "#637a91", // dark gray
            "#f092b0", // pink
            "#b7c0c7"  // light gray
    };

    public static int getColor(){
        // Pick a random color value index
        int randColor = new Random().nextInt(mColors.length);

        return Color.parseColor(mColors[randColor]);
    }

    public static void setColors(RelativeLayout bg, Button btn){
        int randomColor = getColor();
        bg.setBackgroundColor(randomColor);
        btn.setTextColor(randomColor);
    }

}
