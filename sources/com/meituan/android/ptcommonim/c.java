package com.meituan.android.ptcommonim;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final /* synthetic */ class c implements rx.functions.b {
    public static ChangeQuickRedirect a;
    private static final c b = new c();

    public static rx.functions.b a() {
        return b;
    }

    @Override // rx.functions.b
    public final void call(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "76e130816f78a13827d1f276a2e2b9c3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "76e130816f78a13827d1f276a2e2b9c3");
        } else {
            a.a((Throwable) obj);
        }
    }
}
