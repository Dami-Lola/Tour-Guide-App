package com.example.damio.imaginarycityguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.damio.imaginarycityguide.fragments.MotherFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MotherFragment motherFragment = new MotherFragment();
        getSupportActionBar().setElevation(0.0f);
        ActivityUtils.addFragmentToActivity(getSupportFragmentManager(), motherFragment, R.id.contentFrame);
    }
}
