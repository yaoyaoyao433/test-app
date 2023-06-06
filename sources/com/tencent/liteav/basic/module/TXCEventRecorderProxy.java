package com.tencent.liteav.basic.module;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class TXCEventRecorderProxy {
    private long a;

    private static native void nativeAddEventMsg(String str, int i, long j, long j2, String str2, int i2);

    private static native void nativeRelease(long j);

    protected void finalize() throws Throwable {
        nativeRelease(this.a);
        this.a = 0L;
        super.finalize();
    }

    public static void a(String str, int i, long j, long j2, String str2, int i2) {
        if (str == null || str2 == null) {
            return;
        }
        nativeAddEventMsg(str, i, j, j2, str2, i2);
    }
}
