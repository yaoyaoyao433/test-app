package com.meituan.passport.service;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* loaded from: classes3.dex */
public final /* synthetic */ class o implements rx.functions.g {
    public static ChangeQuickRedirect a;
    private final m b;

    public o(m mVar) {
        this.b = mVar;
    }

    @Override // rx.functions.g
    public final Object call(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ffd01d8aef7029561096dde9fa40aa54", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ffd01d8aef7029561096dde9fa40aa54") : m.a(this.b, (Integer) obj);
    }
}
