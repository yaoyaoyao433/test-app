package com.speech.vadsdk.nativelib;

import android.util.Log;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class b {
    private static final VadNative a = new VadNative();
    private static c b;
    private static d c;

    public static c a(String str, byte[] bArr, int i) {
        if (b == null) {
            long nativeInitFrontEnd = a.nativeInitFrontEnd(bArr, i);
            com.speech.vadsdk.log.a.a(str, "", (int) nativeInitFrontEnd, "vad engine init completed");
            if (nativeInitFrontEnd < 0) {
                Log.e("NativeManager", "Init vad engine error!code=" + nativeInitFrontEnd);
                return null;
            }
            b = new c(nativeInitFrontEnd, a);
        }
        return b;
    }

    public static c a() {
        return b;
    }

    public static boolean b() {
        return b != null;
    }

    public static d b(String str, byte[] bArr, int i) {
        if (c == null) {
            int nativeInitWakeUp = a.nativeInitWakeUp(bArr, i);
            com.speech.vadsdk.log.b.a(str, "", nativeInitWakeUp, "wakeup engine init completed");
            if (nativeInitWakeUp < 0) {
                Log.e("NativeManager", "Init wake up engine error!，ret = " + nativeInitWakeUp);
                return null;
            }
            c = new d(a);
        }
        return c;
    }

    public static d c() {
        return c;
    }

    public static void a(a aVar) {
        a.setWakeUpListener(aVar);
    }
}
