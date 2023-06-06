package com.sankuai.waimai.pouch.unionanim;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class f {
    public static ChangeQuickRedirect a = null;
    private static float m = Float.NaN;
    private static int n = Integer.MIN_VALUE;
    private static long o = 3000;
    float b;
    float c;
    int d;
    int e;
    float[] f;
    float[] g;
    float h;
    float i;
    long j;
    long k;
    float l;

    public static boolean a(int i) {
        return i != Integer.MIN_VALUE;
    }

    public f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "26a8a33037df9f11a347d0472fb93918", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "26a8a33037df9f11a347d0472fb93918");
            return;
        }
        this.b = m;
        this.c = m;
        this.d = n;
        this.e = n;
        this.h = m;
        this.i = m;
        this.j = o;
        this.k = 0L;
        this.l = m;
    }

    public final void a(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a758634a5e625b456777c931796af170", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a758634a5e625b456777c931796af170");
        } else {
            this.j = j;
        }
    }

    public final void b(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9d8ed9b9a88481ff6f5dd6a29d9f966f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9d8ed9b9a88481ff6f5dd6a29d9f966f");
        } else {
            this.k = j;
        }
    }

    public static boolean a(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "45a2c5bca2c7dbbaaa0a5550f4ab349e", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "45a2c5bca2c7dbbaaa0a5550f4ab349e")).booleanValue() : !Float.isNaN(f);
    }
}
