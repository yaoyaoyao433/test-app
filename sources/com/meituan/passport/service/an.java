package com.meituan.passport.service;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* loaded from: classes3.dex */
public final /* synthetic */ class an implements rx.functions.h {
    public static ChangeQuickRedirect a;
    private final am b;

    public an(am amVar) {
        this.b = amVar;
    }

    @Override // rx.functions.h
    public final Object a(Object obj, Object obj2) {
        Object[] objArr = {obj, obj2};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4c7ef6f74009e32cbb8e38e79640bfda", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4c7ef6f74009e32cbb8e38e79640bfda") : am.a(this.b, (String) obj, (String) obj2);
    }
}
