package com.meituan.android.legwork.ui.fragment;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class c implements View.OnClickListener {
    public static ChangeQuickRedirect a;
    private final IMSessionFragment b;

    private c(IMSessionFragment iMSessionFragment) {
        this.b = iMSessionFragment;
    }

    public static View.OnClickListener a(IMSessionFragment iMSessionFragment) {
        Object[] objArr = {iMSessionFragment};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d4b4a1aea657491431b1e9ece6937dfb", RobustBitConfig.DEFAULT_VALUE) ? (View.OnClickListener) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d4b4a1aea657491431b1e9ece6937dfb") : new c(iMSessionFragment);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fdf387fef896413d3ad66fc8c75f9d57", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fdf387fef896413d3ad66fc8c75f9d57");
        } else {
            IMSessionFragment.a(this.b, view);
        }
    }
}
