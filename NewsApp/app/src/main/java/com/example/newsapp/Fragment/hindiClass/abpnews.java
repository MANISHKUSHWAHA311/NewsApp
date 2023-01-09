package com.example.newsapp.Fragment.hindiClass;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.example.newsapp.R;

public class abpnews extends AppCompatActivity {
WebView abpnews;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_abpnews);


        abpnews=findViewById(R.id.webViewAbpnews);

        abpnews.setWebViewClient(new WebViewClient());
        abpnews.loadUrl("https://www.abplive.com/");

        abpnews.setWebChromeClient(new WebChromeClient());

        WebSettings settings=abpnews.getSettings();
        settings.setJavaScriptEnabled(true);


    }

    @Override
    public void onBackPressed() {
        if(abpnews.canGoBack()){
            abpnews.goBack();
        }
        else{
            super.onBackPressed();
        }}
}