package com.facebook.react.modules.core;

import android.os.SystemClock;
import android.support.annotation.Nullable;
import android.util.SparseArray;
import com.facebook.proguard.annotations.DoNotStrip;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.modules.core.a;
import com.facebook.react.modules.core.g;
import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class d {
    final ReactApplicationContext a;
    final com.facebook.react.modules.core.c b;
    final g c;
    @Nullable
    a j;
    private final com.facebook.react.devsupport.interfaces.b l;
    final Object d = new Object();
    final Object e = new Object();
    final AtomicBoolean h = new AtomicBoolean(true);
    final AtomicBoolean i = new AtomicBoolean(false);
    private final C0146d m = new C0146d();
    private final b n = new b();
    private boolean o = false;
    private boolean p = false;
    boolean k = false;
    final PriorityQueue<c> f = new PriorityQueue<>(11, new Comparator<c>() { // from class: com.facebook.react.modules.core.d.1
        @Override // java.util.Comparator
        public final /* bridge */ /* synthetic */ int compare(c cVar, c cVar2) {
            int i = ((cVar.d - cVar2.d) > 0L ? 1 : ((cVar.d - cVar2.d) == 0L ? 0 : -1));
            if (i == 0) {
                return 0;
            }
            return i < 0 ? -1 : 1;
        }
    });
    final SparseArray<c> g = new SparseArray<>();

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static class c {
        final int a;
        final boolean b;
        final int c;
        long d;

        private c(int i, long j, int i2, boolean z) {
            this.a = i;
            this.d = j;
            this.c = i2;
            this.b = z;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* renamed from: com.facebook.react.modules.core.d$d  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0146d extends a.AbstractC0145a {
        @Nullable
        private WritableArray b;

        private C0146d() {
            this.b = null;
        }

        @Override // com.facebook.react.modules.core.a.AbstractC0145a
        public final void doFrame(long j) {
            if (!d.this.h.get() || d.this.i.get()) {
                long j2 = j / 1000000;
                synchronized (d.this.d) {
                    while (!d.this.f.isEmpty() && d.this.f.peek().d < j2) {
                        c poll = d.this.f.poll();
                        if (this.b == null) {
                            this.b = Arguments.createArray();
                        }
                        this.b.pushInt(poll.a);
                        if (!poll.b) {
                            d.this.g.remove(poll.a);
                        } else {
                            poll.d = poll.c + j2;
                            d.this.f.add(poll);
                        }
                    }
                }
                if (this.b != null) {
                    d.this.b.a(this.b);
                    this.b = null;
                }
                d.this.c.a(g.a.TIMERS_EVENTS, this);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public class b extends a.AbstractC0145a {
        private b() {
        }

        @Override // com.facebook.react.modules.core.a.AbstractC0145a
        public final void doFrame(long j) {
            if (!d.this.h.get() || d.this.i.get()) {
                if (d.this.j != null) {
                    d.this.j.cancel();
                }
                d.this.j = new a(j);
                d.this.a.runOnJSQueueThread(d.this.j);
                d.this.c.a(g.a.IDLE_EVENT, this);
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    class a implements Runnable {
        private volatile boolean b = false;
        private final long c;

        public a(long j) {
            this.c = j;
        }

        @Override // java.lang.Runnable
        public final void run() {
            boolean z;
            if (this.b) {
                return;
            }
            long uptimeMillis = SystemClock.uptimeMillis() - (this.c / 1000000);
            long currentTimeMillis = System.currentTimeMillis() - uptimeMillis;
            if (16.666666f - ((float) uptimeMillis) < 1.0f) {
                return;
            }
            synchronized (d.this.e) {
                z = d.this.k;
            }
            if (z) {
                d.this.b.a(currentTimeMillis);
            }
            d.this.j = null;
        }

        public final void cancel() {
            this.b = true;
        }
    }

    public d(ReactApplicationContext reactApplicationContext, com.facebook.react.modules.core.c cVar, g gVar, com.facebook.react.devsupport.interfaces.b bVar) {
        this.a = reactApplicationContext;
        this.b = cVar;
        this.c = gVar;
        this.l = bVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a() {
        synchronized (this.e) {
            if (this.k) {
                e();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b() {
        if (!this.h.get() || this.i.get()) {
            return;
        }
        d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c() {
        if (this.o) {
            return;
        }
        this.c.a(g.a.TIMERS_EVENTS, this.m);
        this.o = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d() {
        com.facebook.react.jstasks.b a2 = com.facebook.react.jstasks.b.a(this.a);
        if (this.o && this.h.get() && !a2.a()) {
            this.c.b(g.a.TIMERS_EVENTS, this.m);
            this.o = false;
        }
    }

    void e() {
        if (this.p) {
            return;
        }
        this.c.a(g.a.IDLE_EVENT, this.n);
        this.p = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void f() {
        if (this.p) {
            this.c.b(g.a.IDLE_EVENT, this.n);
            this.p = false;
        }
    }

    @DoNotStrip
    public final void deleteTimer(int i) {
        synchronized (this.d) {
            c cVar = this.g.get(i);
            if (cVar == null) {
                return;
            }
            this.g.remove(i);
            this.f.remove(cVar);
        }
    }

    @DoNotStrip
    public final void setSendIdleEvents(final boolean z) {
        synchronized (this.e) {
            this.k = z;
        }
        UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.facebook.react.modules.core.d.2
            @Override // java.lang.Runnable
            public final void run() {
                synchronized (d.this.e) {
                    if (z) {
                        d.this.e();
                    } else {
                        d.this.f();
                    }
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean a(long j) {
        synchronized (this.d) {
            c peek = this.f.peek();
            if (peek == null) {
                return false;
            }
            if (a(peek, j)) {
                return true;
            }
            Iterator<c> it = this.f.iterator();
            while (it.hasNext()) {
                if (a(it.next(), j)) {
                    return true;
                }
            }
            return false;
        }
    }

    @DoNotStrip
    public final void createTimer(int i, long j, int i2, boolean z) {
        c cVar = new c(i, (System.nanoTime() / 1000000) + j, i2, z);
        synchronized (this.d) {
            this.f.add(cVar);
            this.g.put(i, cVar);
        }
    }

    private static boolean a(c cVar, long j) {
        return !cVar.b && ((long) cVar.c) < j;
    }
}
