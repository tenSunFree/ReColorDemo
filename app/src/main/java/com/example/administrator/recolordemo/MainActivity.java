package com.example.administrator.recolordemo;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.administrator.recolordemo.custom.CustomDynamicImageView;
import com.simmorsal.recolor_project.ReColor;

public class MainActivity extends AppCompatActivity {

    Context context;
    CardView nextCardView;
    TextView titleTextView;
    CustomDynamicImageView foodPictureCustomDynamicImageView;
    LinearLayout rootViewLinearLayout;
    TextView nextStringTextView;

    int jumpToWhichOne;                                                                             // 區分 點擊右下角按鈕時, 觸發的事件

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        context = this;
        nextCardView = findViewById(R.id.nextCardView);
        titleTextView = findViewById(R.id.titleTextView);
        foodPictureCustomDynamicImageView = findViewById(R.id.foodPictureCustomDynamicImageView);
        rootViewLinearLayout = findViewById(R.id.rootViewLinearLayout);
        nextStringTextView = findViewById(R.id.nextStringTextView);

        jumpToWhichOne = 1;

        new ReColor(context).setViewBackgroundColor(nextCardView, "e6eff3", "8f4f06", 750);

        onClicks();
    }

    /** 右下角按鈕的點擊事件 */
    private void onClicks() {

        nextCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (jumpToWhichOne) {

                    case 1:
                        nextCardView.setClickable(false);

                        new Handler().postDelayed(new Runnable() {
                            public void run() {
                                nextCardView.setClickable(true);
                            }
                        }, 1100);

                        new Handler().postDelayed(new Runnable() {
                            public void run() {
                                titleTextView.setText("西班牙 - 鮮蝦");
                                foodPictureCustomDynamicImageView.setImageResource(R.drawable.fresh_shrimp);
                            }
                        }, 1000);

                        new ReColor(context).setViewBackgroundColor(nextCardView, "8f4f06", "73c0f4", 1000);
                        new ReColor(context).setTextViewColor(titleTextView, "e6eff3", "728ca3", 1000);
                        new ReColor(context).setViewBackgroundColor(rootViewLinearLayout, "73c0f4", "f3e4c6", 1000);

                        jumpToWhichOne++;

                        break;

                    case 2:
                        nextCardView.setClickable(false);

                        new Handler().postDelayed(new Runnable() {
                            public void run() {
                                nextCardView.setClickable(true);
                            }
                        }, 1100);

                        new Handler().postDelayed(new Runnable() {
                            public void run() {
                                titleTextView.setText("義大利 - 炸飯糰");
                                foodPictureCustomDynamicImageView.setImageResource(R.drawable.fried_rice_ball);
                            }
                        }, 1000);

                        new ReColor(context).setViewBackgroundColor(nextCardView, "73c0f4", "8f4f06", 1000);
                        new ReColor(context).setTextViewColor(titleTextView, "728ca3", "73c0f4", 1000);
                        new ReColor(context).setViewBackgroundColor(rootViewLinearLayout, "f3e4c6", "728ca3", 1000);

                        jumpToWhichOne++;

                        break;

                    case 3:

                        nextCardView.setClickable(false);

                        new Handler().postDelayed(new Runnable() {
                            public void run() {
                                titleTextView.setText("美國 - 鮮魚塔可餅");
                                foodPictureCustomDynamicImageView.setImageResource(R.drawable.fresh_fish_tower_cake);
                                nextStringTextView.setText("End");
                            }
                        }, 1000);

                        new ReColor(context).setViewBackgroundColor(nextCardView, "8f4f06", "728ca3", 1000);
                        new ReColor(context).setTextViewColor(titleTextView, "73c0f4", "f3e4c6", 1000);
                        new ReColor(context).setViewBackgroundColor(rootViewLinearLayout, "728ca3", "8f4f06", 1000);

                        jumpToWhichOne++;

                        break;
                }
            }
        });
    }
}
