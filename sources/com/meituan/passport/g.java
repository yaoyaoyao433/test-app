package com.meituan.passport;

import android.text.Editable;
import com.meituan.passport.view.PassportEditText;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* loaded from: classes3.dex */
public final /* synthetic */ class g implements PassportEditText.b {
    public static ChangeQuickRedirect a;
    private static final g b = new g();

    public static PassportEditText.b a() {
        return b;
    }

    @Override // com.meituan.passport.view.PassportEditText.b
    public final boolean a(Editable editable) {
        Object[] objArr = {editable};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a42ce55a5a74bbe4f94f15d71b040fe4", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a42ce55a5a74bbe4f94f15d71b040fe4")).booleanValue() : DynamicLoginFragment.a(editable);
    }
}
