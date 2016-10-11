package com.example.sanfuproject;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

import fragment.AccountFrag;
import fragment.CartFrag;
import fragment.ClassifyFrag;
import fragment.HomeFrag;

public class MainActivity extends AppCompatActivity {

    private Fragment content;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RadioButton radioButton = (RadioButton) findViewById(R.id.radioButton1);
        setDefault(new HomeFrag(), radioButton);
    }

    private void setDefault(HomeFrag homeFrag, RadioButton radioButton) {
        radioButton.setChecked(true);
        getSupportFragmentManager().beginTransaction().add(R.id.framelayout, homeFrag).commit();
        content = homeFrag;
    }

    public void change(View view) {
        Fragment fragment = new Fragment();
        switch (view.getId()) {
            case R.id.radioButton1:
                fragment = new HomeFrag();
                break;
            case R.id.radioButton2:
                fragment = new ClassifyFrag();
                break;
            case R.id.radioButton3:
                fragment = new CartFrag();
                break;
            case R.id.radioButton4:
                fragment = new AccountFrag();
                break;
        }
        load(fragment);
    }

    private void load(Fragment fragment) {
        if (content != fragment) {
            getSupportFragmentManager().beginTransaction().add(R.id.framelayout, fragment).commit();
            content = fragment;
        }
    }
}
