package com.meituan.passport.service;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* loaded from: classes3.dex */
public final /* synthetic */ class ay implements rx.functions.h {
    public static ChangeQuickRedirect a;
    private final ax b;

    public ay(ax axVar) {
        this.b = axVar;
    }

    @Override // rx.functions.h
    public final Object a(Object obj, Object obj2) {
        Object[] objArr = {obj, obj2};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3cd30afd709ea2ed6a965b6b09eae1a9", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3cd30afd709ea2ed6a965b6b09eae1a9") : ax.a(this.b, (String) obj, (String) obj2);
    }
}
