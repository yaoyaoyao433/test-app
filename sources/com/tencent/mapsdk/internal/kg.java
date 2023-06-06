package com.tencent.mapsdk.internal;

import android.content.Context;
import android.util.Log;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class kg {
    static final String[] a = {sd.a, "txnavengine"};
    private static final String b = "LibraryLoader";

    private static void a(Context context) {
        for (String str : a) {
            a(context, str);
        }
    }

    public static void a(Context context, String str) {
        try {
            System.loadLibrary(str);
            if (Log.isLoggable(b, 4)) {
                StringBuilder sb = new StringBuilder("loadLibary:");
                sb.append(str);
                sb.append("  successful");
            }
        } catch (UnsatisfiedLinkError unused) {
            boolean a2 = kh.a(context, str);
            if (Log.isLoggable(b, 4)) {
                StringBuilder sb2 = new StringBuilder("loadLibary:");
                sb2.append(str);
                sb2.append(" result:");
                sb2.append(a2);
            }
        }
    }
}
