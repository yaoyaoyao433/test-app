package com.meituan.passport.login.fragment;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* loaded from: classes3.dex */
public final /* synthetic */ class g implements com.meituan.passport.clickaction.a {
    public static ChangeQuickRedirect a;
    private final DynamicAccountLoginFragment b;

    private g(DynamicAccountLoginFragment dynamicAccountLoginFragment) {
        this.b = dynamicAccountLoginFragment;
    }

    public static com.meituan.passport.clickaction.a a(DynamicAccountLoginFragment dynamicAccountLoginFragment) {
        Object[] objArr = {dynamicAccountLoginFragment};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3edcbb151b5c7b62eeec29259b771cd4", RobustBitConfig.DEFAULT_VALUE) ? (com.meituan.passport.clickaction.a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3edcbb151b5c7b62eeec29259b771cd4") : new g(dynamicAccountLoginFragment);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "055269a4ff210ff6c44465bddfc819a1", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "055269a4ff210ff6c44465bddfc819a1");
        } else {
            DynamicAccountLoginFragment.a(this.b, view);
        }
    }
}
