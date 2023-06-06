package com.bumptech.glide;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.animation.Animation;
import java.io.File;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class e<ModelType, DataType, ResourceType, TranscodeType> implements Cloneable {
    private boolean A;
    private boolean B;
    private Drawable C;
    private int D;
    private Object E;
    private String F;
    protected final Class<ModelType> a;
    protected final Context b;
    protected final i c;
    protected final Class<TranscodeType> d;
    protected final com.bumptech.glide.manager.l e;
    protected final com.bumptech.glide.manager.g f;
    public boolean g;
    private com.bumptech.glide.provider.a<ModelType, DataType, ResourceType, TranscodeType> h;
    private ModelType i;
    private com.bumptech.glide.load.c j;
    private boolean k;
    private int l;
    private int m;
    private com.bumptech.glide.request.f<? super ModelType, TranscodeType> n;
    private Float o;
    private e<?, ?, ?, TranscodeType> p;
    private Float q;
    private Drawable r;
    private Drawable s;
    private int t;
    private boolean u;
    private com.bumptech.glide.request.animation.f<TranscodeType> v;
    private int w;
    private int x;
    private com.bumptech.glide.load.engine.b y;
    private com.bumptech.glide.load.g<ResourceType> z;

    /* JADX INFO: Access modifiers changed from: package-private */
    public e(com.bumptech.glide.provider.f<ModelType, DataType, ResourceType, TranscodeType> fVar, Class<TranscodeType> cls, e<ModelType, ?, ?, ?> eVar) {
        this(eVar.b, eVar.a, fVar, cls, eVar.c, eVar.e, eVar.f);
        this.i = eVar.i;
        this.k = eVar.k;
        this.j = eVar.j;
        this.y = eVar.y;
        this.u = eVar.u;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public e(Context context, Class<ModelType> cls, com.bumptech.glide.provider.f<ModelType, DataType, ResourceType, TranscodeType> fVar, Class<TranscodeType> cls2, i iVar, com.bumptech.glide.manager.l lVar, com.bumptech.glide.manager.g gVar) {
        this.j = com.bumptech.glide.signature.b.a();
        this.q = Float.valueOf(1.0f);
        this.t = 0;
        this.u = true;
        this.v = com.bumptech.glide.request.animation.g.a();
        this.w = -1;
        this.x = -1;
        this.y = com.bumptech.glide.load.engine.b.RESULT;
        this.g = false;
        this.z = com.bumptech.glide.load.resource.d.b();
        this.b = context;
        this.a = cls;
        this.d = cls2;
        this.c = iVar;
        this.e = lVar;
        this.f = gVar;
        this.h = fVar != null ? new com.bumptech.glide.provider.a<>(fVar) : null;
        if (context == null) {
            throw new NullPointerException("Context can't be null");
        }
        if (cls != null && fVar == null) {
            throw new NullPointerException("LoadProvider must not be null");
        }
    }

    public e<ModelType, DataType, ResourceType, TranscodeType> a(e<?, ?, ?, TranscodeType> eVar) {
        if (equals(eVar)) {
            throw new IllegalArgumentException("You cannot set a request as a thumbnail for itself. Consider using clone() on the request you are passing to thumbnail()");
        }
        this.p = eVar;
        return this;
    }

    public e<ModelType, DataType, ResourceType, TranscodeType> b(float f) {
        if (f < 0.0f || f > 1.0f) {
            throw new IllegalArgumentException("sizeMultiplier must be between 0 and 1");
        }
        this.o = Float.valueOf(f);
        return this;
    }

    public e<ModelType, DataType, ResourceType, TranscodeType> a(float f) {
        if (f < 0.0f || f > 1.0f) {
            throw new IllegalArgumentException("sizeMultiplier must be between 0 and 1");
        }
        this.q = Float.valueOf(f);
        return this;
    }

    public e<ModelType, DataType, ResourceType, TranscodeType> b(String str) {
        this.F = str;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public e<ModelType, DataType, ResourceType, TranscodeType> b(com.bumptech.glide.load.e<DataType, ResourceType> eVar) {
        if (this.h != null) {
            this.h.b = eVar;
        }
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public e<ModelType, DataType, ResourceType, TranscodeType> a(com.bumptech.glide.load.e<File, ResourceType> eVar) {
        if (this.h != null) {
            this.h.a = eVar;
        }
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public e<ModelType, DataType, ResourceType, TranscodeType> a(com.bumptech.glide.load.b<DataType> bVar) {
        if (this.h != null) {
            this.h.c = bVar;
        }
        return this;
    }

    public e<ModelType, DataType, ResourceType, TranscodeType> a(com.bumptech.glide.load.engine.b bVar) {
        this.y = bVar;
        return this;
    }

    public e<ModelType, DataType, ResourceType, TranscodeType> b(int i) {
        this.t = i;
        return this;
    }

    public e<ModelType, DataType, ResourceType, TranscodeType> a(com.bumptech.glide.load.g<ResourceType>... gVarArr) {
        this.A = true;
        if (gVarArr.length == 1) {
            this.z = gVarArr[0];
        } else {
            this.z = new com.bumptech.glide.load.d(gVarArr);
        }
        return this;
    }

    public e<ModelType, DataType, ResourceType, TranscodeType> f() {
        return a((com.bumptech.glide.load.g[]) new com.bumptech.glide.load.g[]{com.bumptech.glide.load.resource.d.b()});
    }

    public e<ModelType, DataType, ResourceType, TranscodeType> e() {
        return a((com.bumptech.glide.request.animation.f) com.bumptech.glide.request.animation.g.a());
    }

    @Deprecated
    public e<ModelType, DataType, ResourceType, TranscodeType> a(Animation animation) {
        return a((com.bumptech.glide.request.animation.f) new com.bumptech.glide.request.animation.i(animation));
    }

    public e<ModelType, DataType, ResourceType, TranscodeType> a(com.bumptech.glide.request.animation.f<TranscodeType> fVar) {
        if (fVar == null) {
            throw new NullPointerException("Animation factory must not be null!");
        }
        this.v = fVar;
        return this;
    }

    public e<ModelType, DataType, ResourceType, TranscodeType> d(Drawable drawable) {
        this.r = drawable;
        return this;
    }

    public e<ModelType, DataType, ResourceType, TranscodeType> a(int i) {
        this.m = i;
        return this;
    }

    public e<ModelType, DataType, ResourceType, TranscodeType> c(Drawable drawable) {
        this.s = drawable;
        return this;
    }

    public e<ModelType, DataType, ResourceType, TranscodeType> b(com.bumptech.glide.request.f<? super ModelType, TranscodeType> fVar) {
        this.n = fVar;
        return this;
    }

    public e<ModelType, DataType, ResourceType, TranscodeType> b(boolean z) {
        this.u = !z;
        return this;
    }

    public e<ModelType, DataType, ResourceType, TranscodeType> a(int i, int i2) {
        if (!com.bumptech.glide.util.h.a(i, i2)) {
            throw new IllegalArgumentException("Width and height must be Target#SIZE_ORIGINAL or > 0");
        }
        this.x = i;
        this.w = i2;
        return this;
    }

    public e<ModelType, DataType, ResourceType, TranscodeType> a(com.bumptech.glide.load.c cVar) {
        if (cVar == null) {
            throw new NullPointerException("Signature must not be null");
        }
        this.j = cVar;
        return this;
    }

    public e<ModelType, DataType, ResourceType, TranscodeType> a(ModelType modeltype) {
        this.i = modeltype;
        this.k = true;
        return this;
    }

    @Override // 
    /* renamed from: d */
    public e<ModelType, DataType, ResourceType, TranscodeType> clone() {
        try {
            e<ModelType, DataType, ResourceType, TranscodeType> eVar = (e) super.clone();
            eVar.h = this.h != null ? this.h.clone() : null;
            return eVar;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public final <Y extends com.bumptech.glide.request.target.l<TranscodeType>> Y a(Y y) {
        com.bumptech.glide.util.h.a();
        if (y == null) {
            throw new IllegalArgumentException("You must pass in a non null Target");
        }
        if (!this.k) {
            throw new IllegalArgumentException("You must first set a model (try #load())");
        }
        com.bumptech.glide.request.c a = y.a();
        if (a != null) {
            a.c();
            com.bumptech.glide.manager.l lVar = this.e;
            lVar.a.remove(a);
            lVar.b.remove(a);
            a.a();
        }
        if (this.t == 0) {
            this.t = l.c;
        }
        com.bumptech.glide.request.c a2 = a(y, (com.bumptech.glide.request.h) null);
        y.a(a2);
        this.f.a(y);
        com.bumptech.glide.manager.l lVar2 = this.e;
        lVar2.a.add(a2);
        if (!lVar2.c) {
            a2.b();
        } else {
            lVar2.b.add(a2);
        }
        return y;
    }

    public final com.bumptech.glide.request.a<TranscodeType> c(int i, int i2) {
        final com.bumptech.glide.request.e eVar = new com.bumptech.glide.request.e(this.c.d, i, i2);
        this.c.d.post(new Runnable() { // from class: com.bumptech.glide.e.1
            @Override // java.lang.Runnable
            public final void run() {
                if (eVar.isCancelled()) {
                    return;
                }
                e.this.a((e) eVar);
            }
        });
        return eVar;
    }

    private int a() {
        if (this.t == l.d) {
            return l.c;
        }
        if (this.t == l.c) {
            return l.b;
        }
        return l.a;
    }

    private com.bumptech.glide.request.c a(com.bumptech.glide.request.target.l<TranscodeType> lVar, com.bumptech.glide.request.h hVar) {
        if (this.p != null) {
            if (this.B) {
                throw new IllegalStateException("You cannot use a request as both the main request and a thumbnail, consider using clone() on the request(s) passed to thumbnail()");
            }
            if (this.p.v.equals(com.bumptech.glide.request.animation.g.a())) {
                this.p.v = this.v;
            }
            if (this.p.t == 0) {
                this.p.t = a();
            }
            if (com.bumptech.glide.util.h.a(this.x, this.w) && !com.bumptech.glide.util.h.a(this.p.x, this.p.w)) {
                this.p.a(this.x, this.w);
            }
            com.bumptech.glide.request.h hVar2 = new com.bumptech.glide.request.h(hVar);
            com.bumptech.glide.request.c a = a(lVar, this.q.floatValue(), this.t, hVar2);
            this.B = true;
            com.bumptech.glide.request.c a2 = this.p.a(lVar, hVar2);
            this.B = false;
            hVar2.a(a, a2);
            return hVar2;
        } else if (this.o != null) {
            com.bumptech.glide.request.h hVar3 = new com.bumptech.glide.request.h(hVar);
            hVar3.a(a(lVar, this.q.floatValue(), this.t, hVar3), a(lVar, this.o.floatValue(), a(), hVar3));
            return hVar3;
        } else {
            return a(lVar, this.q.floatValue(), this.t, hVar);
        }
    }

    private com.bumptech.glide.request.c a(com.bumptech.glide.request.target.l<TranscodeType> lVar, float f, int i, com.bumptech.glide.request.d dVar) {
        com.bumptech.glide.request.b a = com.bumptech.glide.request.b.a(this.h, this.i, this.j, this.b, i, lVar, f, this.r, this.l, this.s, this.m, this.C, this.D, this.n, dVar, this.c.a, this.z, this.d, this.u, this.v, this.x, this.w, this.y, this.g, this.F);
        a.a = this.E;
        return a;
    }

    public final com.bumptech.glide.request.target.l<TranscodeType> d(int i, int i2) {
        return a((e<ModelType, DataType, ResourceType, TranscodeType>) new com.bumptech.glide.request.target.h(i, i2));
    }
}
