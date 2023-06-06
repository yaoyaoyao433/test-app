package com.facebook.react.uimanager.events;

import android.util.LongSparseArray;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.modules.core.a;
import com.facebook.react.modules.core.g;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class c implements LifecycleEventListener {
    private static final Comparator<com.facebook.react.uimanager.events.b> c = new Comparator<com.facebook.react.uimanager.events.b>() { // from class: com.facebook.react.uimanager.events.c.1
        @Override // java.util.Comparator
        public final /* bridge */ /* synthetic */ int compare(com.facebook.react.uimanager.events.b bVar, com.facebook.react.uimanager.events.b bVar2) {
            com.facebook.react.uimanager.events.b bVar3 = bVar;
            com.facebook.react.uimanager.events.b bVar4 = bVar2;
            if (bVar3 == null && bVar4 == null) {
                return 0;
            }
            if (bVar3 == null) {
                return -1;
            }
            if (bVar4 != null) {
                int i = ((bVar3.f - bVar4.f) > 0L ? 1 : ((bVar3.f - bVar4.f) == 0L ? 0 : -1));
                if (i == 0) {
                    return 0;
                }
                return i < 0 ? -1 : 1;
            }
            return 1;
        }
    };
    public volatile ReactEventEmitter a;
    private final ReactApplicationContext f;
    private final Object d = new Object();
    private final Object e = new Object();
    private final LongSparseArray<Integer> g = new LongSparseArray<>();
    private final Map<String, Short> h = new HashMap();
    private final a i = new a();
    private final ArrayList<com.facebook.react.uimanager.events.b> j = new ArrayList<>();
    private final ArrayList<d> k = new ArrayList<>();
    private final List<Object> l = new ArrayList();
    private final b m = new b();
    private final AtomicInteger n = new AtomicInteger();
    private com.facebook.react.uimanager.events.b[] o = new com.facebook.react.uimanager.events.b[16];
    private int p = 0;
    private short q = 0;
    private volatile boolean r = false;
    public volatile boolean b = false;

    public c(ReactApplicationContext reactApplicationContext) {
        this.f = reactApplicationContext;
        this.f.addLifecycleEventListener(this);
        this.a = new ReactEventEmitter(this.f);
    }

    private void b() {
        if (this.a != null) {
            this.m.b();
        }
    }

    public final void a(d dVar) {
        if (dVar == null) {
            return;
        }
        synchronized (this.k) {
            this.k.add(dVar);
        }
    }

    public final void b(d dVar) {
        if (dVar == null) {
            return;
        }
        synchronized (this.k) {
            this.k.remove(dVar);
        }
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public final void onHostResume() {
        b();
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public final void onHostPause() {
        c();
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public final void onHostDestroy() {
        c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        UiThreadUtil.assertOnUiThread();
        this.m.a = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public class b extends a.AbstractC0145a {
        boolean a;
        private volatile boolean c;

        private b() {
            this.c = false;
            this.a = false;
        }

        @Override // com.facebook.react.modules.core.a.AbstractC0145a
        public final void doFrame(long j) {
            UiThreadUtil.assertOnUiThread();
            if (this.a) {
                this.c = false;
            } else {
                c();
            }
            com.facebook.systrace.a.a(0L, "ScheduleDispatchFrameCallback");
            try {
                c.b(c.this);
                if (!c.this.r) {
                    c.this.r = true;
                    c.this.n.get();
                    c.this.f.runOnJSQueueThread(c.this.i);
                }
            } finally {
                com.facebook.systrace.a.a(0L);
            }
        }

        public final void a() {
            if (this.c) {
                return;
            }
            this.c = true;
            c();
        }

        private void c() {
            com.facebook.react.modules.core.g.b().a(g.a.TIMERS_EVENTS, c.this.m);
        }

        public final void b() {
            if (this.c) {
                return;
            }
            if (!c.this.f.isOnUiQueueThread()) {
                c.this.f.runOnUiQueueThread(new Runnable() { // from class: com.facebook.react.uimanager.events.c.b.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        b.this.a();
                    }
                });
            } else {
                a();
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    class a implements Runnable {
        private a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            com.facebook.systrace.a.a(0L, "DispatchEventsRunnable");
            try {
                c.this.n.getAndIncrement();
                c.this.r = false;
                com.facebook.infer.annotation.a.a(c.this.a);
                synchronized (c.this.e) {
                    if (!c.this.b && c.this.p > 0) {
                        if (c.this.p > 1) {
                            Arrays.sort(c.this.o, 0, c.this.p, c.c);
                        }
                        for (int i = 0; i < c.this.p; i++) {
                            com.facebook.react.uimanager.events.b bVar = c.this.o[i];
                            if (bVar != null) {
                                bVar.a();
                                bVar.a(c.this.a);
                                bVar.g();
                            }
                        }
                        c.m(c.this);
                        c.this.g.clear();
                    }
                }
                synchronized (c.this.l) {
                    Iterator it = c.this.l.iterator();
                    while (it.hasNext()) {
                        it.next();
                    }
                }
            } finally {
                com.facebook.systrace.a.a(0L);
            }
        }
    }

    private void b(com.facebook.react.uimanager.events.b bVar) {
        if (this.p == this.o.length) {
            this.o = (com.facebook.react.uimanager.events.b[]) Arrays.copyOf(this.o, this.o.length * 2);
        }
        com.facebook.react.uimanager.events.b[] bVarArr = this.o;
        int i = this.p;
        this.p = i + 1;
        bVarArr[i] = bVar;
    }

    public final void a(com.facebook.react.uimanager.events.b bVar) {
        com.facebook.infer.annotation.a.a(bVar.d, "Dispatched event hasn't been initialized");
        synchronized (this.k) {
            Iterator<d> it = this.k.iterator();
            while (it.hasNext()) {
                d next = it.next();
                if (next != null) {
                    next.a(bVar);
                }
            }
        }
        synchronized (this.d) {
            this.j.add(bVar);
            bVar.a();
        }
        b();
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x008b A[Catch: all -> 0x00ba, TryCatch #1 {, blocks: (B:4:0x0003, B:5:0x0005, B:35:0x00b3, B:36:0x00b8, B:7:0x0007, B:9:0x000f, B:11:0x001d, B:33:0x00ae, B:12:0x0022, B:14:0x0036, B:16:0x004c, B:18:0x0067, B:30:0x00a6, B:32:0x00ab, B:19:0x0073, B:21:0x007d, B:27:0x008b, B:15:0x003b, B:34:0x00b2), top: B:44:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static /* synthetic */ void b(com.facebook.react.uimanager.events.c r14) {
        /*
            java.lang.Object r0 = r14.d
            monitor-enter(r0)
            java.lang.Object r1 = r14.e     // Catch: java.lang.Throwable -> Lbd
            monitor-enter(r1)     // Catch: java.lang.Throwable -> Lbd
            r2 = 0
        L7:
            java.util.ArrayList<com.facebook.react.uimanager.events.b> r3 = r14.j     // Catch: java.lang.Throwable -> Lba
            int r3 = r3.size()     // Catch: java.lang.Throwable -> Lba
            if (r2 >= r3) goto Lb2
            java.util.ArrayList<com.facebook.react.uimanager.events.b> r3 = r14.j     // Catch: java.lang.Throwable -> Lba
            java.lang.Object r3 = r3.get(r2)     // Catch: java.lang.Throwable -> Lba
            com.facebook.react.uimanager.events.b r3 = (com.facebook.react.uimanager.events.b) r3     // Catch: java.lang.Throwable -> Lba
            boolean r4 = r3.b()     // Catch: java.lang.Throwable -> Lba
            if (r4 != 0) goto L22
            r14.b(r3)     // Catch: java.lang.Throwable -> Lba
            goto Lae
        L22:
            int r4 = r3.e     // Catch: java.lang.Throwable -> Lba
            java.lang.String r5 = r3.a()     // Catch: java.lang.Throwable -> Lba
            short r6 = r3.d()     // Catch: java.lang.Throwable -> Lba
            java.util.Map<java.lang.String, java.lang.Short> r7 = r14.h     // Catch: java.lang.Throwable -> Lba
            java.lang.Object r7 = r7.get(r5)     // Catch: java.lang.Throwable -> Lba
            java.lang.Short r7 = (java.lang.Short) r7     // Catch: java.lang.Throwable -> Lba
            if (r7 == 0) goto L3b
            short r5 = r7.shortValue()     // Catch: java.lang.Throwable -> Lba
            goto L4c
        L3b:
            short r7 = r14.q     // Catch: java.lang.Throwable -> Lba
            int r8 = r7 + 1
            short r8 = (short) r8     // Catch: java.lang.Throwable -> Lba
            r14.q = r8     // Catch: java.lang.Throwable -> Lba
            java.util.Map<java.lang.String, java.lang.Short> r8 = r14.h     // Catch: java.lang.Throwable -> Lba
            java.lang.Short r9 = java.lang.Short.valueOf(r7)     // Catch: java.lang.Throwable -> Lba
            r8.put(r5, r9)     // Catch: java.lang.Throwable -> Lba
            r5 = r7
        L4c:
            long r7 = (long) r4     // Catch: java.lang.Throwable -> Lba
            long r4 = (long) r5     // Catch: java.lang.Throwable -> Lba
            r9 = 65535(0xffff, double:3.23786E-319)
            long r4 = r4 & r9
            r11 = 32
            long r4 = r4 << r11
            long r4 = r4 | r7
            long r6 = (long) r6     // Catch: java.lang.Throwable -> Lba
            long r6 = r6 & r9
            r8 = 48
            long r6 = r6 << r8
            long r4 = r4 | r6
            android.util.LongSparseArray<java.lang.Integer> r6 = r14.g     // Catch: java.lang.Throwable -> Lba
            java.lang.Object r6 = r6.get(r4)     // Catch: java.lang.Throwable -> Lba
            java.lang.Integer r6 = (java.lang.Integer) r6     // Catch: java.lang.Throwable -> Lba
            r7 = 0
            if (r6 != 0) goto L73
            android.util.LongSparseArray<java.lang.Integer> r6 = r14.g     // Catch: java.lang.Throwable -> Lba
            int r8 = r14.p     // Catch: java.lang.Throwable -> Lba
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch: java.lang.Throwable -> Lba
            r6.put(r4, r8)     // Catch: java.lang.Throwable -> Lba
            goto La4
        L73:
            com.facebook.react.uimanager.events.b[] r8 = r14.o     // Catch: java.lang.Throwable -> Lba
            int r9 = r6.intValue()     // Catch: java.lang.Throwable -> Lba
            r8 = r8[r9]     // Catch: java.lang.Throwable -> Lba
            if (r8 == 0) goto L88
            long r9 = r3.f     // Catch: java.lang.Throwable -> Lba
            long r11 = r8.f     // Catch: java.lang.Throwable -> Lba
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 < 0) goto L86
            goto L88
        L86:
            r9 = r8
            goto L89
        L88:
            r9 = r3
        L89:
            if (r9 == r8) goto La1
            android.util.LongSparseArray<java.lang.Integer> r3 = r14.g     // Catch: java.lang.Throwable -> Lba
            int r10 = r14.p     // Catch: java.lang.Throwable -> Lba
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch: java.lang.Throwable -> Lba
            r3.put(r4, r10)     // Catch: java.lang.Throwable -> Lba
            com.facebook.react.uimanager.events.b[] r3 = r14.o     // Catch: java.lang.Throwable -> Lba
            int r4 = r6.intValue()     // Catch: java.lang.Throwable -> Lba
            r3[r4] = r7     // Catch: java.lang.Throwable -> Lba
            r7 = r8
            r3 = r9
            goto La4
        La1:
            r13 = r7
            r7 = r3
            r3 = r13
        La4:
            if (r3 == 0) goto La9
            r14.b(r3)     // Catch: java.lang.Throwable -> Lba
        La9:
            if (r7 == 0) goto Lae
            r7.g()     // Catch: java.lang.Throwable -> Lba
        Lae:
            int r2 = r2 + 1
            goto L7
        Lb2:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lba
            java.util.ArrayList<com.facebook.react.uimanager.events.b> r14 = r14.j     // Catch: java.lang.Throwable -> Lbd
            r14.clear()     // Catch: java.lang.Throwable -> Lbd
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lbd
            return
        Lba:
            r14 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lba
            throw r14     // Catch: java.lang.Throwable -> Lbd
        Lbd:
            r14 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lbd
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.uimanager.events.c.b(com.facebook.react.uimanager.events.c):void");
    }

    static /* synthetic */ void m(c cVar) {
        Arrays.fill(cVar.o, 0, cVar.p, (Object) null);
        cVar.p = 0;
    }
}
