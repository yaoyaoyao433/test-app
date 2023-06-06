package com.meituan.android.mrn.config;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class z {
    public static ChangeQuickRedirect a;
    private static i b;

    public static i a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "500b5aab4216e1741fa506e214c097d2", RobustBitConfig.DEFAULT_VALUE)) {
            return (i) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "500b5aab4216e1741fa506e214c097d2");
        }
        if (y.a().c == null) {
            return b();
        }
        return y.a().c;
    }

    private static i b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "27e37590a67757d6b08d2d98fae4f1d1", RobustBitConfig.DEFAULT_VALUE)) {
            return (i) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "27e37590a67757d6b08d2d98fae4f1d1");
        }
        if (b == null) {
            synchronized (c.class) {
                if (b == null) {
                    List a2 = com.sankuai.meituan.serviceloader.b.a(i.class, (String) null);
                    if (a2 != null && a2.size() > 0) {
                        b = (i) a2.get(0);
                    }
                    if (b == null) {
                        b = aa.b();
                    }
                }
            }
        }
        return b;
    }
}
