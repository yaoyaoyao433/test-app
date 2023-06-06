package com.meituan.android.legwork.ui.component;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class b implements View.OnClickListener {
    public static ChangeQuickRedirect a;
    private final CommonDialog b;

    private b(CommonDialog commonDialog) {
        this.b = commonDialog;
    }

    public static View.OnClickListener a(CommonDialog commonDialog) {
        Object[] objArr = {commonDialog};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "81ee193d03fe86448cf4ba15f29df040", RobustBitConfig.DEFAULT_VALUE) ? (View.OnClickListener) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "81ee193d03fe86448cf4ba15f29df040") : new b(commonDialog);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b150548185ebcd0e4a8b72b20451d4a0", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b150548185ebcd0e4a8b72b20451d4a0");
        } else {
            CommonDialog.a(this.b, view);
        }
    }
}
