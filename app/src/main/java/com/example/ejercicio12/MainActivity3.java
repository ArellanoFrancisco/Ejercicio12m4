package com.example.ejercicio12;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.example.ejercicio12.databinding.ActivityMain3Binding;


public class MainActivity3 extends AppCompatActivity  {

    private ActivityMain3Binding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMain3Binding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        WebView myWebView = binding.Web1;
        WebSettings webSettings = myWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        myWebView.setWebViewClient(new WebViewClient());
        myWebView.loadUrl("https://goo.gl/maps/JGGtoBco81vEJRnu7");

    }
}