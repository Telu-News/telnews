package com.psi.telnews;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
/**
 * Created by Yurizaldo on 2/17/2016.
 */
public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
    }

    public void actionBack(View view) {
        Intent backIntent = new Intent(this, LoginActivity.class);
        startActivity(backIntent);
    }
    public void actionRegistered(View view) {
        Intent registerIntent = new Intent(this, LoginActivity.class);
        startActivity(registerIntent);
    }

}

