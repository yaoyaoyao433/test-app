package com.meituan.passport.login.fragment;

import android.text.Editable;
import com.meituan.passport.view.PassportEditText;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* loaded from: classes3.dex */
public final /* synthetic */ class h implements PassportEditText.d {
    public static ChangeQuickRedirect a;
    private final DynamicAccountLoginFragment b;

    public h(DynamicAccountLoginFragment dynamicAccountLoginFragment) {
        this.b = dynamicAccountLoginFragment;
    }

    @Override // com.meituan.passport.view.PassportEditText.d
    public final void a(Editable editable) {
        Object[] objArr = {editable};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2bea70bc28b02291e52ab2d87a97e68e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2bea70bc28b02291e52ab2d87a97e68e");
        } else {
            DynamicAccountLoginFragment.a(this.b, editable);
        }
    }
}
