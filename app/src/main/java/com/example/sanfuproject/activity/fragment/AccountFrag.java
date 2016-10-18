package com.example.sanfuproject.activity.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.sanfuproject.R;
import com.example.sanfuproject.activity.LoginActivity;

/**
 * Created by Hello on 2016/10/11.
 */

public class AccountFrag extends Fragment {
    View view;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.fragment_account, null);
        init();
        return view;
    }

    private void init() {
        Button bt1 = (Button) view.findViewById(R.id.login);
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(getActivity(), LoginActivity.class);
                startActivity(it);
            }
        });
    }
}
