package com.dianping.nvnetwork.shark.monitor.tcp;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class c {
    public static ChangeQuickRedirect a;
    public boolean b;
    public String c;
    public long d;

    public c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7df2cc33b5fb64f89800b7e15d3415c5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7df2cc33b5fb64f89800b7e15d3415c5");
            return;
        }
        this.b = false;
        this.c = null;
        this.d = 0L;
    }

    public final String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a1600b6ac89de6f8ec584a821f88052c", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a1600b6ac89de6f8ec584a821f88052c");
        }
        return "TcpPingResult{isReachable=" + this.b + ", error='" + this.c + "', costTime=" + this.d + '}';
    }
}
