package com.facebook.react.views.view;

import android.support.v4.view.ViewCompat;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class a {
    public static int a(int i, int i2) {
        if (i2 == 255) {
            return i;
        }
        if (i2 == 0) {
            return i & ViewCompat.MEASURED_SIZE_MASK;
        }
        int i3 = i2 + (i2 >> 7);
        return (i & ViewCompat.MEASURED_SIZE_MASK) | ((((i >>> 24) * i3) >> 8) << 24);
    }
}
