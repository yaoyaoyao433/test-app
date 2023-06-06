package com.sankuai.meituan.mapsdk.core.gesture;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class e {
    public static ChangeQuickRedirect a;
    final float b;
    final float c;
    float d;
    float e;
    float f;
    float g;
    float h;
    float i;
    float j;
    float k;

    public e(float f, float f2) {
        Object[] objArr = {Float.valueOf(f), Float.valueOf(f2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ce84de074b35d58d369c7752361d3fc2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ce84de074b35d58d369c7752361d3fc2");
            return;
        }
        this.b = f;
        this.c = f2;
    }
}
