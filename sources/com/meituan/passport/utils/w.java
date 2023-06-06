package com.meituan.passport.utils;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* loaded from: classes3.dex */
public final /* synthetic */ class w implements rx.functions.g {
    public static ChangeQuickRedirect a;
    private static final w b = new w();

    public static rx.functions.g a() {
        return b;
    }

    @Override // rx.functions.g
    public final Object call(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6619c5688b7fa6ce3e1bb51f682b4add", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6619c5688b7fa6ce3e1bb51f682b4add") : v.a((rx.d) obj);
    }
}
