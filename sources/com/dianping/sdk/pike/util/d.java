package com.dianping.sdk.pike.util;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.concurrent.ExecutorService;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class d {
    public static ChangeQuickRedirect a;
    private static volatile d b;
    private final ExecutorService c;

    public static d a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "968efd7e00ee4e294dedf89c8c708a0d", RobustBitConfig.DEFAULT_VALUE)) {
            return (d) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "968efd7e00ee4e294dedf89c8c708a0d");
        }
        if (b == null) {
            synchronized (d.class) {
                if (b == null) {
                    b = new d();
                }
            }
        }
        return b;
    }

    public d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4c39994f2bc4afb82d05cbef00de1317", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4c39994f2bc4afb82d05cbef00de1317");
        } else {
            this.c = com.sankuai.android.jarvis.c.a("pike-global-thread-jarvis", "pike-global-thread-jarvis", 60L);
        }
    }

    public final void a(Runnable runnable) {
        Object[] objArr = {runnable};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a2e262a285820c38f00077623bfdd23a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a2e262a285820c38f00077623bfdd23a");
        } else {
            this.c.execute(runnable);
        }
    }
}
