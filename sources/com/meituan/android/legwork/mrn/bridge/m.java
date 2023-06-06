package com.meituan.android.legwork.mrn.bridge;

import com.meituan.android.legwork.ui.component.CommonDialog;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class m implements CommonDialog.b {
    public static ChangeQuickRedirect a;
    private final CommonDialog b;

    public m(CommonDialog commonDialog) {
        this.b = commonDialog;
    }

    @Override // com.meituan.android.legwork.ui.component.CommonDialog.b
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eab61ecead17e7eaa8d657c289824985", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eab61ecead17e7eaa8d657c289824985");
        } else {
            LocationBridgeModule.lambda$null$38(this.b);
        }
    }
}
