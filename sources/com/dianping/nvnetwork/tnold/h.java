package com.dianping.nvnetwork.tnold;

import com.dianping.nvnetwork.tnold.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class h<C extends a> {
    public static ChangeQuickRedirect a;
    final com.dianping.nvnetwork.tnold.zip.e f;
    com.dianping.nvnetwork.tnold.zip.e g;
    com.dianping.nvnetwork.tnold.zip.a h;
    private final int j;
    private boolean k;
    private m<C> l;
    private static final String i = com.dianping.nvtunnelkit.logger.a.a("TNDecompressManager");
    static final com.dianping.nvnetwork.tnold.zip.e b = com.dianping.nvnetwork.tnold.zip.c.a(0);
    static final com.dianping.nvnetwork.tnold.zip.a c = com.dianping.nvnetwork.tnold.zip.c.b(0);
    static final com.dianping.nvnetwork.tnold.zip.e d = com.dianping.nvnetwork.tnold.zip.c.a(2);
    static final com.dianping.nvnetwork.tnold.zip.a e = com.dianping.nvnetwork.tnold.zip.c.b(2);

    public h(m<C> mVar) {
        Object[] objArr = {mVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f75c3be80d4d9a7b10c403bf0dc9b1ad", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f75c3be80d4d9a7b10c403bf0dc9b1ad");
            return;
        }
        this.l = mVar;
        this.j = ((c) mVar).c.b;
        this.k = ((c) mVar).c.c;
        this.f = com.dianping.nvnetwork.tnold.zip.c.a(3);
    }

    public final void a(Exception exc) {
        Object[] objArr = {exc};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "55dd4399e7115f0632a1afc459dadfd1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "55dd4399e7115f0632a1afc459dadfd1");
            return;
        }
        this.l.e();
        this.g = b;
        this.h = c;
        com.dianping.nvtunnelkit.ext.d.a().pv4(0L, "shark_decompress_exp", 0, 2, -1, 0, 0, 0, null, null);
    }
}
