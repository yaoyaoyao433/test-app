package com.meituan.passport.outer;

import com.meituan.passport.converter.m;
import com.meituan.passport.pojo.response.SmsRequestCode;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* loaded from: classes3.dex */
public final /* synthetic */ class a implements m {
    public static ChangeQuickRedirect a;
    private final OuterMobileIndexFragment b;

    public a(OuterMobileIndexFragment outerMobileIndexFragment) {
        this.b = outerMobileIndexFragment;
    }

    @Override // com.meituan.passport.converter.m
    public final void a(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8b9a79624e23b79fe6e23dffe3ba5c45", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8b9a79624e23b79fe6e23dffe3ba5c45");
        } else {
            OuterMobileIndexFragment.a(this.b, (SmsRequestCode) obj);
        }
    }
}
