package com.meituan.passport.service;

import com.meituan.passport.pojo.YodaResult;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* loaded from: classes3.dex */
public final /* synthetic */ class j implements rx.functions.g {
    public static ChangeQuickRedirect a;
    private static final j b = new j();

    public static rx.functions.g a() {
        return b;
    }

    @Override // rx.functions.g
    public final Object call(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "08027762e204b85bf1bb29ade0703301", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "08027762e204b85bf1bb29ade0703301") : f.a((YodaResult) obj);
    }
}
