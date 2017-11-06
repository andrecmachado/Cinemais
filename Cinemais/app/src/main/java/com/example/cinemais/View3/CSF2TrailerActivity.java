package com.example.cinemais.View3;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.example.cinemais.R;

public class CSF2TrailerActivity extends Activity {

    WebView wv;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_csf2_trailer);
        wv = (WebView) findViewById(R.id.wvcs2);
        WebSettings ws = wv.getSettings();
        ws.setJavaScriptEnabled(true);
        ws.setSupportZoom(false);
        wv.loadUrl("https://www.youtube.com/watch?v=bldAkEUANWA");
    }
}
