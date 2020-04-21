package com.example.myfirstapp;

import android.os.Build;
import android.os.Environment;
import android.util.Log;
import android.webkit.*;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class WebViewActivity extends AppCompatActivity {

    private WebView myWebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_webview);
        myWebView = findViewById(R.id.webViewCont);

        if (Build.VERSION.SDK_INT > Build.VERSION_CODES.KITKAT) {
            myWebView.setWebContentsDebuggingEnabled(true);
        }

//        myWebView.loadUrl("file:///android_asset/dist/index.html");
        myWebView.loadUrl("file:///android_asset/index.html");
//        myWebView.loadUrl("http://www.baidu.com/");
        myWebView.setWebViewClient(new WebViewClient(){
            @Override
            public void onReceivedError(WebView view, int errorCode, String description, String failingUrl) {
                super.onReceivedError(view, errorCode, description, failingUrl);
                Log.e("WebViewActivity","webview-》onReceivedError : 加载了url：" + failingUrl + " - 错误描述：" + description+ " - 错误代码：" + errorCode);
                view.loadUrl("file:///android_asset/index.html");
            }

            @Override
            public void onReceivedError(WebView view, WebResourceRequest request, WebResourceError error) {
                super.onReceivedError(view, request, error);
                Log.e("WebViewActivity","webview-》onReceivedError (android6.0以上调用) : 加载了url：" + request.getUrl().toString() + " - 错误描述：" + error.getDescription()+ " - 错误代码：" + error.getErrorCode());
            }

        });
        WebSettings webSettings = myWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webSettings.setDomStorageEnabled(true);

    }
}
