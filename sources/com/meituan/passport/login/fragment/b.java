package com.meituan.passport.login.fragment;

import android.text.Editable;
import com.meituan.passport.view.PassportEditText;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* loaded from: classes3.dex */
public final /* synthetic */ class b implements PassportEditText.d {
    public static ChangeQuickRedirect a;
    private final AccountLoginFragment b;

    public b(AccountLoginFragment accountLoginFragment) {
        this.b = accountLoginFragment;
    }

    @Override // com.meituan.passport.view.PassportEditText.d
    public final void a(Editable editable) {
        Object[] objArr = {editable};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0fb005176b46b9477f3d6d0b7b266ab7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0fb005176b46b9477f3d6d0b7b266ab7");
        } else {
            AccountLoginFragment.a(this.b, editable);
        }
    }
}
