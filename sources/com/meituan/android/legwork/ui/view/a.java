package com.meituan.android.legwork.ui.view;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class a implements View.OnClickListener {
    public static ChangeQuickRedirect a;
    private final CustomTitleBarAdapt b;

    private a(CustomTitleBarAdapt customTitleBarAdapt) {
        this.b = customTitleBarAdapt;
    }

    public static View.OnClickListener a(CustomTitleBarAdapt customTitleBarAdapt) {
        Object[] objArr = {customTitleBarAdapt};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "28465fb5defb09dd57feda2242336325", RobustBitConfig.DEFAULT_VALUE) ? (View.OnClickListener) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "28465fb5defb09dd57feda2242336325") : new a(customTitleBarAdapt);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "707c1c97d6f280ca59cd5b65402a622e", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "707c1c97d6f280ca59cd5b65402a622e");
        } else {
            CustomTitleBarAdapt.a(this.b, view);
        }
    }
}
