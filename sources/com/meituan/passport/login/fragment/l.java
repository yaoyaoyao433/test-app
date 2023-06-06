package com.meituan.passport.login.fragment;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* loaded from: classes3.dex */
public final /* synthetic */ class l implements com.meituan.passport.clickaction.a {
    public static ChangeQuickRedirect a;
    private final ElderSSOLoginFragment b;

    private l(ElderSSOLoginFragment elderSSOLoginFragment) {
        this.b = elderSSOLoginFragment;
    }

    public static com.meituan.passport.clickaction.a a(ElderSSOLoginFragment elderSSOLoginFragment) {
        Object[] objArr = {elderSSOLoginFragment};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "16d3a1135f3be42eb00ca0af1b78ee8d", RobustBitConfig.DEFAULT_VALUE) ? (com.meituan.passport.clickaction.a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "16d3a1135f3be42eb00ca0af1b78ee8d") : new l(elderSSOLoginFragment);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5ce83773cfce1d233895ae315dd84a50", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5ce83773cfce1d233895ae315dd84a50");
        } else {
            ElderSSOLoginFragment.a(this.b, view);
        }
    }
}
