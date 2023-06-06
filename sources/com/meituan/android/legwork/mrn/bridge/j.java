package com.meituan.android.legwork.mrn.bridge;

import com.meituan.android.legwork.ui.component.CommonDialog;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class j implements CommonDialog.b {
    public static ChangeQuickRedirect a;
    private final CommonDialog b;

    public j(CommonDialog commonDialog) {
        this.b = commonDialog;
    }

    @Override // com.meituan.android.legwork.ui.component.CommonDialog.b
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f16604e345d8a4e83b08e5942b6ee0e1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f16604e345d8a4e83b08e5942b6ee0e1");
        } else {
            LocationBridgeModule.lambda$requestActualLocation$36(this.b);
        }
    }
}
