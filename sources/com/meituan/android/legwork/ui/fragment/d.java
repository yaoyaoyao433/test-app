package com.meituan.android.legwork.ui.fragment;

import com.meituan.android.legwork.ui.dialog.PrivacyPhoneDegradeDialogFragment;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class d implements PrivacyPhoneDegradeDialogFragment.a {
    public static ChangeQuickRedirect a;
    private final IMSessionFragment b;

    public d(IMSessionFragment iMSessionFragment) {
        this.b = iMSessionFragment;
    }

    @Override // com.meituan.android.legwork.ui.dialog.PrivacyPhoneDegradeDialogFragment.a
    public final void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "76844ecbcc0b297d2dedbd394a57606f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "76844ecbcc0b297d2dedbd394a57606f");
        } else {
            IMSessionFragment.a(this.b, str);
        }
    }
}
