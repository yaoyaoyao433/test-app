package com.meituan.passport.service;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* loaded from: classes3.dex */
public final /* synthetic */ class n implements rx.functions.h {
    public static ChangeQuickRedirect a;
    private final m b;

    public n(m mVar) {
        this.b = mVar;
    }

    @Override // rx.functions.h
    public final Object a(Object obj, Object obj2) {
        Object[] objArr = {obj, obj2};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2e3b2a7c58de4a34e21a6dd7b3c953e9", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2e3b2a7c58de4a34e21a6dd7b3c953e9") : m.a(this.b, (String) obj, (String) obj2);
    }
}
