package com.bumptech.glide;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import com.bumptech.glide.manager.c;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class m implements com.bumptech.glide.manager.h {
    public final Context a;
    public final com.bumptech.glide.manager.g b;
    public final com.bumptech.glide.manager.l c;
    public final i d;
    public final b e;
    private final com.bumptech.glide.manager.k f;

    public m(Context context, com.bumptech.glide.manager.g gVar, com.bumptech.glide.manager.k kVar) {
        this(context, gVar, kVar, new com.bumptech.glide.manager.l(), new com.bumptech.glide.manager.d());
    }

    private m(Context context, final com.bumptech.glide.manager.g gVar, com.bumptech.glide.manager.k kVar, com.bumptech.glide.manager.l lVar, com.bumptech.glide.manager.d dVar) {
        com.bumptech.glide.manager.h iVar;
        this.a = context.getApplicationContext();
        this.b = gVar;
        this.f = kVar;
        this.c = lVar;
        this.d = i.a(context);
        this.e = new b();
        c cVar = new c(lVar);
        if (context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0) {
            iVar = new com.bumptech.glide.manager.e(context, cVar);
        } else {
            iVar = new com.bumptech.glide.manager.i();
        }
        if (com.bumptech.glide.util.h.d()) {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.bumptech.glide.m.1
                @Override // java.lang.Runnable
                public final void run() {
                    gVar.a(m.this);
                }
            });
        } else {
            gVar.a(this);
        }
        gVar.a(iVar);
    }

    public final void a(int i) {
        this.d.a(i);
    }

    public final void a() {
        com.bumptech.glide.util.h.a();
        this.c.a();
    }

    public final void b() {
        com.bumptech.glide.util.h.a();
        this.c.b();
    }

    @Override // com.bumptech.glide.manager.h
    public final void c() {
        b();
    }

    @Override // com.bumptech.glide.manager.h
    public final void d() {
        a();
    }

    @Override // com.bumptech.glide.manager.h
    public final void e() {
        com.bumptech.glide.manager.l lVar = this.c;
        for (com.bumptech.glide.request.c cVar : com.bumptech.glide.util.h.a(lVar.a)) {
            cVar.c();
        }
        lVar.b.clear();
    }

    public <T> d<T> a(Class<T> cls) {
        com.bumptech.glide.load.model.l a2 = i.a(cls, this.a);
        com.bumptech.glide.load.model.l b2 = i.b(cls, this.a);
        if (cls != null && a2 == null && b2 == null) {
            throw new IllegalArgumentException("Unknown type " + cls + ". You must provide a Model of a type for which there is a registered ModelLoader, if you are using a custom model, you must first call Glide#register with a ModelLoaderFactory for your custom model class");
        }
        b bVar = this.e;
        return new d<>(cls, a2, b2, this.a, this.d, this.c, this.b, this.e);
    }

    public static <T> Class<T> a(T t) {
        if (t != null) {
            return (Class<T>) t.getClass();
        }
        return null;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public final class a<A, T> {
        public final com.bumptech.glide.load.model.l<A, T> a;
        public final Class<T> b;

        public a(com.bumptech.glide.load.model.l<A, T> lVar, Class<T> cls) {
            this.a = lVar;
            this.b = cls;
        }

        /* compiled from: ProGuard */
        /* renamed from: com.bumptech.glide.m$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public final class C0045a {
            public final A a;
            public final Class<A> b;
            public final boolean c = true;

            public C0045a(A a) {
                this.a = a;
                this.b = m.a(a);
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public class b {
        b() {
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    static class c implements c.a {
        private final com.bumptech.glide.manager.l a;

        public c(com.bumptech.glide.manager.l lVar) {
            this.a = lVar;
        }

        @Override // com.bumptech.glide.manager.c.a
        public final void a(boolean z) {
            if (z) {
                com.bumptech.glide.manager.l lVar = this.a;
                for (com.bumptech.glide.request.c cVar : com.bumptech.glide.util.h.a(lVar.a)) {
                    if (!cVar.f() && !cVar.h()) {
                        cVar.d();
                        if (!lVar.c) {
                            cVar.b();
                        } else {
                            lVar.b.add(cVar);
                        }
                    }
                }
            }
        }
    }

    public final d<String> a(String str) {
        return (d) a(String.class).b((d) str);
    }

    public final d<Uri> a(Uri uri) {
        com.bumptech.glide.load.model.stream.b bVar = new com.bumptech.glide.load.model.stream.b(this.a, i.a(Uri.class, this.a));
        com.bumptech.glide.load.model.l b2 = i.b(Uri.class, this.a);
        b bVar2 = this.e;
        return (d) new d(Uri.class, bVar, b2, this.a, this.d, this.c, this.b, this.e).b((d) uri);
    }
}
