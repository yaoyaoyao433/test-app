package com.facebook.react.modules.core;

import android.support.annotation.GuardedBy;
import android.support.annotation.Nullable;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.modules.core.a;
import java.util.ArrayDeque;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class g {
    private static g a;
    @Nullable
    private volatile com.facebook.react.modules.core.a b;
    private final Object d = new Object();
    private int f = 0;
    private boolean g = false;
    private final b c = new b();
    @GuardedBy("mCallbackQueuesLock")
    private final ArrayDeque<a.AbstractC0145a>[] e = new ArrayDeque[a.values().length];

    static /* synthetic */ boolean a(g gVar, boolean z) {
        gVar.g = false;
        return false;
    }

    static /* synthetic */ int e(g gVar) {
        int i = gVar.f;
        gVar.f = i - 1;
        return i;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public enum a {
        PERF_MARKERS(0),
        DISPATCH_UI(1),
        NATIVE_ANIMATED_MODULE(2),
        TIMERS_EVENTS(3),
        IDLE_EVENT(4);
        
        final int f;

        a(int i) {
            this.f = i;
        }
    }

    public static void a() {
        if (a == null) {
            a = new g();
        }
    }

    public static g b() {
        com.facebook.infer.annotation.a.a(a, "ReactChoreographer needs to be initialized.");
        return a;
    }

    private g() {
        for (int i = 0; i < this.e.length; i++) {
            this.e[i] = new ArrayDeque<>();
        }
        a((Runnable) null);
    }

    public final void a(a aVar, a.AbstractC0145a abstractC0145a) {
        synchronized (this.d) {
            this.e[aVar.f].addLast(abstractC0145a);
            boolean z = true;
            this.f++;
            if (this.f <= 0) {
                z = false;
            }
            com.facebook.infer.annotation.a.a(z);
            if (!this.g) {
                if (this.b == null) {
                    a(new Runnable() { // from class: com.facebook.react.modules.core.g.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            g.this.c();
                        }
                    });
                } else {
                    c();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        this.b.a(this.c);
        this.g = true;
    }

    private void a(@Nullable final Runnable runnable) {
        UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.facebook.react.modules.core.g.2
            @Override // java.lang.Runnable
            public final void run() {
                synchronized (g.class) {
                    if (g.this.b == null) {
                        g.this.b = com.facebook.react.modules.core.a.a();
                    }
                }
                if (runnable != null) {
                    runnable.run();
                }
            }
        });
    }

    public final void b(a aVar, a.AbstractC0145a abstractC0145a) {
        synchronized (this.d) {
            if (this.e[aVar.f].removeFirstOccurrence(abstractC0145a)) {
                this.f--;
                d();
            } else {
                com.facebook.common.logging.a.d("ReactNative", "Tried to remove non-existent frame callback");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        com.facebook.infer.annotation.a.a(this.f >= 0);
        if (this.f == 0 && this.g) {
            if (this.b != null) {
                this.b.b(this.c);
            }
            this.g = false;
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
            synchronized (g.this.d) {
                g.a(g.this, false);
                for (int i = 0; i < g.this.e.length; i++) {
                    ArrayDeque arrayDeque = g.this.e[i];
                    int size = arrayDeque.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        a.AbstractC0145a abstractC0145a = (a.AbstractC0145a) arrayDeque.pollFirst();
                        if (abstractC0145a != null) {
                            abstractC0145a.doFrame(j);
                            g.e(g.this);
                        } else {
                            com.facebook.common.logging.a.d("ReactNative", "Tried to execute non-existent frame callback");
                        }
                    }
                }
                g.this.d();
            }
        }
    }
}
