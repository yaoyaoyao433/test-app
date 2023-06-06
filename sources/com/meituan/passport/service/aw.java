package com.meituan.passport.service;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* loaded from: classes3.dex */
public final /* synthetic */ class aw implements rx.functions.h {
    public static ChangeQuickRedirect a;
    private final av b;

    public aw(av avVar) {
        this.b = avVar;
    }

    @Override // rx.functions.h
    public final Object a(Object obj, Object obj2) {
        Object[] objArr = {obj, obj2};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fa4e24f869c52d1bac16c4c5d374b286", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fa4e24f869c52d1bac16c4c5d374b286") : av.a(this.b, (String) obj, (String) obj2);
    }
}
