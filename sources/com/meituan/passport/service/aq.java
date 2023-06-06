package com.meituan.passport.service;

import com.meituan.passport.pojo.response.SmsRequestCode;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* loaded from: classes3.dex */
public final /* synthetic */ class aq implements com.meituan.passport.converter.m {
    public static ChangeQuickRedirect a;
    private final ao b;

    public aq(ao aoVar) {
        this.b = aoVar;
    }

    @Override // com.meituan.passport.converter.m
    public final void a(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "efad19d1eb21b96510e31b1f2c939b25", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "efad19d1eb21b96510e31b1f2c939b25");
        } else {
            ao.a(this.b, (SmsRequestCode) obj);
        }
    }
}
