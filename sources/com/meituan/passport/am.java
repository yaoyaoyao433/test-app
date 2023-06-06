package com.meituan.passport;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* loaded from: classes3.dex */
public final /* synthetic */ class am implements rx.functions.a {
    public static ChangeQuickRedirect a;
    private final rx.j b;

    public am(rx.j jVar) {
        this.b = jVar;
    }

    @Override // rx.functions.a
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "24b7416c372ee619008d3527894bc19a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "24b7416c372ee619008d3527894bc19a");
        } else {
            this.b.onCompleted();
        }
    }
}
