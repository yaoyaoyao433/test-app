package com.dianping.nvnetwork.shark.monitor;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class l {
    public static ChangeQuickRedirect a;
    long b;
    double c;
    int d;

    public l(double d) {
        Object[] objArr = {Double.valueOf(d)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7a4163e8d5bd4c3440392e197ad835de", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7a4163e8d5bd4c3440392e197ad835de");
            return;
        }
        this.c = d;
        this.b = com.dianping.nvnetwork.shark.g.a();
        this.d = f.a();
    }
}
