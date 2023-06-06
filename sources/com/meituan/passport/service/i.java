package com.meituan.passport.service;

import com.meituan.passport.pojo.YodaResult;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* loaded from: classes3.dex */
public final /* synthetic */ class i implements rx.functions.g {
    public static ChangeQuickRedirect a;
    private static final i b = new i();

    public static rx.functions.g a() {
        return b;
    }

    @Override // rx.functions.g
    public final Object call(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f63abf37618cb915b53e36b608c545ba", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f63abf37618cb915b53e36b608c545ba") : f.b((YodaResult) obj);
    }
}
