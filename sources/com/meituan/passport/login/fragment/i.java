package com.meituan.passport.login.fragment;

import android.content.DialogInterface;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* loaded from: classes3.dex */
public final /* synthetic */ class i implements DialogInterface.OnClickListener {
    public static ChangeQuickRedirect a;
    private final DynamicAccountLoginFragment b;

    private i(DynamicAccountLoginFragment dynamicAccountLoginFragment) {
        this.b = dynamicAccountLoginFragment;
    }

    public static DialogInterface.OnClickListener a(DynamicAccountLoginFragment dynamicAccountLoginFragment) {
        Object[] objArr = {dynamicAccountLoginFragment};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "059e8748400c1d3226f73eae9fac2fba", RobustBitConfig.DEFAULT_VALUE) ? (DialogInterface.OnClickListener) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "059e8748400c1d3226f73eae9fac2fba") : new i(dynamicAccountLoginFragment);
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        Object[] objArr = {dialogInterface, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e8e02c81099afa47d0ed3cc432d51880", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e8e02c81099afa47d0ed3cc432d51880");
        } else {
            DynamicAccountLoginFragment.a(this.b, dialogInterface, i);
        }
    }
}
