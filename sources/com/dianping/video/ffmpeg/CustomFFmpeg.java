package com.dianping.video.ffmpeg;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class CustomFFmpeg {
    private native int transVideo(String str, double d, double d2);

    public native String test();

    static {
        System.loadLibrary("avutil");
        System.loadLibrary("avcodec");
        System.loadLibrary("swresample");
        System.loadLibrary("avformat");
        System.loadLibrary("swscale");
        System.loadLibrary("avfilter");
        System.loadLibrary("ffmpegtool");
    }
}
