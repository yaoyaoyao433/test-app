package com.meituan.passport.login.fragment;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* loaded from: classes3.dex */
public final /* synthetic */ class o implements com.meituan.passport.clickaction.a {
    public static ChangeQuickRedirect a;
    private final MobileIndexFragment b;

    private o(MobileIndexFragment mobileIndexFragment) {
        this.b = mobileIndexFragment;
    }

    public static com.meituan.passport.clickaction.a a(MobileIndexFragment mobileIndexFragment) {
        Object[] objArr = {mobileIndexFragment};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f71f66fa229c3f01d9fdbbf17391d75c", RobustBitConfig.DEFAULT_VALUE) ? (com.meituan.passport.clickaction.a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f71f66fa229c3f01d9fdbbf17391d75c") : new o(mobileIndexFragment);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f1551c4bd825434f86b9adb47d523ac6", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f1551c4bd825434f86b9adb47d523ac6");
        } else {
            MobileIndexFragment.b(this.b, view);
        }
    }
}
