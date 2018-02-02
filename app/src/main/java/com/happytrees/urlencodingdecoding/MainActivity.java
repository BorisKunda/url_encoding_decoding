package com.happytrees.urlencodingdecoding;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

public class MainActivity extends AppCompatActivity {


    String url = "https://maps.googleapis.com/maps/api/place/textsearch/json?query=pizza%20in%20jerusaelm&key=AIzaSyDo6e7ZL0HqkwaKN-GwKgqZnW03FhJNivQ";
    String decodedUrl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //URL DECODING ->  decoding is the opposite process of encoding . removing symbols like : "%20", " + "  for bringing String to its original form
        try {
            decodedUrl = java.net.URLDecoder.decode(url, "UTF-8");
            Log.d("DECODED URL", decodedUrl);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

        //URL ENCODING -> url encoding converts characters into a format that can be transmitted over the internet(adds symbols like : "%20", " + " )
        try {
            String encodedUrl =   URLEncoder.encode(decodedUrl, "UTF-8");
            Log.d("ENCODED URL",encodedUrl);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

    }
}
//url encoding -> URL encoding converts characters into a format that can be transmitted over the Internet.
//decode -> раскодировать
//encode -> шифровать
//  URL -->  https://maps.googleapis.com/maps/api/place/textsearch/json?query=pizza%20in%20jerusaelm&key=AIzaSyDo6e7ZL0HqkwaKN-GwKgqZnW03FhJNivQ

