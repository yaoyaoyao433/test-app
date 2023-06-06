package com.meituan.android.legwork.ui.base;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class a implements View.OnClickListener {
    public static ChangeQuickRedirect a;
    private final BaseActivity b;

    private a(BaseActivity baseActivity) {
        this.b = baseActivity;
    }

    public static View.OnClickListener a(BaseActivity baseActivity) {
        Object[] objArr = {baseActivity};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1a89908cce019ce5e8ac5b39e1506448", RobustBitConfig.DEFAULT_VALUE) ? (View.OnClickListener) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1a89908cce019ce5e8ac5b39e1506448") : new a(baseActivity);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7d72dfff75c36c9b62d3521c719c9672", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7d72dfff75c36c9b62d3521c719c9672");
        } else {
            BaseActivity.a(this.b, view);
        }
    }
}
