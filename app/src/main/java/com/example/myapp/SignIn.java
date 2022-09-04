package com.example.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;

import com.airbnb.lottie.LottieAnimationView;

public class SignIn extends AppCompatActivity {

    LottieAnimationView sign_in_anim;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_sign_in);

        sign_in_anim = findViewById(R.id.sign_in_animation);
        //sign_in_anim.animate().translationY(-1600).setDuration(1000).setStartDelay(4000);

        /*new Handler().postDelayed(new Runnable(){
            @Override
            public void run(){
                Intent i = new Intent(getApplicationContext(),SignIn.class);
                startActivity(i);
                finish();
            }
        },5000);*/
       new Handler().postDelayed(new Runnable(){
            @Override
            public void run(){
                Intent i = new Intent(getApplicationContext(),Night_light.class);
                startActivity(i);
                finish();
            }
        },5000);
    }
}