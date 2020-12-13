package com.example.myoutlibrary;

import android.app.Application;
import android.content.Context;

//import com.alibaba.android.arouter.launcher.ARouter;

/**
 * Created by develop on 2020/11/15.
 */

public class MyApplication extends Application {
    //是否开启调试
    private static boolean isDebug =true;
    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        MyTools.libLog("MyApplication --- attachBaseContext");
    }

    @Override
    public void onCreate() {
        super.onCreate();
        MyTools.libLog("MyApplication --- onCreate");
        //必须在初始化之前写入这两行
//        if (isDebug) {
//            //打印日志
//            ARouter.openLog();
//            //开始调试
//            ARouter.openDebug();
//        }
//        //ARouter的实例化
//        ARouter.init(this);
    }
}
