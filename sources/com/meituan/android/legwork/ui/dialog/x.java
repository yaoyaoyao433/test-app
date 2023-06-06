package com.meituan.android.legwork.ui.dialog;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class x implements View.OnClickListener {
    public static ChangeQuickRedirect a;
    private final PrivacyPhoneDialogFragment b;

    private x(PrivacyPhoneDialogFragment privacyPhoneDialogFragment) {
        this.b = privacyPhoneDialogFragment;
    }

    public static View.OnClickListener a(PrivacyPhoneDialogFragment privacyPhoneDialogFragment) {
        Object[] objArr = {privacyPhoneDialogFragment};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4d74f76f54d90b009f1424d9bdfaa2fe", RobustBitConfig.DEFAULT_VALUE) ? (View.OnClickListener) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4d74f76f54d90b009f1424d9bdfaa2fe") : new x(privacyPhoneDialogFragment);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b89825e558390a6ae97cac2344fa7ee9", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b89825e558390a6ae97cac2344fa7ee9");
        } else {
            PrivacyPhoneDialogFragment.c(this.b, view);
        }
    }
}
