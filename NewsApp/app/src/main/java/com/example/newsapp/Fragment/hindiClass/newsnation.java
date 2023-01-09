package com.example.newsapp.Fragment.hindiClass;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.example.newsapp.R;

public class newsnation extends AppCompatActivity {
    WebView newsnation;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_newsnation);
        newsnation=findViewById(R.id.webViewnewsnation);
        getSupportActionBar().hide();

        newsnation.setWebViewClient(new WebViewClient());
        newsnation.loadUrl("https://www.newsnationtv.com/");

        newsnation.setWebChromeClient(new WebChromeClient());

        WebSettings settings=newsnation.getSettings();
        settings.setJavaScriptEnabled(true);


    }

    @Override
    public void onBackPressed() {
        if(newsnation.canGoBack()){
            newsnation.goBack();
        }
        else{
            super.onBackPressed();
        }}
}