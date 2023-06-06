package com.dianping.sdk.pike.message;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class c {
    public static ChangeQuickRedirect a;
    public int b;
    public int c;
    public int d;
    public long e;

    public c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "345b2de6226db069051708430f6b463a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "345b2de6226db069051708430f6b463a");
            return;
        }
        this.b = com.dianping.sdk.pike.f.d;
        this.c = com.dianping.sdk.pike.f.e;
        this.d = com.dianping.sdk.pike.f.f;
        this.e = com.dianping.sdk.pike.f.t;
    }
}
