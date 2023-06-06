package com.meituan.passport.service;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* loaded from: classes3.dex */
public final /* synthetic */ class d implements rx.functions.h {
    public static ChangeQuickRedirect a;
    private final a b;
    private final String c;
    private final String d;

    public d(a aVar, String str, String str2) {
        this.b = aVar;
        this.c = str;
        this.d = str2;
    }

    @Override // rx.functions.h
    public final Object a(Object obj, Object obj2) {
        Object[] objArr = {obj, obj2};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0211937f6fb7aa6a91a8728415c630bb", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0211937f6fb7aa6a91a8728415c630bb") : a.a(this.b, this.c, this.d, (String) obj, (String) obj2);
    }
}
