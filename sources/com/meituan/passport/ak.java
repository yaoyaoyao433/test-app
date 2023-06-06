package com.meituan.passport;

import com.meituan.passport.UserCenter;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* loaded from: classes3.dex */
public final /* synthetic */ class ak implements rx.functions.b {
    public static ChangeQuickRedirect a;
    private final rx.j b;

    public ak(rx.j jVar) {
        this.b = jVar;
    }

    @Override // rx.functions.b
    public final void call(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3b46f28909bb12cbe81596fa3a72c42f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3b46f28909bb12cbe81596fa3a72c42f");
        } else {
            UserCenter.lambda$null$0(this.b, (UserCenter.c) obj);
        }
    }
}
