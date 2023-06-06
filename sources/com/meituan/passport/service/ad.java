package com.meituan.passport.service;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* loaded from: classes3.dex */
public final /* synthetic */ class ad implements rx.functions.h {
    public static ChangeQuickRedirect a;
    private final x b;
    private final boolean c;

    public ad(x xVar, boolean z) {
        this.b = xVar;
        this.c = z;
    }

    @Override // rx.functions.h
    public final Object a(Object obj, Object obj2) {
        Object[] objArr = {obj, obj2};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e340db47a23ec3ca0a61fc98a1135e26", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e340db47a23ec3ca0a61fc98a1135e26") : x.a(this.b, this.c, (String) obj, (String) obj2);
    }
}
