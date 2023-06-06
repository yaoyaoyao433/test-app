package com.meituan.android.cashier.dialog;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class i implements Runnable {
    public static ChangeQuickRedirect a;
    private final CommonGuideDialog b;

    private i(CommonGuideDialog commonGuideDialog) {
        this.b = commonGuideDialog;
    }

    public static Runnable a(CommonGuideDialog commonGuideDialog) {
        Object[] objArr = {commonGuideDialog};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b4be2824a06786265e4d99917f0ba523", RobustBitConfig.DEFAULT_VALUE) ? (Runnable) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b4be2824a06786265e4d99917f0ba523") : new i(commonGuideDialog);
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5f5a25e8cbf0fd3b051cc8ca5285b542", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5f5a25e8cbf0fd3b051cc8ca5285b542");
        } else {
            CommonGuideDialog.b(this.b);
        }
    }
}
