package com.gzeinnumer.yoyoanimationsimple;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.os.Handler;
import android.widget.Button;

import com.gzeinnumer.yoyoanimsimple.utils.AnimFunction;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ConstraintLayout parent = findViewById(R.id.parent);
        Button button = findViewById(R.id.btn);

        parent.setOnClickListener(v -> {
            AnimFunction.animationIn(button);

            new Handler().postDelayed(() -> AnimFunction.animationOut(button), 5000);
        });
    }
}