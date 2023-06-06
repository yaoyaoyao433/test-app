package com.meituan.passport.service;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* loaded from: classes3.dex */
public final /* synthetic */ class ak implements rx.functions.h {
    public static ChangeQuickRedirect a;
    private final aj b;

    public ak(aj ajVar) {
        this.b = ajVar;
    }

    @Override // rx.functions.h
    public final Object a(Object obj, Object obj2) {
        Object[] objArr = {obj, obj2};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d31ad8ece73ac2606849bbc7ba2dcabf", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d31ad8ece73ac2606849bbc7ba2dcabf") : aj.a(this.b, (String) obj, (String) obj2);
    }
}
