package com.catata.animacioneslottie;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.airbnb.lottie.LottieAnimationView;

public class MainActivity extends AppCompatActivity {
    LottieAnimationView lottieAnimationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lottieAnimationView = (LottieAnimationView)findViewById(R.id.animation_view);

        lottieAnimationView.addAnimatorListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationStart(Animator animation) {
                Log.i("ANIMACION", "Empieza" + animation.getDuration());
            }



            @Override
            public void onAnimationEnd(Animator animation) {
                Log.i("ANIMACION", "Termina");

            }
        });
    }

    public void empezar(View view) {
        lottieAnimationView.playAnimation();

    }
}