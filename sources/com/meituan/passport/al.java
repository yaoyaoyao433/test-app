package com.meituan.passport;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* loaded from: classes3.dex */
public final /* synthetic */ class al implements rx.functions.b {
    public static ChangeQuickRedirect a;
    private final rx.j b;

    public al(rx.j jVar) {
        this.b = jVar;
    }

    @Override // rx.functions.b
    public final void call(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3e8a53e9c4e82a476ab4257b3175d06c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3e8a53e9c4e82a476ab4257b3175d06c");
        } else {
            this.b.onError((Throwable) obj);
        }
    }
}
