package com.meituan.android.cashier;

import com.meituan.android.cashier.model.bean.OverLoadInfo;
import com.meituan.android.cashier.payresult.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class b implements a.InterfaceC0190a {
    public static ChangeQuickRedirect a;
    private final NativeStandardCashierAdapter b;

    public b(NativeStandardCashierAdapter nativeStandardCashierAdapter) {
        this.b = nativeStandardCashierAdapter;
    }

    @Override // com.meituan.android.cashier.payresult.a.InterfaceC0190a
    public final void a(OverLoadInfo overLoadInfo) {
        Object[] objArr = {overLoadInfo};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f74fffe45e674d63621ca53bcfe0d246", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f74fffe45e674d63621ca53bcfe0d246");
        } else {
            NativeStandardCashierAdapter.a(this.b, overLoadInfo);
        }
    }
}
