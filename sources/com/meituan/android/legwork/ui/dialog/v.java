package com.meituan.android.legwork.ui.dialog;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class v implements View.OnClickListener {
    public static ChangeQuickRedirect a;
    private final PrivacyPhoneDegradeDialogFragment b;

    private v(PrivacyPhoneDegradeDialogFragment privacyPhoneDegradeDialogFragment) {
        this.b = privacyPhoneDegradeDialogFragment;
    }

    public static View.OnClickListener a(PrivacyPhoneDegradeDialogFragment privacyPhoneDegradeDialogFragment) {
        Object[] objArr = {privacyPhoneDegradeDialogFragment};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a91d2b644786bbdd1421f20990e5a628", RobustBitConfig.DEFAULT_VALUE) ? (View.OnClickListener) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a91d2b644786bbdd1421f20990e5a628") : new v(privacyPhoneDegradeDialogFragment);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5ff31d8aae09a5f0f58f0e95569f786e", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5ff31d8aae09a5f0f58f0e95569f786e");
        } else {
            PrivacyPhoneDegradeDialogFragment.a(this.b, view);
        }
    }
}
