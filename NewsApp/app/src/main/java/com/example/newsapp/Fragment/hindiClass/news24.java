package com.example.newsapp.Fragment.hindiClass;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.example.newsapp.R;

public class news24 extends AppCompatActivity {
    WebView news24;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news24);
        news24=findViewById(R.id.webViewnews24);
        getSupportActionBar().hide();

        news24.setWebViewClient(new WebViewClient());
        news24.loadUrl("https://news24online.com/");

        news24.setWebChromeClient(new WebChromeClient());

        WebSettings settings=news24.getSettings();
        settings.setJavaScriptEnabled(true);


    }

    @Override
    public void onBackPressed() {
        if(news24.canGoBack()){
            news24.goBack();
        }
        else{
            super.onBackPressed();
        }}
}