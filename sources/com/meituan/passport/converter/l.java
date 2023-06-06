package com.meituan.passport.converter;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* loaded from: classes3.dex */
public final /* synthetic */ class l implements rx.functions.a {
    public static ChangeQuickRedirect a;
    private final rx.j b;

    public l(rx.j jVar) {
        this.b = jVar;
    }

    @Override // rx.functions.a
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7f7a44cb077d5ce8977ac70d0d58d033", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7f7a44cb077d5ce8977ac70d0d58d033");
        } else {
            this.b.onCompleted();
        }
    }
}
