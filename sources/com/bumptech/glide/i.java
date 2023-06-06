package com.bumptech.glide;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import android.view.View;
import com.bumptech.glide.load.model.file_descriptor.a;
import com.bumptech.glide.load.model.file_descriptor.c;
import com.bumptech.glide.load.model.file_descriptor.d;
import com.bumptech.glide.load.model.file_descriptor.e;
import com.bumptech.glide.load.model.stream.a;
import com.bumptech.glide.load.model.stream.c;
import com.bumptech.glide.load.model.stream.d;
import com.bumptech.glide.load.model.stream.f;
import com.bumptech.glide.load.model.stream.g;
import com.bumptech.glide.load.model.stream.h;
import com.bumptech.glide.load.model.stream.i;
import com.bumptech.glide.load.resource.bitmap.n;
import com.bumptech.glide.load.resource.bitmap.p;
import com.squareup.picasso.PicassoDrawable;
import java.io.File;
import java.io.InputStream;
import java.net.URL;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class i {
    private static volatile i e = null;
    private static boolean f = false;
    private static volatile boolean g = false;
    final com.bumptech.glide.load.engine.c a;
    final com.bumptech.glide.load.engine.bitmap_recycle.c b;
    final com.bumptech.glide.load.a c;
    private final com.bumptech.glide.load.model.c h;
    private final com.bumptech.glide.load.engine.cache.h i;
    private final com.bumptech.glide.load.resource.bitmap.e m;
    private final com.bumptech.glide.load.resource.gifbitmap.f n;
    private final com.bumptech.glide.load.resource.bitmap.i o;
    private final com.bumptech.glide.load.resource.gifbitmap.f p;
    private final com.bumptech.glide.load.engine.prefill.a q;
    private final com.bumptech.glide.request.target.f j = new com.bumptech.glide.request.target.f();
    private final com.bumptech.glide.load.resource.transcode.d k = new com.bumptech.glide.load.resource.transcode.d();
    final Handler d = new Handler(Looper.getMainLooper());
    private final com.bumptech.glide.provider.c l = new com.bumptech.glide.provider.c();

    public static void a(boolean z) {
        synchronized (i.class) {
            if (e != null) {
                throw new IllegalArgumentException("Glide singleton already exists.");
            }
            f = false;
        }
    }

    public static i a(Context context) {
        List<com.bumptech.glide.module.a> emptyList;
        if (e == null) {
            synchronized (i.class) {
                if (e == null) {
                    Context applicationContext = context.getApplicationContext();
                    j jVar = new j(applicationContext);
                    if (f) {
                        emptyList = new com.bumptech.glide.module.b(applicationContext).a();
                    } else {
                        emptyList = Collections.emptyList();
                    }
                    Iterator<com.bumptech.glide.module.a> it = emptyList.iterator();
                    while (it.hasNext()) {
                        it.next();
                    }
                    if (jVar.e == null) {
                        jVar.e = new com.bumptech.glide.load.engine.executor.a(Math.max(1, com.sankuai.waimai.launcher.util.aop.b.a(Runtime.getRuntime().availableProcessors())));
                    }
                    if (jVar.f == null) {
                        jVar.f = new com.bumptech.glide.load.engine.executor.a(1);
                    }
                    com.bumptech.glide.load.engine.cache.i iVar = new com.bumptech.glide.load.engine.cache.i(jVar.a);
                    if (jVar.c == null) {
                        if (Build.VERSION.SDK_INT >= 11) {
                            jVar.c = new com.bumptech.glide.load.engine.bitmap_recycle.f(iVar.a);
                        } else {
                            jVar.c = new com.bumptech.glide.load.engine.bitmap_recycle.d();
                        }
                    }
                    if (jVar.d == null) {
                        jVar.d = new com.bumptech.glide.load.engine.cache.g(iVar.b);
                    }
                    if (jVar.h == null) {
                        jVar.h = new com.bumptech.glide.load.engine.cache.f(jVar.a);
                    }
                    if (jVar.b == null) {
                        jVar.b = new com.bumptech.glide.load.engine.c(jVar.d, jVar.h, jVar.f, jVar.e);
                    }
                    if (jVar.g == null) {
                        jVar.g = com.bumptech.glide.load.a.d;
                    }
                    e = new i(jVar.b, jVar.d, jVar.c, jVar.a, jVar.g);
                    Iterator<com.bumptech.glide.module.a> it2 = emptyList.iterator();
                    while (it2.hasNext()) {
                        it2.next();
                    }
                }
            }
        }
        return e;
    }

    i(com.bumptech.glide.load.engine.c cVar, com.bumptech.glide.load.engine.cache.h hVar, com.bumptech.glide.load.engine.bitmap_recycle.c cVar2, Context context, com.bumptech.glide.load.a aVar) {
        this.a = cVar;
        this.b = cVar2;
        this.i = hVar;
        this.c = aVar;
        this.h = new com.bumptech.glide.load.model.c(context);
        this.q = new com.bumptech.glide.load.engine.prefill.a(hVar, cVar2, aVar);
        p pVar = new p(cVar2, aVar);
        this.l.a(InputStream.class, Bitmap.class, pVar);
        com.bumptech.glide.load.resource.bitmap.g gVar = new com.bumptech.glide.load.resource.bitmap.g(cVar2, aVar);
        this.l.a(ParcelFileDescriptor.class, Bitmap.class, gVar);
        n nVar = new n(pVar, gVar);
        this.l.a(com.bumptech.glide.load.model.g.class, Bitmap.class, nVar);
        com.bumptech.glide.load.resource.gif.c cVar3 = new com.bumptech.glide.load.resource.gif.c(context, cVar2);
        this.l.a(InputStream.class, com.bumptech.glide.load.resource.gif.b.class, cVar3);
        this.l.a(com.bumptech.glide.load.model.g.class, com.bumptech.glide.load.resource.gifbitmap.a.class, new com.bumptech.glide.load.resource.gifbitmap.g(nVar, cVar3, cVar2));
        this.l.a(InputStream.class, File.class, new com.bumptech.glide.load.resource.file.d());
        a(File.class, ParcelFileDescriptor.class, new a.C0042a());
        a(File.class, InputStream.class, new d.a());
        a(Integer.TYPE, ParcelFileDescriptor.class, new c.a());
        a(Integer.TYPE, InputStream.class, new f.a());
        a(Integer.class, ParcelFileDescriptor.class, new c.a());
        a(Integer.class, InputStream.class, new f.a());
        a(String.class, ParcelFileDescriptor.class, new d.a());
        a(String.class, InputStream.class, new g.a());
        a(Uri.class, ParcelFileDescriptor.class, new e.a());
        a(Uri.class, InputStream.class, new h.a());
        a(URL.class, InputStream.class, new i.a());
        a(com.bumptech.glide.load.model.d.class, InputStream.class, new a.C0043a());
        a(byte[].class, InputStream.class, new c.a());
        this.k.a(Bitmap.class, com.bumptech.glide.load.resource.bitmap.j.class, new com.bumptech.glide.load.resource.transcode.b(context.getResources(), cVar2));
        this.k.a(com.bumptech.glide.load.resource.gifbitmap.a.class, PicassoDrawable.class, new com.bumptech.glide.load.resource.transcode.a(new com.bumptech.glide.load.resource.transcode.b(context.getResources(), cVar2)));
        this.m = new com.bumptech.glide.load.resource.bitmap.e(cVar2);
        this.n = new com.bumptech.glide.load.resource.gifbitmap.f(cVar2, this.m);
        this.o = new com.bumptech.glide.load.resource.bitmap.i(cVar2);
        this.p = new com.bumptech.glide.load.resource.gifbitmap.f(cVar2, this.o);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final <Z, R> com.bumptech.glide.load.resource.transcode.c<Z, R> a(Class<Z> cls, Class<R> cls2) {
        return this.k.a(cls, cls2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final <T, Z> com.bumptech.glide.provider.b<T, Z> b(Class<T> cls, Class<Z> cls2) {
        return this.l.a(cls, cls2);
    }

    public static boolean a() {
        return g;
    }

    public final void b() {
        com.bumptech.glide.util.h.a();
        this.i.a();
        this.b.a();
    }

    public final void a(int i) {
        com.bumptech.glide.util.h.a();
        this.i.a(i);
        this.b.a(i);
    }

    public static void a(com.bumptech.glide.request.target.l<?> lVar) {
        com.bumptech.glide.util.h.a();
        com.bumptech.glide.request.c a2 = lVar.a();
        if (a2 != null) {
            a2.c();
            lVar.a((com.bumptech.glide.request.c) null);
        }
    }

    public static void a(View view) {
        a(new a(view));
    }

    public final <T, Y> void a(Class<T> cls, Class<Y> cls2, com.bumptech.glide.load.model.m<T, Y> mVar) {
        this.h.a(cls, cls2, mVar);
    }

    private static <T, Y> com.bumptech.glide.load.model.l<T, Y> a(Class<T> cls, Class<Y> cls2, Context context) {
        if (cls == null) {
            Log.isLoggable("Glide", 3);
            return null;
        }
        return a(context).h.a(cls, cls2);
    }

    public static <T> com.bumptech.glide.load.model.l<T, InputStream> a(Class<T> cls, Context context) {
        return a(cls, InputStream.class, context);
    }

    public static <T> com.bumptech.glide.load.model.l<T, ParcelFileDescriptor> b(Class<T> cls, Context context) {
        return a(cls, ParcelFileDescriptor.class, context);
    }

    public static m b(Context context) {
        return com.bumptech.glide.manager.j.a().a(context);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    static class a extends com.bumptech.glide.request.target.m<View, Object> {
        @Override // com.bumptech.glide.request.target.b, com.bumptech.glide.request.target.l
        public final void a(Drawable drawable) {
        }

        @Override // com.bumptech.glide.request.target.b, com.bumptech.glide.request.target.l
        public final void a(Exception exc, Drawable drawable) {
        }

        @Override // com.bumptech.glide.request.target.l
        public final void a(Object obj, com.bumptech.glide.request.animation.e<? super Object> eVar) {
        }

        @Override // com.bumptech.glide.request.target.b, com.bumptech.glide.request.target.l
        public final void b(Drawable drawable) {
        }

        public a(View view) {
            super(view);
        }
    }
}
