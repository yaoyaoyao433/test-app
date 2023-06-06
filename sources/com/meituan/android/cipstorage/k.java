package com.meituan.android.cipstorage;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class k {
    public static ChangeQuickRedirect a;
    private static q b;

    public static k a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c2980d73f1b8efc3ac42a34a66b1c2d8", RobustBitConfig.DEFAULT_VALUE) ? (k) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c2980d73f1b8efc3ac42a34a66b1c2d8") : new k();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public q b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "98f3bc9ff21948374469b42b01fef3c0", RobustBitConfig.DEFAULT_VALUE)) {
            return (q) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "98f3bc9ff21948374469b42b01fef3c0");
        }
        if (b != null) {
            return b;
        }
        q a2 = q.a(v.c, "cips-inner-info", 2);
        b = a2;
        return a2;
    }

    public final boolean a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "914ceb8d19d24b5d1299c7e4f8ec6f95", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "914ceb8d19d24b5d1299c7e4f8ec6f95")).booleanValue();
        }
        q b2 = b();
        return b2.a("cmu#" + str, str2);
    }

    public final long a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0e170790d5886ea7a5ff01b6a1e44702", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0e170790d5886ea7a5ff01b6a1e44702")).longValue();
        }
        q b2 = b();
        return b2.b("its-" + str, 0L);
    }

    public final boolean a(String str, long j) {
        Object[] objArr = {str, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "62c1f19d54e9cc935ffcc1b861964c41", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "62c1f19d54e9cc935ffcc1b861964c41")).booleanValue();
        }
        q b2 = b();
        return b2.a("its-" + str, j);
    }
}
