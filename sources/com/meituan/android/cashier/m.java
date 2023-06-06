package com.meituan.android.cashier;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class m implements Runnable {
    public static ChangeQuickRedirect a;
    private static final m b = new m();

    public static Runnable a() {
        return b;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "721b1e04f6efa2cb3086ea84e9427699", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "721b1e04f6efa2cb3086ea84e9427699");
        } else {
            StandardCashierInit.a();
        }
    }
}
