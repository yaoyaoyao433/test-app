package com.meituan.passport.retrieve.fragment;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* loaded from: classes3.dex */
public final /* synthetic */ class a implements View.OnClickListener {
    public static ChangeQuickRedirect a;
    private final CheckSecurityFragment b;

    private a(CheckSecurityFragment checkSecurityFragment) {
        this.b = checkSecurityFragment;
    }

    public static View.OnClickListener a(CheckSecurityFragment checkSecurityFragment) {
        Object[] objArr = {checkSecurityFragment};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b902c1a4954a8cc796e4f2889a459210", RobustBitConfig.DEFAULT_VALUE) ? (View.OnClickListener) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b902c1a4954a8cc796e4f2889a459210") : new a(checkSecurityFragment);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1a59fc66e43eae96189fd791a141d331", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1a59fc66e43eae96189fd791a141d331");
        } else {
            CheckSecurityFragment.a(this.b, view);
        }
    }
}
