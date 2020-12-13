package com.example.myoutlibrary;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

/**
 * Created by develop on 2020/11/15.
 */

public class MyTools {
    /**
     * 不带参数日志打印
     */
    public static void testLib(){
        Log.d("tool","---MyTools   testLib()---");
    }

    /**
     * 带参数日志打印
     * @param msg
     */
    public static void libLog(String msg){
        Log.d("tool",msg);
    }

    /**
     * 一个弹窗的方法
     * @param context
     * @param msg
     */
    public static void libToast(Context context, String msg){
        //在这里弹出消息
        Toast.makeText(context,msg,Toast.LENGTH_SHORT).show();
    }
    public static void toOneActivity(Context context){
        context.startActivity(new Intent(context,DemoActivity.class));
    }
}
