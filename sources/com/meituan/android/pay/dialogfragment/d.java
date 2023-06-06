package com.meituan.android.pay.dialogfragment;

import android.view.View;
import com.meituan.android.pay.desk.component.bean.balanceinsufficientguide.PayErrorGuide;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class d implements View.OnClickListener {
    public static ChangeQuickRedirect a;
    private final BalanceInsufficientGuideFragment b;
    private final int c;
    private final PayErrorGuide d;
    private final int e;

    private d(BalanceInsufficientGuideFragment balanceInsufficientGuideFragment, int i, PayErrorGuide payErrorGuide, int i2) {
        this.b = balanceInsufficientGuideFragment;
        this.c = i;
        this.d = payErrorGuide;
        this.e = i2;
    }

    public static View.OnClickListener a(BalanceInsufficientGuideFragment balanceInsufficientGuideFragment, int i, PayErrorGuide payErrorGuide, int i2) {
        Object[] objArr = {balanceInsufficientGuideFragment, Integer.valueOf(i), payErrorGuide, Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ea8288a5f2ace96017a38d3a2ab15dc9", RobustBitConfig.DEFAULT_VALUE) ? (View.OnClickListener) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ea8288a5f2ace96017a38d3a2ab15dc9") : new d(balanceInsufficientGuideFragment, i, payErrorGuide, i2);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3f578c4cb35434fca6a268a9d6d4289b", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3f578c4cb35434fca6a268a9d6d4289b");
        } else {
            BalanceInsufficientGuideFragment.a(this.b, this.c, this.d, this.e, view);
        }
    }
}
