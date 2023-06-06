package com.meituan.android.paycommon.lib.widgets;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final /* synthetic */ class f implements Runnable {
    public static ChangeQuickRedirect a;
    private final LoadingCircleWithCenterImageView b;

    private f(LoadingCircleWithCenterImageView loadingCircleWithCenterImageView) {
        this.b = loadingCircleWithCenterImageView;
    }

    public static Runnable a(LoadingCircleWithCenterImageView loadingCircleWithCenterImageView) {
        Object[] objArr = {loadingCircleWithCenterImageView};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "91e3c9601326c7ba8838e0ade39dc920", RobustBitConfig.DEFAULT_VALUE) ? (Runnable) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "91e3c9601326c7ba8838e0ade39dc920") : new f(loadingCircleWithCenterImageView);
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "12c884327952fcdf8c91715745aad3e3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "12c884327952fcdf8c91715745aad3e3");
        } else {
            LoadingCircleWithCenterImageView.a(this.b);
        }
    }
}
