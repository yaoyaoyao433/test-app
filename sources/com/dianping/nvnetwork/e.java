package com.dianping.nvnetwork;

import com.dianping.nvnetwork.h;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class e {
    public static ChangeQuickRedirect a;
    static volatile boolean b;
    private static volatile Runnable c;

    public static void a(final List<h.a> list, final boolean z) {
        Object[] objArr = {list, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6b99bc16bf0c29f5d75eacc9f68c4fbb", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6b99bc16bf0c29f5d75eacc9f68c4fbb");
            return;
        }
        long j = h.h().aA;
        if (c != null) {
            com.dianping.nvtunnelkit.core.c.a().b(c);
        }
        c = new Runnable() { // from class: com.dianping.nvnetwork.e.1
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d43baa023873ea8a968251c6337af1cb", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d43baa023873ea8a968251c6337af1cb");
                    return;
                }
                e.b = z;
                for (int i = 0; i < list.size(); i++) {
                    ((h.a) list.get(i)).b(z);
                }
                com.dianping.nvnetwork.util.g.b("tunnelSwitchChanges.run-> closeTunnel : " + z);
            }
        };
        if (z) {
            com.dianping.nvtunnelkit.core.c a2 = com.dianping.nvtunnelkit.core.c.a();
            Runnable runnable = c;
            if (j <= 0) {
                j = 0;
            }
            a2.a(runnable, j);
            return;
        }
        c.run();
    }
}
