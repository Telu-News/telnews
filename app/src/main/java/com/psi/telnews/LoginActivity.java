package com.psi.telnews;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Html;
import android.view.View;
import android.widget.TextView;
/**
 * Created by Yurizaldo on 2/17/2016.
 */
public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void actionLogin(View view) {
        Intent dashboardIntent = new Intent(this, MainActivity.class);
        startActivity(dashboardIntent);
    }

    /**
     * Test Commit
     * @param view
     */
    public void actionRegister(View view) {
        Intent registerIntent = new Intent(this, RegisterActivity.class);
        startActivity(registerIntent);
    }
}

