package com.meituan.passport.oauthlogin.service;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import rx.functions.h;
/* loaded from: classes3.dex */
public final /* synthetic */ class e implements h {
    public static ChangeQuickRedirect a;
    private final c b;
    private final String c;
    private final String d;
    private final com.meituan.passport.oauthlogin.model.a e;
    private final boolean f;

    public e(c cVar, String str, String str2, com.meituan.passport.oauthlogin.model.a aVar, boolean z) {
        this.b = cVar;
        this.c = str;
        this.d = str2;
        this.e = aVar;
        this.f = z;
    }

    @Override // rx.functions.h
    public final Object a(Object obj, Object obj2) {
        Object[] objArr = {obj, obj2};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d40f4b487a705cf9c434f9830f45f57b", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d40f4b487a705cf9c434f9830f45f57b") : c.a(this.b, this.c, this.d, this.e, this.f, (String) obj, (String) obj2);
    }
}
