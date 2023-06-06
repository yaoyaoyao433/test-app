package com.meituan.android.legwork.ui.dialog;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class u implements View.OnClickListener {
    public static ChangeQuickRedirect a;
    private final PrivacyPhoneDegradeDialogFragment b;

    private u(PrivacyPhoneDegradeDialogFragment privacyPhoneDegradeDialogFragment) {
        this.b = privacyPhoneDegradeDialogFragment;
    }

    public static View.OnClickListener a(PrivacyPhoneDegradeDialogFragment privacyPhoneDegradeDialogFragment) {
        Object[] objArr = {privacyPhoneDegradeDialogFragment};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "69f63971ef4e6c16af53bfe1629366d8", RobustBitConfig.DEFAULT_VALUE) ? (View.OnClickListener) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "69f63971ef4e6c16af53bfe1629366d8") : new u(privacyPhoneDegradeDialogFragment);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6a607a9d23b86b9761b9536102216c3b", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6a607a9d23b86b9761b9536102216c3b");
        } else {
            PrivacyPhoneDegradeDialogFragment.b(this.b, view);
        }
    }
}
