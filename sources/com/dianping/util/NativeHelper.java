package com.dianping.util;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class NativeHelper {
    public static final boolean a;

    private static native boolean a();

    public static native boolean nd(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4);

    public static native byte[] ndug(byte[] bArr, byte[] bArr2, byte[] bArr3);

    public static native boolean ne(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4);

    public static native byte[] nug(byte[] bArr);

    static {
        boolean z;
        try {
            if (!g.a("nh", NativeHelper.class)) {
                System.loadLibrary("nh");
            }
            z = a();
        } catch (Throwable unused) {
            h.a("failed to load native helper");
            z = false;
        }
        a = z;
    }
}
