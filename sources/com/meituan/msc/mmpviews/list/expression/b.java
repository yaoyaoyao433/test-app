package com.meituan.msc.mmpviews.list.expression;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class b {
    public static ChangeQuickRedirect a;
    public int b;
    public boolean c;
    public String d;
    public Object e;

    public b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3dacb80445079d6fbf54e6a37d90fd39", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3dacb80445079d6fbf54e6a37d90fd39");
            return;
        }
        this.c = false;
        this.d = null;
        this.e = null;
    }

    public final String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aef10ab5b68de1b0a3609a67581fb061", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aef10ab5b68de1b0a3609a67581fb061");
        }
        StringBuilder sb = new StringBuilder();
        sb.append(com.meituan.msc.mmpviews.list.common.a.a(this));
        return sb.toString();
    }
}
