package com.sankuai.xm.base.component;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class b {
    public static ChangeQuickRedirect a;
    public final Map<String, Object> b;
    public final Map<Class, Object> c;

    public b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ef71f52d94af357efdb7f9a6724959cf", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ef71f52d94af357efdb7f9a6724959cf");
            return;
        }
        this.b = new HashMap();
        this.c = new HashMap();
    }

    public b(Map<String, Object> map, Map<Class, Object> map2) {
        Object[] objArr = {null, map2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d61a75a4395e4d2afdfdc17a064273f5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d61a75a4395e4d2afdfdc17a064273f5");
            return;
        }
        this.b = null;
        this.c = map2;
    }
}
