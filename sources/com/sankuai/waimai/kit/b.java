package com.sankuai.waimai.kit;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class b {
    public static ChangeQuickRedirect a;
    public String b;
    public double c;
    public double d;
    public String e;

    public b() {
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class a {
        private static final b a = new b();
    }

    public static b a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a8173b0aff47c0677c249a41da4ac368", RobustBitConfig.DEFAULT_VALUE) ? (b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a8173b0aff47c0677c249a41da4ac368") : a.a;
    }

    public final String b() {
        return this.b;
    }

    public final double c() {
        return this.c;
    }

    public final double d() {
        return this.d;
    }
}
