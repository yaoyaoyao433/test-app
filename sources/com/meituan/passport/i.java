package com.meituan.passport;

import android.view.View;
import com.meituan.passport.view.PassportEditText;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* loaded from: classes3.dex */
public final /* synthetic */ class i implements View.OnClickListener {
    public static ChangeQuickRedirect a;
    private final DynamicLoginFragment b;
    private final PassportEditText c;

    private i(DynamicLoginFragment dynamicLoginFragment, PassportEditText passportEditText) {
        this.b = dynamicLoginFragment;
        this.c = passportEditText;
    }

    public static View.OnClickListener a(DynamicLoginFragment dynamicLoginFragment, PassportEditText passportEditText) {
        Object[] objArr = {dynamicLoginFragment, passportEditText};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "cb8f2053d6b41082a412e4bbc17423d2", RobustBitConfig.DEFAULT_VALUE) ? (View.OnClickListener) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "cb8f2053d6b41082a412e4bbc17423d2") : new i(dynamicLoginFragment, passportEditText);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "001b432299b61014470456b7d9f93201", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "001b432299b61014470456b7d9f93201");
        } else {
            DynamicLoginFragment.a(this.b, this.c, view);
        }
    }
}
