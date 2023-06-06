package com.meituan.passport.service;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* loaded from: classes3.dex */
public final /* synthetic */ class p implements rx.functions.h {
    public static ChangeQuickRedirect a;
    private final m b;
    private final Integer c;

    public p(m mVar, Integer num) {
        this.b = mVar;
        this.c = num;
    }

    @Override // rx.functions.h
    public final Object a(Object obj, Object obj2) {
        Object[] objArr = {obj, obj2};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5ed09490c98a4d89510f2cead24c3d06", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5ed09490c98a4d89510f2cead24c3d06") : m.a(this.b, this.c, (String) obj, (String) obj2);
    }
}
