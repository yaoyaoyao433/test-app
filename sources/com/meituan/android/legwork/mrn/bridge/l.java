package com.meituan.android.legwork.mrn.bridge;

import com.meituan.android.legwork.ui.component.CommonDialog;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class l implements CommonDialog.a {
    public static ChangeQuickRedirect a;
    private final LocationBridgeModule b;

    public l(LocationBridgeModule locationBridgeModule) {
        this.b = locationBridgeModule;
    }

    @Override // com.meituan.android.legwork.ui.component.CommonDialog.a
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cb016fcd322a63d1e83b443ea61a626c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cb016fcd322a63d1e83b443ea61a626c");
        } else {
            LocationBridgeModule.lambda$null$37(this.b);
        }
    }
}
