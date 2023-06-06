package com.meituan.passport;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* loaded from: classes3.dex */
public final /* synthetic */ class e implements com.meituan.passport.module.b {
    public static ChangeQuickRedirect a;
    private final DynamicLoginFragment b;

    public e(DynamicLoginFragment dynamicLoginFragment) {
        this.b = dynamicLoginFragment;
    }

    @Override // com.meituan.passport.module.b
    public final void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "358a439bfcd75dde309736cc61eeae8e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "358a439bfcd75dde309736cc61eeae8e");
        } else {
            DynamicLoginFragment.b(this.b, z);
        }
    }
}
