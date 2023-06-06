package com.dianping.nvnetwork.shark.monitor;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class g {
    public static ChangeQuickRedirect a;
    public long b;
    public int c;
    public double d;
    public double e;
    public double f;
    public int g;

    public g(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "786893917150ce3861412c1b71b1d8ff", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "786893917150ce3861412c1b71b1d8ff");
        } else {
            this.g = i;
        }
    }
}
