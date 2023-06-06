package com.tencent.liteav.basic.module;

import android.content.Context;
import com.tencent.liteav.basic.log.TXCLog;
import java.io.File;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class TXCKeyPointReportProxy {

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public static class a {
        public int a;
        public int b;
        public int c;
        public int d;
        public String e;
        public String f;
        public String g;
        public String h;
    }

    private static native void nativeInit(String str);

    private static native void nativeSendCacheReport();

    private static native void nativeSetBasicInfo(int i, int i2);

    private static native void nativeSetCpu(int i, int i2);

    private static native void nativeSetDeviceInfo(int i, int i2, int i3, int i4, String str, String str2, String str3, String str4);

    private static native void nativeSetErrorCode(int i);

    private static native void nativeSetLocalQuality(int i, int i2, int i3);

    private static native void nativeTagKeyPointAudio(String str, int i);

    private static native void nativeTagKeyPointEnd(int i, int i2);

    private static native void nativeTagKeyPointStart(int i);

    private static native void nativeTagKeyPointVideo(String str, int i);

    private static native void nativesetRemoteQuality(String str, int i, long j, int i2);

    public static void a(Context context) {
        File externalFilesDir;
        if (context == null || (externalFilesDir = context.getApplicationContext().getExternalFilesDir(null)) == null) {
            return;
        }
        String str = externalFilesDir.getAbsolutePath() + "/txrtmp/ssoreport.txt";
        File file = new File(str);
        if (!file.exists()) {
            try {
                if (!file.mkdirs()) {
                    TXCLog.e("TXCKeyPointReportProxy", "can not create sso file path");
                    return;
                }
            } catch (Exception e) {
                TXCLog.e("TXCKeyPointReportProxy", "create sso file exception:" + e.toString());
            }
        }
        nativeInit(str);
    }

    public static void a() {
        nativeSendCacheReport();
    }

    public static void a(a aVar) {
        nativeSetDeviceInfo(aVar.a, aVar.b, aVar.c, aVar.d, aVar.e, aVar.f, aVar.g, aVar.h);
    }

    public static void a(int i, int i2) {
        nativeSetCpu(i, i2);
    }

    public static void a(int i) {
        nativeTagKeyPointStart(i);
    }

    public static void b(int i, int i2) {
        nativeTagKeyPointEnd(i, i2);
    }

    public static void a(String str, int i) {
        nativeTagKeyPointVideo(str, i);
    }

    public static void b(String str, int i) {
        nativeTagKeyPointAudio(str, i);
    }

    public static void a(String str, int i, long j, int i2) {
        nativesetRemoteQuality(str, i, j, i2);
    }

    public static void a(int i, int i2, int i3) {
        nativeSetLocalQuality(i, i2, i3);
    }

    public static void c(int i, int i2) {
        nativeSetBasicInfo(i, i2);
    }

    public static void b(int i) {
        nativeSetErrorCode(i);
    }
}
