package com.meituan.android.neohybrid.neo.loading;

import android.view.View;
import com.meituan.android.neohybrid.neo.loading.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class e implements b.InterfaceC0305b {
    public static ChangeQuickRedirect a;
    private final d b;

    public e(d dVar) {
        this.b = dVar;
    }

    @Override // com.meituan.android.neohybrid.neo.loading.b.InterfaceC0305b
    public final void a(c cVar, View view, String str) {
        Object[] objArr = {cVar, view, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3c53fb50eccfeee6f6b57a6e303b27a0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3c53fb50eccfeee6f6b57a6e303b27a0");
        } else {
            d.a(this.b, cVar, view, str);
        }
    }
}
