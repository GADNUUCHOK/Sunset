package com.example.gadnuuk.sunset;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;


public class SunsetActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment(){
        return SunsetFragment.newInstance();
    }
}