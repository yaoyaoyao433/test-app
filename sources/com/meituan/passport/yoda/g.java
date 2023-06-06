package com.meituan.passport.yoda;

import com.meituan.passport.exception.ApiException;
import com.meituan.passport.yoda.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* loaded from: classes3.dex */
public final /* synthetic */ class g implements com.meituan.passport.converter.b {
    public static ChangeQuickRedirect a;
    private final a.c b;

    public g(a.c cVar) {
        this.b = cVar;
    }

    @Override // com.meituan.passport.converter.b
    public final boolean a(ApiException apiException, boolean z) {
        Object accessDispatch;
        Object[] objArr = {apiException, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3a5977da38fefcdfba11840b395abe17", RobustBitConfig.DEFAULT_VALUE)) {
            accessDispatch = PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3a5977da38fefcdfba11840b395abe17");
        } else {
            a.c cVar = this.b;
            Object[] objArr2 = {cVar, apiException, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect2 = a.c.e;
            if (!PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "c4320a753cb766cc37402458bf11cb1b", RobustBitConfig.DEFAULT_VALUE)) {
                return cVar.b.a(apiException);
            }
            accessDispatch = PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "c4320a753cb766cc37402458bf11cb1b");
        }
        return ((Boolean) accessDispatch).booleanValue();
    }
}
