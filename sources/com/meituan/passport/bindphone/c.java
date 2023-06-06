package com.meituan.passport.bindphone;

import android.text.Editable;
import com.meituan.passport.view.PassportEditText;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* loaded from: classes3.dex */
public final /* synthetic */ class c implements PassportEditText.b {
    public static ChangeQuickRedirect a;
    private static final c b = new c();

    public static PassportEditText.b a() {
        return b;
    }

    @Override // com.meituan.passport.view.PassportEditText.b
    public final boolean a(Editable editable) {
        Object[] objArr = {editable};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e1e28c49535178d11e0790582db10b9e", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e1e28c49535178d11e0790582db10b9e")).booleanValue() : BindPhoneActivity.a(editable);
    }
}
