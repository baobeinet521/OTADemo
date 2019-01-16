package com.zd.otademo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.zd.otademo.download.DownLoadManagerSingleton;
import com.zd.otademo.download.DownLoadManagerSingleton2;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private Button mDownLoadApk;
    private DownLoadManagerSingleton2 mDownLoadManagerSingleton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mDownLoadApk = findViewById(R.id.downLoadApk);
        mDownLoadApk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("downLoad","点击mDownLoadApk btn");
                mDownLoadManagerSingleton = DownLoadManagerSingleton2.getSingleton();
                mDownLoadManagerSingleton.downLoadPackage(MainActivity.this);
            }
        });


    }
}
