package com.meituan.android.legwork.ui.abfragment;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class b implements rx.functions.b {
    public static ChangeQuickRedirect a;
    private final LegworkMainBFragment b;

    public b(LegworkMainBFragment legworkMainBFragment) {
        this.b = legworkMainBFragment;
    }

    @Override // rx.functions.b
    public final void call(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6d706a4c82c95b288750e949b6081a5b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6d706a4c82c95b288750e949b6081a5b");
        } else {
            LegworkMainBFragment.a(this.b, (Integer) obj);
        }
    }
}
