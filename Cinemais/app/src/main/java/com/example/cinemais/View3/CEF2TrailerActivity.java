package com.example.cinemais.View3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.example.cinemais.R;

public class CEF2TrailerActivity extends AppCompatActivity {

    WebView wv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cef2_trailer);
        wv = (WebView) findViewById(R.id.wvce2);
        WebSettings ws = wv.getSettings();
        ws.setJavaScriptEnabled(true);
        ws.setSupportZoom(false);
        wv.loadUrl("https://www.youtube.com/watch?v=KvSlvtPnZTo");
    }
}
