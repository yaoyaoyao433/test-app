package com.meituan.android.pay.hellodialog;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class d implements View.OnClickListener {
    public static ChangeQuickRedirect a;
    private final RealNameInfoDialog b;
    private final List c;

    private d(RealNameInfoDialog realNameInfoDialog, List list) {
        this.b = realNameInfoDialog;
        this.c = list;
    }

    public static View.OnClickListener a(RealNameInfoDialog realNameInfoDialog, List list) {
        Object[] objArr = {realNameInfoDialog, list};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2c88006c5087015d599818e30be6e5f4", RobustBitConfig.DEFAULT_VALUE) ? (View.OnClickListener) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2c88006c5087015d599818e30be6e5f4") : new d(realNameInfoDialog, list);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "79b9612960b3183f135d9a4b0c36a64b", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "79b9612960b3183f135d9a4b0c36a64b");
        } else {
            RealNameInfoDialog.a(this.b, this.c, view);
        }
    }
}
