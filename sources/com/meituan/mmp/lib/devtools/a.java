package com.meituan.mmp.lib.devtools;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class a {
    public static ChangeQuickRedirect a;
    private static f b;
    private static i c;

    public static synchronized f a() {
        synchronized (a.class) {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            f fVar = null;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c081f8eef929a680872fd0c3e2918367", RobustBitConfig.DEFAULT_VALUE)) {
                return (f) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c081f8eef929a680872fd0c3e2918367");
            }
            if (b == null) {
                List a2 = com.sankuai.meituan.serviceloader.b.a(f.class, "mmp_devtools_provider");
                if (a2 != null && a2.size() > 0) {
                    fVar = (f) a2.get(0);
                }
                b = fVar;
            }
            return b;
        }
    }

    public static synchronized i b() {
        synchronized (a.class) {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            i iVar = null;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ecdf23ad2bea79c790765553f881c847", RobustBitConfig.DEFAULT_VALUE)) {
                return (i) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ecdf23ad2bea79c790765553f881c847");
            }
            if (c == null) {
                List a2 = com.sankuai.meituan.serviceloader.b.a(i.class, "mmp_v8debugger_provider");
                if (a2 != null && a2.size() > 0) {
                    iVar = (i) a2.get(0);
                }
                c = iVar;
            }
            return c;
        }
    }
}
