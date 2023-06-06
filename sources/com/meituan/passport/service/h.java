package com.meituan.passport.service;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* loaded from: classes3.dex */
public final /* synthetic */ class h implements rx.functions.h {
    public static ChangeQuickRedirect a;
    private final f b;

    public h(f fVar) {
        this.b = fVar;
    }

    @Override // rx.functions.h
    public final Object a(Object obj, Object obj2) {
        Object[] objArr = {obj, obj2};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3ae6a4295767404fbaf4e7c9f7cf7537", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3ae6a4295767404fbaf4e7c9f7cf7537") : f.a(this.b, (String) obj, (String) obj2);
    }
}
