package com.meituan.passport.service;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* loaded from: classes3.dex */
public final /* synthetic */ class af implements rx.functions.h {
    public static ChangeQuickRedirect a;
    private final ae b;
    private final boolean c;

    public af(ae aeVar, boolean z) {
        this.b = aeVar;
        this.c = z;
    }

    @Override // rx.functions.h
    public final Object a(Object obj, Object obj2) {
        Object[] objArr = {obj, obj2};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "da4742fe1483fb5131a7750ad5a60e82", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "da4742fe1483fb5131a7750ad5a60e82") : ae.a(this.b, this.c, (String) obj, (String) obj2);
    }
}
