package com.example.luozenglin.calculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.example.luozenglin.Menu.Jinzhizhuanhuan;
import com.example.luozenglin.Menu.help_page;
import com.example.luozenglin.service.StandardCalculator;

public class MainActivity extends AppCompatActivity {
    Menu menu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calculator_standard_layout);
        StandardCalculator standard = new StandardCalculator(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Intent intent = new Intent();
        switch (item.getItemId()) {
            case R.id.add_zhuanhuan:
                intent.setClass(this, Jinzhizhuanhuan.class);
                break;

            case R.id.add_help:
                intent.setClass(this, help_page.class);
                break;
        }

        startActivity(intent);
        return true;
    }
}
