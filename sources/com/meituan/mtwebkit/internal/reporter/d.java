package com.meituan.mtwebkit.internal.reporter;

import com.meituan.mtwebkit.internal.reporter.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class d {
    public static ChangeQuickRedirect a = null;
    public static volatile boolean b = true;
    public static d c;
    public c.b d;

    public static d a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "98d84648c99af54ef5f12a23ac3df5d2", RobustBitConfig.DEFAULT_VALUE)) {
            return (d) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "98d84648c99af54ef5f12a23ac3df5d2");
        }
        if (c == null) {
            synchronized (d.class) {
                if (c == null) {
                    c = new d();
                }
            }
        }
        return c;
    }

    public d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8f9b50bde42cc7880ee380117e3b9a56", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8f9b50bde42cc7880ee380117e3b9a56");
        } else {
            this.d = new c.b();
        }
    }
}
