package com.meituan.passport.service;

import com.meituan.passport.pojo.Mobile;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* loaded from: classes3.dex */
public final /* synthetic */ class u implements rx.functions.h {
    public static ChangeQuickRedirect a;
    private final r b;
    private final String c;
    private final Mobile d;
    private final String e;
    private final String f;

    public u(r rVar, String str, Mobile mobile, String str2, String str3) {
        this.b = rVar;
        this.c = str;
        this.d = mobile;
        this.e = str2;
        this.f = str3;
    }

    @Override // rx.functions.h
    public final Object a(Object obj, Object obj2) {
        Object[] objArr = {obj, obj2};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "468a022d089e3c21f197d236d5af2e9d", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "468a022d089e3c21f197d236d5af2e9d") : r.a(this.b, this.c, this.d, this.e, this.f, (String) obj, (String) obj2);
    }
}
