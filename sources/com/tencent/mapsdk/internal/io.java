package com.tencent.mapsdk.internal;

import android.view.animation.Interpolator;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public abstract class io implements Cloneable {
    float a;
    Class<?> b;
    Interpolator c = null;
    boolean d = false;

    public abstract void a(Object obj);

    public abstract Object d();

    @Override // 
    /* renamed from: e */
    public abstract io clone();

    public static io a(float f, int i) {
        return new b(f, i);
    }

    public static io a() {
        return new b();
    }

    public static io a(float f, double d) {
        return new a(f, d);
    }

    public static io b() {
        return new a();
    }

    public static io a(float f, Object obj) {
        return new c(f, obj);
    }

    public static io c() {
        return new c(0.0f, null);
    }

    private boolean f() {
        return this.d;
    }

    private float g() {
        return this.a;
    }

    private void a(float f) {
        this.a = f;
    }

    private Interpolator h() {
        return this.c;
    }

    private void a(Interpolator interpolator) {
        this.c = interpolator;
    }

    private Class i() {
        return this.b;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public static final class c extends io {
        Object e;

        c(float f, Object obj) {
            this.a = f;
            this.e = obj;
            this.d = obj != null;
            this.b = this.d ? obj.getClass() : Object.class;
        }

        @Override // com.tencent.mapsdk.internal.io
        public final Object d() {
            return this.e;
        }

        @Override // com.tencent.mapsdk.internal.io
        public final void a(Object obj) {
            this.e = obj;
            this.d = obj != null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.tencent.mapsdk.internal.io
        /* renamed from: f */
        public c e() {
            c cVar = new c(this.a, this.e);
            cVar.c = this.c;
            return cVar;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public static final class b extends io {
        int e;

        b(float f, int i) {
            this.a = f;
            this.e = i;
            this.b = Integer.TYPE;
            this.d = true;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public b() {
            this.a = 0.0f;
            this.b = Integer.TYPE;
        }

        private int f() {
            return this.e;
        }

        @Override // com.tencent.mapsdk.internal.io
        public final Object d() {
            return Integer.valueOf(this.e);
        }

        @Override // com.tencent.mapsdk.internal.io
        public final void a(Object obj) {
            if (obj == null || obj.getClass() != Integer.class) {
                return;
            }
            this.e = ((Integer) obj).intValue();
            this.d = true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.tencent.mapsdk.internal.io
        /* renamed from: g */
        public b e() {
            b bVar = new b(this.a, this.e);
            bVar.c = this.c;
            return bVar;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public static final class a extends io {
        double e;

        a(float f, double d) {
            this.a = f;
            this.e = d;
            this.b = Double.TYPE;
            this.d = true;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public a() {
            this.a = 0.0f;
            this.b = Double.TYPE;
        }

        private double f() {
            return this.e;
        }

        @Override // com.tencent.mapsdk.internal.io
        public final Object d() {
            return Double.valueOf(this.e);
        }

        @Override // com.tencent.mapsdk.internal.io
        public final void a(Object obj) {
            if (obj == null || obj.getClass() != Double.class) {
                return;
            }
            this.e = ((Double) obj).doubleValue();
            this.d = true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.tencent.mapsdk.internal.io
        /* renamed from: g */
        public a e() {
            a aVar = new a(this.a, this.e);
            aVar.c = this.c;
            return aVar;
        }
    }
}
