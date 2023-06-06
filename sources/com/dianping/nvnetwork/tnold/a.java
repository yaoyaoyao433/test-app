package com.dianping.nvnetwork.tnold;

import android.os.Message;
import com.dianping.nvtunnelkit.conn.a;
import com.dianping.nvtunnelkit.kit.t;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.net.SocketAddress;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class a extends com.dianping.nvbinarytunnel.a {
    private static final String b = com.dianping.nvtunnelkit.logger.a.a("TNBaseConnection");
    public static ChangeQuickRedirect d;
    final AtomicInteger e;
    public final com.dianping.nvtunnelkit.core.i f;
    final com.dianping.nvtunnelkit.core.i g;
    double h;

    public static /* synthetic */ void a(a aVar, int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = com.dianping.nvtunnelkit.conn.b.j;
        if (PatchProxy.isSupport(objArr, aVar, changeQuickRedirect, false, "1f54db8f08070470f4730ee0e29bd178", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, aVar, changeQuickRedirect, false, "1f54db8f08070470f4730ee0e29bd178");
            return;
        }
        String str = aVar.k;
        com.dianping.nvtunnelkit.logger.b.a(str, "sendDataReadable, addr: " + aVar.q + ", closed: " + aVar.l());
        if (aVar.l()) {
            return;
        }
        super.r();
        try {
            if (aVar.l.b == a.b.BLOCKING) {
                super.a(i);
                return;
            }
            Message obtainMessage = aVar.r.obtainMessage(15);
            obtainMessage.arg1 = i;
            obtainMessage.sendToTarget();
        } catch (IllegalStateException unused) {
            com.dianping.nvtunnelkit.logger.b.b(aVar.k, String.format("data readable err: closed %s, real closed: %s.", Boolean.valueOf(aVar.l()), Boolean.valueOf(aVar.o.get())));
        }
    }

    public a(com.dianping.nvtunnelkit.conn.a aVar, SocketAddress socketAddress, t tVar) {
        super(aVar, socketAddress, tVar);
        Object[] objArr = {aVar, socketAddress, tVar};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "778d0bfeba10ed176f4c9d59905b26fb", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "778d0bfeba10ed176f4c9d59905b26fb");
            return;
        }
        this.e = new AtomicInteger(0);
        this.f = new com.dianping.nvtunnelkit.core.i(10);
        this.g = new com.dianping.nvtunnelkit.core.i(10);
        tVar.a(new t.a() { // from class: com.dianping.nvnetwork.tnold.a.1
            public static ChangeQuickRedirect a;

            @Override // com.dianping.nvtunnelkit.kit.t.a
            public final void a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2fe91345e69cba6a49227ce98ec97b41", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2fe91345e69cba6a49227ce98ec97b41");
                } else {
                    a.this.i();
                }
            }

            @Override // com.dianping.nvtunnelkit.kit.t.a
            public final void a(Throwable th) {
                Object[] objArr2 = {th};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "cbd4fefd59e28b835f4ed65569789756", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "cbd4fefd59e28b835f4ed65569789756");
                } else {
                    a.this.a(th);
                }
            }

            @Override // com.dianping.nvtunnelkit.kit.t.a
            public final void a(int i) {
                Object[] objArr2 = {0};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "30a7fcf4f63cd292f8b165d86f869b0f", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "30a7fcf4f63cd292f8b165d86f869b0f");
                } else {
                    a.a(a.this, 0);
                }
            }

            @Override // com.dianping.nvtunnelkit.kit.t.a
            public final com.dianping.nvtunnelkit.conn.a b() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "16cc88568f816df0da61a2f5c1c67248", 6917529027641081856L) ? (com.dianping.nvtunnelkit.conn.a) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "16cc88568f816df0da61a2f5c1c67248") : a.this.l;
            }
        });
    }

    public final int c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d0fdb90543a284b1b8d9835f451e81a8", 6917529027641081856L) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d0fdb90543a284b1b8d9835f451e81a8")).intValue() : this.e.get();
    }

    public final int d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b019617da25a56c40320ec49d211a066", 6917529027641081856L) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b019617da25a56c40320ec49d211a066")).intValue() : this.g.a();
    }

    public final int b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2d0e8942cc621aaba3f81b35e0880ffd", 6917529027641081856L) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2d0e8942cc621aaba3f81b35e0880ffd")).intValue() : this.f.a();
    }

    public final double e() {
        return this.h;
    }

    @Override // com.dianping.nvtunnelkit.kit.w
    public double g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9106f9d0cef3d80b6e50e46651e5d5cf", 6917529027641081856L)) {
            return ((Double) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9106f9d0cef3d80b6e50e46651e5d5cf")).doubleValue();
        }
        int[] iArr = this.l.j;
        if (iArr == null || iArr.length != 4) {
            return 1.0d;
        }
        this.h = (((iArr[0] * Math.atan(d())) - (iArr[1] * Math.atan(n() >= 0 ? n() : 1.0d))) - (iArr[2] * Math.atan(b()))) - (iArr[3] * Math.atan(c()));
        return this.h;
    }
}
