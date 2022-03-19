package com.example.myparstagram;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;


public class ParseApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        ParseObject.registerSubclass(Post.class);
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("rVTHwVtXUnB0uzMX5g45azmwhM72epdJi8zEYoLt")
                .clientKey("6TGVyuZgroeUNZHvrSum5aWIotK46sb6JqkN2lmC")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }

}
