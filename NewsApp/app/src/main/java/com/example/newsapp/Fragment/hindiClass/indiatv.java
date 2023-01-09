package com.example.newsapp.Fragment.hindiClass;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.example.newsapp.R;

public class indiatv extends AppCompatActivity {
WebView indiatv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_indiatv);
        getSupportActionBar().hide();

        indiatv=findViewById(R.id.webViewIndiatv);

        indiatv.setWebViewClient(new WebViewClient());
        indiatv.loadUrl("https://www.indiatvnews.com/");

        indiatv.setWebChromeClient(new WebChromeClient());

        WebSettings settings=indiatv.getSettings();
        settings.setJavaScriptEnabled(true);


    }

    @Override
    public void onBackPressed() {
        if(indiatv.canGoBack()){
            indiatv.goBack();
        }
        else{
            super.onBackPressed();
        }}

}