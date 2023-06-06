package com.meituan.android.pay.hellodialog;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class c implements View.OnClickListener {
    public static ChangeQuickRedirect a;
    private final RealNameInfoDialog b;
    private final List c;

    private c(RealNameInfoDialog realNameInfoDialog, List list) {
        this.b = realNameInfoDialog;
        this.c = list;
    }

    public static View.OnClickListener a(RealNameInfoDialog realNameInfoDialog, List list) {
        Object[] objArr = {realNameInfoDialog, list};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4459835dd7920ed848178cf6c8173cf2", RobustBitConfig.DEFAULT_VALUE) ? (View.OnClickListener) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4459835dd7920ed848178cf6c8173cf2") : new c(realNameInfoDialog, list);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5c536aed6c22cc015dad8875c7b6c7dd", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5c536aed6c22cc015dad8875c7b6c7dd");
        } else {
            RealNameInfoDialog.b(this.b, this.c, view);
        }
    }
}
