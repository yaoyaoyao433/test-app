package com.meituan.passport.dialogs;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* loaded from: classes3.dex */
public final /* synthetic */ class r implements View.OnClickListener {
    public static ChangeQuickRedirect a;
    private final UserPhoneBindedErrorFragment b;

    private r(UserPhoneBindedErrorFragment userPhoneBindedErrorFragment) {
        this.b = userPhoneBindedErrorFragment;
    }

    public static View.OnClickListener a(UserPhoneBindedErrorFragment userPhoneBindedErrorFragment) {
        Object[] objArr = {userPhoneBindedErrorFragment};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3028d03492c9ecf7aed5713852cf9ce2", RobustBitConfig.DEFAULT_VALUE) ? (View.OnClickListener) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3028d03492c9ecf7aed5713852cf9ce2") : new r(userPhoneBindedErrorFragment);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3b8819d0310c3539117885cc8a7e91ac", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3b8819d0310c3539117885cc8a7e91ac");
        } else {
            UserPhoneBindedErrorFragment.a(this.b, view);
        }
    }
}
