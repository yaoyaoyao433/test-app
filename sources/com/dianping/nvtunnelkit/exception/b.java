package com.dianping.nvtunnelkit.exception;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class b extends Exception {
    public static ChangeQuickRedirect a;
    public long b;

    public b(String str, long j) {
        super(str);
        Object[] objArr = {str, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "702c3ba84abbeca29e424e1483a06473", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "702c3ba84abbeca29e424e1483a06473");
        } else {
            this.b = j;
        }
    }
}
