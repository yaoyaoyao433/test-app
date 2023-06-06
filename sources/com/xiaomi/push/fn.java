package com.xiaomi.push;

import android.os.SystemClock;
import android.util.Pair;
import com.xiaomi.push.service.XMPushService;
import com.xiaomi.push.service.ag;
import java.util.Collection;
import java.util.LinkedList;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
/* loaded from: classes6.dex */
public abstract class fn {
    public static boolean a;
    private static final AtomicInteger r = new AtomicInteger(0);
    protected fz j;
    protected fo o;
    protected XMPushService p;
    protected int b = 0;
    protected long c = -1;
    protected volatile long d = 0;
    protected volatile long e = 0;
    public LinkedList<Pair<Integer, Long>> f = new LinkedList<>();
    public final Collection<fq> g = new CopyOnWriteArrayList();
    protected final Map<fs, a> h = new ConcurrentHashMap();
    protected final Map<fs, a> i = new ConcurrentHashMap();
    protected String k = "";
    protected String l = "";
    int m = 2;
    protected final int n = r.getAndIncrement();
    private long s = 0;
    protected long q = 0;

    /* loaded from: classes6.dex */
    public static class a {
        fs a;
        private ga b;

        public a(fs fsVar, ga gaVar) {
            this.a = fsVar;
            this.b = gaVar;
        }

        public final void a(fb fbVar) {
            this.a.a(fbVar);
        }
    }

    static {
        a = false;
        try {
            a = Boolean.getBoolean("smack.debugEnabled");
        } catch (Exception unused) {
        }
        ft.a();
    }

    private static String a(int i) {
        return i == 1 ? "connected" : i == 0 ? "connecting" : i == 2 ? "disconnected" : "unknown";
    }

    public final void a(fs fsVar, ga gaVar) {
        if (fsVar == null) {
            throw new NullPointerException("Packet listener is null.");
        }
        this.h.put(fsVar, new a(fsVar, gaVar));
    }

    public abstract void a(gf gfVar);

    public abstract void a(ag.b bVar);

    public final synchronized void a(String str) {
        if (this.m != 0) {
            com.xiaomi.channel.commonutils.logger.c.a("ignore setChallenge because connection was disconnected");
            return;
        }
        com.xiaomi.channel.commonutils.logger.c.a("setChallenge hash = " + aq.a(str).substring(0, 8));
        this.k = str;
        a(1, 0, null);
    }

    public abstract void a(String str, String str2);

    public abstract void a(fb[] fbVarArr);

    public final synchronized boolean a(long j) {
        return this.s >= j;
    }

    public abstract void b(int i, Exception exc);

    public abstract void b(fb fbVar);

    public final void b(fs fsVar, ga gaVar) {
        if (fsVar == null) {
            throw new NullPointerException("Packet listener is null.");
        }
        this.i.put(fsVar, new a(fsVar, gaVar));
    }

    public abstract void b(boolean z);

    public boolean b() {
        return false;
    }

    public final fo e() {
        return this.o;
    }

    public String f() {
        return this.o.c();
    }

    public final long h() {
        return this.e;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final Map<fs, a> i() {
        return this.h;
    }

    public final boolean j() {
        return this.m == 0;
    }

    public final boolean k() {
        return this.m == 1;
    }

    public final int l() {
        return this.b;
    }

    public final synchronized void m() {
        this.s = SystemClock.elapsedRealtime();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0072  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public fn(com.xiaomi.push.service.XMPushService r7, com.xiaomi.push.fo r8) {
        /*
            r6 = this;
            r6.<init>()
            r0 = 0
            r6.b = r0
            r1 = -1
            r6.c = r1
            r1 = 0
            r6.d = r1
            r6.e = r1
            java.util.LinkedList r3 = new java.util.LinkedList
            r3.<init>()
            r6.f = r3
            java.util.concurrent.CopyOnWriteArrayList r3 = new java.util.concurrent.CopyOnWriteArrayList
            r3.<init>()
            r6.g = r3
            java.util.concurrent.ConcurrentHashMap r3 = new java.util.concurrent.ConcurrentHashMap
            r3.<init>()
            r6.h = r3
            java.util.concurrent.ConcurrentHashMap r3 = new java.util.concurrent.ConcurrentHashMap
            r3.<init>()
            r6.i = r3
            r3 = 0
            r6.j = r3
            java.lang.String r4 = ""
            r6.k = r4
            java.lang.String r4 = ""
            r6.l = r4
            r4 = 2
            r6.m = r4
            java.util.concurrent.atomic.AtomicInteger r5 = com.xiaomi.push.fn.r
            int r5 = r5.getAndIncrement()
            r6.n = r5
            r6.s = r1
            r6.q = r1
            r6.o = r8
            r6.p = r7
            com.xiaomi.push.fo r7 = r6.o
            boolean r7 = r7.f
            if (r7 == 0) goto L9c
            com.xiaomi.push.fz r7 = r6.j
            if (r7 != 0) goto L9c
            java.lang.String r7 = "smack.debuggerClass"
            java.lang.String r7 = java.lang.System.getProperty(r7)     // Catch: java.lang.Throwable -> L5b
            goto L5c
        L5b:
            r7 = r3
        L5c:
            if (r7 == 0) goto L67
            java.lang.Class r7 = java.lang.Class.forName(r7)     // Catch: java.lang.Exception -> L63
            goto L68
        L63:
            r7 = move-exception
            r7.printStackTrace()
        L67:
            r7 = r3
        L68:
            if (r7 != 0) goto L72
            com.xiaomi.push.fl r7 = new com.xiaomi.push.fl
            r7.<init>(r6)
            r6.j = r7
            return
        L72:
            r8 = 3
            java.lang.Class[] r8 = new java.lang.Class[r8]     // Catch: java.lang.Exception -> L93
            java.lang.Class<com.xiaomi.push.fn> r1 = com.xiaomi.push.fn.class
            r8[r0] = r1     // Catch: java.lang.Exception -> L93
            java.lang.Class<java.io.Writer> r1 = java.io.Writer.class
            r2 = 1
            r8[r2] = r1     // Catch: java.lang.Exception -> L93
            java.lang.Class<java.io.Reader> r1 = java.io.Reader.class
            r8[r4] = r1     // Catch: java.lang.Exception -> L93
            java.lang.reflect.Constructor r7 = r7.getConstructor(r8)     // Catch: java.lang.Exception -> L93
            java.lang.Object[] r8 = new java.lang.Object[r2]     // Catch: java.lang.Exception -> L93
            r8[r0] = r6     // Catch: java.lang.Exception -> L93
            java.lang.Object r7 = r7.newInstance(r8)     // Catch: java.lang.Exception -> L93
            com.xiaomi.push.fz r7 = (com.xiaomi.push.fz) r7     // Catch: java.lang.Exception -> L93
            r6.j = r7     // Catch: java.lang.Exception -> L93
            return
        L93:
            r7 = move-exception
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Can't initialize the configured debugger!"
            r8.<init>(r0, r7)
            throw r8
        L9c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.fn.<init>(com.xiaomi.push.service.XMPushService, com.xiaomi.push.fo):void");
    }

    public final String g() {
        return this.o.g;
    }

    public final void a(int i, int i2, Exception exc) {
        if (i != this.m) {
            com.xiaomi.channel.commonutils.logger.c.a(String.format("update the connection status. %1$s -> %2$s : %3$s ", a(this.m), a(i), com.xiaomi.push.service.ak.a(i2)));
        }
        if (al.a(this.p)) {
            synchronized (this.f) {
                try {
                    if (i == 1) {
                        this.f.clear();
                    } else {
                        this.f.add(new Pair<>(Integer.valueOf(i), Long.valueOf(System.currentTimeMillis())));
                        if (this.f.size() > 6) {
                            this.f.remove(0);
                        }
                    }
                } finally {
                }
            }
        }
        if (i == 1) {
            this.p.a(10);
            if (this.m != 0) {
                com.xiaomi.channel.commonutils.logger.c.a("try set connected while not connecting.");
            }
            this.m = i;
            for (fq fqVar : this.g) {
                fqVar.b(this);
            }
        } else if (i == 0) {
            if (this.m != 2) {
                com.xiaomi.channel.commonutils.logger.c.a("try set connecting while not disconnected.");
            }
            this.m = i;
            for (fq fqVar2 : this.g) {
                fqVar2.a(this);
            }
        } else if (i == 2) {
            this.p.a(10);
            if (this.m == 0) {
                for (fq fqVar3 : this.g) {
                    fqVar3.a(this, exc == null ? new CancellationException("disconnect while connecting") : exc);
                }
            } else if (this.m == 1) {
                for (fq fqVar4 : this.g) {
                    fqVar4.a(this, i2, exc);
                }
            }
            this.m = i;
        }
    }
}
