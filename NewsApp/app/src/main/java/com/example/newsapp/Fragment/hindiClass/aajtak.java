package com.example.newsapp.Fragment.hindiClass;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.example.newsapp.R;

public class aajtak extends AppCompatActivity {
WebView aajtak;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getSupportActionBar().hide();
        setContentView(R.layout.activity_aajtak);
        aajtak=findViewById(R.id.webViewAajtak);

        aajtak.setWebViewClient(new WebViewClient());
        aajtak.loadUrl("https://www.aajtak.in/");

        aajtak.setWebChromeClient(new WebChromeClient());

        WebSettings settings=aajtak.getSettings();
        settings.setJavaScriptEnabled(true);


    }

    @Override
    public void onBackPressed() {
        if(aajtak.canGoBack()){
            aajtak.goBack();
        }
        else{
        super.onBackPressed();
    }}
}