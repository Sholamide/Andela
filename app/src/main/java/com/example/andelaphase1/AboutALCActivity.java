package com.example.andelaphase1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.webkit.SslErrorHandler;
import android.net.http.SslError;

public class AboutALCActivity extends AppCompatActivity {

    WebView andelaEngine;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_alc);



        andelaEngine = findViewById(R.id.webview_andela);
        andelaEngine.loadUrl("https://andela.com/alc/");

        andelaEngine.setWebViewClient(new WebViewClient(){

            @Override
            public void onReceivedSslError(WebView view, SslErrorHandler handler, SslError error) {
                handler.proceed();
                //super.onReceivedSslError(view, handler, error);
            }
        });
    }
}
