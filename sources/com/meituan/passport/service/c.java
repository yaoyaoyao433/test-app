package com.meituan.passport.service;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* loaded from: classes3.dex */
public final /* synthetic */ class c implements rx.functions.h {
    public static ChangeQuickRedirect a;
    private final a b;

    public c(a aVar) {
        this.b = aVar;
    }

    @Override // rx.functions.h
    public final Object a(Object obj, Object obj2) {
        Object[] objArr = {obj, obj2};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "15438e59f4ee9f8ea3f49381c447fae7", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "15438e59f4ee9f8ea3f49381c447fae7") : a.a(this.b, (String) obj, (String) obj2);
    }
}
