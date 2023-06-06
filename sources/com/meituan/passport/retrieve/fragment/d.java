package com.meituan.passport.retrieve.fragment;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* loaded from: classes3.dex */
public final /* synthetic */ class d implements com.meituan.passport.clickaction.a {
    public static ChangeQuickRedirect a;
    private final InputNewPassportFragment b;

    private d(InputNewPassportFragment inputNewPassportFragment) {
        this.b = inputNewPassportFragment;
    }

    public static com.meituan.passport.clickaction.a a(InputNewPassportFragment inputNewPassportFragment) {
        Object[] objArr = {inputNewPassportFragment};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "aebe588e0ee8adaf8454e0d5e7d0d58b", RobustBitConfig.DEFAULT_VALUE) ? (com.meituan.passport.clickaction.a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "aebe588e0ee8adaf8454e0d5e7d0d58b") : new d(inputNewPassportFragment);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ae3c65145fce9687debb848c13974a65", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ae3c65145fce9687debb848c13974a65");
        } else {
            InputNewPassportFragment.a(this.b, view);
        }
    }
}
