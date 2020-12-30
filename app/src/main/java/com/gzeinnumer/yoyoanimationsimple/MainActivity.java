package com.gzeinnumer.yoyoanimationsimple;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.os.Handler;
import android.widget.Button;
import android.widget.LinearLayout;

import com.daimajia.androidanimations.library.Techniques;
import com.gzeinnumer.yoyoanimsimple.utils.AnimFunction;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LinearLayout parent = findViewById(R.id.parent);
        Button button = findViewById(R.id.btn);

        parent.setOnClickListener(v -> {
            AnimFunction.animationIn(button);

            new Handler().postDelayed(() -> AnimFunction.animationOut(button), 5000);
        });
    }
}