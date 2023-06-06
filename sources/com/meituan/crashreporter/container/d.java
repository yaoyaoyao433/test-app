package com.meituan.crashreporter.container;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Collection;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class d {
    public static ChangeQuickRedirect a;
    private static final d b = new d();
    private HashMap<String, c> c;

    public d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "84d9528d71f4d3cd09f72a1d926cd53c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "84d9528d71f4d3cd09f72a1d926cd53c");
        } else {
            this.c = new HashMap<>(8);
        }
    }

    public final synchronized c a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c2aeb38ddabdfa9cd3bf1533b3b3bbb6", RobustBitConfig.DEFAULT_VALUE)) {
            return (c) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c2aeb38ddabdfa9cd3bf1533b3b3bbb6");
        }
        c cVar = this.c.get(str);
        if (cVar == null) {
            cVar = new c(str);
            this.c.put(str, cVar);
        }
        return cVar;
    }

    public final synchronized Collection<c> a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a5e25db8ea34e9b7a5c1343f0d4fb5a4", RobustBitConfig.DEFAULT_VALUE)) {
            return (Collection) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a5e25db8ea34e9b7a5c1343f0d4fb5a4");
        }
        return this.c.values();
    }

    public static d b() {
        return b;
    }
}
