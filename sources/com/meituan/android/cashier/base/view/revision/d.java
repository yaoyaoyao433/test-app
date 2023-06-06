package com.meituan.android.cashier.base.view.revision;

import android.animation.Animator;
import com.meituan.android.paycommon.lib.widgets.AutoChangeNumberView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class d implements AutoChangeNumberView.a {
    public static ChangeQuickRedirect a;
    private final CashierOrderInfoView b;

    public d(CashierOrderInfoView cashierOrderInfoView) {
        this.b = cashierOrderInfoView;
    }

    @Override // com.meituan.android.paycommon.lib.widgets.AutoChangeNumberView.a
    public final void a(Animator animator) {
        Object[] objArr = {animator};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0d9ab1ca26fb739601d79c03786358ee", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0d9ab1ca26fb739601d79c03786358ee");
        } else {
            CashierOrderInfoView.a(this.b, animator);
        }
    }
}
