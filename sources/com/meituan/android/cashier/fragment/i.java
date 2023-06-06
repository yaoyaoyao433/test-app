package com.meituan.android.cashier.fragment;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.math.BigDecimal;
import java.util.ArrayList;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class i implements com.meituan.android.pay.desk.component.fragment.g {
    public static ChangeQuickRedirect a;
    private final MTCashierRevisionFragment b;
    private final BigDecimal c;

    public i(MTCashierRevisionFragment mTCashierRevisionFragment, BigDecimal bigDecimal) {
        this.b = mTCashierRevisionFragment;
        this.c = bigDecimal;
    }

    @Override // com.meituan.android.pay.desk.component.fragment.g
    public final void a(ArrayList arrayList) {
        Object[] objArr = {arrayList};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "65e82b42c55c01e5e0b57d9dc4cf24d8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "65e82b42c55c01e5e0b57d9dc4cf24d8");
        } else {
            MTCashierRevisionFragment.a(this.b, this.c, arrayList);
        }
    }
}
