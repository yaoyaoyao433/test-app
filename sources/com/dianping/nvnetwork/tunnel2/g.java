package com.dianping.nvnetwork.tunnel2;

import android.content.Context;
import com.dianping.nvnetwork.Request;
import com.dianping.nvnetwork.q;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class g implements com.dianping.nvnetwork.http.a {
    public static ChangeQuickRedirect a;
    public volatile f b;
    public volatile com.dianping.nvnetwork.shark.f c;
    private Context d;
    private volatile com.dianping.nvnetwork.h e;
    private volatile boolean f;
    private AtomicBoolean g;

    public g(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "57a4c0adb9106b00d02020385a4ce22e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "57a4c0adb9106b00d02020385a4ce22e");
            return;
        }
        this.f = false;
        this.g = new AtomicBoolean(false);
        this.d = context;
        this.e = com.dianping.nvnetwork.h.h();
    }

    @Override // com.dianping.nvnetwork.http.a
    public rx.d<q> exec(Request request) {
        Object[] objArr = {request};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5fea0de819f2f2c8bcf3cac7b6df9643", 6917529027641081856L)) {
            return (rx.d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5fea0de819f2f2c8bcf3cac7b6df9643");
        }
        if (this.e.ae) {
            b().b(request);
            com.dianping.nvtunnelkit.logger.b.a("RxForkTunnelService : original tunnel exec");
            return b().exec(request);
        }
        com.dianping.nvtunnelkit.logger.b.a("RxForkTunnelService : nioTunnel exec");
        a().a();
        return a().exec(request);
    }

    private f a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0af26e3221a6c9d781e9bda885eaf72a", 6917529027641081856L)) {
            return (f) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0af26e3221a6c9d781e9bda885eaf72a");
        }
        if (this.b == null) {
            synchronized (g.class) {
                if (this.b == null) {
                    a(1);
                    this.b = new f(this.d);
                }
            }
        }
        return this.b;
    }

    private com.dianping.nvnetwork.shark.f b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9af76e0293c231fedd7be538401d2919", 6917529027641081856L)) {
            return (com.dianping.nvnetwork.shark.f) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9af76e0293c231fedd7be538401d2919");
        }
        if (com.dianping.nvnetwork.h.h().ae && this.c == null) {
            synchronized (g.class) {
                if (this.c == null) {
                    a(2);
                    com.dianping.nvtunnelkit.logger.b.a("RxForkTunnelService", "use tunnelkit");
                    this.c = new com.dianping.nvnetwork.shark.f(this.d);
                }
            }
        }
        return this.c;
    }

    private void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a65e234bf695b71da8c0d4744903dd32", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a65e234bf695b71da8c0d4744903dd32");
        } else if (com.dianping.nvnetwork.h.h().ak) {
            com.dianping.nvnetwork.g.d().pv4(0L, "tunnel_framework_type", 0, 0, i, 0, 0, 0, null, null);
        }
    }
}
