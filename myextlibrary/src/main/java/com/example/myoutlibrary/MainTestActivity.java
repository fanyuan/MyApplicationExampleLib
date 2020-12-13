package com.example.myoutlibrary;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.alibaba.android.arouter.facade.annotation.Route;

@Route(path = "/ext/main")
public class MainTestActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_test);
        MyTools.libToast(this,"MainTestActivity");
    }
    public void demo(View v){
        startActivity(new Intent(this,DemoActivity.class));
    }
}
