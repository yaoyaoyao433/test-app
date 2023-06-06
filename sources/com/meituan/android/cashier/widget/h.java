package com.meituan.android.cashier.widget;

import com.meituan.android.pay.desk.pack.e;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class h implements e.a {
    public static ChangeQuickRedirect a;
    private final NativeStandardCashierAreaView b;

    public h(NativeStandardCashierAreaView nativeStandardCashierAreaView) {
        this.b = nativeStandardCashierAreaView;
    }

    @Override // com.meituan.android.pay.desk.pack.e.a
    public final void a(com.meituan.android.pay.common.payment.data.d dVar) {
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "48013b12552a1c1ed45672d15e98134c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "48013b12552a1c1ed45672d15e98134c");
        } else {
            NativeStandardCashierAreaView.a(this.b, dVar);
        }
    }
}
