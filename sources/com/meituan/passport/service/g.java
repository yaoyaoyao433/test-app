package com.meituan.passport.service;

import com.meituan.passport.pojo.response.SmsRequestCode;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* loaded from: classes3.dex */
public final /* synthetic */ class g implements com.meituan.passport.converter.m {
    public static ChangeQuickRedirect a;
    private final f b;

    public g(f fVar) {
        this.b = fVar;
    }

    @Override // com.meituan.passport.converter.m
    public final void a(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dc4ad1870459406a78f719b021e0da9f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dc4ad1870459406a78f719b021e0da9f");
        } else {
            f.a(this.b, (SmsRequestCode) obj);
        }
    }
}
