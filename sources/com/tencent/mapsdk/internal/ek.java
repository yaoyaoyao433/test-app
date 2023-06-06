package com.tencent.mapsdk.internal;

import android.graphics.Rect;
import android.view.View;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public abstract class ek implements em {
    public abstract View[] b();

    @Override // com.tencent.mapsdk.internal.em
    public Rect a() {
        View[] b = b();
        Rect rect = new Rect();
        for (View view : b) {
            rect.union(hc.a(view));
        }
        return rect;
    }
}
