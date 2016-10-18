package com.example.sanfuproject.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.example.sanfuproject.R;

/**
 *
 * 侧滑栏形象学堂WebView
 */
public class ClassRoomActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_class_room);
        init();
    }

    private void init() {
        String path = "http://m.sanfu.com/goods/bestlist.htm?ajax=3";
        WebView webView = (WebView) findViewById(R.id.webView);
        webView.setWebViewClient(new WebViewClient());
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl(path);
    }
}
