package com.meituan.android.common.unionid.oneid.util;

import com.meituan.robust.ChangeQuickRedirect;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class CoreUtils {
    public static ChangeQuickRedirect changeQuickRedirect;

    public static native String getCtime(String str);

    public static native String getProp(String str);

    public static native String statFile(String str);

    static {
        try {
            System.loadLibrary("unionid");
        } catch (Throwable unused) {
        }
    }
}
