package com.revivalx.androidparsetodolist;

import android.app.Application;

/**
 * Created by Bradley on 11/8/2015.
 */
public class App extends Application {

    @Override public void onCreate() {
        super.onCreate();

        Parse.initialize(this, i6GUNc7HMdxLuA0vb7ewXaSFTHPApMXAWxVljy03, OwjEgnk0ypk7Ddm9byCSm8p2uKp6fyW4jcERBJd6);
    }
}
