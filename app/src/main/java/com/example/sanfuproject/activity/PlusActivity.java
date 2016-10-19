package com.example.sanfuproject.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.example.sanfuproject.R;

public class PlusActivity extends AppCompatActivity {

    /**
     * 时尚优选WebView
     *
     * @param savedInstanceState
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plus);
        init();
    }

    private void init() {
        Intent intent = getIntent();
        String path = intent.getStringExtra("path");
        WebView webView = (WebView) findViewById(R.id.webView);
        webView.setWebViewClient(new WebViewClient());
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl(path);
    }
}
