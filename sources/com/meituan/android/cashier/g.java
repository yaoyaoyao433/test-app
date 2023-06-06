package com.meituan.android.cashier;

import com.meituan.android.paybase.utils.f;
import com.meituan.android.paycommon.lib.coupon.model.Promotion;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class g implements f.InterfaceC0337f {
    public static ChangeQuickRedirect a;
    private final NativeStandardCashierAdapter b;
    private final Promotion c;

    public g(NativeStandardCashierAdapter nativeStandardCashierAdapter, Promotion promotion) {
        this.b = nativeStandardCashierAdapter;
        this.c = promotion;
    }

    @Override // com.meituan.android.paybase.utils.f.InterfaceC0337f
    public final void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "93abdea0a2d1c837a1e0c93fb61fdbab", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "93abdea0a2d1c837a1e0c93fb61fdbab");
        } else {
            NativeStandardCashierAdapter.a(this.b, this.c, z);
        }
    }
}
