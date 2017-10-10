package com.example.xiaoheihei;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;

public class FristActivity extends AppCompatActivity {
     private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.frist_activity);
       final Animation animation =  AnimationUtils.loadAnimation(this,R.anim.scaletest);
        animation.setInterpolator(new AccelerateDecelerateInterpolator());
        button = (Button) findViewById(R.id.butonid);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                button.startAnimation(animation);

            }
        });
    }
}
