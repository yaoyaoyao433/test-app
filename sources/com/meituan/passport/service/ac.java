package com.meituan.passport.service;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* loaded from: classes3.dex */
public final /* synthetic */ class ac implements rx.functions.h {
    public static ChangeQuickRedirect a;
    private final x b;

    public ac(x xVar) {
        this.b = xVar;
    }

    @Override // rx.functions.h
    public final Object a(Object obj, Object obj2) {
        Object[] objArr = {obj, obj2};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "457016c396ad8682c274a2a8fbdb4e7f", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "457016c396ad8682c274a2a8fbdb4e7f") : x.a(this.b, (String) obj, (String) obj2);
    }
}
