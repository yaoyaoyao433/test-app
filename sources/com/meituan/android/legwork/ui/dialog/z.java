package com.meituan.android.legwork.ui.dialog;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class z implements View.OnClickListener {
    public static ChangeQuickRedirect a;
    private final PrivacyPhoneDialogFragment b;

    private z(PrivacyPhoneDialogFragment privacyPhoneDialogFragment) {
        this.b = privacyPhoneDialogFragment;
    }

    public static View.OnClickListener a(PrivacyPhoneDialogFragment privacyPhoneDialogFragment) {
        Object[] objArr = {privacyPhoneDialogFragment};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e39f0707640f47897f0e7ce2891d81f0", RobustBitConfig.DEFAULT_VALUE) ? (View.OnClickListener) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e39f0707640f47897f0e7ce2891d81f0") : new z(privacyPhoneDialogFragment);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5eea61a32ae7a694c4e2bc91a75b4fee", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5eea61a32ae7a694c4e2bc91a75b4fee");
        } else {
            PrivacyPhoneDialogFragment.a(this.b, view);
        }
    }
}
