package com.example.abhijit.erhs_android;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;


public class signin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        //fullscreen
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_signin);

        //gradient animation
        ConstraintLayout constraintLayout = findViewById(R.id.signin);
        AnimationDrawable animationDrawable = (AnimationDrawable) constraintLayout.getBackground();
        animationDrawable.setEnterFadeDuration(2000);
        animationDrawable.setExitFadeDuration(4000);
        animationDrawable.start();

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signin);
        setForgotpassword();







    }
    public Button forgotpassword;

    public void setForgotpassword(){
        forgotpassword= (Button)findViewById(R.id.forgotpassword);
        forgotpassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent toy = new Intent(signin.this,resetPassword.class);
                startActivity(toy);
            }
        });
    }

    public void resetUsername(View view) {
        Intent intent = new Intent(this, resetUsername.class);
        startActivity(intent);

    }
}


