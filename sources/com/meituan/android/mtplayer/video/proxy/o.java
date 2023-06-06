package com.meituan.android.mtplayer.video.proxy;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class o {
    public static ChangeQuickRedirect e;
    private final r a;
    private final Object b;
    private final Object c;
    private volatile Thread d;
    final com.meituan.android.mtplayer.video.proxy.a f;
    boolean g;
    protected volatile long h;
    protected volatile long i;
    c j;
    private volatile boolean k;
    private volatile int l;
    private final AtomicInteger m;
    private volatile j n;
    private final Object o;
    private a p;
    private boolean q;

    public void a(int i, long j) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0173, code lost:
        r2 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0177, code lost:
        if (r31.b() != false) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0179, code lost:
        r2 = r31.f.a();
        r0 = (r2 > r31.a.a() ? 1 : (r2 == r31.a.a() ? 0 : -1));
        r2 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0187, code lost:
        if (r0 != 0) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0189, code lost:
        r31.f.c();
        r2 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x018e, code lost:
        monitor-exit(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0190, code lost:
        r0 = new java.lang.Object[]{new java.lang.Long(r12)};
        r9 = com.meituan.android.mtplayer.video.proxy.o.e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x01a9, code lost:
        if (com.meituan.robust.PatchProxy.isSupport(r0, r31, r9, false, "803fbc3aec2904dacdab82e5cd604bf6", com.meituan.robust.utils.RobustBitConfig.DEFAULT_VALUE) == false) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x01ab, code lost:
        com.meituan.robust.PatchProxy.accessDispatch(r0, r31, r9, false, "803fbc3aec2904dacdab82e5cd604bf6");
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x01af, code lost:
        r31.l = 100;
        r31.a(r31.l, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x01b6, code lost:
        r31.a.b();
        r31.a(r29, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x01c0, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x01cd, code lost:
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x01ce, code lost:
        r2 = r29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x01d2, code lost:
        r2 = r29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x01d5, code lost:
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x01d6, code lost:
        r2 = r29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x014e, code lost:
        r0 = new java.lang.Object[0];
        r9 = com.meituan.android.mtplayer.video.proxy.o.e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0154, code lost:
        r2 = r31;
        r29 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0163, code lost:
        if (com.meituan.robust.PatchProxy.isSupport(r0, r2, r9, false, "f71c0612dd1d4010d649440cda960728", com.meituan.robust.utils.RobustBitConfig.DEFAULT_VALUE) == false) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0165, code lost:
        com.meituan.robust.PatchProxy.accessDispatch(r0, r31, r9, false, "f71c0612dd1d4010d649440cda960728");
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x016a, code lost:
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x016b, code lost:
        r1 = r12;
        r3 = r29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0170, code lost:
        r1 = r31.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0172, code lost:
        monitor-enter(r1);
     */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0228 A[Catch: all -> 0x0234, TRY_ENTER, TryCatch #12 {all -> 0x01f6, blocks: (B:7:0x0024, B:155:0x0227, B:151:0x01fa, B:156:0x0228, B:157:0x022a), top: B:169:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:183:0x012e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0131 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ void a(com.meituan.android.mtplayer.video.proxy.o r31, com.meituan.android.mtplayer.video.proxy.o.a r32) {
        /*
            Method dump skipped, instructions count: 576
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.mtplayer.video.proxy.o.a(com.meituan.android.mtplayer.video.proxy.o, com.meituan.android.mtplayer.video.proxy.o$a):void");
    }

    public o(r rVar, com.meituan.android.mtplayer.video.proxy.a aVar) {
        Object[] objArr = {rVar, aVar};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f49890b102219db2d7b29715d623f62b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f49890b102219db2d7b29715d623f62b");
            return;
        }
        this.b = new Object();
        this.c = new Object();
        this.l = -1;
        this.o = new Object();
        this.p = null;
        this.a = (r) n.a(rVar);
        this.f = (com.meituan.android.mtplayer.video.proxy.a) n.a(aVar);
        this.m = new AtomicInteger();
    }

    public final int a(byte[] bArr, long j, int i) throws j, p {
        int i2;
        Object[] objArr = {bArr, new Long(j), 8192};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bf576ecb681e2c5423a1338f665af74d", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bf576ecb681e2c5423a1338f665af74d")).intValue();
        }
        Object[] objArr2 = {bArr, new Long(j), 8192};
        ChangeQuickRedirect changeQuickRedirect2 = q.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "49f9c492ec3d7a2cede5e2be23436420", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "49f9c492ec3d7a2cede5e2be23436420");
        } else {
            Object[] objArr3 = {bArr, "Buffer must be not null!"};
            ChangeQuickRedirect changeQuickRedirect3 = n.a;
            if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "1b9b8af0cf79d1b4c34e9a853ba7acfd", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "1b9b8af0cf79d1b4c34e9a853ba7acfd");
            } else if (bArr == null) {
                throw new NullPointerException("Buffer must be not null!");
            }
            n.a(j >= 0, "Data offset must be positive!");
            n.a(8192 <= bArr.length, "Length must be in range [0..buffer.length]");
        }
        while (!this.f.d() && this.f.a() < 8192 + j && !this.k) {
            c(j);
            Object[] objArr4 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect4 = e;
            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "65bed3ef49ef5aa3d082ab15c7c90d37", RobustBitConfig.DEFAULT_VALUE)) {
                i2 = 0;
                PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "65bed3ef49ef5aa3d082ab15c7c90d37");
            } else {
                synchronized (this.b) {
                    try {
                        this.b.wait(1000L);
                    } catch (InterruptedException unused) {
                        this.m.incrementAndGet();
                    }
                }
                i2 = 0;
            }
            Object[] objArr5 = new Object[i2];
            ChangeQuickRedirect changeQuickRedirect5 = e;
            if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "289a1920b3a5a3441b4afac9e9e5a62e", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "289a1920b3a5a3441b4afac9e9e5a62e");
            } else {
                synchronized (this) {
                    if (this.n != null) {
                        throw this.n;
                    }
                }
                int i3 = this.m.get();
                if (i3 >= 3) {
                    this.m.set(0);
                    throw new p("Error reading source " + i3 + " times");
                }
            }
        }
        int a2 = this.f.a(bArr, j, 8192);
        if (this.f.d() && this.l != 100) {
            this.l = 100;
            a(100, Long.MAX_VALUE);
        }
        return a2;
    }

    public final void a() throws j {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2a17b2e340b3ce41cc45b58330a09801", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2a17b2e340b3ce41cc45b58330a09801");
            return;
        }
        synchronized (this.c) {
            com.meituan.android.mtplayer.video.utils.c.b("Proxy", "ProxyCache: Shutdown proxy for " + this.a);
            this.k = true;
            synchronized (this.o) {
                if (this.q) {
                    this.o.notifyAll();
                }
            }
            if (this.d != null) {
                this.d.interrupt();
            }
            this.g = true;
            this.f.b();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x003f, code lost:
        if (r12.d.getState() != java.lang.Thread.State.TERMINATED) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private synchronized void c(long r13) {
        /*
            r12 = this;
            monitor-enter(r12)
            r0 = 1
            java.lang.Object[] r8 = new java.lang.Object[r0]     // Catch: java.lang.Throwable -> L76
            java.lang.Long r1 = new java.lang.Long     // Catch: java.lang.Throwable -> L76
            r1.<init>(r13)     // Catch: java.lang.Throwable -> L76
            r9 = 0
            r8[r9] = r1     // Catch: java.lang.Throwable -> L76
            com.meituan.robust.ChangeQuickRedirect r10 = com.meituan.android.mtplayer.video.proxy.o.e     // Catch: java.lang.Throwable -> L76
            java.lang.String r11 = "a5c83394efa739ca60c4a05d25989377"
            r4 = 0
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            r1 = r8
            r2 = r12
            r3 = r10
            r5 = r11
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L76
            if (r1 == 0) goto L22
            com.meituan.robust.PatchProxy.accessDispatch(r8, r12, r10, r9, r11)     // Catch: java.lang.Throwable -> L76
            monitor-exit(r12)
            return
        L22:
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L76
            r2 = 26
            if (r1 != r2) goto L33
            java.lang.Thread r1 = r12.d     // Catch: java.lang.Throwable -> L76
            if (r1 == 0) goto L31
            boolean r1 = r12.g     // Catch: java.lang.Throwable -> L76
            if (r1 != 0) goto L31
            goto L41
        L31:
            r0 = 0
            goto L41
        L33:
            java.lang.Thread r1 = r12.d     // Catch: java.lang.Throwable -> L76
            if (r1 == 0) goto L31
            java.lang.Thread r1 = r12.d     // Catch: java.lang.Throwable -> L76
            java.lang.Thread$State r1 = r1.getState()     // Catch: java.lang.Throwable -> L76
            java.lang.Thread$State r2 = java.lang.Thread.State.TERMINATED     // Catch: java.lang.Throwable -> L76
            if (r1 == r2) goto L31
        L41:
            boolean r1 = r12.k     // Catch: java.lang.Throwable -> L76
            if (r1 != 0) goto L74
            com.meituan.android.mtplayer.video.proxy.a r1 = r12.f     // Catch: java.lang.Throwable -> L76
            boolean r1 = r1.d()     // Catch: java.lang.Throwable -> L76
            if (r1 != 0) goto L74
            if (r0 != 0) goto L74
            com.meituan.android.mtplayer.video.proxy.o$a r0 = new com.meituan.android.mtplayer.video.proxy.o$a     // Catch: java.lang.Throwable -> L76
            r0.<init>(r13)     // Catch: java.lang.Throwable -> L76
            r12.p = r0     // Catch: java.lang.Throwable -> L76
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L76
            java.lang.String r14 = "mtplayer_video-Source reader for "
            r13.<init>(r14)     // Catch: java.lang.Throwable -> L76
            com.meituan.android.mtplayer.video.proxy.r r14 = r12.a     // Catch: java.lang.Throwable -> L76
            r13.append(r14)     // Catch: java.lang.Throwable -> L76
            java.lang.String r13 = r13.toString()     // Catch: java.lang.Throwable -> L76
            com.meituan.android.mtplayer.video.proxy.o$a r14 = r12.p     // Catch: java.lang.Throwable -> L76
            java.lang.Thread r13 = com.sankuai.android.jarvis.c.a(r13, r14)     // Catch: java.lang.Throwable -> L76
            r12.d = r13     // Catch: java.lang.Throwable -> L76
            java.lang.Thread r13 = r12.d     // Catch: java.lang.Throwable -> L76
            r13.start()     // Catch: java.lang.Throwable -> L76
        L74:
            monitor-exit(r12)
            return
        L76:
            r13 = move-exception
            monitor-exit(r12)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.mtplayer.video.proxy.o.c(long):void");
    }

    private void a(long j, long j2) {
        Object[] objArr = {new Long(j), new Long(j2)};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1ff7fb96ed6abb6ec18f1c8f8264abf2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1ff7fb96ed6abb6ec18f1c8f8264abf2");
            return;
        }
        Object[] objArr2 = {new Long(j), new Long(j2)};
        ChangeQuickRedirect changeQuickRedirect2 = e;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c653e28d3739ec36fe8cdb7b8e6c44ea", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c653e28d3739ec36fe8cdb7b8e6c44ea");
        } else {
            int i = (j2 > 0L ? 1 : (j2 == 0L ? 0 : -1));
            int i2 = i == 0 ? 100 : (int) ((((float) j) / ((float) j2)) * 100.0f);
            boolean z = i2 != this.l;
            if ((i >= 0) && z) {
                a(i2, j);
            }
            this.l = i2;
        }
        synchronized (this.b) {
            this.b.notifyAll();
        }
    }

    public final void a(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f755948158c334aada8f7ffc80e075a6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f755948158c334aada8f7ffc80e075a6");
        } else if (this.j == null) {
        } else {
            synchronized (this.o) {
                StringBuilder sb = new StringBuilder("initDownloadOffset: playerReadOffset  start = ");
                sb.append(this.h);
                sb.append("   cacheOffset = ");
                sb.append(this.p != null ? this.p.d : -1L);
                com.meituan.android.mtplayer.video.utils.c.a("ProxyCache", sb.toString());
                this.i = j;
                this.h = j;
                StringBuilder sb2 = new StringBuilder("initDownloadOffset: playerReadOffset end = ");
                sb2.append(this.h);
                sb2.append("   cacheOffset = ");
                sb2.append(this.p != null ? this.p.d : -1L);
                com.meituan.android.mtplayer.video.utils.c.a("ProxyCache", sb2.toString());
                if (this.q) {
                    this.q = false;
                    this.o.notifyAll();
                }
            }
        }
    }

    public final void b(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c964c2422377ece00a5a2c820f2efac8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c964c2422377ece00a5a2c820f2efac8");
            return;
        }
        c cVar = this.j;
        if (cVar == null) {
            return;
        }
        synchronized (this.o) {
            if (j >= this.i) {
                this.h = j;
            }
            a aVar = this.p;
            if (aVar == null) {
                return;
            }
            long j2 = aVar.d;
            if (this.q) {
                if (j2 - this.h < ((cVar.g <= 0 || cVar.g >= 1048576) ? 2097152 : cVar.g)) {
                    this.q = false;
                    this.o.notifyAll();
                }
            }
        }
    }

    private boolean b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = e;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f0d128b99dc292a43fcd5a201963920e", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f0d128b99dc292a43fcd5a201963920e")).booleanValue() : Thread.currentThread().isInterrupted() || this.k;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public class a implements Runnable {
        public static ChangeQuickRedirect a;
        private long c;
        private volatile long d;

        public a(long j) {
            Object[] objArr = {o.this, new Long(j)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5291de59eff20950314d646d67a42b99", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5291de59eff20950314d646d67a42b99");
                return;
            }
            this.c = j;
            try {
                this.d = o.this.f.a();
            } catch (Exception e) {
                this.d = j;
                com.meituan.android.mtplayer.video.utils.c.a("ProxyCache", "SourceReaderRunnable: ", e);
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0e6347c091fe0943acd49b7dba82b4de", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0e6347c091fe0943acd49b7dba82b4de");
                return;
            }
            o.this.g = false;
            o.a(o.this, this);
            o.this.g = true;
        }
    }
}
