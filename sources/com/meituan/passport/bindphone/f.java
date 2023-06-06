package com.meituan.passport.bindphone;

import android.content.DialogInterface;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* loaded from: classes3.dex */
public final /* synthetic */ class f implements DialogInterface.OnClickListener {
    public static ChangeQuickRedirect a;
    private final BindPhoneActivity b;

    private f(BindPhoneActivity bindPhoneActivity) {
        this.b = bindPhoneActivity;
    }

    public static DialogInterface.OnClickListener a(BindPhoneActivity bindPhoneActivity) {
        Object[] objArr = {bindPhoneActivity};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d096cda0c6d4c47fc9333a58dcae81f9", RobustBitConfig.DEFAULT_VALUE) ? (DialogInterface.OnClickListener) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d096cda0c6d4c47fc9333a58dcae81f9") : new f(bindPhoneActivity);
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        Object[] objArr = {dialogInterface, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5be659786d62f0287add60cdf3aeb169", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5be659786d62f0287add60cdf3aeb169");
        } else {
            BindPhoneActivity.a(this.b, dialogInterface, i);
        }
    }
}
