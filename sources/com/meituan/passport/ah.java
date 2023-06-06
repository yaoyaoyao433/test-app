package com.meituan.passport;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class ah {
    public static ChangeQuickRedirect a;
    static ah b;
    Map<com.meituan.passport.service.ai, com.meituan.passport.service.ah> c;

    public ah() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f0f649c4933935194dfafc39b381ec7b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f0f649c4933935194dfafc39b381ec7b");
        } else {
            this.c = new HashMap();
        }
    }
}
