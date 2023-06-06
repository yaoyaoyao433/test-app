package com.meituan.android.cashier.dialog;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class h implements View.OnClickListener {
    public static ChangeQuickRedirect a;
    private final CommonGuideDialog b;
    private final int c;

    private h(CommonGuideDialog commonGuideDialog, int i) {
        this.b = commonGuideDialog;
        this.c = i;
    }

    public static View.OnClickListener a(CommonGuideDialog commonGuideDialog, int i) {
        Object[] objArr = {commonGuideDialog, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8eb58a131d7e9989d217f4ff3d0b0a7d", RobustBitConfig.DEFAULT_VALUE) ? (View.OnClickListener) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8eb58a131d7e9989d217f4ff3d0b0a7d") : new h(commonGuideDialog, i);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8364443e05a61f3cb0d54c75989d24be", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8364443e05a61f3cb0d54c75989d24be");
        } else {
            CommonGuideDialog.a(this.b, this.c, view);
        }
    }
}
