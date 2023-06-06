package com.tencent.mapsdk.internal;

import android.content.Context;
import android.util.TypedValue;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class jv {
    public static int a(Context context, int i) {
        return (int) TypedValue.applyDimension(1, i, context.getResources().getDisplayMetrics());
    }
}
