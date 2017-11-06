package com.example.cinemais.View3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.example.cinemais.R;

public class CMF1TrailerActivity extends AppCompatActivity {

    WebView wv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cmf1_trailer);
        wv = (WebView) findViewById(R.id.wvcm1);
        WebSettings ws = wv.getSettings();
        ws.setJavaScriptEnabled(true);
        ws.setSupportZoom(false);
        wv.loadUrl("https://www.youtube.com/watch?v=twSgIOPEqzM");
    }
}
