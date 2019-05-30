package com.example.targilaharon;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Main2Activity extends AppCompatActivity {
        Double x1,x2,x3;
        WebView wv;
        String url;
    Intent out1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        wv=(WebView)findViewById(R.id.wv);
        wv.getSettings().setJavaScriptEnabled(true);
        wv.setWebViewClient(new MyWebViewClient());

        out1 =  getIntent();
        x1=out1.getDoubleExtra("n",0);
        x2=out1.getDoubleExtra("nn",0);
        x3=out1.getDoubleExtra("nnn",0);
        url = "https://www.google.co.il/search?q="+x1+"x%5E2%2B"+x2+"x%2B"+x3;
        wv.loadUrl(url);

    }
    private class MyWebViewClient extends WebViewClient{
        @Override
        public boolean shouldOverrideUrlLoading(WebView view,String url){
            view.loadUrl(url);
            return true;
        }
    }



    public void back(View view) {
        out1.putExtra("n",x1);
        out1.putExtra("nn",x2);
        out1.putExtra("nnn",x3);
        setResult(RESULT_OK,out1);
        finish();
    }
}
