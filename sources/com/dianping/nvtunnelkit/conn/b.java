package com.dianping.nvtunnelkit.conn;

import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import com.dianping.nvtunnelkit.core.d;
import com.dianping.nvtunnelkit.core.i;
import com.dianping.nvtunnelkit.utils.g;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import dianping.com.nvlinker.NVLinker;
import java.io.IOException;
import java.net.Inet6Address;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public abstract class b<W, R> implements Handler.Callback, c<W, R> {
    public static ChangeQuickRedirect j;
    private volatile long A;
    private boolean B;
    private Runnable C;
    private Runnable D;
    private final AtomicBoolean a;
    private final AtomicBoolean b;
    private final AtomicBoolean c;
    private final com.dianping.nvtunnelkit.core.d d;
    private final AtomicBoolean e;
    private final AtomicBoolean f;
    private final AtomicBoolean g;
    private volatile long h;
    private volatile long i;
    public final String k;
    public final com.dianping.nvtunnelkit.conn.a l;
    public final SocketAddress m;
    public final List<d<b>> n;
    public final AtomicBoolean o;
    public final AtomicInteger p;
    public final String q;
    public final d.b r;
    public volatile long s;
    public volatile long t;
    public i u;
    public a v;
    protected int w;
    private volatile long x;
    private volatile long y;
    private volatile long z;

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public interface a {
        void a(int i);

        void a(Throwable th);
    }

    public b(com.dianping.nvtunnelkit.conn.a aVar, SocketAddress socketAddress) {
        Object[] objArr = {aVar, socketAddress};
        ChangeQuickRedirect changeQuickRedirect = j;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6389ea30739ddb8dbc1444cce7ec84aa", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6389ea30739ddb8dbc1444cce7ec84aa");
            return;
        }
        this.e = new AtomicBoolean(false);
        this.f = new AtomicBoolean(false);
        this.g = new AtomicBoolean(false);
        this.h = 0L;
        this.i = Long.MAX_VALUE;
        this.B = false;
        this.C = new Runnable() { // from class: com.dianping.nvtunnelkit.conn.b.1
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "03521f5092fb0589ce28bb62efde784b", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "03521f5092fb0589ce28bb62efde784b");
                } else {
                    b.this.a((Throwable) new SocketTimeoutException("timeout"));
                }
            }
        };
        this.D = new Runnable() { // from class: com.dianping.nvtunnelkit.conn.b.2
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "324b697cd13cfb5455dd186f1007b6ed", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "324b697cd13cfb5455dd186f1007b6ed");
                } else {
                    b.this.t();
                }
            }
        };
        if (aVar == null) {
            throw new IllegalArgumentException("connectionConfig cannot be null.");
        }
        this.k = com.dianping.nvtunnelkit.logger.a.a(aVar.n, "NvBaseConnection");
        this.m = socketAddress;
        this.a = new AtomicBoolean(false);
        this.b = new AtomicBoolean(false);
        this.o = new AtomicBoolean(false);
        this.c = new AtomicBoolean(false);
        this.l = aVar;
        this.n = new ArrayList();
        this.u = new i(10);
        this.p = new AtomicInteger(0);
        this.q = g.a(this.m);
        this.d = d.a.a(aVar.n);
        this.r = this.d.a(this);
        this.w = aVar.e ? 100 : 0;
    }

    public final void a(d dVar) {
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = j;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "70384acac537f4d84ea078611a3e57d2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "70384acac537f4d84ea078611a3e57d2");
        } else {
            this.n.add(dVar);
        }
    }

    public final void b(d dVar) {
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = j;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "38ae268966f03b20a5f1fb68f64fe2a8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "38ae268966f03b20a5f1fb68f64fe2a8");
        } else {
            this.n.remove(dVar);
        }
    }

    public void a(long j2) {
        Object[] objArr = {new Long(j2)};
        ChangeQuickRedirect changeQuickRedirect = j;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "34fd87948255159d9813045e2dfdde12", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "34fd87948255159d9813045e2dfdde12");
        } else if (l()) {
        } else {
            this.h = d();
            this.B = NVLinker.isAppBackground();
            try {
                r();
                this.r.postDelayed(this.C, j2);
            } catch (IllegalStateException unused) {
                com.dianping.nvtunnelkit.logger.b.b(this.k, String.format("connect err: closed %s, real closed: %s.", Boolean.valueOf(l()), Boolean.valueOf(this.o.get())));
            }
        }
    }

    public final boolean k() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = j;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7bdbe447e864ed4ac3ff14af7cd9df1d", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7bdbe447e864ed4ac3ff14af7cd9df1d")).booleanValue() : this.a.get();
    }

    @Override // com.dianping.nvtunnelkit.conn.c
    public final boolean l() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = j;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fe69f28f7d02239b1116e48ee3cc0e8f", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fe69f28f7d02239b1116e48ee3cc0e8f")).booleanValue() : this.b.get();
    }

    public final String f() {
        return this.q;
    }

    @Override // com.dianping.nvtunnelkit.conn.c
    public final boolean b(long j2) throws IOException {
        Object[] objArr = {new Long(j2)};
        ChangeQuickRedirect changeQuickRedirect = j;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "50453f8d3c4ad43cd503a6938f1fafa8", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "50453f8d3c4ad43cd503a6938f1fafa8")).booleanValue();
        }
        long d = d();
        if (m()) {
            throw new IOException("ping timeout.");
        }
        return this.l.o ? d - this.s >= j2 : (this.y != 0 && d - this.y >= j2) || (this.x != 0 && d - this.x >= j2);
    }

    public final boolean m() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = j;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "20aa1202785770de916b10506c39d362", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "20aa1202785770de916b10506c39d362")).booleanValue();
        }
        long d = d();
        if (this.y == 0 || d - this.y < 300000) {
            long b = b();
            return this.s - this.A > 0 && b > 0 && d - this.z > b;
        }
        return true;
    }

    private long b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = j;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "73c18abb9327de582fc422d2800b29fa", RobustBitConfig.DEFAULT_VALUE) ? ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "73c18abb9327de582fc422d2800b29fa")).longValue() : c();
    }

    public final int a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = j;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1764e8617edfca432baaae3d25a6331d", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1764e8617edfca432baaae3d25a6331d")).intValue();
        }
        if (this.u == null) {
            return -1;
        }
        return this.u.a();
    }

    public final int n() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = j;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c30c687e64f1887c7b4d203823a5550e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c30c687e64f1887c7b4d203823a5550e")).intValue();
        }
        SocketAddress socketAddress = this.m;
        if ((socketAddress instanceof InetSocketAddress) && (((InetSocketAddress) socketAddress).getAddress() instanceof Inet6Address)) {
            if (a() != Integer.MAX_VALUE) {
                return a();
            }
            return a() - this.l.g;
        }
        return a();
    }

    public final long o() {
        return this.i - this.h;
    }

    @Override // com.dianping.nvtunnelkit.conn.c
    public void p() throws IOException {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = j;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2863739dce855ddd95900fcad509154b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2863739dce855ddd95900fcad509154b");
            return;
        }
        this.x = d();
        if (this.s - this.A <= 0) {
            this.z = this.x;
        }
        this.s = this.x;
    }

    public void h() {
        int min;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = j;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "245255c1ec7ef01e69e10daf7d6bc56b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "245255c1ec7ef01e69e10daf7d6bc56b");
            return;
        }
        this.A = d();
        this.t = this.A - this.s;
        if (k()) {
            i iVar = this.u;
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = j;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f8ffa10d86bb6e0bdb38ab32d7b06c5b", RobustBitConfig.DEFAULT_VALUE)) {
                min = ((Integer) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f8ffa10d86bb6e0bdb38ab32d7b06c5b")).intValue();
            } else if (this.s == 0) {
                min = Integer.MAX_VALUE;
            } else {
                long j2 = this.A - this.s;
                if (j2 < 0) {
                    min = (int) Math.min(2147483647L, Math.max(this.t, d() - this.s));
                } else {
                    min = (int) Math.min(2147483647L, j2);
                }
            }
            iVar.a(min);
        }
        if (this.p.get() > 0) {
            this.p.decrementAndGet();
            q();
        }
        if (x()) {
            String str = this.k;
            com.dianping.nvtunnelkit.logger.b.b(str, "recv pong, ip: " + this.q + " ,this: " + hashCode());
        }
    }

    public void q() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = j;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6ff96ba8b756bf7e15d9b63bae21d08f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6ff96ba8b756bf7e15d9b63bae21d08f");
        } else if (this.v == null) {
        } else {
            if (this.p.get() == 0) {
                this.v.a(a());
                this.v = null;
                return;
            }
            try {
                p();
            } catch (IOException e) {
                com.dianping.nvtunnelkit.logger.b.a(this.k, e);
                this.p.set(0);
                if (this.v != null) {
                    this.v.a(e);
                }
                this.v = null;
            }
        }
    }

    public void a(W w) throws IOException {
        Object[] objArr = {w};
        ChangeQuickRedirect changeQuickRedirect = j;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f04e51e7a758cd1e16f6a42a777e41fe", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f04e51e7a758cd1e16f6a42a777e41fe");
            return;
        }
        this.x = d();
        String str = this.k;
        com.dianping.nvtunnelkit.logger.b.a(str, "write, addr: " + this.q);
    }

    public void i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = j;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2382a615df74f6a7b2c106272e9b3087", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2382a615df74f6a7b2c106272e9b3087");
        } else if (this.f.compareAndSet(false, true)) {
            String str = this.k;
            com.dianping.nvtunnelkit.logger.b.b(str, "send connect success, addr: " + this.q + ", closed: " + l() + " ,this: " + hashCode());
            this.i = d();
            this.a.set(true);
            if (l()) {
                a(false, this.i - this.h);
                return;
            }
            try {
                p();
                r();
                this.r.removeMessages(1);
                try {
                    this.r.obtainMessage(1).sendToTarget();
                } catch (IllegalStateException unused) {
                    com.dianping.nvtunnelkit.logger.b.b(this.k, String.format("connect success err: closed %s, real closed: %s.", Boolean.valueOf(l()), Boolean.valueOf(this.o.get())));
                }
                a(true, this.i - this.h);
            } catch (IOException unused2) {
                String str2 = this.k;
                com.dianping.nvtunnelkit.logger.b.b(str2, "Connect Success but ping err, do close it. ip : " + this.q);
                t();
                a(false, this.i - this.h);
            }
        }
    }

    public void j() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = j;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "babb54c03c32521b4604527a977e1019", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "babb54c03c32521b4604527a977e1019");
        } else if (this.g.compareAndSet(false, true)) {
            String str = this.k;
            com.dianping.nvtunnelkit.logger.b.b(str, "send connect close, addr: " + this.q + " ,this: " + hashCode());
            r();
            this.r.removeMessages(10);
            try {
                this.r.obtainMessage(10).sendToTarget();
            } catch (IllegalStateException unused) {
                com.dianping.nvtunnelkit.logger.b.b(this.k, String.format("connection closed err: closed %s, real closed: %s.", Boolean.valueOf(l()), Boolean.valueOf(this.o.get())));
            }
            this.b.set(true);
        }
    }

    public final void a(Throwable th) {
        Object[] objArr = {th};
        ChangeQuickRedirect changeQuickRedirect = j;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6806d08e4dff6e6883ed53e18d098fc6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6806d08e4dff6e6883ed53e18d098fc6");
        } else if (this.e.compareAndSet(false, true)) {
            String str = this.k;
            com.dianping.nvtunnelkit.logger.b.a(str, "send connect failed, addr: " + this.q + ", close: " + l(), th);
            if (!this.a.get()) {
                this.i = d();
            }
            if (l()) {
                if (this.a.get()) {
                    return;
                }
                a(false, this.i - this.h);
                return;
            }
            r();
            this.r.removeMessages(5);
            try {
                this.r.obtainMessage(5, th).sendToTarget();
            } catch (IllegalStateException e) {
                String str2 = this.k;
                com.dianping.nvtunnelkit.logger.b.a(str2, "sendConnectFailed msg err, closed: " + l(), e);
            }
            if (this.a.get()) {
                return;
            }
            a(false, this.i - this.h);
        }
    }

    private void a(boolean z, long j2) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), new Long(j2)};
        ChangeQuickRedirect changeQuickRedirect = j;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4190f1f336ecfd7143ac1effb41d0cf0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4190f1f336ecfd7143ac1effb41d0cf0");
            return;
        }
        try {
            if (this.w > 0 && (this.m instanceof InetSocketAddress)) {
                if (!this.B && !NVLinker.isAppBackground()) {
                    String hostAddress = ((InetSocketAddress) this.m).getAddress().getHostAddress();
                    int a2 = g.a(hostAddress);
                    if (!z) {
                        a2 *= -1;
                    }
                    int i = a2;
                    String str = this.l.k;
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("ab", str);
                    String jSONObject2 = jSONObject.toString();
                    com.dianping.nvtunnelkit.ext.d.a().a(0L, this.l.n + "_tcp_connect", 0, 0, 0, 0, i, 0, 0, (int) j2, hostAddress, null, this.w, null, null, null, null, null, null, null, g.a(str, jSONObject2));
                }
                return;
            }
            if (z) {
                com.dianping.nvtunnelkit.logger.b.b("connect to:" + this.q + " success in " + j2 + "ms.network:" + com.dianping.nvtunnelkit.utils.c.b() + "\n");
                return;
            }
            com.dianping.nvtunnelkit.logger.b.b("connect to:" + this.q + " failed.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void r() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = j;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9e1d201977b9b83740448032f321ffcb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9e1d201977b9b83740448032f321ffcb");
        } else if (l()) {
        } else {
            this.r.removeCallbacks(this.C);
        }
    }

    public final void s() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = j;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "93cdb36c234e301becce3c4d4a718dde", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "93cdb36c234e301becce3c4d4a718dde");
        } else if (l()) {
            String str = this.k;
            com.dianping.nvtunnelkit.logger.b.b(str, "softClose already closed. addr: " + this.q);
        } else if (!this.c.compareAndSet(false, true)) {
            String str2 = this.k;
            com.dianping.nvtunnelkit.logger.b.a(str2, "softClose already triggered. addr: " + this.q);
        } else {
            try {
                this.r.removeCallbacks(this.D);
                this.r.postDelayed(this.D, c());
            } catch (IllegalStateException unused) {
                com.dianping.nvtunnelkit.logger.b.b(this.k, String.format("soft close err: closed %s, real closed: %s.", Boolean.valueOf(l()), Boolean.valueOf(this.o.get())));
            }
        }
    }

    @Override // com.dianping.nvtunnelkit.conn.c
    public final void t() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = j;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c0c3ce2a6b406b205f9a67a3312c9236", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c0c3ce2a6b406b205f9a67a3312c9236");
        } else if (l()) {
            String str = this.k;
            com.dianping.nvtunnelkit.logger.b.b(str, "already closed. addr: " + this.q + " ,this: " + hashCode());
        } else {
            j();
        }
    }

    public void u() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = j;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0576ca85e91779ae345547be531aa6d5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0576ca85e91779ae345547be531aa6d5");
        } else if (!this.o.compareAndSet(false, true)) {
            com.dianping.nvtunnelkit.logger.b.b(this.k, "realClose already closed.");
        } else {
            String str = this.k;
            com.dianping.nvtunnelkit.logger.b.b(str, "real Close: " + this.q + " ,this: " + hashCode());
            com.dianping.nvtunnelkit.core.d dVar = this.d;
            d.b bVar = this.r;
            Object[] objArr2 = {bVar};
            ChangeQuickRedirect changeQuickRedirect2 = com.dianping.nvtunnelkit.core.d.a;
            if (PatchProxy.isSupport(objArr2, dVar, changeQuickRedirect2, false, "fe2f397fcf107718ef56725ab2fbad56", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, dVar, changeQuickRedirect2, false, "fe2f397fcf107718ef56725ab2fbad56");
            } else if (bVar != null && !dVar.c) {
                d.b.a(bVar);
                dVar.b.a(bVar.b);
            }
            e();
            this.n.clear();
        }
    }

    @Override // com.dianping.nvtunnelkit.conn.c
    public final com.dianping.nvtunnelkit.conn.a v() {
        return this.l;
    }

    @Override // com.dianping.nvtunnelkit.conn.c
    public final SocketAddress w() {
        return this.m;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        Object[] objArr = {message};
        ChangeQuickRedirect changeQuickRedirect = j;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ea1209ad59727c4f0d752d6e3c58c666", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ea1209ad59727c4f0d752d6e3c58c666")).booleanValue();
        }
        int i = message.what;
        if (i == 1) {
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = j;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b28bcf1d2d1fefa14a6512b30bbbf7e7", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b28bcf1d2d1fefa14a6512b30bbbf7e7");
            } else {
                for (d dVar : new ArrayList(this.n)) {
                    dVar.a(this);
                }
            }
            return true;
        } else if (i == 5) {
            if (message.obj instanceof Throwable) {
                b((Throwable) message.obj);
            }
            j();
            return true;
        } else if (i == 10) {
            u();
            return true;
        } else if (i != 15) {
            return false;
        } else {
            a(message.arg1);
            return true;
        }
    }

    private long d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = j;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "87de29750a8da815a70e925cedefb998", RobustBitConfig.DEFAULT_VALUE) ? ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "87de29750a8da815a70e925cedefb998")).longValue() : SystemClock.elapsedRealtime();
    }

    public void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = j;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a0863ff67637573fa79e2ef322554f3c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a0863ff67637573fa79e2ef322554f3c");
            return;
        }
        this.y = d();
        b(i);
    }

    private void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = j;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c717095c9fa59b2890e0b5f59f3fc72d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c717095c9fa59b2890e0b5f59f3fc72d");
            return;
        }
        for (d dVar : new ArrayList(this.n)) {
            dVar.b(this);
        }
    }

    private void b(Throwable th) {
        Object[] objArr = {th};
        ChangeQuickRedirect changeQuickRedirect = j;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d6da2b400e0d8b2057e48cb337d176a6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d6da2b400e0d8b2057e48cb337d176a6");
            return;
        }
        for (d dVar : new ArrayList(this.n)) {
            dVar.a(this, th);
        }
    }

    private long c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = j;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9ffde05fce136f61deec65ad2b89f1f2", RobustBitConfig.DEFAULT_VALUE) ? ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9ffde05fce136f61deec65ad2b89f1f2")).longValue() : this.l.f;
    }

    public final boolean x() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = j;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8ff1a59ef41f59301ea59334a5a1bb15", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8ff1a59ef41f59301ea59334a5a1bb15")).booleanValue() : (this.l.n.contains("pike") && NVLinker.isAppBackground()) ? false : true;
    }
}
