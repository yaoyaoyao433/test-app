package com.meituan.passport.view;

import android.text.Editable;
import com.meituan.passport.view.PassportEditText;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* loaded from: classes3.dex */
public final /* synthetic */ class h implements PassportEditText.b {
    public static ChangeQuickRedirect a;
    private final PassportMobileInputView b;

    private h(PassportMobileInputView passportMobileInputView) {
        this.b = passportMobileInputView;
    }

    public static PassportEditText.b a(PassportMobileInputView passportMobileInputView) {
        Object[] objArr = {passportMobileInputView};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6e05605414f69b21aa759144812a97f9", RobustBitConfig.DEFAULT_VALUE) ? (PassportEditText.b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6e05605414f69b21aa759144812a97f9") : new h(passportMobileInputView);
    }

    @Override // com.meituan.passport.view.PassportEditText.b
    public final boolean a(Editable editable) {
        Object[] objArr = {editable};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3d9f0afd0ba189c1923d2e465c14d564", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3d9f0afd0ba189c1923d2e465c14d564")).booleanValue() : PassportMobileInputView.a(this.b, editable);
    }
}
