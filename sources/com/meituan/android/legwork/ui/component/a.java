package com.meituan.android.legwork.ui.component;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class a implements View.OnClickListener {
    public static ChangeQuickRedirect a;
    private final CommonDialog b;

    private a(CommonDialog commonDialog) {
        this.b = commonDialog;
    }

    public static View.OnClickListener a(CommonDialog commonDialog) {
        Object[] objArr = {commonDialog};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1bb8e81c65b4c8b874998c3da0542855", RobustBitConfig.DEFAULT_VALUE) ? (View.OnClickListener) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1bb8e81c65b4c8b874998c3da0542855") : new a(commonDialog);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b44e0133d4cbadf4f37233da18e5e4d3", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b44e0133d4cbadf4f37233da18e5e4d3");
        } else {
            CommonDialog.b(this.b, view);
        }
    }
}
