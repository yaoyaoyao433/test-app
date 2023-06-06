package com.meituan.android.pay.hellodialog;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class e implements View.OnClickListener {
    public static ChangeQuickRedirect a;
    private final RealNameInfoDialog b;

    private e(RealNameInfoDialog realNameInfoDialog) {
        this.b = realNameInfoDialog;
    }

    public static View.OnClickListener a(RealNameInfoDialog realNameInfoDialog) {
        Object[] objArr = {realNameInfoDialog};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "65be4d73e638f8cd1b9d3a8feb980f0c", RobustBitConfig.DEFAULT_VALUE) ? (View.OnClickListener) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "65be4d73e638f8cd1b9d3a8feb980f0c") : new e(realNameInfoDialog);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "97852e8b00590c2366a4de2b34e26464", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "97852e8b00590c2366a4de2b34e26464");
        } else {
            RealNameInfoDialog.a(this.b, view);
        }
    }
}
