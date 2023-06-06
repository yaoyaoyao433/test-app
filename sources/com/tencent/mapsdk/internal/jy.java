package com.tencent.mapsdk.internal;

import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.util.Printer;
import com.tencent.map.tools.Callback;
import com.tencent.map.tools.Util;
import com.tencent.mapsdk.internal.kn;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class jy {
    private static final Handler a;
    private static c b;

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public static abstract class a<T> implements Callback<T>, Runnable {
        @Override // com.tencent.map.tools.Callback
        public abstract void callback(T t);

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public interface d<T> {
        Future<T> a(g<T> gVar);
    }

    static {
        kn.g(ki.s);
        a = new Handler(Looper.getMainLooper());
    }

    public static void a(Runnable runnable) {
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            a.post(runnable);
        } else {
            runnable.run();
        }
    }

    public static void a(Runnable runnable, long j) {
        if (runnable == null) {
            return;
        }
        a.postDelayed(runnable, j);
    }

    public static Looper a(String str) {
        if (b == null) {
            return null;
        }
        c cVar = b;
        String concat = "tms-".concat(String.valueOf(str));
        HandlerThread handlerThread = cVar.a.get(concat);
        if (handlerThread == null || handlerThread.getThreadId() == -1) {
            handlerThread = new HandlerThread(concat);
            handlerThread.start();
            cVar.a(concat, handlerThread);
        }
        return handlerThread.getLooper();
    }

    private static Looper b() {
        if (b == null) {
            return null;
        }
        return b.b.getLooper();
    }

    public static void b(final Runnable runnable) {
        a((g) new g<Void>() { // from class: com.tencent.mapsdk.internal.jy.1
            private Void a() throws Exception {
                runnable.run();
                return null;
            }

            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() throws Exception {
                runnable.run();
                return null;
            }
        }).a((d) new e(null)).a();
    }

    public static c a() {
        return new c();
    }

    public static void a(c cVar) {
        if (cVar == null) {
            return;
        }
        b = cVar;
        cVar.a(b.a, cVar.b);
        Looper looper = b.b.getLooper();
        if (looper != null) {
            looper.setMessageLogging(new Printer() { // from class: com.tencent.mapsdk.internal.jy.2
                @Override // android.util.Printer
                public final void println(String str) {
                    kj.c(ki.s, str);
                }
            });
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public static final class c {
        final Map<String, HandlerThread> a = new HashMap();
        final b b = new b();

        private void a() {
            a(b.a, this.b);
        }

        public final void a(String str, HandlerThread handlerThread) {
            if (str == null || str.isEmpty()) {
                return;
            }
            this.a.put(str, handlerThread);
        }

        private Looper a(String str) {
            String concat = "tms-".concat(String.valueOf(str));
            HandlerThread handlerThread = this.a.get(concat);
            if (handlerThread == null || handlerThread.getThreadId() == -1) {
                handlerThread = new HandlerThread(concat);
                handlerThread.start();
                a(concat, handlerThread);
            }
            return handlerThread.getLooper();
        }

        private b b() {
            return this.b;
        }

        private void c() {
            if (this.a.isEmpty()) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            Util.foreach(this.a.entrySet(), new AnonymousClass1(arrayList));
            Util.foreach(arrayList, new AnonymousClass2());
        }

        /* compiled from: ProGuard */
        /* renamed from: com.tencent.mapsdk.internal.jy$c$1  reason: invalid class name */
        /* loaded from: classes6.dex */
        public final class AnonymousClass1 extends a<Map.Entry<String, HandlerThread>> {
            final /* synthetic */ List a;

            AnonymousClass1(List list) {
                this.a = list;
            }

            @Override // com.tencent.mapsdk.internal.jy.a, com.tencent.map.tools.Callback
            public final /* synthetic */ void callback(Object obj) {
                HandlerThread handlerThread;
                Map.Entry entry = (Map.Entry) obj;
                if (entry == null || (handlerThread = (HandlerThread) entry.getValue()) == null) {
                    return;
                }
                if (Build.VERSION.SDK_INT >= 18) {
                    handlerThread.quitSafely();
                } else {
                    handlerThread.quit();
                }
                this.a.add(entry.getKey());
            }

            private void a(Map.Entry<String, HandlerThread> entry) {
                HandlerThread value;
                if (entry == null || (value = entry.getValue()) == null) {
                    return;
                }
                if (Build.VERSION.SDK_INT >= 18) {
                    value.quitSafely();
                } else {
                    value.quit();
                }
                this.a.add(entry.getKey());
            }
        }

        /* compiled from: ProGuard */
        /* renamed from: com.tencent.mapsdk.internal.jy$c$2  reason: invalid class name */
        /* loaded from: classes6.dex */
        public final class AnonymousClass2 extends a<String> {
            AnonymousClass2() {
            }

            @Override // com.tencent.mapsdk.internal.jy.a, com.tencent.map.tools.Callback
            public final /* synthetic */ void callback(Object obj) {
                String str = (String) obj;
                if (str != null) {
                    c.this.a.remove(str);
                }
            }

            private void a(String str) {
                if (str != null) {
                    c.this.a.remove(str);
                }
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public static final class b extends HandlerThread {
        public static final String a = "tms-dsp";
        private static final int h = 1;
        private static final int i = 300;
        private boolean b;
        private boolean c;
        private volatile boolean d;
        private Handler e;
        private final ConcurrentLinkedQueue<a> f;
        private final List<a> g;

        public b() {
            super(a);
            this.f = new ConcurrentLinkedQueue<>();
            this.g = new LinkedList();
        }

        private void a(c cVar) {
            cVar.a(a, this);
        }

        @Override // android.os.HandlerThread
        protected final void onLooperPrepared() {
            super.onLooperPrepared();
            this.b = true;
            this.e = new Handler(getLooper()) { // from class: com.tencent.mapsdk.internal.jy.b.1
                @Override // android.os.Handler
                public final void dispatchMessage(Message message) {
                    super.dispatchMessage(message);
                    if (message.what == 1) {
                        try {
                            if (b.this.a()) {
                                b.this.e.sendEmptyMessageDelayed(1, 300L);
                            }
                        } catch (Throwable th) {
                            kj.a("MSG_SYNC_CHECK ERR:", th);
                        }
                    }
                }
            };
            kn.f(ki.s).a("looper is prepared...");
            this.e.sendEmptyMessage(1);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Type inference failed for: r5v24, types: [T, java.lang.Object] */
        public boolean a() {
            boolean z;
            a poll;
            if (!this.f.isEmpty() && (poll = this.f.poll()) != null && poll.m == 1) {
                kn.f(ki.s).a(new Object[0]);
                if (poll.g != null && poll.h != null) {
                    poll.j = poll.g.a(poll.h);
                }
                kn.f(ki.s).a(new Object[0]);
                poll.m = 2;
                this.g.add(poll);
            }
            Iterator<a> it = this.g.iterator();
            while (it.hasNext()) {
                a next = it.next();
                if (next != null) {
                    switch (next.m) {
                        case 2:
                            try {
                                kn.f(ki.s).a(new Object[0]);
                                if (next.j == null) {
                                    continue;
                                } else if (!next.f) {
                                    if (next.j.isDone()) {
                                        next.m = 3;
                                        break;
                                    } else if (!next.j.isCancelled()) {
                                        break;
                                    } else {
                                        next.k = next.j.get();
                                        next.b();
                                        break;
                                    }
                                } else {
                                    break;
                                }
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                                break;
                            } catch (ExecutionException e2) {
                                e2.printStackTrace();
                                break;
                            }
                        case 3:
                            kn.f(ki.s).a("result:" + next.k, "userCallback:" + next.i);
                            if (next.i != null) {
                                next.i.callback(next.k);
                            }
                            it.remove();
                            continue;
                        case 4:
                            next.l++;
                            kn.f(ki.s).a("try time:" + next.l);
                            if (next.l < 2) {
                                next.f = false;
                                next.a();
                                z = true;
                            } else {
                                z = false;
                            }
                            if (z) {
                                this.f.offer(next);
                            }
                            it.remove();
                            continue;
                    }
                }
            }
            return !this.g.isEmpty();
        }

        final synchronized <T> a<T> a(g<T> gVar) {
            kn.a f = kn.f(ki.s);
            f.a("prepared:" + this.b);
            if (!this.b && !this.c && !this.d) {
                start();
                this.c = true;
            }
            return new a<>(this, gVar, (byte) 0);
        }

        @Override // android.os.HandlerThread
        public final boolean quit() {
            boolean quit = super.quit();
            if (quit) {
                b();
                this.d = true;
            }
            return quit;
        }

        @Override // android.os.HandlerThread
        public final boolean quitSafely() {
            boolean quitSafely = super.quitSafely();
            if (quitSafely) {
                b();
                this.d = true;
            }
            return quitSafely;
        }

        private void b() {
            Iterator<a> it = this.f.iterator();
            while (it.hasNext()) {
                a next = it.next();
                if (next != null) {
                    next.b();
                }
            }
            for (a aVar : this.g) {
                if (aVar != null) {
                    aVar.b();
                }
            }
            this.f.clear();
            this.g.clear();
            kn.f(ki.s).a("cancelAll...");
            if (this.e != null) {
                this.e.removeCallbacksAndMessages(null);
            }
        }

        /* compiled from: ProGuard */
        /* loaded from: classes6.dex */
        public final class a<T> {
            static final int a = 0;
            static final int b = 1;
            static final int c = 2;
            static final int d = 3;
            static final int e = 4;
            boolean f;
            d<T> g;
            final g<T> h;
            a<T> i;
            Future<T> j;
            T k;
            int l;
            int m;

            /* synthetic */ a(b bVar, g gVar, byte b2) {
                this(gVar);
            }

            private a(g<T> gVar) {
                this.m = 0;
                this.h = gVar;
                if (gVar == null || b.this.d) {
                    this.f = true;
                }
            }

            public final a<T> a(d<T> dVar) {
                b.this.f.add(this);
                kn.a f = kn.f(ki.s);
                f.a("dispatchHandler:" + b.this.e);
                b(dVar);
                return this;
            }

            public final void a(T t) {
                if (b.this.d) {
                    return;
                }
                a((d) new f(t)).a();
            }

            public final void a(a<T> aVar) {
                if (b.this.d) {
                    return;
                }
                a((d) new f(null)).b(aVar);
            }

            private void c() {
                a((d) new e(null)).a();
            }

            public final void a(T t, a<T> aVar) {
                a((d) new e(t)).b(aVar);
            }

            private void b(d<T> dVar) {
                this.g = dVar;
                if (this.h != null) {
                    ((g) this.h).a = new a<T>() { // from class: com.tencent.mapsdk.internal.jy.b.a.1
                        @Override // com.tencent.mapsdk.internal.jy.a, com.tencent.map.tools.Callback
                        public final void callback(T t) {
                            a.this.k = t;
                        }
                    };
                }
            }

            private boolean d() {
                this.l++;
                kn.f(ki.s).a("try time:" + this.l);
                if (this.l < 2) {
                    this.f = false;
                    a();
                    return true;
                }
                return false;
            }

            public final void b(a<T> aVar) {
                this.i = aVar;
                a();
            }

            public final void a() {
                kn.f(ki.s).a(new Object[0]);
                if (this.f || b.this.d) {
                    kn.f(ki.s).a("cancelled...");
                    return;
                }
                this.m = 1;
                if (b.this.e != null) {
                    b.this.e.sendEmptyMessage(1);
                }
            }

            private void e() {
                kn.f(ki.s).a(new Object[0]);
                if (this.g != null && this.h != null) {
                    this.j = this.g.a(this.h);
                }
                kn.f(ki.s).a(new Object[0]);
                this.m = 2;
            }

            private void f() {
                kn.a f = kn.f(ki.s);
                f.a("result:" + this.k, "userCallback:" + this.i);
                if (this.i != null) {
                    this.i.callback(this.k);
                }
            }

            final void b() {
                kn.f(ki.s).a(new Object[0]);
                this.f = true;
                if (this.j != null) {
                    this.j.cancel(false);
                }
                this.m = 4;
            }

            private void g() throws ExecutionException, InterruptedException {
                kn.f(ki.s).a(new Object[0]);
                if (this.j == null || this.f) {
                    return;
                }
                if (this.j.isDone()) {
                    this.m = 3;
                } else if (this.j.isCancelled()) {
                    this.k = this.j.get();
                    b();
                }
            }
        }
    }

    public static <T> b.a<T> a(g<T> gVar) {
        kn.f(ki.s).a(gVar);
        return b.b.a(gVar);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public static abstract class g<T> implements Runnable, Callable<T> {
        private a<T> a;

        @Override // java.lang.Runnable
        public final void run() {
            try {
                T call = call();
                if (this.a != null) {
                    this.a.callback(call);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public static final class e<T> implements d<T> {
        T a;

        public e(T t) {
            this.a = t;
        }

        @Override // com.tencent.mapsdk.internal.jy.d
        public final Future<T> a(g<T> gVar) {
            return hd.a().submit(gVar, this.a);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public static final class f<T> implements d<T> {
        T a;

        public f(T t) {
            this.a = t;
        }

        @Override // com.tencent.mapsdk.internal.jy.d
        public final Future<T> a(g<T> gVar) {
            return hd.b().submit(gVar, this.a);
        }
    }

    public static void b(c cVar) {
        if (cVar != null && !cVar.a.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            Util.foreach(cVar.a.entrySet(), new c.AnonymousClass1(arrayList));
            Util.foreach(arrayList, new c.AnonymousClass2());
        }
        a.removeCallbacksAndMessages(null);
    }
}
