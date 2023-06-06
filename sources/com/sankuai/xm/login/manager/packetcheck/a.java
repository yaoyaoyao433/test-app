package com.sankuai.xm.login.manager.packetcheck;

import com.meituan.metrics.laggy.anr.MetricsAnrManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.base.proto.protobase.d;
import com.sankuai.xm.base.proto.protobase.g;
import com.sankuai.xm.base.trace.j;
import com.sankuai.xm.c;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Timer;
import java.util.TimerTask;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class a {
    public static ChangeQuickRedirect a;
    private static a b;
    private HashMap<Integer, C1412a> c;
    private Timer d;
    private TimerTask e;

    public static /* synthetic */ void a(a aVar) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, aVar, changeQuickRedirect, false, "2b8d4f7fde214ce0e0fee1b374c73ce1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, aVar, changeQuickRedirect, false, "2b8d4f7fde214ce0e0fee1b374c73ce1");
            return;
        }
        try {
            aVar.d();
            aVar.e();
            if (aVar.b()) {
                aVar.c();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static a a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "182ef7e715e264254c6ddc53628836a4", 6917529027641081856L)) {
            return (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "182ef7e715e264254c6ddc53628836a4");
        }
        if (b == null) {
            synchronized (a.class) {
                if (b == null) {
                    b = new a();
                }
            }
        }
        return b;
    }

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "853e4865209a9370216a7bcb95089879", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "853e4865209a9370216a7bcb95089879");
            return;
        }
        this.c = new HashMap<>();
        this.d = new Timer();
        this.e = null;
    }

    public final void a(byte[] bArr) {
        Object[] objArr = {bArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b2d901ab3c25061749c0e88af1e199f5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b2d901ab3c25061749c0e88af1e199f5");
            return;
        }
        try {
            d g = g.g(bArr);
            if (g == null || a(g.g)) {
                return;
            }
            C1412a c1412a = new C1412a();
            c1412a.a = g;
            byte[] bArr2 = new byte[bArr.length];
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            c1412a.b = bArr2;
            c1412a.c = System.currentTimeMillis();
            a(c1412a);
            c();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public final void b(byte[] bArr) {
        Object[] objArr = {bArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "202d64930ba64815b90788d8aee0d1e8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "202d64930ba64815b90788d8aee0d1e8");
            return;
        }
        try {
            d g = g.g(bArr);
            if (g == null) {
                return;
            }
            synchronized (this) {
                C1412a c1412a = this.c.get(Integer.valueOf(g.g));
                if (c1412a == null) {
                    return;
                }
                this.c.remove(Integer.valueOf(g.g));
                c.a().e().a(c1412a.b, true);
                com.sankuai.xm.login.d.b("PacketCheckManage::resendPacket header:%s", c1412a.a.toString());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private boolean b() {
        boolean z;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "52ed9712db858b002aaed3a20801e514", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "52ed9712db858b002aaed3a20801e514")).booleanValue();
        }
        synchronized (this) {
            z = this.c.size() > 0;
        }
        return z;
    }

    private boolean a(int i) {
        boolean containsKey;
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3eaaed9ecdb28a54f2536d6638f47976", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3eaaed9ecdb28a54f2536d6638f47976")).booleanValue();
        }
        synchronized (this) {
            containsKey = this.c.containsKey(Integer.valueOf(i));
        }
        return containsKey;
    }

    private void a(C1412a c1412a) {
        Object[] objArr = {c1412a};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "af9a3e9aa7fb11c8e2649417a87655cc", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "af9a3e9aa7fb11c8e2649417a87655cc");
        } else if (c1412a.a != null && !a(c1412a.a.g)) {
            synchronized (this) {
                if (this.c.size() >= 100) {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d996c3f726b73cb0baa2e6a6bcfb78ae", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d996c3f726b73cb0baa2e6a6bcfb78ae");
                    } else {
                        synchronized (this) {
                            C1412a c1412a2 = null;
                            for (Integer num : this.c.keySet()) {
                                C1412a c1412a3 = this.c.get(num);
                                if (c1412a3 != null) {
                                    if (c1412a2 == null) {
                                        c1412a2 = c1412a3;
                                    }
                                    if (c1412a3.c < c1412a2.c) {
                                        c1412a2 = c1412a3;
                                    }
                                }
                            }
                            if (c1412a2 != null) {
                                com.sankuai.xm.login.d.b("PacketCheckManage::removeOneOldestPacket header:%s", c1412a2.a.toString());
                                this.c.remove(Integer.valueOf(c1412a2.a.g));
                            }
                        }
                    }
                }
                this.c.put(Integer.valueOf(c1412a.a.g), c1412a);
                com.sankuai.xm.login.d.b("PacketCheckManage::addPacket header:%s", c1412a.a.toString());
            }
        }
    }

    private void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "33f3971ff22d5becab74f05033e6b0e6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "33f3971ff22d5becab74f05033e6b0e6");
            return;
        }
        synchronized (this) {
            if (this.e != null) {
                return;
            }
            this.e = new TimerTask() { // from class: com.sankuai.xm.login.manager.packetcheck.a.1
                public static ChangeQuickRedirect a;
                private com.sankuai.xm.base.trace.g c = j.a();

                @Override // java.util.TimerTask, java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "79da117c9c4ba13646be6ef94da5fa01", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "79da117c9c4ba13646be6ef94da5fa01");
                        return;
                    }
                    try {
                        j.a(this.c);
                        a.a(a.this);
                        j.c(this.c);
                    } catch (Throwable th) {
                        j.a(this.c, th);
                        throw th;
                    }
                }
            };
            this.d.schedule(this.e, 1000L);
        }
    }

    private void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "96b0a41fe852250b90409351e3296c89", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "96b0a41fe852250b90409351e3296c89");
            return;
        }
        synchronized (this) {
            if (this.e != null) {
                this.e.cancel();
                this.e = null;
            }
        }
    }

    private void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1aab2077dea5ccb1a89540a4e6ae84c8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1aab2077dea5ccb1a89540a4e6ae84c8");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (this) {
            Iterator<Integer> it = this.c.keySet().iterator();
            while (it.hasNext()) {
                C1412a c1412a = this.c.get(it.next());
                if (c1412a != null && currentTimeMillis - c1412a.c > MetricsAnrManager.ANR_THRESHOLD) {
                    com.sankuai.xm.login.d.b("PacketCheckManage::clearTimeoutPacket header:%s", c1412a.a.toString());
                    it.remove();
                }
            }
        }
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.xm.login.manager.packetcheck.a$a  reason: collision with other inner class name */
    /* loaded from: classes6.dex */
    public class C1412a {
        public d a;
        public byte[] b;
        public long c;

        private C1412a() {
            this.a = null;
            this.b = null;
            this.c = 0L;
        }
    }
}
