package com.sankuai.waimai.skeleton.shimmer;

import android.content.res.TypedArray;
import android.support.annotation.ColorInt;
import android.support.annotation.FloatRange;
import android.support.v4.view.ViewCompat;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class Shimmer {
    public static ChangeQuickRedirect a;
    public final float[] b;
    public final int[] c;
    public int d;
    @ColorInt
    public int e;
    @ColorInt
    public int f;
    public int g;
    public int h;
    public int i;
    public float j;
    public float k;
    public float l;
    public float m;
    public float n;
    public boolean o;
    public boolean p;
    public boolean q;
    public int r;
    public int s;
    public long t;
    public long u;
    public long v;

    /* compiled from: ProGuard */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes5.dex */
    public @interface Direction {
        public static final int BOTTOM_TO_TOP = 3;
        public static final int LEFT_TO_RIGHT = 0;
        public static final int RIGHT_TO_LEFT = 2;
        public static final int TOP_TO_BOTTOM = 1;
    }

    /* compiled from: ProGuard */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes5.dex */
    public @interface Shape {
        public static final int LINEAR = 0;
        public static final int RADIAL = 1;
    }

    public Shimmer() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fefde5a159e1eac8614ef8c7863fe285", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fefde5a159e1eac8614ef8c7863fe285");
            return;
        }
        this.b = new float[4];
        this.c = new int[4];
        this.d = 0;
        this.e = -1;
        this.f = 1291845631;
        this.g = 0;
        this.h = 0;
        this.i = 0;
        this.j = 1.0f;
        this.k = 1.0f;
        this.l = 0.0f;
        this.m = 0.5f;
        this.n = 20.0f;
        this.o = true;
        this.p = true;
        this.q = true;
        this.r = -1;
        this.s = 1;
        this.t = 1000L;
    }

    public final int a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "297faaf00dd07d965adefb2f8d835442", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "297faaf00dd07d965adefb2f8d835442")).intValue() : this.h > 0 ? this.h : Math.round(this.j * i);
    }

    public final int b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a708e2bd423b5de471e5ede2c803ef37", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a708e2bd423b5de471e5ede2c803ef37")).intValue() : this.i > 0 ? this.i : Math.round(this.k * i);
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0038da48b4fdddccbd65d26c1f273ebf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0038da48b4fdddccbd65d26c1f273ebf");
            return;
        }
        this.c[0] = this.f;
        this.c[1] = this.e;
        this.c[2] = this.e;
        this.c[3] = this.f;
    }

    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6d484f5f06dde10befd8d8ae14f1e560", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6d484f5f06dde10befd8d8ae14f1e560");
            return;
        }
        this.b[0] = Math.max(((1.0f - this.l) - this.m) / 2.0f, 0.0f);
        this.b[1] = Math.max(((1.0f - this.l) - 0.001f) / 2.0f, 0.0f);
        this.b[2] = Math.min(((this.l + 1.0f) + 0.001f) / 2.0f, 1.0f);
        this.b[3] = Math.min(((this.l + 1.0f) + this.m) / 2.0f, 1.0f);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static abstract class b<T extends b<T>> {
        public static ChangeQuickRedirect b;
        public final Shimmer c;

        public abstract T a();

        public b() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = b;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8e7feb564c34410f90f7ccdba18e4bad", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8e7feb564c34410f90f7ccdba18e4bad");
            } else {
                this.c = new Shimmer();
            }
        }

        public final T a(TypedArray typedArray) {
            Object[] objArr = {typedArray};
            ChangeQuickRedirect changeQuickRedirect = b;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f505829d3f2e72496072de57ed180b6e", RobustBitConfig.DEFAULT_VALUE)) {
                return (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f505829d3f2e72496072de57ed180b6e");
            }
            if (typedArray.hasValue(0)) {
                b(typedArray.getFloat(0, 0.3f));
            }
            if (typedArray.hasValue(1)) {
                c(typedArray.getFloat(1, 1.0f));
            }
            if (typedArray.hasValue(2)) {
                a(typedArray.getInt(2, (int) this.c.t));
            }
            if (typedArray.hasValue(3)) {
                int dimensionPixelSize = typedArray.getDimensionPixelSize(3, this.c.h);
                Object[] objArr2 = {Integer.valueOf(dimensionPixelSize)};
                ChangeQuickRedirect changeQuickRedirect2 = b;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "cf037fde780347b6efd17b90d2424dca", RobustBitConfig.DEFAULT_VALUE)) {
                    b bVar = (b) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "cf037fde780347b6efd17b90d2424dca");
                } else if (dimensionPixelSize < 0) {
                    throw new IllegalArgumentException("Given invalid width: " + dimensionPixelSize);
                } else {
                    this.c.h = dimensionPixelSize;
                    a();
                }
            }
            if (typedArray.hasValue(4)) {
                int dimensionPixelSize2 = typedArray.getDimensionPixelSize(4, this.c.i);
                Object[] objArr3 = {Integer.valueOf(dimensionPixelSize2)};
                ChangeQuickRedirect changeQuickRedirect3 = b;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "390dfd6bd60968eb5f921f50beb4a640", RobustBitConfig.DEFAULT_VALUE)) {
                    b bVar2 = (b) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "390dfd6bd60968eb5f921f50beb4a640");
                } else if (dimensionPixelSize2 < 0) {
                    throw new IllegalArgumentException("Given invalid height: " + dimensionPixelSize2);
                } else {
                    this.c.i = dimensionPixelSize2;
                    a();
                }
            }
            if (typedArray.hasValue(5)) {
                a(typedArray.getFloat(5, this.c.n));
            }
            return a();
        }

        public final T a(float f) {
            Object[] objArr = {Float.valueOf(f)};
            ChangeQuickRedirect changeQuickRedirect = b;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9350fa93026d4e14fd264a0e068a41ba", RobustBitConfig.DEFAULT_VALUE)) {
                return (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9350fa93026d4e14fd264a0e068a41ba");
            }
            this.c.n = f;
            return a();
        }

        public final T b(@FloatRange(from = 0.0d, to = 1.0d) float f) {
            Object[] objArr = {Float.valueOf(f)};
            ChangeQuickRedirect changeQuickRedirect = b;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ae9e931444df8b75f08a1ade6d8769a9", RobustBitConfig.DEFAULT_VALUE)) {
                return (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ae9e931444df8b75f08a1ade6d8769a9");
            }
            this.c.f = (((int) (a(0.0f, 1.0f, f) * 255.0f)) << 24) | (this.c.f & ViewCompat.MEASURED_SIZE_MASK);
            return a();
        }

        public final T c(@FloatRange(from = 0.0d, to = 1.0d) float f) {
            Object[] objArr = {Float.valueOf(f)};
            ChangeQuickRedirect changeQuickRedirect = b;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "28557835acd845ce63f98d5715132896", RobustBitConfig.DEFAULT_VALUE)) {
                return (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "28557835acd845ce63f98d5715132896");
            }
            this.c.e = (((int) (a(0.0f, 1.0f, f) * 255.0f)) << 24) | (this.c.e & ViewCompat.MEASURED_SIZE_MASK);
            return a();
        }

        public final T a(long j) {
            Object[] objArr = {new Long(j)};
            ChangeQuickRedirect changeQuickRedirect = b;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "52d024164a56b93ce7e08607bfc9cce9", RobustBitConfig.DEFAULT_VALUE)) {
                return (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "52d024164a56b93ce7e08607bfc9cce9");
            }
            if (j < 0) {
                throw new IllegalArgumentException("Given a negative duration: " + j);
            }
            this.c.t = j;
            return a();
        }

        public final Shimmer b() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = b;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "78a356f82045c207d2f56387ff220190", RobustBitConfig.DEFAULT_VALUE)) {
                return (Shimmer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "78a356f82045c207d2f56387ff220190");
            }
            this.c.a();
            this.c.b();
            return this.c;
        }

        private static float a(float f, float f2, float f3) {
            Object[] objArr = {Float.valueOf(0.0f), Float.valueOf(1.0f), Float.valueOf(f3)};
            ChangeQuickRedirect changeQuickRedirect = b;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "bb247a2b865960fe787da7d3c19f4827", RobustBitConfig.DEFAULT_VALUE) ? ((Float) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "bb247a2b865960fe787da7d3c19f4827")).floatValue() : Math.min(1.0f, Math.max(0.0f, f3));
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class a extends b<a> {
        public static ChangeQuickRedirect a;

        @Override // com.sankuai.waimai.skeleton.shimmer.Shimmer.b
        public final /* bridge */ /* synthetic */ a a() {
            return this;
        }

        public a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d112d2deff90ac997e72993f0142c779", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d112d2deff90ac997e72993f0142c779");
            } else {
                this.c.q = true;
            }
        }
    }
}
