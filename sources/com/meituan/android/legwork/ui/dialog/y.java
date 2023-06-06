package com.meituan.android.legwork.ui.dialog;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class y implements View.OnClickListener {
    public static ChangeQuickRedirect a;
    private final PrivacyPhoneDialogFragment b;

    private y(PrivacyPhoneDialogFragment privacyPhoneDialogFragment) {
        this.b = privacyPhoneDialogFragment;
    }

    public static View.OnClickListener a(PrivacyPhoneDialogFragment privacyPhoneDialogFragment) {
        Object[] objArr = {privacyPhoneDialogFragment};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "681d200f4a6ffe0334252470d2fddc91", RobustBitConfig.DEFAULT_VALUE) ? (View.OnClickListener) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "681d200f4a6ffe0334252470d2fddc91") : new y(privacyPhoneDialogFragment);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "00710b119ebd9e7d772ef2b4678f6107", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "00710b119ebd9e7d772ef2b4678f6107");
        } else {
            PrivacyPhoneDialogFragment.b(this.b, view);
        }
    }
}
