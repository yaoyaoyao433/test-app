package com.meituan.passport.service;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* loaded from: classes3.dex */
public final /* synthetic */ class as implements rx.functions.h {
    public static ChangeQuickRedirect a;
    private final ar b;
    private final int c;
    private final int d;
    private final boolean e;

    public as(ar arVar, int i, int i2, boolean z) {
        this.b = arVar;
        this.c = i;
        this.d = i2;
        this.e = z;
    }

    @Override // rx.functions.h
    public final Object a(Object obj, Object obj2) {
        Object[] objArr = {obj, obj2};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1473bd512e01b3c42edb7d4a35b2cf4d", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1473bd512e01b3c42edb7d4a35b2cf4d") : ar.a(this.b, this.c, this.d, this.e, (String) obj, (String) obj2);
    }
}
