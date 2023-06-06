package com.meituan.android.cashier.dialog;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class j implements Runnable {
    public static ChangeQuickRedirect a;
    private final CommonGuideDialog b;

    private j(CommonGuideDialog commonGuideDialog) {
        this.b = commonGuideDialog;
    }

    public static Runnable a(CommonGuideDialog commonGuideDialog) {
        Object[] objArr = {commonGuideDialog};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "681ac3a4ebf9f0b7e8869e75a6082027", RobustBitConfig.DEFAULT_VALUE) ? (Runnable) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "681ac3a4ebf9f0b7e8869e75a6082027") : new j(commonGuideDialog);
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "26a4b297ee72fe9441eb6e0aab7e30e5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "26a4b297ee72fe9441eb6e0aab7e30e5");
        } else {
            CommonGuideDialog.a(this.b);
        }
    }
}
