package com.dianping.nvnetwork.tnold;

import com.dianping.nvnetwork.tunnel.Encrypt.SecureProtocolData;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class i {
    public static ChangeQuickRedirect a;
    int b;
    SecureProtocolData c;
    int d;
    long e;
    private long f;

    public i(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "998fdb5e513c2a5cc231a9d493bc40b6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "998fdb5e513c2a5cc231a9d493bc40b6");
            return;
        }
        this.b = i;
        if (this.b == 1) {
            this.c = new SecureProtocolData();
        } else {
            this.d = 1;
        }
    }

    public i(int i, long j, long j2) {
        this(1);
        Object[] objArr = {1, new Long(j), 0L};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5cc9c75571a5adc5822d88570d5e9f42", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5cc9c75571a5adc5822d88570d5e9f42");
            return;
        }
        this.e = j;
        this.f = 0L;
    }
}
