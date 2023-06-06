package com.sankuai.xm.login.net;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.base.util.ac;
import java.nio.channels.Selector;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class h extends com.sankuai.xm.login.net.taskqueue.f {
    private static volatile int a;
    public static ChangeQuickRedirect b;
    public Map<Integer, d> c;
    public volatile boolean d;
    private Selector m;
    private i n;

    public h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "08c95757875ba2fcaced9767b7c7152c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "08c95757875ba2fcaced9767b7c7152c");
            return;
        }
        this.c = null;
        this.m = null;
        this.n = null;
        this.d = false;
        this.c = new ConcurrentHashMap();
        this.n = new i(this);
    }

    @Override // com.sankuai.xm.login.net.taskqueue.f, com.sankuai.xm.login.net.taskqueue.b
    public final com.sankuai.xm.login.net.taskqueue.a c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "97a63fa8fe5c428644641acb15826f17", 6917529027641081856L) ? (com.sankuai.xm.login.net.taskqueue.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "97a63fa8fe5c428644641acb15826f17") : new f(this.m);
    }

    public final int a(final a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "73b676cc5d3c486ff2b1a14887deba9e", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "73b676cc5d3c486ff2b1a14887deba9e")).intValue();
        }
        final int i = a + 1;
        a = i;
        a(new com.sankuai.xm.login.net.taskqueue.base.b() { // from class: com.sankuai.xm.login.net.h.3
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.xm.login.net.taskqueue.base.b
            public final void a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "56fc1c5d29fc75f947b6b2397371e283", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "56fc1c5d29fc75f947b6b2397371e283");
                    return;
                }
                h.this.c.put(Integer.valueOf(i), new e(i, h.this.m, aVar));
                com.sankuai.xm.login.d.a("SocketQueue::create:: link id = " + i);
            }
        });
        return i;
    }

    public final void a(final int i, final String str, final int i2) {
        Object[] objArr = {Integer.valueOf(i), str, Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e85caf9388caec4d22321850eef0459f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e85caf9388caec4d22321850eef0459f");
        } else if (ac.a(str)) {
            com.sankuai.xm.login.d.c("SocketQueue::connect:: ip is invalid", new Object[0]);
        } else {
            a(new com.sankuai.xm.login.net.taskqueue.base.b() { // from class: com.sankuai.xm.login.net.h.4
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.xm.login.net.taskqueue.base.b
                public final void a() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4c91e85ccbb80099d0eb50d60c4ada61", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4c91e85ccbb80099d0eb50d60c4ada61");
                        return;
                    }
                    d dVar = (d) h.this.c.get(Integer.valueOf(i));
                    if (dVar != null) {
                        dVar.a(str, i2);
                        return;
                    }
                    com.sankuai.xm.login.d.d("SocketQueue::connect:: invalid linkId = " + i, new Object[0]);
                }
            });
        }
    }

    public final void a(final int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b7e407c5bc76b561052085c307350d16", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b7e407c5bc76b561052085c307350d16");
        } else {
            a(new com.sankuai.xm.login.net.taskqueue.base.b() { // from class: com.sankuai.xm.login.net.h.6
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.xm.login.net.taskqueue.base.b
                public final void a() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9053a01065ed2b69add6f1ac04715b30", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9053a01065ed2b69add6f1ac04715b30");
                        return;
                    }
                    d dVar = (d) h.this.c.get(Integer.valueOf(i));
                    if (dVar != null) {
                        dVar.a(false, 15);
                        h.this.c.remove(Integer.valueOf(i));
                    } else {
                        com.sankuai.xm.login.d.a("SocketQueue.close => invalid linkId=" + i);
                    }
                    com.sankuai.xm.login.d.a("SocketQueue::close => link id = " + i);
                }
            });
        }
    }

    public void cancel(final int i, final String str) {
        Object[] objArr = {Integer.valueOf(i), str};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ce5f6b9c2cce2b0596b716e94f9e914b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ce5f6b9c2cce2b0596b716e94f9e914b");
        } else {
            a(new com.sankuai.xm.login.net.taskqueue.base.b() { // from class: com.sankuai.xm.login.net.h.7
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.xm.login.net.taskqueue.base.b
                public final void a() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7e998686cee0810f520588a6250b9f1a", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7e998686cee0810f520588a6250b9f1a");
                        return;
                    }
                    d dVar = (d) h.this.c.get(Integer.valueOf(i));
                    if (dVar != null) {
                        dVar.cancel(str);
                    } else {
                        com.sankuai.xm.login.d.a("SocketQueue.cancel => invalid linkId=" + i);
                    }
                    com.sankuai.xm.login.d.a("SocketQueue::cancel => link id = " + i);
                }
            });
        }
    }

    public final void a(int i, int i2, int i3) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e824f0211b560ebcb04a10352e1c3a52", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e824f0211b560ebcb04a10352e1c3a52");
        } else {
            this.n.a(i, i2, i3);
        }
    }

    public final void b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a2689cb573c9966e1ae934232c7aaf91", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a2689cb573c9966e1ae934232c7aaf91");
        } else {
            this.n.a(i);
        }
    }

    public final void a(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fc15c44e88bec575f4583bfbbacb3b93", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fc15c44e88bec575f4583bfbbacb3b93");
        } else {
            this.n.a(i, i2);
        }
    }
}
