package com.meituan.android.cashier.oneclick.fragment;

import com.meituan.android.cashier.oneclick.model.bean.OneClickPayOrderState;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class b implements Runnable {
    public static ChangeQuickRedirect a;
    private final MTCOneClickPayFragment b;
    private final OneClickPayOrderState c;

    private b(MTCOneClickPayFragment mTCOneClickPayFragment, OneClickPayOrderState oneClickPayOrderState) {
        this.b = mTCOneClickPayFragment;
        this.c = oneClickPayOrderState;
    }

    public static Runnable a(MTCOneClickPayFragment mTCOneClickPayFragment, OneClickPayOrderState oneClickPayOrderState) {
        Object[] objArr = {mTCOneClickPayFragment, oneClickPayOrderState};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a2c8517e9a075b8b141764483a3e0928", RobustBitConfig.DEFAULT_VALUE) ? (Runnable) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a2c8517e9a075b8b141764483a3e0928") : new b(mTCOneClickPayFragment, oneClickPayOrderState);
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0d4f4ba1d1907e03f6011b2c9ffd3ae0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0d4f4ba1d1907e03f6011b2c9ffd3ae0");
        } else {
            MTCOneClickPayFragment.a(this.b, this.c);
        }
    }
}
