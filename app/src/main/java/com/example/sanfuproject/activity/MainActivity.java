package com.example.sanfuproject.activity;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.View;
import android.widget.RadioButton;

import com.example.sanfuproject.R;

import fragment.AccountFrag;
import fragment.CartFrag;
import fragment.ClassifyFrag;
import fragment.HomeFrag;
import fragment.LeftFrag;
import fragment.RightFrag;

import static com.example.sanfuproject.activity.utils.Constants.drawerLayout;

public class MainActivity extends AppCompatActivity {

    private Fragment content;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initDrawerLayout();
        RadioButton radioButton = (RadioButton) findViewById(R.id.radioButton1);
        setDefault(new HomeFrag(), radioButton);
    }

    private void initDrawerLayout() {
        drawerLayout = (DrawerLayout) findViewById(R.id.drawerlayout);
        drawerLayout.setDrawerLockMode(DrawerLayout.LOCK_MODE_LOCKED_CLOSED, Gravity.LEFT);
        drawerLayout.setDrawerLockMode(DrawerLayout.LOCK_MODE_LOCKED_CLOSED, Gravity.RIGHT);
        drawerLayout.setDrawerListener(new DrawerLayout.DrawerListener() {
            @Override
            public void onDrawerSlide(View drawerView, float slideOffset) {

            }

            @Override
            public void onDrawerOpened(View drawerView) {
            }

            @Override
            public void onDrawerClosed(View drawerView) {
                drawerLayout.setDrawerLockMode(DrawerLayout.LOCK_MODE_LOCKED_CLOSED, Gravity.LEFT);
                drawerLayout.setDrawerLockMode(DrawerLayout.LOCK_MODE_LOCKED_CLOSED, Gravity.RIGHT);
            }

            @Override
            public void onDrawerStateChanged(int newState) {

            }
        });
        getSupportFragmentManager().beginTransaction().replace(R.id.left_frame, new LeftFrag()).commit();
        getSupportFragmentManager().beginTransaction().replace(R.id.right_frame, new RightFrag()).commit();
    }

    private void setDefault(HomeFrag homeFrag, RadioButton radioButton) {
        radioButton.setChecked(true);
        getSupportFragmentManager().beginTransaction().add(R.id.framelayout, homeFrag).commit();
        content = homeFrag;
    }

    public void change(View view) {
        Fragment fragment = null;
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
            getSupportFragmentManager().beginTransaction().replace(R.id.framelayout, fragment).commit();
            content = fragment;
        }
    }
}
