package com.ccdt.app.mobiletvclient;

import android.app.Application;
import android.content.Context;

//import com.ccdt.app.mobiletvclient.injection.component.ApplicationComponent;
//import com.ccdt.app.mobiletvclient.injection.component.DaggerApplicationComponent;
//import com.ccdt.app.mobiletvclient.injection.module.ApplicationModule;

public class MyApplication extends Application {

//    ApplicationComponent mApplicationComponent;

    @Override
    public void onCreate() {
        super.onCreate();

//        if (BuildConfig.DEBUG) {
//            Timber.plant(new Timber.DebugTree());
//            Fabric.with(this, new Crashlytics());
//        }
    }

    public static MyApplication get(Context context) {
        return (MyApplication) context.getApplicationContext();
    }

//    public ApplicationComponent getComponent() {
//        if (mApplicationComponent == null) {
//            mApplicationComponent = DaggerApplicationComponent.builder()
//                    .applicationModule(new ApplicationModule(this))
//                    .build();
//        }
//        return mApplicationComponent;
//    }

    // Needed to replace the component with a test specific one
//    public void setComponent(ApplicationComponent applicationComponent) {
//        mApplicationComponent = applicationComponent;
//    }
}