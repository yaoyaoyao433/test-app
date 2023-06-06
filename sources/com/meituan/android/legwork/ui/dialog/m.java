package com.meituan.android.legwork.ui.dialog;

import com.meituan.android.legwork.ui.dialog.PrivacyPhoneDegradeDialogFragment;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class m implements PrivacyPhoneDegradeDialogFragment.a {
    public static ChangeQuickRedirect a;
    private static final m b = new m();

    public static PrivacyPhoneDegradeDialogFragment.a a() {
        return b;
    }

    @Override // com.meituan.android.legwork.ui.dialog.PrivacyPhoneDegradeDialogFragment.a
    public final void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4823f70b81f09fe149c10c48023d95f0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4823f70b81f09fe149c10c48023d95f0");
        } else {
            ChangeBindPhoneDialogFragment.a(str);
        }
    }
}
