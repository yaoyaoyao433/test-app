package com.meituan.android.privacy.interfaces;

import android.content.Context;
import android.support.annotation.Nullable;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class y {
    private static boolean a = false;
    private static f b;

    public static synchronized void a(@Nullable Context context, f fVar) {
        synchronized (y.class) {
            if (a) {
                return;
            }
            a = true;
            b = fVar;
        }
    }
}
