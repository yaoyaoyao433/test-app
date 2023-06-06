package com.meituan.passport.service;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* loaded from: classes3.dex */
public final /* synthetic */ class ab implements rx.functions.h {
    public static ChangeQuickRedirect a;
    private final x b;

    public ab(x xVar) {
        this.b = xVar;
    }

    @Override // rx.functions.h
    public final Object a(Object obj, Object obj2) {
        Object[] objArr = {obj, obj2};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "34810549a977a6cb82c26b9c73f9dba3", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "34810549a977a6cb82c26b9c73f9dba3") : x.b(this.b, (String) obj, (String) obj2);
    }
}
