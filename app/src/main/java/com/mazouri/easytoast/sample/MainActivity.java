package com.mazouri.easytoast.sample;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Gravity;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.mazouri.easytoast.EasyToast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab_start = (FloatingActionButton) findViewById(R.id.fab_start);
        FloatingActionButton fab_center = (FloatingActionButton) findViewById(R.id.fab_center);
        FloatingActionButton fab_end = (FloatingActionButton) findViewById(R.id.fab_end);
        fab_start.setOnClickListener(this);
        fab_center.setOnClickListener(this);
        fab_end.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.fab_start:
                EasyToast.makeText(MainActivity.this, "这是一条提示语", Toast.LENGTH_SHORT, Gravity.TOP).show();
                break;
            case R.id.fab_center:
                EasyToast.makeText(MainActivity.this, "这是一条提示语", Toast.LENGTH_SHORT, Gravity.CENTER).show();
                break;
            case R.id.fab_end:
                EasyToast.makeText(MainActivity.this, "这是一条提示语,这是一条提示语,这是一条提示语,这是一条提示语", Toast.LENGTH_SHORT).show();
                break;
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

}
