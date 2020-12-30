package com.gzeinnumer.yoyoanimsimple.utils;

import android.os.Handler;
import android.view.View;

import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;

import java.util.Arrays;
import java.util.List;

public class AnimFunction {

    public static void animationIn(View targetView) {
        Techniques techniques = Techniques.SlideInDown;
        long duration = 500;

        targetView.setVisibility(View.VISIBLE);
        YoYo.with(techniques).duration(duration).playOn(targetView);
    }

    public static void animationOut(View targetView) {
        Techniques techniques = Techniques.SlideOutDown;
        long duration = 500;

        YoYo.with(techniques).duration(duration).playOn(targetView);
        new Handler().postDelayed(() -> targetView.setVisibility(View.GONE), duration);
    }

    public static void animation(Techniques techniques, long duration, View targetView) {
        Techniques[] tIn = new Techniques[]{
                Techniques.RollIn,
                Techniques.BounceIn,
                Techniques.BounceInDown,
                Techniques.BounceInLeft,
                Techniques.BounceInRight,
                Techniques.BounceInUp,
                Techniques.FadeIn,
                Techniques.FadeInUp,
                Techniques.FadeInDown,
                Techniques.FadeInLeft,
                Techniques.FadeInRight,
                Techniques.FlipInX,
                Techniques.FlipInY,
                Techniques.RotateIn,
                Techniques.RotateInDownLeft,
                Techniques.RotateInDownRight,
                Techniques.RotateInUpLeft,
                Techniques.RotateInUpRight,
                Techniques.SlideInLeft,
                Techniques.SlideInRight,
                Techniques.SlideInUp,
                Techniques.SlideInDown,
                Techniques.ZoomIn,
                Techniques.ZoomInDown,
                Techniques.ZoomInLeft,
                Techniques.ZoomInRight,
                Techniques.ZoomInUp
        };

        Techniques[] tOut = new Techniques[]{
                Techniques.RollOut,
                Techniques.FadeOut,
                Techniques.FadeOutDown,
                Techniques.FadeOutLeft,
                Techniques.FadeOutRight,
                Techniques.FadeOutUp,
                Techniques.FlipOutX,
                Techniques.FlipOutY,
                Techniques.RotateOut,
                Techniques.RotateOutDownLeft,
                Techniques.RotateOutDownRight,
                Techniques.RotateOutUpLeft,
                Techniques.RotateOutUpRight,
                Techniques.SlideOutLeft,
                Techniques.SlideOutRight,
                Techniques.SlideOutUp,
                Techniques.SlideOutDown,
                Techniques.ZoomOut,
                Techniques.ZoomOutDown,
                Techniques.ZoomOutLeft,
                Techniques.ZoomOutRight,
                Techniques.ZoomOutUp,
        };

        List<Techniques> listIn = Arrays.asList(tIn);
        List<Techniques> listOut = Arrays.asList(tOut);
        if (listIn.contains(techniques)){
            targetView.setVisibility(View.VISIBLE);
            YoYo.with(techniques).duration(duration).playOn(targetView);
        } else if(listOut.contains(techniques)){
            YoYo.with(techniques).duration(duration).playOn(targetView);
            new Handler().postDelayed(() -> targetView.setVisibility(View.GONE), duration);
        } else {
            YoYo.with(techniques).duration(duration).playOn(targetView);
        }
    }
}
