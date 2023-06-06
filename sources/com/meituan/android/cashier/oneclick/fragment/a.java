package com.meituan.android.cashier.oneclick.fragment;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class a implements Runnable {
    public static ChangeQuickRedirect a;
    private final MTCOneClickPayFragment b;
    private final String c;

    private a(MTCOneClickPayFragment mTCOneClickPayFragment, String str) {
        this.b = mTCOneClickPayFragment;
        this.c = str;
    }

    public static Runnable a(MTCOneClickPayFragment mTCOneClickPayFragment, String str) {
        Object[] objArr = {mTCOneClickPayFragment, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ee66b949996dff240f04e2688d0b9b59", RobustBitConfig.DEFAULT_VALUE) ? (Runnable) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ee66b949996dff240f04e2688d0b9b59") : new a(mTCOneClickPayFragment, str);
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "06b1ea73000e2db4de9422e0adcf77d0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "06b1ea73000e2db4de9422e0adcf77d0");
        } else {
            MTCOneClickPayFragment.a(this.b, this.c);
        }
    }
}
