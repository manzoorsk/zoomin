package com.example.admin.zoomin;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements Animation.AnimationListener {

    EditText edit_text;
     Animation animationZoomIn,animationZoomOut;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edit_text = (EditText) findViewById(R.id.edit_text);

        animationZoomIn=AnimationUtils.loadAnimation(getApplicationContext(),R.anim.zoom_in);
//        animationZoomOut=AnimationUtils.loadAnimation(getApplicationContext(),R.anim.zoom_out);

        edit_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              edit_text.startAnimation(animationZoomIn);
            }
        });


    }

    @Override
    public void onAnimationStart(Animation animation) {

    }

    @Override
    public void onAnimationEnd(Animation animation) {
        if (animation==animationZoomIn){
            Toast.makeText(getBaseContext(),"",Toast.LENGTH_SHORT).show();
        }
//        else
//        if(animation==animationZoomOut){
//            Toast.makeText(getBaseContext(),"",Toast.LENGTH_SHORT).show();;
//        }

    }

    @Override
    public void onAnimationRepeat(Animation animation) {

    }
}


