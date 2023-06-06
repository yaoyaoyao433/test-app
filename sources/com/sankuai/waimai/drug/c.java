package com.sankuai.waimai.drug;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final /* synthetic */ class c implements View.OnClickListener {
    public static ChangeQuickRedirect a;
    private final AddCartDialog b;

    private c(AddCartDialog addCartDialog) {
        this.b = addCartDialog;
    }

    public static View.OnClickListener a(AddCartDialog addCartDialog) {
        Object[] objArr = {addCartDialog};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7ec3fed2526d1b40a1b40fe317533a88", RobustBitConfig.DEFAULT_VALUE) ? (View.OnClickListener) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7ec3fed2526d1b40a1b40fe317533a88") : new c(addCartDialog);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1b21b512f5791fd15675d1d0d417b37d", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1b21b512f5791fd15675d1d0d417b37d");
        } else {
            AddCartDialog.b(this.b, view);
        }
    }
}
