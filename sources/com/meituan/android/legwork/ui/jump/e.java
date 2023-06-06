package com.meituan.android.legwork.ui.jump;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class e implements rx.functions.b {
    public static ChangeQuickRedirect a;
    private final d b;

    public e(d dVar) {
        this.b = dVar;
    }

    @Override // rx.functions.b
    public final void call(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fe571570ed791f30f167a4efde958c3a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fe571570ed791f30f167a4efde958c3a");
        } else {
            d.a(this.b, (Integer) obj);
        }
    }
}
