package com.sankuai.waimai.store.shimmer;

import android.content.res.TypedArray;
import android.graphics.RectF;
import android.support.annotation.ColorInt;
import android.support.v4.view.ViewCompat;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class SGShimmer {
    public static ChangeQuickRedirect a;
    public final float[] b;
    public final int[] c;
    public final RectF d;
    public int e;
    @ColorInt
    public int f;
    @ColorInt
    public int g;
    public int h;
    public int i;
    public int j;
    public float k;
    public float l;
    public float m;
    public float n;
    public float o;
    public boolean p;
    public boolean q;
    public boolean r;
    public int s;
    public int t;
    public long u;
    public long v;
    public long w;

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

    public SGShimmer() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "71fc3cbe369d2d522a38d25de2ed1c73", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "71fc3cbe369d2d522a38d25de2ed1c73");
            return;
        }
        this.b = new float[4];
        this.c = new int[4];
        this.d = new RectF();
        this.e = 0;
        this.f = -1;
        this.g = 1627389951;
        this.h = 0;
        this.i = 0;
        this.j = 0;
        this.k = 1.0f;
        this.l = 1.0f;
        this.m = 0.0f;
        this.n = 0.4f;
        this.o = 20.0f;
        this.p = true;
        this.q = true;
        this.r = true;
        this.s = -1;
        this.t = 1;
        this.u = 1000L;
    }

    public final int a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "29455c32ec91f949b50deaf2d5711983", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "29455c32ec91f949b50deaf2d5711983")).intValue() : this.i > 0 ? this.i : Math.round(this.k * i);
    }

    public final int b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f834d2780f723cda7e442f8d304d0626", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f834d2780f723cda7e442f8d304d0626")).intValue() : this.j > 0 ? this.j : Math.round(this.l * i);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static abstract class b<T extends b<T>> {
        public static ChangeQuickRedirect b;
        public final SGShimmer c;

        public abstract T a();

        public b() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = b;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b98a03c5f1fa917e1d685a0b1133511e", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b98a03c5f1fa917e1d685a0b1133511e");
            } else {
                this.c = new SGShimmer();
            }
        }

        public T a(TypedArray typedArray) {
            int i;
            Object[] objArr = {typedArray};
            ChangeQuickRedirect changeQuickRedirect = b;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "655fca47b3356fc778d6446bbb7cd8cc", RobustBitConfig.DEFAULT_VALUE)) {
                return (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "655fca47b3356fc778d6446bbb7cd8cc");
            }
            if (typedArray.hasValue(0)) {
                boolean z = typedArray.getBoolean(0, this.c.p);
                Object[] objArr2 = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                ChangeQuickRedirect changeQuickRedirect2 = b;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6f3c971ee35b8fcab483e1df247d8546", RobustBitConfig.DEFAULT_VALUE)) {
                    b bVar = (b) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6f3c971ee35b8fcab483e1df247d8546");
                } else {
                    this.c.p = z;
                    a();
                }
            }
            if (typedArray.hasValue(6)) {
                boolean z2 = typedArray.getBoolean(6, this.c.q);
                Object[] objArr3 = {Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
                ChangeQuickRedirect changeQuickRedirect3 = b;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "4bad70f67f92732ba7270902d8c270a6", RobustBitConfig.DEFAULT_VALUE)) {
                    b bVar2 = (b) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "4bad70f67f92732ba7270902d8c270a6");
                } else {
                    this.c.q = z2;
                    a();
                }
            }
            if (typedArray.hasValue(4)) {
                float f = typedArray.getFloat(4, 0.3f);
                Object[] objArr4 = {Float.valueOf(f)};
                ChangeQuickRedirect changeQuickRedirect4 = b;
                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "19e8aad488fa0af571faf6e06e6797ea", RobustBitConfig.DEFAULT_VALUE)) {
                    b bVar3 = (b) PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "19e8aad488fa0af571faf6e06e6797ea");
                } else {
                    this.c.g = (((int) (a(0.0f, 1.0f, f) * 255.0f)) << 24) | (this.c.g & ViewCompat.MEASURED_SIZE_MASK);
                    a();
                }
            }
            if (typedArray.hasValue(5)) {
                float f2 = typedArray.getFloat(5, 1.0f);
                Object[] objArr5 = {Float.valueOf(f2)};
                ChangeQuickRedirect changeQuickRedirect5 = b;
                if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "c34306d5bdac52b94b396f6db7680c83", RobustBitConfig.DEFAULT_VALUE)) {
                    b bVar4 = (b) PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "c34306d5bdac52b94b396f6db7680c83");
                } else {
                    this.c.f = (((int) (a(0.0f, 1.0f, f2) * 255.0f)) << 24) | (this.c.f & ViewCompat.MEASURED_SIZE_MASK);
                    a();
                }
            }
            if (typedArray.hasValue(7)) {
                long j = typedArray.getInt(7, (int) this.c.u);
                Object[] objArr6 = {new Long(j)};
                ChangeQuickRedirect changeQuickRedirect6 = b;
                if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "417bc2ce04288bcb944bcaab1560e1f8", RobustBitConfig.DEFAULT_VALUE)) {
                    b bVar5 = (b) PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "417bc2ce04288bcb944bcaab1560e1f8");
                } else if (j < 0) {
                    throw new IllegalArgumentException("Given a negative duration: " + j);
                } else {
                    this.c.u = j;
                    a();
                }
            }
            if (typedArray.hasValue(8)) {
                int i2 = typedArray.getInt(8, this.c.s);
                Object[] objArr7 = {Integer.valueOf(i2)};
                ChangeQuickRedirect changeQuickRedirect7 = b;
                if (PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "7300a4ec3f00f12789e4c554d25a2dc9", RobustBitConfig.DEFAULT_VALUE)) {
                    b bVar6 = (b) PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "7300a4ec3f00f12789e4c554d25a2dc9");
                } else {
                    this.c.s = i2;
                    a();
                }
            }
            if (typedArray.hasValue(9)) {
                long j2 = typedArray.getInt(9, (int) this.c.v);
                Object[] objArr8 = {new Long(j2)};
                ChangeQuickRedirect changeQuickRedirect8 = b;
                if (PatchProxy.isSupport(objArr8, this, changeQuickRedirect8, false, "414873a7ae2cc796594bf4288130988a", RobustBitConfig.DEFAULT_VALUE)) {
                    b bVar7 = (b) PatchProxy.accessDispatch(objArr8, this, changeQuickRedirect8, false, "414873a7ae2cc796594bf4288130988a");
                } else if (j2 < 0) {
                    throw new IllegalArgumentException("Given a negative repeat delay: " + j2);
                } else {
                    this.c.v = j2;
                    a();
                }
            }
            if (typedArray.hasValue(10)) {
                int i3 = typedArray.getInt(10, this.c.t);
                Object[] objArr9 = {Integer.valueOf(i3)};
                ChangeQuickRedirect changeQuickRedirect9 = b;
                if (PatchProxy.isSupport(objArr9, this, changeQuickRedirect9, false, "33a07a3dd1999182ddac28476f5a5922", RobustBitConfig.DEFAULT_VALUE)) {
                    b bVar8 = (b) PatchProxy.accessDispatch(objArr9, this, changeQuickRedirect9, false, "33a07a3dd1999182ddac28476f5a5922");
                } else {
                    this.c.t = i3;
                    a();
                }
            }
            if (typedArray.hasValue(11)) {
                long j3 = typedArray.getInt(11, (int) this.c.w);
                Object[] objArr10 = {new Long(j3)};
                ChangeQuickRedirect changeQuickRedirect10 = b;
                if (PatchProxy.isSupport(objArr10, this, changeQuickRedirect10, false, "f54770bb883455ade771cd240fdb3b79", RobustBitConfig.DEFAULT_VALUE)) {
                    b bVar9 = (b) PatchProxy.accessDispatch(objArr10, this, changeQuickRedirect10, false, "f54770bb883455ade771cd240fdb3b79");
                } else if (j3 < 0) {
                    throw new IllegalArgumentException("Given a negative start delay: " + j3);
                } else {
                    this.c.w = j3;
                    a();
                }
            }
            if (typedArray.hasValue(12)) {
                switch (typedArray.getInt(12, this.c.e)) {
                    case 1:
                        a(1);
                        break;
                    case 2:
                        a(2);
                        break;
                    case 3:
                        a(3);
                        break;
                    default:
                        a(0);
                        break;
                }
            }
            if (typedArray.hasValue(19)) {
                i = 1;
                if (typedArray.getInt(19, this.c.h) != 1) {
                    b(0);
                } else {
                    b(1);
                }
            } else {
                i = 1;
            }
            if (typedArray.hasValue(13)) {
                float f3 = typedArray.getFloat(13, this.c.n);
                Object[] objArr11 = new Object[i];
                objArr11[0] = Float.valueOf(f3);
                ChangeQuickRedirect changeQuickRedirect11 = b;
                if (PatchProxy.isSupport(objArr11, this, changeQuickRedirect11, false, "5284059d1b840514d3db552e47ccbca8", RobustBitConfig.DEFAULT_VALUE)) {
                    b bVar10 = (b) PatchProxy.accessDispatch(objArr11, this, changeQuickRedirect11, false, "5284059d1b840514d3db552e47ccbca8");
                } else if (f3 < 0.0f) {
                    throw new IllegalArgumentException("Given invalid dropoff value: " + f3);
                } else {
                    this.c.n = f3;
                    a();
                }
            }
            if (typedArray.hasValue(14)) {
                int dimensionPixelSize = typedArray.getDimensionPixelSize(14, this.c.i);
                Object[] objArr12 = {Integer.valueOf(dimensionPixelSize)};
                ChangeQuickRedirect changeQuickRedirect12 = b;
                if (PatchProxy.isSupport(objArr12, this, changeQuickRedirect12, false, "17c725a0ca6fee3d231459a4347272f5", RobustBitConfig.DEFAULT_VALUE)) {
                    b bVar11 = (b) PatchProxy.accessDispatch(objArr12, this, changeQuickRedirect12, false, "17c725a0ca6fee3d231459a4347272f5");
                } else if (dimensionPixelSize < 0) {
                    throw new IllegalArgumentException("Given invalid width: " + dimensionPixelSize);
                } else {
                    this.c.i = dimensionPixelSize;
                    a();
                }
            }
            if (typedArray.hasValue(15)) {
                int dimensionPixelSize2 = typedArray.getDimensionPixelSize(15, this.c.j);
                Object[] objArr13 = {Integer.valueOf(dimensionPixelSize2)};
                ChangeQuickRedirect changeQuickRedirect13 = b;
                if (PatchProxy.isSupport(objArr13, this, changeQuickRedirect13, false, "f20105f7748e518a9c6fb801f076aa83", RobustBitConfig.DEFAULT_VALUE)) {
                    b bVar12 = (b) PatchProxy.accessDispatch(objArr13, this, changeQuickRedirect13, false, "f20105f7748e518a9c6fb801f076aa83");
                } else if (dimensionPixelSize2 < 0) {
                    throw new IllegalArgumentException("Given invalid height: " + dimensionPixelSize2);
                } else {
                    this.c.j = dimensionPixelSize2;
                    a();
                }
            }
            if (typedArray.hasValue(16)) {
                float f4 = typedArray.getFloat(16, this.c.m);
                Object[] objArr14 = {Float.valueOf(f4)};
                ChangeQuickRedirect changeQuickRedirect14 = b;
                if (PatchProxy.isSupport(objArr14, this, changeQuickRedirect14, false, "52b9df1252098634c55bb467b324360d", RobustBitConfig.DEFAULT_VALUE)) {
                    b bVar13 = (b) PatchProxy.accessDispatch(objArr14, this, changeQuickRedirect14, false, "52b9df1252098634c55bb467b324360d");
                } else if (f4 < 0.0f) {
                    throw new IllegalArgumentException("Given invalid intensity value: " + f4);
                } else {
                    this.c.m = f4;
                    a();
                }
            }
            if (typedArray.hasValue(17)) {
                float f5 = typedArray.getFloat(17, this.c.k);
                Object[] objArr15 = {Float.valueOf(f5)};
                ChangeQuickRedirect changeQuickRedirect15 = b;
                if (PatchProxy.isSupport(objArr15, this, changeQuickRedirect15, false, "bba81d20ddb967739096e0e875324ceb", RobustBitConfig.DEFAULT_VALUE)) {
                    b bVar14 = (b) PatchProxy.accessDispatch(objArr15, this, changeQuickRedirect15, false, "bba81d20ddb967739096e0e875324ceb");
                } else if (f5 < 0.0f) {
                    throw new IllegalArgumentException("Given invalid width ratio: " + f5);
                } else {
                    this.c.k = f5;
                    a();
                }
            }
            if (typedArray.hasValue(18)) {
                float f6 = typedArray.getFloat(18, this.c.l);
                Object[] objArr16 = {Float.valueOf(f6)};
                ChangeQuickRedirect changeQuickRedirect16 = b;
                if (PatchProxy.isSupport(objArr16, this, changeQuickRedirect16, false, "5af4a28f016a612c4238e5f880c7ab8e", RobustBitConfig.DEFAULT_VALUE)) {
                    b bVar15 = (b) PatchProxy.accessDispatch(objArr16, this, changeQuickRedirect16, false, "5af4a28f016a612c4238e5f880c7ab8e");
                } else if (f6 < 0.0f) {
                    throw new IllegalArgumentException("Given invalid height ratio: " + f6);
                } else {
                    this.c.l = f6;
                    a();
                }
            }
            if (typedArray.hasValue(20)) {
                float f7 = typedArray.getFloat(20, this.c.o);
                Object[] objArr17 = {Float.valueOf(f7)};
                ChangeQuickRedirect changeQuickRedirect17 = b;
                if (PatchProxy.isSupport(objArr17, this, changeQuickRedirect17, false, "2e7c60f46b98ce97ca3403a408e12b3b", RobustBitConfig.DEFAULT_VALUE)) {
                    b bVar16 = (b) PatchProxy.accessDispatch(objArr17, this, changeQuickRedirect17, false, "2e7c60f46b98ce97ca3403a408e12b3b");
                } else {
                    this.c.o = f7;
                    a();
                }
            }
            return a();
        }

        private T a(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = b;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8743f7f8022057adca487ea6684aff64", RobustBitConfig.DEFAULT_VALUE)) {
                return (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8743f7f8022057adca487ea6684aff64");
            }
            this.c.e = i;
            return a();
        }

        private T b(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = b;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5b1af3df5fe3a6372157d92249ccce6d", RobustBitConfig.DEFAULT_VALUE)) {
                return (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5b1af3df5fe3a6372157d92249ccce6d");
            }
            this.c.h = i;
            return a();
        }

        public final SGShimmer b() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = b;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a17505fcdf6993e5e81b699a8a197a81", RobustBitConfig.DEFAULT_VALUE)) {
                return (SGShimmer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a17505fcdf6993e5e81b699a8a197a81");
            }
            SGShimmer sGShimmer = this.c;
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = SGShimmer.a;
            if (PatchProxy.isSupport(objArr2, sGShimmer, changeQuickRedirect2, false, "7898c1944f1a9883d0aa738f57e0e372", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, sGShimmer, changeQuickRedirect2, false, "7898c1944f1a9883d0aa738f57e0e372");
            } else if (sGShimmer.h != 1) {
                sGShimmer.c[0] = sGShimmer.g;
                sGShimmer.c[1] = sGShimmer.f;
                sGShimmer.c[2] = sGShimmer.f;
                sGShimmer.c[3] = sGShimmer.g;
            } else {
                sGShimmer.c[0] = sGShimmer.f;
                sGShimmer.c[1] = sGShimmer.f;
                sGShimmer.c[2] = sGShimmer.g;
                sGShimmer.c[3] = sGShimmer.g;
            }
            SGShimmer sGShimmer2 = this.c;
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = SGShimmer.a;
            if (PatchProxy.isSupport(objArr3, sGShimmer2, changeQuickRedirect3, false, "67642e718c8a9e8f48f2d1aa5b1d9a2d", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, sGShimmer2, changeQuickRedirect3, false, "67642e718c8a9e8f48f2d1aa5b1d9a2d");
            } else if (sGShimmer2.h != 1) {
                sGShimmer2.b[0] = Math.max(((1.0f - sGShimmer2.m) - sGShimmer2.n) / 2.0f, 0.0f);
                sGShimmer2.b[1] = Math.max(((1.0f - sGShimmer2.m) - 0.001f) / 2.0f, 0.0f);
                sGShimmer2.b[2] = Math.min(((sGShimmer2.m + 1.0f) + 0.001f) / 2.0f, 1.0f);
                sGShimmer2.b[3] = Math.min(((sGShimmer2.m + 1.0f) + sGShimmer2.n) / 2.0f, 1.0f);
            } else {
                sGShimmer2.b[0] = 0.0f;
                sGShimmer2.b[1] = Math.min(sGShimmer2.m, 1.0f);
                sGShimmer2.b[2] = Math.min(sGShimmer2.m + sGShimmer2.n, 1.0f);
                sGShimmer2.b[3] = 1.0f;
            }
            return this.c;
        }

        private static float a(float f, float f2, float f3) {
            Object[] objArr = {Float.valueOf(0.0f), Float.valueOf(1.0f), Float.valueOf(f3)};
            ChangeQuickRedirect changeQuickRedirect = b;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2170363dd3fd856cdf6582205f767577", RobustBitConfig.DEFAULT_VALUE) ? ((Float) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2170363dd3fd856cdf6582205f767577")).floatValue() : Math.min(1.0f, Math.max(0.0f, f3));
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class a extends b<a> {
        public static ChangeQuickRedirect a;

        @Override // com.sankuai.waimai.store.shimmer.SGShimmer.b
        public final /* bridge */ /* synthetic */ a a() {
            return this;
        }

        public a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f9e42c2aca15fd13afd1d939dcd21f80", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f9e42c2aca15fd13afd1d939dcd21f80");
            } else {
                this.c.r = true;
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class c extends b<c> {
        public static ChangeQuickRedirect a;

        @Override // com.sankuai.waimai.store.shimmer.SGShimmer.b
        public final /* bridge */ /* synthetic */ c a() {
            return this;
        }

        @Override // com.sankuai.waimai.store.shimmer.SGShimmer.b
        public final /* synthetic */ c a(TypedArray typedArray) {
            Object[] objArr = {typedArray};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d3c51714d81aacc0f844e3f6991fdacf", RobustBitConfig.DEFAULT_VALUE)) {
                return (c) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d3c51714d81aacc0f844e3f6991fdacf");
            }
            super.a(typedArray);
            if (typedArray.hasValue(2)) {
                int color = typedArray.getColor(2, this.c.g);
                Object[] objArr2 = {Integer.valueOf(color)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f54cf8f49efd0beeb5bb5caf46298c58", RobustBitConfig.DEFAULT_VALUE)) {
                    c cVar = (c) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f54cf8f49efd0beeb5bb5caf46298c58");
                } else {
                    this.c.g = (color & ViewCompat.MEASURED_SIZE_MASK) | (this.c.g & (-16777216));
                }
            }
            if (typedArray.hasValue(3)) {
                int color2 = typedArray.getColor(3, this.c.f);
                Object[] objArr3 = {Integer.valueOf(color2)};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "8c4dfd33669b3d8dd5446f34c9273476", RobustBitConfig.DEFAULT_VALUE)) {
                    c cVar2 = (c) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "8c4dfd33669b3d8dd5446f34c9273476");
                } else {
                    this.c.f = color2;
                }
            }
            return this;
        }

        public c() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f591d8673d16025a5befbdc7f89fa73a", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f591d8673d16025a5befbdc7f89fa73a");
            } else {
                this.c.r = false;
            }
        }
    }
}
