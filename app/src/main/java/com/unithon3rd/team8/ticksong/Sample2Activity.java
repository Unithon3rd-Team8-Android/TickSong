package com.unithon3rd.team8.ticksong;

/**
 * Created by Daesub Kim on 2016-07-30.
 */
import com.dd.CircularProgressButton;

import android.animation.ValueAnimator;
import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Integer Progress Sample
 */
public class Sample2Activity extends AppCompatActivity {

    @Bind(R.id.circularButton1)
    CircularProgressButton circularButton1;

    @Bind(R.id.circularButton2)
    CircularProgressButton circularButton2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ac_sample_2);

        ButterKnife.bind(this);

        ActionBar actionBar = getActionBar();
        if(actionBar != null) {
            actionBar.setTitle("no title");
        }
    }

    @OnClick(R.id.circularButton1)
    void onBtn1Click() {
        if (circularButton1.getProgress() == 0) {
            simulateSuccessProgress(circularButton1);
        } else {
            circularButton1.setProgress(0);
        }
    }

    @OnClick(R.id.circularButton2)
    void onBtn2Click() {
        if (circularButton2.getProgress() == 0) {
            simulateErrorProgress(circularButton2);
        } else {
            circularButton2.setProgress(0);
        }
    }

    private void simulateSuccessProgress(final CircularProgressButton button) {
        ValueAnimator widthAnimation = ValueAnimator.ofInt(1, 100);
        widthAnimation.setDuration(1000);
        widthAnimation.setInterpolator(new AccelerateDecelerateInterpolator());
        widthAnimation.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public void onAnimationUpdate(ValueAnimator animation) {
                Integer value = (Integer) animation.getAnimatedValue();
                button.setProgress(value);
            }
        });
        widthAnimation.start();
    }

    private void simulateErrorProgress(final CircularProgressButton button) {
        ValueAnimator widthAnimation = ValueAnimator.ofInt(1, 99);
        widthAnimation.setDuration(1000);
        widthAnimation.setInterpolator(new AccelerateDecelerateInterpolator());
        widthAnimation.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public void onAnimationUpdate(ValueAnimator animation) {
                Integer value = (Integer) animation.getAnimatedValue();
                button.setProgress(value);
                if (value == 99) {
                    button.setProgress(-1);
                }
            }
        });
        widthAnimation.start();
    }
}