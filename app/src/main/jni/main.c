/* DO NOT EDIT THIS FILE - it is machine generated */
#include "com_awen_jnitest_JNIUtil.h"

/*
 * Class:     com_awen_jnitest_JNIUtil
 * Method:    initData
 * Signature: ()Ljava/lang/String;
 */
JNIEXPORT jstring JNICALL Java_com_awen_jnitest_JNIUtil_initData(JNIEnv *env, jobject jObj){
    return (*env)->NewStringUTF(env, "有梦为马，随处可栖。");
}
/*
 * Class:     com_awen_jnitest_JNIUtil
 * Method:    getStringFromJni
 * Signature: ()Ljava/lang/String;
 */
JNIEXPORT jstring JNICALL Java_com_awen_jnitest_JNIUtil_getStringFromJni
        (JNIEnv *env, jobject jObj){
    return (*env)->NewStringUTF(env, "笔沫拾光\nhttp://awenzeng.me/");
}