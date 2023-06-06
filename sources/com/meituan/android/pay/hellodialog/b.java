package com.meituan.android.pay.hellodialog;

import android.view.View;
import com.meituan.android.pay.hellodialog.DiscountDowngradeDialog;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class b implements View.OnClickListener {
    public static ChangeQuickRedirect a;
    private final DiscountDowngradeDialog b;
    private final DiscountDowngradeDialog.a c;

    private b(DiscountDowngradeDialog discountDowngradeDialog, DiscountDowngradeDialog.a aVar) {
        this.b = discountDowngradeDialog;
        this.c = aVar;
    }

    public static View.OnClickListener a(DiscountDowngradeDialog discountDowngradeDialog, DiscountDowngradeDialog.a aVar) {
        Object[] objArr = {discountDowngradeDialog, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7936e1b810fff8d1d5428e09518cfa28", RobustBitConfig.DEFAULT_VALUE) ? (View.OnClickListener) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7936e1b810fff8d1d5428e09518cfa28") : new b(discountDowngradeDialog, aVar);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "36b620b78c97b02504e6a6740a2e6dc0", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "36b620b78c97b02504e6a6740a2e6dc0");
        } else {
            DiscountDowngradeDialog.a(this.b, this.c, view);
        }
    }
}
