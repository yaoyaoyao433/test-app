package com.meituan.passport.oauthlogin.service;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import rx.functions.h;
/* loaded from: classes3.dex */
public final /* synthetic */ class d implements h {
    public static ChangeQuickRedirect a;
    private final c b;
    private final com.meituan.passport.oauthlogin.model.a c;
    private final String d;
    private final boolean e;

    public d(c cVar, com.meituan.passport.oauthlogin.model.a aVar, String str, boolean z) {
        this.b = cVar;
        this.c = aVar;
        this.d = str;
        this.e = z;
    }

    @Override // rx.functions.h
    public final Object a(Object obj, Object obj2) {
        Object[] objArr = {obj, obj2};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c81842c0e162d282f5df1a69933f18bc", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c81842c0e162d282f5df1a69933f18bc") : c.a(this.b, this.c, this.d, this.e, (String) obj, (String) obj2);
    }
}
