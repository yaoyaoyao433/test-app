package com.sankuai.waimai.drug;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final /* synthetic */ class a implements View.OnClickListener {
    public static ChangeQuickRedirect a;
    private final AddCartDialog b;

    private a(AddCartDialog addCartDialog) {
        this.b = addCartDialog;
    }

    public static View.OnClickListener a(AddCartDialog addCartDialog) {
        Object[] objArr = {addCartDialog};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1bee618d560afe1ed8880824929f4909", RobustBitConfig.DEFAULT_VALUE) ? (View.OnClickListener) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1bee618d560afe1ed8880824929f4909") : new a(addCartDialog);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bd3f3b28e6003a92196c37fb3fe569cf", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bd3f3b28e6003a92196c37fb3fe569cf");
        } else {
            AddCartDialog.d(this.b, view);
        }
    }
}
