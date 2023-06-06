package com.bumptech.glide.request;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.Log;
import com.bumptech.glide.load.engine.c;
import com.bumptech.glide.load.engine.l;
import com.bumptech.glide.request.target.j;
import com.meituan.robust.common.CommonConstant;
import java.util.Queue;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class b<A, T, Z, R> implements c, g, j {
    private static final Queue<b<?, ?, ?, ?>> b = com.bumptech.glide.util.h.a(0);
    private Drawable A;
    private boolean B;
    private l<?> C;
    private c.C0039c D;
    private long E;
    private int F;
    private String G;
    public Object a;
    private final String c = String.valueOf(hashCode());
    private com.bumptech.glide.load.c d;
    private Drawable e;
    private int f;
    private int g;
    private int h;
    private Context i;
    private com.bumptech.glide.load.g<Z> j;
    private com.bumptech.glide.provider.f<A, T, Z, R> k;
    private d l;
    private A m;
    private Class<R> n;
    private boolean o;
    private int p;
    private com.bumptech.glide.request.target.l<R> q;
    private f<? super A, R> r;
    private float s;
    private com.bumptech.glide.load.engine.c t;
    private com.bumptech.glide.request.animation.f<R> u;
    private int v;
    private int w;
    private com.bumptech.glide.load.engine.b x;
    private boolean y;
    private Drawable z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: $VALUES field not found */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static final class a {
        public static final int a = 1;
        public static final int b = 2;
        public static final int c = 3;
        public static final int d = 4;
        public static final int e = 5;
        public static final int f = 6;
        public static final int g = 7;
        public static final int h = 8;
        private static final /* synthetic */ int[] i = {a, b, c, d, e, f, g, h};
    }

    public static <A, T, Z, R> b<A, T, Z, R> a(com.bumptech.glide.provider.f<A, T, Z, R> fVar, A a2, com.bumptech.glide.load.c cVar, Context context, int i, com.bumptech.glide.request.target.l<R> lVar, float f, Drawable drawable, int i2, Drawable drawable2, int i3, Drawable drawable3, int i4, f<? super A, R> fVar2, d dVar, com.bumptech.glide.load.engine.c cVar2, com.bumptech.glide.load.g<Z> gVar, Class<R> cls, boolean z, com.bumptech.glide.request.animation.f<R> fVar3, int i5, int i6, com.bumptech.glide.load.engine.b bVar, boolean z2, String str) {
        b<?, ?, ?, ?> poll = b.poll();
        if (poll == null) {
            poll = new b<>();
        }
        b<A, T, Z, R> bVar2 = (b<A, T, Z, R>) poll;
        ((b) bVar2).k = fVar;
        ((b) bVar2).m = a2;
        ((b) bVar2).d = cVar;
        ((b) bVar2).e = drawable3;
        ((b) bVar2).f = i4;
        ((b) bVar2).i = context.getApplicationContext();
        ((b) bVar2).p = i;
        ((b) bVar2).q = lVar;
        ((b) bVar2).s = f;
        ((b) bVar2).z = drawable;
        ((b) bVar2).g = i2;
        ((b) bVar2).A = drawable2;
        ((b) bVar2).h = i3;
        ((b) bVar2).r = fVar2;
        ((b) bVar2).l = dVar;
        ((b) bVar2).t = cVar2;
        ((b) bVar2).j = gVar;
        ((b) bVar2).n = cls;
        ((b) bVar2).o = z;
        ((b) bVar2).u = fVar3;
        ((b) bVar2).v = i5;
        ((b) bVar2).w = i6;
        ((b) bVar2).x = bVar;
        ((b) bVar2).y = z2;
        ((b) bVar2).G = str;
        ((b) bVar2).F = a.a;
        if (a2 != null) {
            a("ModelLoader", fVar.e(), "try .using(ModelLoader)");
            a("Transcoder", fVar.f(), "try .as*(Class).transcode(ResourceTranscoder)");
            a("Transformation", gVar, "try .transform(UnitTransformation.get())");
            if (bVar.e) {
                a("SourceEncoder", fVar.c(), "try .sourceEncoder(Encoder) or .diskCacheStrategy(NONE/RESULT)");
            } else {
                a("SourceDecoder", fVar.b(), "try .decoder/.imageDecoder/.videoDecoder(ResourceDecoder) or .diskCacheStrategy(ALL/SOURCE)");
            }
            if (bVar.e || bVar.f) {
                a("CacheDecoder", fVar.a(), "try .cacheDecoder(ResouceDecoder) or .diskCacheStrategy(NONE)");
            }
            if (bVar.f) {
                a("Encoder", fVar.d(), "try .encode(ResourceEncoder) or .diskCacheStrategy(NONE/SOURCE)");
            }
        }
        return bVar2;
    }

    private b() {
    }

    @Override // com.bumptech.glide.request.c
    public final void a() {
        this.k = null;
        this.m = null;
        this.i = null;
        this.q = null;
        this.z = null;
        this.A = null;
        this.e = null;
        this.r = null;
        this.l = null;
        this.j = null;
        this.u = null;
        this.B = false;
        this.D = null;
        b.offer(this);
    }

    private static void a(String str, Object obj, String str2) {
        if (obj != null) {
            return;
        }
        throw new NullPointerException(str + " must not be null, " + str2);
    }

    @Override // com.bumptech.glide.request.c
    public final void b() {
        this.E = com.bumptech.glide.util.d.a();
        if (this.m == null) {
            a((Exception) null);
            return;
        }
        this.F = a.c;
        if (com.bumptech.glide.util.h.a(this.v, this.w)) {
            a(this.v, this.w);
        } else {
            this.q.a((j) this);
        }
        if (!f()) {
            if (!(this.F == a.e) && j()) {
                this.q.a(i());
            }
        }
        if (Log.isLoggable("GenericRequest", 2)) {
            a("finished run method in " + com.bumptech.glide.util.d.a(this.E));
        }
    }

    final void cancel() {
        this.F = a.f;
        if (this.D != null) {
            this.D.cancel();
            this.D = null;
        }
    }

    @Override // com.bumptech.glide.request.c
    public final void c() {
        com.bumptech.glide.util.h.a();
        if (this.F == a.g) {
            return;
        }
        cancel();
        if (this.C != null) {
            b(this.C);
        }
        if (j()) {
            this.q.b(i());
        }
        this.F = a.g;
    }

    @Override // com.bumptech.glide.request.c
    public final void d() {
        c();
        this.F = a.h;
    }

    private void b(l lVar) {
        com.bumptech.glide.load.engine.c.a(lVar);
        this.C = null;
    }

    @Override // com.bumptech.glide.request.c
    public final boolean e() {
        return this.F == a.b || this.F == a.c;
    }

    @Override // com.bumptech.glide.request.c
    public final boolean f() {
        return this.F == a.d;
    }

    @Override // com.bumptech.glide.request.c
    public final boolean g() {
        return f();
    }

    @Override // com.bumptech.glide.request.c
    public final boolean h() {
        return this.F == a.f || this.F == a.g;
    }

    private void b(Exception exc) {
        Drawable drawable;
        if (j()) {
            if (this.m == null) {
                if (this.e == null && this.f > 0) {
                    this.e = this.i.getResources().getDrawable(this.f);
                }
                drawable = this.e;
            } else {
                drawable = null;
            }
            if (drawable == null) {
                if (this.A == null && this.h > 0) {
                    this.A = this.i.getResources().getDrawable(this.h);
                }
                drawable = this.A;
            }
            if (drawable == null) {
                drawable = i();
            }
            this.q.a(exc, drawable);
        }
    }

    private Drawable i() {
        if (this.z == null && this.g > 0) {
            this.z = this.i.getResources().getDrawable(this.g);
        }
        return this.z;
    }

    @Override // com.bumptech.glide.request.target.j
    public final void a(int i, int i2) {
        if (Log.isLoggable("GenericRequest", 2)) {
            a("Got onSizeReady in " + com.bumptech.glide.util.d.a(this.E));
        }
        if (this.F != a.c) {
            return;
        }
        this.F = a.b;
        int round = Math.round(this.s * i);
        int round2 = Math.round(this.s * i2);
        int i3 = round <= 0 ? Integer.MIN_VALUE : round;
        int i4 = round2 <= 0 ? Integer.MIN_VALUE : round2;
        com.bumptech.glide.load.model.l<A, T> e = this.k.e();
        if (e instanceof com.bumptech.glide.load.model.f) {
            ((com.bumptech.glide.load.model.f) e).a(this.a);
        }
        com.bumptech.glide.load.data.c<T> a2 = e.a(this.m, i3, i4);
        if (a2 == null) {
            a(new Exception("Failed to load model: '" + this.m + CommonConstant.Symbol.SINGLE_QUOTES));
            return;
        }
        com.bumptech.glide.load.resource.transcode.c<Z, R> f = this.k.f();
        if (Log.isLoggable("GenericRequest", 2)) {
            a("finished setup for calling load in " + com.bumptech.glide.util.d.a(this.E));
        }
        this.B = true;
        this.D = this.t.a(this.d, i3, i4, a2, this.k, this.j, f, this.p, this.o, this.x, this, this.y, this.G);
        this.B = this.C != null;
        if (Log.isLoggable("GenericRequest", 2)) {
            a("finished onSizeReady in " + com.bumptech.glide.util.d.a(this.E));
        }
    }

    private boolean j() {
        return this.l == null || this.l.b(this);
    }

    private boolean k() {
        return this.l == null || !this.l.i();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bumptech.glide.request.g
    public final void a(l<?> lVar) {
        if (lVar == null) {
            a(new Exception("Expected to receive a Resource<R> with an object of " + this.n + " inside, but instead got null."));
            return;
        }
        Object a2 = lVar.a();
        if (a2 == null || !this.n.isAssignableFrom(a2.getClass())) {
            b(lVar);
            StringBuilder sb = new StringBuilder("Expected to receive an object of ");
            sb.append(this.n);
            sb.append(" but instead got ");
            sb.append(a2 != null ? a2.getClass() : "");
            sb.append(CommonConstant.Symbol.BIG_BRACKET_LEFT);
            sb.append(a2);
            sb.append("} inside Resource{");
            sb.append(lVar);
            sb.append("}.");
            sb.append(a2 != null ? "" : " To indicate failure return a null Resource object, rather than a Resource object containing null data.");
            a(new Exception(sb.toString()));
            return;
        }
        if (!(this.l == null || this.l.a(this))) {
            b(lVar);
            this.F = a.d;
            return;
        }
        boolean k = k();
        this.F = a.d;
        this.C = lVar;
        if (this.r == null || !this.r.a(a2, this.m, this.q, this.B, k)) {
            this.q.a((com.bumptech.glide.request.target.l<R>) a2, (com.bumptech.glide.request.animation.e<? super com.bumptech.glide.request.target.l<R>>) this.u.a(this.B, k));
        }
        if (this.l != null) {
            this.l.c(this);
        }
        if (Log.isLoggable("GenericRequest", 2)) {
            a("Resource ready in " + com.bumptech.glide.util.d.a(this.E) + " size: " + (lVar.c() * 9.5367431640625E-7d) + " fromCache: " + this.B);
        }
    }

    @Override // com.bumptech.glide.request.g
    public final void a(Exception exc) {
        if (Log.isLoggable("GenericRequest", 3)) {
            Log.d("GenericRequest", "load failed", exc);
        }
        this.F = a.e;
        if (this.r == null || !this.r.a(exc, (A) this.m, this.q, k())) {
            b(exc);
        }
    }

    private void a(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" this: ");
        sb.append(this.c);
    }
}
