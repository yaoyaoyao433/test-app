package com.meituan.android.privacy.interfaces;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class ab {
    private static boolean a = false;
    private static h b;

    public static synchronized void a(h hVar) {
        synchronized (ab.class) {
            if (a) {
                return;
            }
            a = true;
            b = hVar;
        }
    }

    public static h a() {
        return b;
    }
}
