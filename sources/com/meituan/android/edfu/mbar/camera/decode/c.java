package com.meituan.android.edfu.mbar.camera.decode;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class c {
    public static ChangeQuickRedirect a = null;
    public static float b = 0.3f;
    public static float c = 0.1f;
    public static float d = 0.4f;
    long e;
    long f;
    public int g;
    public int h;
    public long i;
    public long j;

    public c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bf3db37ec09e6eaab4e260ef0b9f4614", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bf3db37ec09e6eaab4e260ef0b9f4614");
            return;
        }
        this.e = 500L;
        this.f = 1000L;
        this.g = 0;
        this.h = 0;
        this.i = 0L;
    }

    public final void a(int i, int i2) {
        this.g = i;
        this.h = i2;
    }
}
