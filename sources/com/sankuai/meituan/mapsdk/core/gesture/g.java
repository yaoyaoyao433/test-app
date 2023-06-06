package com.sankuai.meituan.mapsdk.core.gesture;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class g {
    public static ChangeQuickRedirect a;
    final float b;
    final float c;
    final float d;
    final float e;
    final float f;
    private final float g;

    public g(float f, float f2, float f3, float f4) {
        Object[] objArr = {Float.valueOf(f), Float.valueOf(f2), Float.valueOf(f3), Float.valueOf(f4)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ba557ddcd385fe20a035f828a9b8409a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ba557ddcd385fe20a035f828a9b8409a");
            return;
        }
        this.b = f;
        this.c = f2;
        this.d = f3;
        this.e = f4;
        this.g = (float) Math.sqrt((f * f) + (f2 * f2));
        this.f = (float) Math.sqrt((f3 * f3) + (f4 * f4));
    }
}
