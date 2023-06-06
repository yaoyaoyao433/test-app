package com.dianping.nvtunnelkit.ext;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class c {
    public static ChangeQuickRedirect a;
    public String b;
    public long c;
    public int d;

    public c(String str, long j, int i) {
        Object[] objArr = {str, new Long(j), Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9435be2bbf256c7ecf1b583c2cb43998", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9435be2bbf256c7ecf1b583c2cb43998");
            return;
        }
        this.b = str;
        this.c = j;
        this.d = i;
    }
}
