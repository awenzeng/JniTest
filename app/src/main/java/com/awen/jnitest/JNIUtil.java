package com.awen.jnitest;

/**
 * Created by AwenZeng on 2017/6/30.
 */

public class JNIUtil {

    private static JNIUtil instance = new JNIUtil();

    public static JNIUtil getInstance() {
        return instance;
    }

    static {
        System.loadLibrary("native-lib");
    }

    public native String initData();
    public native String getStringFromJni();
}
