package com.bumptech.glide.load.engine;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.bumptech.glide.load.engine.i;
import com.squareup.picasso.IMonitorCallback;
import com.squareup.picasso.MonitorData;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class d implements i.a {
    private static final a h = new a();
    private static final Handler i = new Handler(Looper.getMainLooper(), new b());
    final List<com.bumptech.glide.request.g> a;
    final ExecutorService b;
    boolean c;
    boolean d;
    Set<com.bumptech.glide.request.g> e;
    i f;
    volatile Future<?> g;
    private final a j;
    private final e k;
    private final com.bumptech.glide.load.c l;
    private final ExecutorService m;
    private final boolean n;
    private boolean o;
    private l<?> p;
    private Exception q;
    private h<?> r;
    private IMonitorCallback s;
    private String t;

    public d(com.bumptech.glide.load.c cVar, ExecutorService executorService, ExecutorService executorService2, boolean z, e eVar, IMonitorCallback iMonitorCallback, String str) {
        this(cVar, executorService, executorService2, z, eVar, h, iMonitorCallback, str);
    }

    private d(com.bumptech.glide.load.c cVar, ExecutorService executorService, ExecutorService executorService2, boolean z, e eVar, a aVar, IMonitorCallback iMonitorCallback, String str) {
        this.a = new ArrayList();
        this.l = cVar;
        this.b = executorService;
        this.m = executorService2;
        this.n = z;
        this.k = eVar;
        this.j = aVar;
        this.s = iMonitorCallback;
        this.t = str;
    }

    @Override // com.bumptech.glide.load.engine.i.a
    public final void a(i iVar) {
        this.g = this.m.submit(iVar);
    }

    public final void a(com.bumptech.glide.request.g gVar) {
        com.bumptech.glide.util.h.a();
        if (this.c) {
            gVar.a(this.r);
        } else if (this.d) {
            gVar.a(this.q);
        } else {
            this.a.add(gVar);
        }
    }

    private boolean b(com.bumptech.glide.request.g gVar) {
        return this.e != null && this.e.contains(gVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void cancel() {
        if (this.d || this.c || this.o) {
            return;
        }
        this.f.cancel();
        Future<?> future = this.g;
        if (future != null) {
            future.cancel(true);
        }
        this.o = true;
        this.k.a(this, this.l);
    }

    @Override // com.bumptech.glide.request.g
    public final void a(l<?> lVar) {
        this.p = lVar;
        i.obtainMessage(1, this).sendToTarget();
        if (lVar == null || lVar.e() == null) {
            return;
        }
        MonitorData e = lVar.e();
        lVar.a(null);
        if (this.s == null || !(this.l instanceof f)) {
            return;
        }
        String str = ((f) this.l).a;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        String scheme = Uri.parse(str).getScheme();
        if ("http".equalsIgnoreCase(scheme) || "https".equalsIgnoreCase(scheme)) {
            e.a = str;
            e.n = this.t;
        }
    }

    @Override // com.bumptech.glide.request.g
    public final void a(Exception exc) {
        this.q = exc;
        i.obtainMessage(2, this).sendToTarget();
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    static class a {
        a() {
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static class b implements Handler.Callback {
        private b() {
        }

        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            if ((1 == message.what || 2 == message.what) && message.obj != null) {
                d dVar = (d) message.obj;
                if (1 == message.what) {
                    d.a(dVar);
                } else {
                    d.b(dVar);
                }
                return true;
            }
            return false;
        }
    }

    static /* synthetic */ void a(d dVar) {
        if (dVar.o) {
            dVar.p.d();
        } else if (dVar.a.isEmpty()) {
            throw new IllegalStateException("Received a resource without any callbacks to notify");
        } else {
            dVar.r = new h<>(dVar.p, dVar.n);
            dVar.c = true;
            dVar.r.f();
            dVar.k.a(dVar.l, dVar.r);
            for (com.bumptech.glide.request.g gVar : dVar.a) {
                if (!dVar.b(gVar)) {
                    dVar.r.f();
                    gVar.a(dVar.r);
                }
            }
            dVar.r.g();
        }
    }

    static /* synthetic */ void b(d dVar) {
        if (dVar.o) {
            return;
        }
        if (dVar.a.isEmpty()) {
            throw new IllegalStateException("Received an exception without any callbacks to notify");
        }
        dVar.d = true;
        dVar.k.a(dVar.l, (h<?>) null);
        for (com.bumptech.glide.request.g gVar : dVar.a) {
            if (!dVar.b(gVar)) {
                gVar.a(dVar.q);
            }
        }
    }
}
