package com.meituan.android.legwork.mrn.bridge;

import com.meituan.android.legwork.ui.component.CommonDialog;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class i implements CommonDialog.a {
    public static ChangeQuickRedirect a;
    private final LocationBridgeModule b;

    public i(LocationBridgeModule locationBridgeModule) {
        this.b = locationBridgeModule;
    }

    @Override // com.meituan.android.legwork.ui.component.CommonDialog.a
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f55eab66411832c24d9388dff48be863", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f55eab66411832c24d9388dff48be863");
        } else {
            LocationBridgeModule.lambda$requestActualLocation$35(this.b);
        }
    }
}
