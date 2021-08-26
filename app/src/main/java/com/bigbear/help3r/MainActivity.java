package com.bigbear.help3r;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    WebView webView;
    String url = "https://www.help3r.com";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        initialize();
    }

    private void initialize() {
        webView = findViewById(R.id.webView);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl(url);

        //Set webView element as our browser or WebViewClient,
        //so web pages will be display in same layout instead of a browser
        webView.setWebViewClient(new WebViewClient());
    }
}