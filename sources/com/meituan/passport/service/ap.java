package com.meituan.passport.service;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* loaded from: classes3.dex */
public final /* synthetic */ class ap implements rx.functions.h {
    public static ChangeQuickRedirect a;
    private final ao b;
    private final String c;
    private final int d;
    private final int e;

    public ap(ao aoVar, String str, int i, int i2) {
        this.b = aoVar;
        this.c = str;
        this.d = i;
        this.e = i2;
    }

    @Override // rx.functions.h
    public final Object a(Object obj, Object obj2) {
        Object[] objArr = {obj, obj2};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "28ab413e963c4480f4e21e8aef78036f", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "28ab413e963c4480f4e21e8aef78036f") : ao.a(this.b, this.c, this.d, this.e, (String) obj, (String) obj2);
    }
}
