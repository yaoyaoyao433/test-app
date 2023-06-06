package com.meituan.android.legwork.ui.dialog;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class w implements View.OnClickListener {
    public static ChangeQuickRedirect a;
    private final PrivacyPhoneDialogFragment b;

    private w(PrivacyPhoneDialogFragment privacyPhoneDialogFragment) {
        this.b = privacyPhoneDialogFragment;
    }

    public static View.OnClickListener a(PrivacyPhoneDialogFragment privacyPhoneDialogFragment) {
        Object[] objArr = {privacyPhoneDialogFragment};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a007c78786d85d1b212f30ed6131482e", RobustBitConfig.DEFAULT_VALUE) ? (View.OnClickListener) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a007c78786d85d1b212f30ed6131482e") : new w(privacyPhoneDialogFragment);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9951516d46e7cd93612ebd760e0222c8", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9951516d46e7cd93612ebd760e0222c8");
        } else {
            PrivacyPhoneDialogFragment.d(this.b, view);
        }
    }
}
