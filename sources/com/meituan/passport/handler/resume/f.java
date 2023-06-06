package com.meituan.passport.handler.resume;

import com.meituan.passport.handler.resume.e;
import com.meituan.passport.utils.s;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* loaded from: classes3.dex */
public final /* synthetic */ class f implements rx.functions.h {
    public static ChangeQuickRedirect a;
    private final String b;

    public f(String str) {
        this.b = str;
    }

    @Override // rx.functions.h
    public final Object a(Object obj, Object obj2) {
        Object[] objArr = {obj, obj2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dd9e516f7f789e3bdbd22014ef9a34f7", RobustBitConfig.DEFAULT_VALUE)) {
            return PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dd9e516f7f789e3bdbd22014ef9a34f7");
        }
        String str = this.b;
        String str2 = (String) obj;
        String str3 = (String) obj2;
        Object[] objArr2 = {str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect2 = e.AnonymousClass1.a;
        return PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "b69575e62ed4d738cd26e43eaba8604b", RobustBitConfig.DEFAULT_VALUE) ? (rx.d) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "b69575e62ed4d738cd26e43eaba8604b") : s.c().getPageData(str, str2, str3);
    }
}
