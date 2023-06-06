package com.meituan.android.hybridcashier.hook;

import com.meituan.android.hybridcashier.cashier.HybridCashierSetting;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class e implements Runnable {
    public static ChangeQuickRedirect a;
    private final d b;
    private final HybridCashierSetting c;

    private e(d dVar, HybridCashierSetting hybridCashierSetting) {
        this.b = dVar;
        this.c = hybridCashierSetting;
    }

    public static Runnable a(d dVar, HybridCashierSetting hybridCashierSetting) {
        Object[] objArr = {dVar, hybridCashierSetting};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b23e7b40c6edbf9d41d8eadb1e216702", RobustBitConfig.DEFAULT_VALUE) ? (Runnable) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b23e7b40c6edbf9d41d8eadb1e216702") : new e(dVar, hybridCashierSetting);
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b38e2cd771ec6fa1890fa23f779e5036", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b38e2cd771ec6fa1890fa23f779e5036");
            return;
        }
        d dVar = this.b;
        HybridCashierSetting hybridCashierSetting = this.c;
        Object[] objArr2 = {dVar, hybridCashierSetting};
        ChangeQuickRedirect changeQuickRedirect2 = d.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "bef52c1813b0a5da48bf31c6fac9889f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "bef52c1813b0a5da48bf31c6fac9889f");
        } else {
            dVar.a(hybridCashierSetting, true);
        }
    }
}
