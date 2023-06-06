package com.tencent.mapsdk.internal;

import android.graphics.Bitmap;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class kv {
    private static final String a = "PoolUtil";
    private static final int b = 20;
    private static final k<Object> c = new k<Object>() { // from class: com.tencent.mapsdk.internal.kv.1
        @Override // com.tencent.mapsdk.internal.kv.k
        public final void a(@NonNull Object obj) {
        }
    };

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public interface e<T> {
        T a();
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public interface g<T> {
        @Nullable
        T a();

        boolean a(@NonNull T t);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public interface h {
        @NonNull
        l a();
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public interface k<T> {
        void a(@NonNull T t);
    }

    private kv() {
    }

    public static g<i<Bitmap>> a(@NonNull a aVar) {
        return a(10, new b<i<Bitmap>>(aVar) { // from class: com.tencent.mapsdk.internal.kv.2
            private i<Bitmap> b() {
                return new i<>(Bitmap.createBitmap(this.a.a, this.a.b, this.a.c));
            }

            @Override // com.tencent.mapsdk.internal.kv.e
            public final /* synthetic */ Object a() {
                return new i(Bitmap.createBitmap(this.a.a, this.a.b, this.a.c));
            }
        });
    }

    @NonNull
    private static <T extends h> g<T> b(int i2, @NonNull e<T> eVar) {
        return a(new j.a(i2), eVar);
    }

    @NonNull
    public static <T extends h> g<T> a(int i2, @NonNull e<T> eVar) {
        return a(new j.b(i2), eVar);
    }

    @NonNull
    private static <T extends h> g<T> a(int i2, @NonNull e<T> eVar, k<T> kVar) {
        return a(new j.b(i2), eVar, kVar);
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: ProGuard */
    /* renamed from: com.tencent.mapsdk.internal.kv$3  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass3<T> implements e<List<T>> {
        AnonymousClass3() {
        }

        @NonNull
        private static List<T> b() {
            return new ArrayList();
        }

        @Override // com.tencent.mapsdk.internal.kv.e
        @NonNull
        public final /* synthetic */ Object a() {
            return new ArrayList();
        }
    }

    @NonNull
    private static <T> g<List<T>> b() {
        return a(new j.b(20), new AnonymousClass3(), new AnonymousClass4());
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: ProGuard */
    /* renamed from: com.tencent.mapsdk.internal.kv$4  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass4<T> implements k<List<T>> {
        AnonymousClass4() {
        }

        @Override // com.tencent.mapsdk.internal.kv.k
        public final /* synthetic */ void a(@NonNull Object obj) {
            ((List) obj).clear();
        }

        private static void a(@NonNull List<T> list) {
            list.clear();
        }
    }

    @NonNull
    private static <T> g<T> a(@NonNull g<T> gVar, @NonNull e<T> eVar, @NonNull k<T> kVar) {
        return new f(gVar, eVar, kVar);
    }

    @NonNull
    private static <T> k<T> c() {
        return (k<T>) c;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public static abstract class l {
        private static final boolean a = false;

        public abstract void a();

        public abstract void a(boolean z);

        @NonNull
        private static l b() {
            return new d();
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public static final class d extends l {
        private volatile boolean a;

        @Override // com.tencent.mapsdk.internal.kv.l
        public final void a() {
            if (this.a) {
                throw new IllegalStateException("Already released");
            }
        }

        @Override // com.tencent.mapsdk.internal.kv.l
        public final void a(boolean z) {
            this.a = z;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    static final class c extends l {
        private volatile RuntimeException a;

        c() {
        }

        @Override // com.tencent.mapsdk.internal.kv.l
        public final void a() {
            if (this.a != null) {
                throw new IllegalStateException("Already released", this.a);
            }
        }

        @Override // com.tencent.mapsdk.internal.kv.l
        public final void a(boolean z) {
            if (z) {
                this.a = new RuntimeException("Released");
            } else {
                this.a = null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public static final class f<T> implements g<T> {
        private final e<T> a;
        private final k<T> b;
        private final g<T> c;

        f(@NonNull g<T> gVar, @NonNull e<T> eVar, @NonNull k<T> kVar) {
            this.c = gVar;
            this.a = eVar;
            this.b = kVar;
        }

        @Override // com.tencent.mapsdk.internal.kv.g
        public final T a() {
            T a = this.c.a();
            if (a == null) {
                a = this.a.a();
                kj.a(kv.a, "Created new ".concat(String.valueOf(a)));
            }
            if (a instanceof h) {
                ((h) a).a().a(false);
            }
            return a;
        }

        @Override // com.tencent.mapsdk.internal.kv.g
        public final boolean a(@NonNull T t) {
            if (t instanceof h) {
                ((h) t).a().a(true);
            }
            this.b.a(t);
            return this.c.a(t);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public static final class i<T> implements h {
        public final T a;
        private l b = new d();

        public i(T t) {
            this.a = t;
        }

        private T b() {
            return this.a;
        }

        @Override // com.tencent.mapsdk.internal.kv.h
        @NonNull
        public final l a() {
            return this.b;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    static abstract class b<T> implements e<T> {
        a a;

        b(a aVar) {
            this.a = aVar;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public static final class a {
        public int a = 256;
        public int b = 256;
        public Bitmap.Config c;

        public a(Bitmap.Config config) {
            this.c = config;
        }

        private void a(a aVar) {
            if (aVar != null) {
                this.a = aVar.a;
                this.b = aVar.b;
                this.c = aVar.c;
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public static final class j {
        private j() {
        }

        /* compiled from: ProGuard */
        /* loaded from: classes6.dex */
        public static final class b<T> extends a<T> {
            private final Object a;

            public b(int i) {
                super(i);
                this.a = new Object();
            }

            @Override // com.tencent.mapsdk.internal.kv.j.a, com.tencent.mapsdk.internal.kv.g
            public final T a() {
                T t;
                synchronized (this.a) {
                    t = (T) super.a();
                }
                return t;
            }

            @Override // com.tencent.mapsdk.internal.kv.j.a, com.tencent.mapsdk.internal.kv.g
            public final boolean a(@NonNull T t) {
                boolean a;
                synchronized (this.a) {
                    a = super.a(t);
                }
                return a;
            }
        }

        /* compiled from: ProGuard */
        /* loaded from: classes6.dex */
        public static class a<T> implements g<T> {
            private final Object[] a;
            private int b;

            public a(int i) {
                if (i <= 0) {
                    throw new IllegalArgumentException("The max pool size must be > 0");
                }
                this.a = new Object[i];
            }

            @Override // com.tencent.mapsdk.internal.kv.g
            public T a() {
                if (this.b > 0) {
                    int i = this.b - 1;
                    T t = (T) this.a[i];
                    this.a[i] = null;
                    this.b--;
                    return t;
                }
                return null;
            }

            private boolean b(@NonNull T t) {
                for (int i = 0; i < this.b; i++) {
                    if (this.a[i] == t) {
                        return true;
                    }
                }
                return false;
            }

            @Override // com.tencent.mapsdk.internal.kv.g
            public boolean a(@NonNull T t) {
                boolean z;
                int i = 0;
                while (true) {
                    if (i >= this.b) {
                        z = false;
                        break;
                    } else if (this.a[i] == t) {
                        z = true;
                        break;
                    } else {
                        i++;
                    }
                }
                if (z) {
                    throw new IllegalStateException("Already in the pool!");
                }
                if (this.b < this.a.length) {
                    this.a[this.b] = t;
                    this.b++;
                    return true;
                }
                return false;
            }
        }
    }

    @NonNull
    private static <T> g<List<T>> a() {
        return a(new j.b(20), new AnonymousClass3(), new AnonymousClass4());
    }

    @NonNull
    private static <T extends h> g<T> a(@NonNull g<T> gVar, @NonNull e<T> eVar) {
        return a(gVar, eVar, c);
    }
}
