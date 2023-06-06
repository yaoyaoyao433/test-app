package com.squareup.okhttp.internal.http;

import android.os.SystemClock;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.takeoutnew.util.aop.BootAPICatMonitor;
import com.squareup.okhttp.ab;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.net.Proxy;
import java.util.List;
import java.util.concurrent.TimeUnit;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class s {
    public final com.squareup.okhttp.a a;
    public q b;
    public com.squareup.okhttp.internal.io.b c;
    private final com.squareup.okhttp.k d;
    private boolean e;
    private boolean f;
    private j g;

    public s(com.squareup.okhttp.k kVar, com.squareup.okhttp.a aVar) {
        this.d = kVar;
        this.a = aVar;
    }

    public final j a(int i, int i2, int i3, boolean z, boolean z2) throws p, IOException {
        j eVar;
        try {
            com.squareup.okhttp.internal.io.b b = b(i, i2, i3, z, z2);
            if (b.d != null) {
                eVar = new f(this, b.d);
            } else {
                b.b.setSoTimeout(i2);
                b.f.timeout().timeout(i2, TimeUnit.MILLISECONDS);
                b.g.timeout().timeout(i3, TimeUnit.MILLISECONDS);
                eVar = new e(this, b.f, b.g);
            }
            synchronized (this.d) {
                b.e++;
                this.g = eVar;
            }
            return eVar;
        } catch (IOException e) {
            throw new p(e);
        }
    }

    private com.squareup.okhttp.internal.io.b b(int i, int i2, int i3, boolean z, boolean z2) throws IOException, p {
        while (true) {
            com.squareup.okhttp.internal.io.b a = a(i, i2, i3, z);
            synchronized (this.d) {
                if (a.e == 0) {
                    return a;
                }
                if (a.a(z2)) {
                    return a;
                }
                a(true, false, true);
            }
        }
    }

    private com.squareup.okhttp.internal.io.b a(int i, int i2, int i3, boolean z) throws IOException, p {
        int i4;
        final String str;
        final String str2;
        synchronized (this.d) {
            if (this.e) {
                throw new IllegalStateException("released");
            }
            if (this.g == null) {
                if (this.f) {
                    throw new IOException("Canceled");
                }
                com.squareup.okhttp.internal.io.b bVar = this.c;
                if (bVar == null || bVar.i) {
                    com.squareup.okhttp.internal.io.b a = com.squareup.okhttp.internal.d.b.a(this.d, this.a, this);
                    if (a != null) {
                        this.c = a;
                        return a;
                    }
                    if (this.b == null) {
                        this.b = new q(this.a, c());
                    }
                    com.squareup.okhttp.internal.io.b bVar2 = new com.squareup.okhttp.internal.io.b(this.b.b());
                    a(bVar2);
                    synchronized (this.d) {
                        com.squareup.okhttp.internal.d.b.b(this.d, bVar2);
                        this.c = bVar2;
                        if (this.f) {
                            throw new IOException("Canceled");
                        }
                    }
                    List<com.squareup.okhttp.l> list = this.a.f;
                    Object[] objArr = {bVar2, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), list, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                    ChangeQuickRedirect changeQuickRedirect = com.sankuai.meituan.takeoutnew.util.aop.i.a;
                    if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "79b026c839f00b4d4f4ee0dd141ff6d6", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "79b026c839f00b4d4f4ee0dd141ff6d6");
                    } else {
                        long elapsedRealtime = SystemClock.elapsedRealtime();
                        try {
                            bVar2.a(i, i2, i3, list, z);
                            final int elapsedRealtime2 = (int) (SystemClock.elapsedRealtime() - elapsedRealtime);
                            final String a2 = com.sankuai.meituan.takeoutnew.util.aop.i.a(bVar2);
                            if (a2 != null) {
                                try {
                                    i4 = bVar2.a.a.a.a.equals("https") ? 8 : 0;
                                } catch (Exception e) {
                                    e = e;
                                    i4 = 0;
                                }
                                try {
                                    str2 = bVar2.a.c.getAddress().getHostAddress();
                                } catch (Exception e2) {
                                    e = e2;
                                    com.sankuai.waimai.foundation.utils.log.a.b(e);
                                    str2 = null;
                                    final int i5 = i4;
                                    com.sankuai.waimai.foundation.utils.log.a.d("OCM", "connection %s establish took %d ms", bVar2.b, Integer.valueOf(elapsedRealtime2));
                                    com.sankuai.waimai.launcher.util.aop.b.a(BootAPICatMonitor.sCatExecutor, new Runnable() { // from class: com.sankuai.meituan.takeoutnew.util.aop.i.1
                                        public static ChangeQuickRedirect a;

                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            Object[] objArr2 = new Object[0];
                                            ChangeQuickRedirect changeQuickRedirect2 = a;
                                            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5fb1817e3aa8d9fdd40df1c2374d9606", RobustBitConfig.DEFAULT_VALUE)) {
                                                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5fb1817e3aa8d9fdd40df1c2374d9606");
                                                return;
                                            }
                                            com.sankuai.waimai.platform.capacity.log.c a3 = com.sankuai.waimai.platform.capacity.log.c.a();
                                            a3.pv3(0L, "waimai_image_okhttp_connection/" + a2, 0, i5, r3 ? 200 : 400, 0, 0, elapsedRealtime2, str2, 5);
                                        }
                                    });
                                    c().b(bVar2.a);
                                    return bVar2;
                                }
                                final int i52 = i4;
                                com.sankuai.waimai.foundation.utils.log.a.d("OCM", "connection %s establish took %d ms", bVar2.b, Integer.valueOf(elapsedRealtime2));
                                com.sankuai.waimai.launcher.util.aop.b.a(BootAPICatMonitor.sCatExecutor, new Runnable() { // from class: com.sankuai.meituan.takeoutnew.util.aop.i.1
                                    public static ChangeQuickRedirect a;

                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        Object[] objArr2 = new Object[0];
                                        ChangeQuickRedirect changeQuickRedirect2 = a;
                                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5fb1817e3aa8d9fdd40df1c2374d9606", RobustBitConfig.DEFAULT_VALUE)) {
                                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5fb1817e3aa8d9fdd40df1c2374d9606");
                                            return;
                                        }
                                        com.sankuai.waimai.platform.capacity.log.c a3 = com.sankuai.waimai.platform.capacity.log.c.a();
                                        a3.pv3(0L, "waimai_image_okhttp_connection/" + a2, 0, i52, r3 ? 200 : 400, 0, 0, elapsedRealtime2, str2, 5);
                                    }
                                });
                            }
                        } catch (Throwable th) {
                            final int elapsedRealtime3 = (int) (SystemClock.elapsedRealtime() - elapsedRealtime);
                            final String a3 = com.sankuai.meituan.takeoutnew.util.aop.i.a(bVar2);
                            if (a3 != null) {
                                try {
                                    i4 = bVar2.a.a.a.a.equals("https") ? 8 : 0;
                                } catch (Exception e3) {
                                    e = e3;
                                    i4 = 0;
                                }
                                try {
                                    str = bVar2.a.c.getAddress().getHostAddress();
                                } catch (Exception e4) {
                                    e = e4;
                                    com.sankuai.waimai.foundation.utils.log.a.b(e);
                                    str = null;
                                    final int i6 = i4;
                                    com.sankuai.waimai.foundation.utils.log.a.d("OCM", "connection %s establish took %d ms", bVar2.b, Integer.valueOf(elapsedRealtime3));
                                    com.sankuai.waimai.launcher.util.aop.b.a(BootAPICatMonitor.sCatExecutor, new Runnable() { // from class: com.sankuai.meituan.takeoutnew.util.aop.i.1
                                        public static ChangeQuickRedirect a;

                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            Object[] objArr2 = new Object[0];
                                            ChangeQuickRedirect changeQuickRedirect2 = a;
                                            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5fb1817e3aa8d9fdd40df1c2374d9606", RobustBitConfig.DEFAULT_VALUE)) {
                                                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5fb1817e3aa8d9fdd40df1c2374d9606");
                                                return;
                                            }
                                            com.sankuai.waimai.platform.capacity.log.c a32 = com.sankuai.waimai.platform.capacity.log.c.a();
                                            a32.pv3(0L, "waimai_image_okhttp_connection/" + a3, 0, i6, r3 ? 200 : 400, 0, 0, elapsedRealtime3, str, 5);
                                        }
                                    });
                                    throw th;
                                }
                                final int i62 = i4;
                                com.sankuai.waimai.foundation.utils.log.a.d("OCM", "connection %s establish took %d ms", bVar2.b, Integer.valueOf(elapsedRealtime3));
                                com.sankuai.waimai.launcher.util.aop.b.a(BootAPICatMonitor.sCatExecutor, new Runnable() { // from class: com.sankuai.meituan.takeoutnew.util.aop.i.1
                                    public static ChangeQuickRedirect a;

                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        Object[] objArr2 = new Object[0];
                                        ChangeQuickRedirect changeQuickRedirect2 = a;
                                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5fb1817e3aa8d9fdd40df1c2374d9606", RobustBitConfig.DEFAULT_VALUE)) {
                                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5fb1817e3aa8d9fdd40df1c2374d9606");
                                            return;
                                        }
                                        com.sankuai.waimai.platform.capacity.log.c a32 = com.sankuai.waimai.platform.capacity.log.c.a();
                                        a32.pv3(0L, "waimai_image_okhttp_connection/" + a3, 0, i62, r3 ? 200 : 400, 0, 0, elapsedRealtime3, str, 5);
                                    }
                                });
                            }
                            throw th;
                        }
                    }
                    c().b(bVar2.a);
                    return bVar2;
                }
                return bVar;
            }
            throw new IllegalStateException("stream != null");
        }
    }

    public final void a(j jVar) {
        synchronized (this.d) {
            if (jVar != null) {
                if (jVar == this.g) {
                }
            }
            throw new IllegalStateException("expected " + this.g + " but was " + jVar);
        }
        a(false, false, true);
    }

    private com.squareup.okhttp.internal.i c() {
        return com.squareup.okhttp.internal.d.b.a(this.d);
    }

    public final synchronized com.squareup.okhttp.internal.io.b a() {
        return this.c;
    }

    public final void b() {
        a(false, true, false);
    }

    public void a(boolean z, boolean z2, boolean z3) {
        com.squareup.okhttp.internal.io.b bVar;
        synchronized (this.d) {
            if (z3) {
                try {
                    this.g = null;
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (z2) {
                this.e = true;
            }
            if (this.c != null) {
                if (z) {
                    this.c.i = true;
                }
                if (this.g == null && (this.e || this.c.i)) {
                    b(this.c);
                    if (this.c.e > 0) {
                        this.b = null;
                    }
                    if (this.c.h.isEmpty()) {
                        this.c.j = System.nanoTime();
                        if (com.squareup.okhttp.internal.d.b.a(this.d, this.c)) {
                            bVar = this.c;
                            this.c = null;
                        }
                    }
                    bVar = null;
                    this.c = null;
                }
            }
            bVar = null;
        }
        if (bVar != null) {
            com.squareup.okhttp.internal.j.a(bVar.b);
        }
    }

    public final void cancel() {
        j jVar;
        com.squareup.okhttp.internal.io.b bVar;
        synchronized (this.d) {
            this.f = true;
            jVar = this.g;
            bVar = this.c;
        }
        if (jVar != null) {
            jVar.cancel();
        } else if (bVar != null) {
            bVar.cancel();
        }
    }

    public void a(IOException iOException) {
        synchronized (this.d) {
            if (this.b != null) {
                if (this.c.e == 0) {
                    ab abVar = this.c.a;
                    q qVar = this.b;
                    if (abVar.b.type() != Proxy.Type.DIRECT && qVar.a.g != null) {
                        qVar.a.g.connectFailed(qVar.a.a.b(), abVar.b.address(), iOException);
                    }
                    qVar.b.a(abVar);
                } else {
                    this.b = null;
                }
            }
        }
        a(true, false, true);
    }

    public final void a(com.squareup.okhttp.internal.io.b bVar) {
        bVar.h.add(new WeakReference(this));
    }

    private void b(com.squareup.okhttp.internal.io.b bVar) {
        int size = bVar.h.size();
        for (int i = 0; i < size; i++) {
            if (bVar.h.get(i).get() == this) {
                bVar.h.remove(i);
                return;
            }
        }
        throw new IllegalStateException();
    }

    public final String toString() {
        return this.a.toString();
    }
}
