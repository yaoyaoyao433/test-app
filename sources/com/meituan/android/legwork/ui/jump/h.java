package com.meituan.android.legwork.ui.jump;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class h implements rx.functions.b {
    public static ChangeQuickRedirect a;
    private final g b;
    private final String c;

    public h(g gVar, String str) {
        this.b = gVar;
        this.c = str;
    }

    @Override // rx.functions.b
    public final void call(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1796317afd8bb0934a249e0ab4d74e09", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1796317afd8bb0934a249e0ab4d74e09");
        } else {
            g.a(this.b, this.c, (Integer) obj);
        }
    }
}
