package com.meituan.passport.service;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* loaded from: classes3.dex */
public final /* synthetic */ class k implements rx.functions.g {
    public static ChangeQuickRedirect a;
    private static final k b = new k();

    public static rx.functions.g a() {
        return b;
    }

    @Override // rx.functions.g
    public final Object call(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "977d532471b7fcf1683620a1edbe7acb", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "977d532471b7fcf1683620a1edbe7acb") : f.a((String) obj);
    }
}
