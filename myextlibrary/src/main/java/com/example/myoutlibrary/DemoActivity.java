package com.example.myoutlibrary;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;

/**
 * Created by develop on 2020/11/15.
 */

public class DemoActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo);
    }
    public void demo2(View v){
        ARouter.getInstance().build("/demo2/main").navigation();
    }

    public void ext2(View v) {
        ARouter.getInstance().build("/ext2/main").navigation();
    }

}
