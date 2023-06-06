package com.sankuai.waimai.drug;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final /* synthetic */ class d implements View.OnClickListener {
    public static ChangeQuickRedirect a;
    private final AddCartDialog b;

    private d(AddCartDialog addCartDialog) {
        this.b = addCartDialog;
    }

    public static View.OnClickListener a(AddCartDialog addCartDialog) {
        Object[] objArr = {addCartDialog};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c19abbb85eb0d9b3b894a995d6809a2c", RobustBitConfig.DEFAULT_VALUE) ? (View.OnClickListener) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c19abbb85eb0d9b3b894a995d6809a2c") : new d(addCartDialog);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d844fd39ffb3a20d7ed2a0ac8c6c6072", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d844fd39ffb3a20d7ed2a0ac8c6c6072");
        } else {
            AddCartDialog.a(this.b, view);
        }
    }
}
