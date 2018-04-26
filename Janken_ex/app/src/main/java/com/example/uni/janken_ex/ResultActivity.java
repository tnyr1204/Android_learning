package com.example.uni.janken_ex;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {
    final int JANKEN_GU = 0;
    final int JANKEN_CHOKI = 1;
    final int JANKEN_PAR = 2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        int myHand = 0;
        Intent intent = getIntent();
        int id = intent.getIntExtra("MY_HAND", 0);

        ImageView myHandImageView = (ImageView) findViewById(R.id.my_hand_image);
        switch (id) {
            case R.id.gu:
                myHandImageView.setImageResource(R.drawable.gu);
                myHand = JANKEN_GU;
                break;
            case R.id.choki:
                myHandImageView.setImageResource(R.drawable.choki);
                myHand = JANKEN_CHOKI;
                break;
            case R.id.pa:
                myHandImageView.setImageResource(R.drawable.pa);
                myHand = JANKEN_PAR;
                break;
            default:
                myHand = JANKEN_GU;
                break;
        }

        //コンピュータの手を決める
        int comHand = (int)(Math.random() * 3);
        ImageView comHandImageView = (ImageView) findViewById(R.id.com_hand_image);
        switch (comHand) {
            case JANKEN_GU:
                comHandImageView.setImageResource(R.drawable.com_gu);
                break;
            case JANKEN_CHOKI:
                comHandImageView.setImageResource(R.drawable.com_choki);
                break;
            case JANKEN_PAR:
                comHandImageView.setImageResource(R.drawable.com_pa);
                break;
        }

        //勝敗を決める
        TextView resultLabel = (TextView) findViewById(R.id.result_label);
        int gameResult = (comHand - myHand + 3) % 3;
        switch (gameResult) {
            case 0:
                //あいこの場合
                resultLabel.setText(R.string.result_draw);
                break;
            case 1:
                //勝った場合
                resultLabel.setText(R.string.result_win);
                break;
            case 2:
                //負けた場合
                resultLabel.setText(R.string.result_lose);
                break;
        }
    }

    public void onBackButtonTapped(View view) {
        finish();
    }
}