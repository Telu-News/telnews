package com.psi.telnews;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

/**
 * Created by Yurizaldo on 2/17/2016.
 */
public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.item, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){

        super.onOptionsItemSelected(item);
        switch (item.getItemId()){
            case R.id.profile:
                Toast.makeText(getBaseContext(),"profil",Toast.LENGTH_SHORT).show();
                break;
            case R.id.about:
                Toast.makeText(getBaseContext(),"profil",Toast.LENGTH_SHORT).show();
                break;
            case R.id.logout:
                Intent l = new Intent(this, LoginActivity.class);
                startActivity(l);
                break;
        }
        return true;
    }

    public void actionPost(View view) {
        Intent postIntent = new Intent(this, PostActivity.class);
        startActivity(postIntent);
    }
}
