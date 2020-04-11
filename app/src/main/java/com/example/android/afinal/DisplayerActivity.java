package com.example.android.afinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class DisplayerActivity extends AppCompatActivity {

    private String displayTutorial="";

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_web);

            Intent receiveIntent = getIntent();
            displayTutorial = receiveIntent.getStringExtra("LINK");
            setTitle("Tutorial");

            WebView webView = (WebView)findViewById(R.id.wv_webView);
            webView.setWebViewClient(new WebViewClient() {
                @Override
                public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
                    if (request.getUrl().toString().startsWith("tel:")) {
                        Intent intent = new Intent(Intent.ACTION_DIAL, request.getUrl());
                        view.getContext().startActivity(intent);
                    }
                    return super.shouldOverrideUrlLoading(view, request);
                }
            });
            webView.loadUrl(displayTutorial);
        }
    }
