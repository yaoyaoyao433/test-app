package com.bumptech.glide.load.engine;

import android.os.Looper;
import android.os.MessageQueue;
import android.util.Log;
import com.bumptech.glide.load.engine.a;
import com.bumptech.glide.load.engine.cache.a;
import com.bumptech.glide.load.engine.cache.h;
import com.bumptech.glide.load.engine.h;
import com.squareup.picasso.IMonitorCallback;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.ExecutorService;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class c implements h.a, com.bumptech.glide.load.engine.e, h.a {
    private final Map<com.bumptech.glide.load.c, com.bumptech.glide.load.engine.d> a;
    private final g b;
    private final com.bumptech.glide.load.engine.cache.h c;
    private final a d;
    private final Map<com.bumptech.glide.load.c, WeakReference<h<?>>> e;
    private final m f;
    private final b g;
    private ReferenceQueue<h<?>> h;
    private IMonitorCallback i;

    /* compiled from: ProGuard */
    /* renamed from: com.bumptech.glide.load.engine.c$c  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0039c {
        private final com.bumptech.glide.load.engine.d a;
        private final com.bumptech.glide.request.g b;

        public C0039c(com.bumptech.glide.request.g gVar, com.bumptech.glide.load.engine.d dVar) {
            this.b = gVar;
            this.a = dVar;
        }

        public final void cancel() {
            com.bumptech.glide.load.engine.d dVar = this.a;
            com.bumptech.glide.request.g gVar = this.b;
            com.bumptech.glide.util.h.a();
            if (!dVar.c && !dVar.d) {
                dVar.a.remove(gVar);
                if (dVar.a.isEmpty()) {
                    dVar.cancel();
                    return;
                }
                return;
            }
            if (dVar.e == null) {
                dVar.e = new HashSet();
            }
            dVar.e.add(gVar);
        }
    }

    public c(com.bumptech.glide.load.engine.cache.h hVar, a.InterfaceC0040a interfaceC0040a, ExecutorService executorService, ExecutorService executorService2) {
        this(hVar, interfaceC0040a, executorService, executorService2, null, null, null, null, null);
    }

    private c(com.bumptech.glide.load.engine.cache.h hVar, a.InterfaceC0040a interfaceC0040a, ExecutorService executorService, ExecutorService executorService2, Map<com.bumptech.glide.load.c, com.bumptech.glide.load.engine.d> map, g gVar, Map<com.bumptech.glide.load.c, WeakReference<h<?>>> map2, a aVar, m mVar) {
        this.c = hVar;
        this.g = new b(interfaceC0040a);
        this.e = new HashMap();
        this.b = new g();
        this.a = new HashMap();
        this.d = new a(executorService, executorService2, this);
        this.f = new m();
        hVar.a(this);
    }

    public final <T, Z, R> C0039c a(com.bumptech.glide.load.c cVar, int i, int i2, com.bumptech.glide.load.data.c<T> cVar2, com.bumptech.glide.provider.b<T, Z> bVar, com.bumptech.glide.load.g<Z> gVar, com.bumptech.glide.load.resource.transcode.c<Z, R> cVar3, int i3, boolean z, com.bumptech.glide.load.engine.b bVar2, com.bumptech.glide.request.g gVar2, boolean z2, String str) {
        h hVar;
        WeakReference<h<?>> weakReference;
        h<?> hVar2;
        com.bumptech.glide.util.h.a();
        long a2 = com.bumptech.glide.util.d.a();
        f fVar = new f(cVar2.b(), cVar, i, i2, bVar.a(), bVar.b(), gVar, bVar.d(), cVar3, bVar.c());
        if (z) {
            l<?> a3 = this.c.a(fVar);
            if (a3 == null) {
                hVar = null;
            } else if (a3 instanceof h) {
                hVar = (h) a3;
            } else {
                hVar = new h(a3, true);
            }
            if (hVar != null) {
                hVar.f();
                this.e.put(fVar, new e(fVar, hVar, a()));
            }
        } else {
            hVar = null;
        }
        if (hVar != null) {
            gVar2.a(hVar);
            if (Log.isLoggable("Engine", 2)) {
                a("Loaded resource from cache", a2, fVar);
            }
            return null;
        }
        if (z && (weakReference = this.e.get(fVar)) != null) {
            hVar2 = weakReference.get();
            if (hVar2 != null) {
                hVar2.f();
            } else {
                this.e.remove(fVar);
            }
        } else {
            hVar2 = null;
        }
        if (hVar2 != null) {
            gVar2.a(hVar2);
            if (Log.isLoggable("Engine", 2)) {
                a("Loaded resource from active resources", a2, fVar);
            }
            return null;
        }
        com.bumptech.glide.load.engine.d dVar = this.a.get(fVar);
        if (dVar != null) {
            dVar.a(gVar2);
            if (Log.isLoggable("Engine", 2)) {
                a("Added to existing load", a2, fVar);
            }
            return new C0039c(gVar2, dVar);
        }
        a aVar = this.d;
        com.bumptech.glide.load.engine.d dVar2 = new com.bumptech.glide.load.engine.d(fVar, aVar.a, aVar.b, z, aVar.c, this.i, str);
        i iVar = new i(dVar2, new com.bumptech.glide.load.engine.a(fVar, i, i2, cVar2, bVar, gVar, cVar3, this.g, bVar2, i3), i3, z2);
        this.a.put(fVar, dVar2);
        dVar2.a(gVar2);
        dVar2.f = iVar;
        dVar2.g = dVar2.b.submit(iVar);
        if (Log.isLoggable("Engine", 2)) {
            a("Started new load", a2, fVar);
        }
        return new C0039c(gVar2, dVar2);
    }

    private static void a(String str, long j, com.bumptech.glide.load.c cVar) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" in ");
        sb.append(com.bumptech.glide.util.d.a(j));
        sb.append("ms, key: ");
        sb.append(cVar);
    }

    public static void a(l lVar) {
        com.bumptech.glide.util.h.a();
        if (lVar instanceof h) {
            ((h) lVar).g();
            return;
        }
        throw new IllegalArgumentException("Cannot release anything but an EngineResource");
    }

    @Override // com.bumptech.glide.load.engine.e
    public final void a(com.bumptech.glide.load.c cVar, h<?> hVar) {
        com.bumptech.glide.util.h.a();
        if (hVar != null) {
            hVar.c = cVar;
            hVar.b = this;
            if (hVar.a) {
                this.e.put(cVar, new e(cVar, hVar, a()));
            }
        }
        this.a.remove(cVar);
    }

    @Override // com.bumptech.glide.load.engine.e
    public final void a(com.bumptech.glide.load.engine.d dVar, com.bumptech.glide.load.c cVar) {
        com.bumptech.glide.util.h.a();
        if (dVar.equals(this.a.get(cVar))) {
            this.a.remove(cVar);
        }
    }

    @Override // com.bumptech.glide.load.engine.cache.h.a
    public final void b(l<?> lVar) {
        com.bumptech.glide.util.h.a();
        this.f.a(lVar);
    }

    @Override // com.bumptech.glide.load.engine.h.a
    public final void b(com.bumptech.glide.load.c cVar, h hVar) {
        com.bumptech.glide.util.h.a();
        this.e.remove(cVar);
        if (hVar.a) {
            this.c.a(cVar, hVar);
        } else {
            this.f.a(hVar);
        }
    }

    private ReferenceQueue<h<?>> a() {
        if (this.h == null) {
            this.h = new ReferenceQueue<>();
            Looper.myQueue().addIdleHandler(new d(this.e, this.h));
        }
        return this.h;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static class b implements a.InterfaceC0037a {
        private final a.InterfaceC0040a a;
        private volatile com.bumptech.glide.load.engine.cache.a b;

        public b(a.InterfaceC0040a interfaceC0040a) {
            this.a = interfaceC0040a;
        }

        @Override // com.bumptech.glide.load.engine.a.InterfaceC0037a
        public final com.bumptech.glide.load.engine.cache.a a() {
            if (this.b == null) {
                synchronized (this) {
                    if (this.b == null) {
                        this.b = this.a.a();
                    }
                    if (this.b == null) {
                        this.b = new com.bumptech.glide.load.engine.cache.b();
                    }
                }
            }
            return this.b;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static class e extends WeakReference<h<?>> {
        private final com.bumptech.glide.load.c a;

        public e(com.bumptech.glide.load.c cVar, h<?> hVar, ReferenceQueue<? super h<?>> referenceQueue) {
            super(hVar, referenceQueue);
            this.a = cVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static class d implements MessageQueue.IdleHandler {
        private final Map<com.bumptech.glide.load.c, WeakReference<h<?>>> a;
        private final ReferenceQueue<h<?>> b;

        public d(Map<com.bumptech.glide.load.c, WeakReference<h<?>>> map, ReferenceQueue<h<?>> referenceQueue) {
            this.a = map;
            this.b = referenceQueue;
        }

        @Override // android.os.MessageQueue.IdleHandler
        public final boolean queueIdle() {
            e eVar = (e) this.b.poll();
            if (eVar != null) {
                this.a.remove(eVar.a);
                return true;
            }
            return true;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static class a {
        final ExecutorService a;
        final ExecutorService b;
        final com.bumptech.glide.load.engine.e c;

        public a(ExecutorService executorService, ExecutorService executorService2, com.bumptech.glide.load.engine.e eVar) {
            this.a = executorService;
            this.b = executorService2;
            this.c = eVar;
        }
    }
}
