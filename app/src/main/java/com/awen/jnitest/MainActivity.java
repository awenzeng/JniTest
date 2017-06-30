package com.awen.jnitest;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView tv = (TextView) findViewById(R.id.sample_text);

        tv.setText(JNIUtil.getInstance().getStringFromJni());
        Log.i("笔沫拾光",JNIUtil.getInstance().initData());
        Toast.makeText(this,JNIUtil.getInstance().initData(),Toast.LENGTH_LONG);
    }
}
