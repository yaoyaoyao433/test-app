package com.dianping.monitor.impl;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class g {
    public static ChangeQuickRedirect a;
    public final String b;
    public final int c;
    public final String d;

    public g(String str, int i, String str2) {
        Object[] objArr = {str, Integer.valueOf(i), str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "848d4606037207935aa4790bb9815829", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "848d4606037207935aa4790bb9815829");
            return;
        }
        this.b = str;
        this.c = i;
        this.d = str2 == null ? "" : str2;
    }

    public final boolean equals(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "daaed83ab73a96a37c1a0d450d73c961", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "daaed83ab73a96a37c1a0d450d73c961")).booleanValue();
        }
        if (obj instanceof g) {
            g gVar = (g) obj;
            if ((gVar.b + CommonConstant.Symbol.MINUS + gVar.c + CommonConstant.Symbol.MINUS + gVar.d).equals(this.b + CommonConstant.Symbol.MINUS + this.c + CommonConstant.Symbol.MINUS + this.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6bfb59c2e2cea0393c528b3257c66252", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6bfb59c2e2cea0393c528b3257c66252")).intValue();
        }
        if (this.b == null) {
            return -1;
        }
        return this.b.hashCode() + this.d.hashCode() + this.c;
    }
}
