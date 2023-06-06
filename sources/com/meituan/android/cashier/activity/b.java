package com.meituan.android.cashier.activity;

import com.meituan.android.cashier.common.ICashier;
import com.meituan.android.cashier.common.l;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class b implements l.a {
    public static ChangeQuickRedirect a;
    private final MTCashierActivity b;

    public b(MTCashierActivity mTCashierActivity) {
        this.b = mTCashierActivity;
    }

    @Override // com.meituan.android.cashier.common.l.a
    public final void a(ICashier iCashier, Map map) {
        Object[] objArr = {iCashier, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c253df9d0ac0aae1393f99cd74616258", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c253df9d0ac0aae1393f99cd74616258");
        } else {
            this.b.a(iCashier, map);
        }
    }
}
