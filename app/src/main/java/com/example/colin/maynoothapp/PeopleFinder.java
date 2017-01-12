package com.example.colin.maynoothapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class PeopleFinder extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_people_finder);

        WebView people = (WebView) findViewById(R.id.people);
        people.loadUrl("https://www.maynoothuniversity.ie/people");
        people.getSettings().setJavaScriptEnabled(true);
        people.setWebViewClient(new WebViewClient());
    }
}
