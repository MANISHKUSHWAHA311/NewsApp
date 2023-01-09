package com.example.newsapp.Fragment.hindiClass;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.example.newsapp.R;

public class zeenews extends AppCompatActivity {
WebView zeenews;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zeenews);
        getSupportActionBar().hide();


        zeenews=findViewById(R.id.webViewZeenews);

        zeenews.setWebViewClient(new WebViewClient());
        zeenews.loadUrl("https://zeenews.india.com/");

        zeenews.setWebChromeClient(new WebChromeClient());

        WebSettings settings=zeenews.getSettings();
        settings.setJavaScriptEnabled(true);


    }

    @Override
    public void onBackPressed() {
        if(zeenews.canGoBack()){
            zeenews.goBack();
        }
        else{
            super.onBackPressed();
        }}
}