package com.facebook.react.bridge;

import com.facebook.proguard.annotations.DoNotStrip;
import java.io.File;
/* compiled from: ProGuard */
@DoNotStrip
/* loaded from: classes.dex */
public class JSCodeCacheCreator {
    private static native void jniCreateCodeCacheFromDioFile(String str, String str2, String str3, String str4);

    private static native void jniCreateCodeCacheFromFile(String str, String str2, String str3);

    public static boolean createCodeCacheFromDioFile(String str, String str2, String str3, String str4) {
        File file = new File(str4);
        file.getParentFile().mkdirs();
        jniCreateCodeCacheFromDioFile(str, str2, str3, str4);
        return file.exists();
    }

    public static boolean createCodeCacheFromFile(String str, String str2, String str3) {
        File file = new File(str3);
        file.getParentFile().mkdirs();
        jniCreateCodeCacheFromFile(str, str2, str3);
        return file.exists();
    }
}
