package com.dianping.sdk.pike.service;

import com.dianping.sdk.pike.packet.aa;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class l {
    public static ChangeQuickRedirect a;
    public final String b;
    public com.dianping.sdk.pike.packet.l c;
    public com.dianping.sdk.pike.packet.k d;
    public final int e;
    public String f;
    public volatile com.dianping.sdk.pike.a g;
    public boolean h;
    public long i;
    public int j;
    public int k;
    public boolean l;
    public int m;
    private long n;
    private long o;
    private boolean p;

    public l() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "03a0b57dd6211e063e310abd62ec1027", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "03a0b57dd6211e063e310abd62ec1027");
            return;
        }
        this.h = true;
        this.i = com.dianping.sdk.pike.f.t;
        this.j = com.dianping.sdk.pike.f.f;
        this.p = false;
        this.b = com.dianping.sdk.pike.util.g.a();
        this.e = Integer.valueOf(this.b).intValue();
        this.f = "";
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d217b98a3469222bf659eb2b8de2fa4c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d217b98a3469222bf659eb2b8de2fa4c");
            return;
        }
        this.p = true;
        if (this.k == 0) {
            com.dianping.sdk.pike.i.a("PikeSession", "session start, sessionId: ", this.b);
            this.n = com.dianping.sdk.pike.util.g.c();
            if (this.c != null) {
                this.c.a(this.b);
            }
        }
    }

    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e49b7f46f17b6dab7da4da2e92339209", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e49b7f46f17b6dab7da4da2e92339209");
            return;
        }
        com.dianping.sdk.pike.i.a("PikeSession", "session complete, sessionId: ", this.b);
        this.o = com.dianping.sdk.pike.util.g.c();
        long j = this.p ? this.o - this.n : 0L;
        if (this.c != null) {
            if (this.l) {
                this.c.a(j);
                if (this.c instanceof aa) {
                    com.dianping.sdk.pike.util.f.a(((aa) this.c).e, this.f, com.dianping.sdk.pike.metrics.c.UpLinkMessage, this.c.h(), ((aa) this.c).f);
                }
            } else {
                this.c.a(this.m, j);
            }
        }
        if (this.d != null) {
            this.d.i();
        }
        if (this.p && com.dianping.sdk.pike.f.o) {
            a(j);
        }
    }

    private void a(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7d7dff22458fb6b8cabb3e0810239829", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7d7dff22458fb6b8cabb3e0810239829");
            return;
        }
        String b = this.c != null ? this.c.b() : "";
        if (com.dianping.nvtunnelkit.utils.f.a(b)) {
            return;
        }
        int h = this.c != null ? this.c.h() : 0;
        int h2 = this.d != null ? this.d.h() : 0;
        int i = (int) j;
        com.dianping.sdk.pike.util.f.a(b, this.l ? 200 : this.m, h, h2, i, this.f, "", com.dianping.sdk.pike.util.a.a(h, h2, i));
    }
}
