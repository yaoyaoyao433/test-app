package com.meituan.passport.service;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* loaded from: classes3.dex */
public final /* synthetic */ class y implements rx.functions.h {
    public static ChangeQuickRedirect a;
    private final x b;

    public y(x xVar) {
        this.b = xVar;
    }

    @Override // rx.functions.h
    public final Object a(Object obj, Object obj2) {
        Object[] objArr = {obj, obj2};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aedaa250aee19c29f8c8862bd26bb75e", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aedaa250aee19c29f8c8862bd26bb75e") : x.e(this.b, (String) obj, (String) obj2);
    }
}
