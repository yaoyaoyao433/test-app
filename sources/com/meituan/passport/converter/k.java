package com.meituan.passport.converter;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* loaded from: classes3.dex */
public final /* synthetic */ class k implements rx.functions.b {
    public static ChangeQuickRedirect a;
    private final rx.j b;

    public k(rx.j jVar) {
        this.b = jVar;
    }

    @Override // rx.functions.b
    public final void call(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b06a266567641a1420c23f59711b15ec", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b06a266567641a1420c23f59711b15ec");
        } else {
            this.b.onNext(obj);
        }
    }
}
