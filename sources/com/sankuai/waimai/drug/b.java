package com.sankuai.waimai.drug;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final /* synthetic */ class b implements View.OnClickListener {
    public static ChangeQuickRedirect a;
    private final AddCartDialog b;

    private b(AddCartDialog addCartDialog) {
        this.b = addCartDialog;
    }

    public static View.OnClickListener a(AddCartDialog addCartDialog) {
        Object[] objArr = {addCartDialog};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b4dde7447451bd2e721be089e5b3169f", RobustBitConfig.DEFAULT_VALUE) ? (View.OnClickListener) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b4dde7447451bd2e721be089e5b3169f") : new b(addCartDialog);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e84e72d32e175d693fc1cc4d33e03248", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e84e72d32e175d693fc1cc4d33e03248");
        } else {
            AddCartDialog.c(this.b, view);
        }
    }
}
