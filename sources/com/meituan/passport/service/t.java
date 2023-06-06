package com.meituan.passport.service;

import com.meituan.passport.pojo.Mobile;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* loaded from: classes3.dex */
public final /* synthetic */ class t implements rx.functions.h {
    public static ChangeQuickRedirect a;
    private final r b;
    private final String c;
    private final Mobile d;

    public t(r rVar, String str, Mobile mobile) {
        this.b = rVar;
        this.c = str;
        this.d = mobile;
    }

    @Override // rx.functions.h
    public final Object a(Object obj, Object obj2) {
        Object[] objArr = {obj, obj2};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6f3671c1b8677654297846d19dc21e2e", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6f3671c1b8677654297846d19dc21e2e") : r.a(this.b, this.c, this.d, (String) obj, (String) obj2);
    }
}
