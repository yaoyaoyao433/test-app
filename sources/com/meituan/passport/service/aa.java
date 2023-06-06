package com.meituan.passport.service;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* loaded from: classes3.dex */
public final /* synthetic */ class aa implements rx.functions.h {
    public static ChangeQuickRedirect a;
    private final x b;

    public aa(x xVar) {
        this.b = xVar;
    }

    @Override // rx.functions.h
    public final Object a(Object obj, Object obj2) {
        Object[] objArr = {obj, obj2};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2a7c7f32fd11fc784358c56ab1174b86", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2a7c7f32fd11fc784358c56ab1174b86") : x.c(this.b, (String) obj, (String) obj2);
    }
}
