package com.meituan.android.pay.hellodialog;

import android.view.View;
import com.meituan.android.pay.hellodialog.DiscountDowngradeDialog;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class a implements View.OnClickListener {
    public static ChangeQuickRedirect a;
    private final DiscountDowngradeDialog b;
    private final DiscountDowngradeDialog.a c;

    private a(DiscountDowngradeDialog discountDowngradeDialog, DiscountDowngradeDialog.a aVar) {
        this.b = discountDowngradeDialog;
        this.c = aVar;
    }

    public static View.OnClickListener a(DiscountDowngradeDialog discountDowngradeDialog, DiscountDowngradeDialog.a aVar) {
        Object[] objArr = {discountDowngradeDialog, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "15373118b41a4addbf87e0ed776c7a04", RobustBitConfig.DEFAULT_VALUE) ? (View.OnClickListener) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "15373118b41a4addbf87e0ed776c7a04") : new a(discountDowngradeDialog, aVar);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "564f67e733c93766da2bfbf9458d00e1", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "564f67e733c93766da2bfbf9458d00e1");
        } else {
            DiscountDowngradeDialog.b(this.b, this.c, view);
        }
    }
}
