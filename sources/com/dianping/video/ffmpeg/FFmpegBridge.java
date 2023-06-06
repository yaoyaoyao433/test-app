package com.dianping.video.ffmpeg;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class FFmpegBridge {
    private static boolean a = false;

    private static final native int exec(String[] strArr);

    static {
        System.loadLibrary("avutil");
        System.loadLibrary("avcodec");
        System.loadLibrary("swresample");
        System.loadLibrary("avformat");
        System.loadLibrary("swscale");
        System.loadLibrary("avfilter");
        System.loadLibrary("ffmpegtool");
        a = true;
    }
}
