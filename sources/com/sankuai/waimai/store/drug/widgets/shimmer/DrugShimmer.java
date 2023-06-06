package com.sankuai.waimai.store.drug.widgets.shimmer;

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
public final class DrugShimmer {
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

    public DrugShimmer() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a8ef39a3f13ecf0269ab95752ff221a8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a8ef39a3f13ecf0269ab95752ff221a8");
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
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "096bf7111751fb2afa02dfe1515d92f1", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "096bf7111751fb2afa02dfe1515d92f1")).intValue() : this.i > 0 ? this.i : Math.round(this.k * i);
    }

    public final int b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "02784d953f067f7379ff04437012e406", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "02784d953f067f7379ff04437012e406")).intValue() : this.j > 0 ? this.j : Math.round(this.l * i);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static abstract class b<T extends b<T>> {
        public static ChangeQuickRedirect b;
        public final DrugShimmer c;

        public abstract T a();

        public b() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = b;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "081fdd141b5a140e32fb019229168e8a", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "081fdd141b5a140e32fb019229168e8a");
            } else {
                this.c = new DrugShimmer();
            }
        }

        public T a(TypedArray typedArray) {
            int i;
            Object[] objArr = {typedArray};
            ChangeQuickRedirect changeQuickRedirect = b;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8bf6918a5a8dcbad0c4437aec7d8294c", RobustBitConfig.DEFAULT_VALUE)) {
                return (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8bf6918a5a8dcbad0c4437aec7d8294c");
            }
            if (typedArray.hasValue(0)) {
                boolean z = typedArray.getBoolean(0, this.c.p);
                Object[] objArr2 = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                ChangeQuickRedirect changeQuickRedirect2 = b;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d6313d01fc7b865779430bf5abe298e9", RobustBitConfig.DEFAULT_VALUE)) {
                    b bVar = (b) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d6313d01fc7b865779430bf5abe298e9");
                } else {
                    this.c.p = z;
                    a();
                }
            }
            if (typedArray.hasValue(6)) {
                boolean z2 = typedArray.getBoolean(6, this.c.q);
                Object[] objArr3 = {Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
                ChangeQuickRedirect changeQuickRedirect3 = b;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "bfc77825131cf72811ec3880790e6da8", RobustBitConfig.DEFAULT_VALUE)) {
                    b bVar2 = (b) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "bfc77825131cf72811ec3880790e6da8");
                } else {
                    this.c.q = z2;
                    a();
                }
            }
            if (typedArray.hasValue(4)) {
                float f = typedArray.getFloat(4, 0.3f);
                Object[] objArr4 = {Float.valueOf(f)};
                ChangeQuickRedirect changeQuickRedirect4 = b;
                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "3ae23c86c650f812556dee82ecf9d245", RobustBitConfig.DEFAULT_VALUE)) {
                    b bVar3 = (b) PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "3ae23c86c650f812556dee82ecf9d245");
                } else {
                    this.c.g = (((int) (a(0.0f, 1.0f, f) * 255.0f)) << 24) | (this.c.g & ViewCompat.MEASURED_SIZE_MASK);
                    a();
                }
            }
            if (typedArray.hasValue(5)) {
                float f2 = typedArray.getFloat(5, 1.0f);
                Object[] objArr5 = {Float.valueOf(f2)};
                ChangeQuickRedirect changeQuickRedirect5 = b;
                if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "ee7c74b42ee7899c742a22596bc7f1cd", RobustBitConfig.DEFAULT_VALUE)) {
                    b bVar4 = (b) PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "ee7c74b42ee7899c742a22596bc7f1cd");
                } else {
                    this.c.f = (((int) (a(0.0f, 1.0f, f2) * 255.0f)) << 24) | (this.c.f & ViewCompat.MEASURED_SIZE_MASK);
                    a();
                }
            }
            if (typedArray.hasValue(7)) {
                long j = typedArray.getInt(7, (int) this.c.u);
                Object[] objArr6 = {new Long(j)};
                ChangeQuickRedirect changeQuickRedirect6 = b;
                if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "2946c61a0f155c188806fd64ab0a298b", RobustBitConfig.DEFAULT_VALUE)) {
                    b bVar5 = (b) PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "2946c61a0f155c188806fd64ab0a298b");
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
                if (PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "a0e27dc9bf9ee660622147b7eb0744b5", RobustBitConfig.DEFAULT_VALUE)) {
                    b bVar6 = (b) PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "a0e27dc9bf9ee660622147b7eb0744b5");
                } else {
                    this.c.s = i2;
                    a();
                }
            }
            if (typedArray.hasValue(9)) {
                long j2 = typedArray.getInt(9, (int) this.c.v);
                Object[] objArr8 = {new Long(j2)};
                ChangeQuickRedirect changeQuickRedirect8 = b;
                if (PatchProxy.isSupport(objArr8, this, changeQuickRedirect8, false, "066df4baf9092aff4985b3b1725f4104", RobustBitConfig.DEFAULT_VALUE)) {
                    b bVar7 = (b) PatchProxy.accessDispatch(objArr8, this, changeQuickRedirect8, false, "066df4baf9092aff4985b3b1725f4104");
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
                if (PatchProxy.isSupport(objArr9, this, changeQuickRedirect9, false, "9705ccdaa40c0eb7ffe97b5732011b88", RobustBitConfig.DEFAULT_VALUE)) {
                    b bVar8 = (b) PatchProxy.accessDispatch(objArr9, this, changeQuickRedirect9, false, "9705ccdaa40c0eb7ffe97b5732011b88");
                } else {
                    this.c.t = i3;
                    a();
                }
            }
            if (typedArray.hasValue(11)) {
                long j3 = typedArray.getInt(11, (int) this.c.w);
                Object[] objArr10 = {new Long(j3)};
                ChangeQuickRedirect changeQuickRedirect10 = b;
                if (PatchProxy.isSupport(objArr10, this, changeQuickRedirect10, false, "d97fa7fefdfcb96076c704c43ff5d05b", RobustBitConfig.DEFAULT_VALUE)) {
                    b bVar9 = (b) PatchProxy.accessDispatch(objArr10, this, changeQuickRedirect10, false, "d97fa7fefdfcb96076c704c43ff5d05b");
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
                if (PatchProxy.isSupport(objArr11, this, changeQuickRedirect11, false, "78f1e5478b34e27326d32449dd4d3d65", RobustBitConfig.DEFAULT_VALUE)) {
                    b bVar10 = (b) PatchProxy.accessDispatch(objArr11, this, changeQuickRedirect11, false, "78f1e5478b34e27326d32449dd4d3d65");
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
                if (PatchProxy.isSupport(objArr12, this, changeQuickRedirect12, false, "c38f71454d52a50b0975ef25841db394", RobustBitConfig.DEFAULT_VALUE)) {
                    b bVar11 = (b) PatchProxy.accessDispatch(objArr12, this, changeQuickRedirect12, false, "c38f71454d52a50b0975ef25841db394");
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
                if (PatchProxy.isSupport(objArr13, this, changeQuickRedirect13, false, "4ab13d3ebe926bd82e2f64e64f0226be", RobustBitConfig.DEFAULT_VALUE)) {
                    b bVar12 = (b) PatchProxy.accessDispatch(objArr13, this, changeQuickRedirect13, false, "4ab13d3ebe926bd82e2f64e64f0226be");
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
                if (PatchProxy.isSupport(objArr14, this, changeQuickRedirect14, false, "e24192397d3049f13ad24bc1d64e7351", RobustBitConfig.DEFAULT_VALUE)) {
                    b bVar13 = (b) PatchProxy.accessDispatch(objArr14, this, changeQuickRedirect14, false, "e24192397d3049f13ad24bc1d64e7351");
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
                if (PatchProxy.isSupport(objArr15, this, changeQuickRedirect15, false, "142d39526f39c55dd223aee0d3c64fd4", RobustBitConfig.DEFAULT_VALUE)) {
                    b bVar14 = (b) PatchProxy.accessDispatch(objArr15, this, changeQuickRedirect15, false, "142d39526f39c55dd223aee0d3c64fd4");
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
                if (PatchProxy.isSupport(objArr16, this, changeQuickRedirect16, false, "9d39d525a77d9a822e0f7de24c64f60e", RobustBitConfig.DEFAULT_VALUE)) {
                    b bVar15 = (b) PatchProxy.accessDispatch(objArr16, this, changeQuickRedirect16, false, "9d39d525a77d9a822e0f7de24c64f60e");
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
                if (PatchProxy.isSupport(objArr17, this, changeQuickRedirect17, false, "e85a53741f46405c7c7f72d9232c4e72", RobustBitConfig.DEFAULT_VALUE)) {
                    b bVar16 = (b) PatchProxy.accessDispatch(objArr17, this, changeQuickRedirect17, false, "e85a53741f46405c7c7f72d9232c4e72");
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
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "379b964bc9c885e1cbb79fe4dd9009ac", RobustBitConfig.DEFAULT_VALUE)) {
                return (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "379b964bc9c885e1cbb79fe4dd9009ac");
            }
            this.c.e = i;
            return a();
        }

        private T b(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = b;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f980d3c7d09988fb1c3a0bfaf9b0b88b", RobustBitConfig.DEFAULT_VALUE)) {
                return (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f980d3c7d09988fb1c3a0bfaf9b0b88b");
            }
            this.c.h = i;
            return a();
        }

        public final DrugShimmer b() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = b;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dda2261685517090d6f968ffe7cdc8e7", RobustBitConfig.DEFAULT_VALUE)) {
                return (DrugShimmer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dda2261685517090d6f968ffe7cdc8e7");
            }
            DrugShimmer drugShimmer = this.c;
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = DrugShimmer.a;
            if (PatchProxy.isSupport(objArr2, drugShimmer, changeQuickRedirect2, false, "626a13d5d7845b095bc84f2d8710cd6a", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, drugShimmer, changeQuickRedirect2, false, "626a13d5d7845b095bc84f2d8710cd6a");
            } else if (drugShimmer.h != 1) {
                drugShimmer.c[0] = drugShimmer.g;
                drugShimmer.c[1] = drugShimmer.f;
                drugShimmer.c[2] = drugShimmer.f;
                drugShimmer.c[3] = drugShimmer.g;
            } else {
                drugShimmer.c[0] = drugShimmer.f;
                drugShimmer.c[1] = drugShimmer.f;
                drugShimmer.c[2] = drugShimmer.g;
                drugShimmer.c[3] = drugShimmer.g;
            }
            DrugShimmer drugShimmer2 = this.c;
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = DrugShimmer.a;
            if (PatchProxy.isSupport(objArr3, drugShimmer2, changeQuickRedirect3, false, "93adb7d1a5921560aa45363d28b4fdad", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, drugShimmer2, changeQuickRedirect3, false, "93adb7d1a5921560aa45363d28b4fdad");
            } else if (drugShimmer2.h != 1) {
                drugShimmer2.b[0] = Math.max(((1.0f - drugShimmer2.m) - drugShimmer2.n) / 2.0f, 0.0f);
                drugShimmer2.b[1] = Math.max(((1.0f - drugShimmer2.m) - 0.001f) / 2.0f, 0.0f);
                drugShimmer2.b[2] = Math.min(((drugShimmer2.m + 1.0f) + 0.001f) / 2.0f, 1.0f);
                drugShimmer2.b[3] = Math.min(((drugShimmer2.m + 1.0f) + drugShimmer2.n) / 2.0f, 1.0f);
            } else {
                drugShimmer2.b[0] = 0.0f;
                drugShimmer2.b[1] = Math.min(drugShimmer2.m, 1.0f);
                drugShimmer2.b[2] = Math.min(drugShimmer2.m + drugShimmer2.n, 1.0f);
                drugShimmer2.b[3] = 1.0f;
            }
            return this.c;
        }

        private static float a(float f, float f2, float f3) {
            Object[] objArr = {Float.valueOf(0.0f), Float.valueOf(1.0f), Float.valueOf(f3)};
            ChangeQuickRedirect changeQuickRedirect = b;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "68f0ba2cc8d98aa94c34f16f6b44bc85", RobustBitConfig.DEFAULT_VALUE) ? ((Float) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "68f0ba2cc8d98aa94c34f16f6b44bc85")).floatValue() : Math.min(1.0f, Math.max(0.0f, f3));
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class a extends b<a> {
        public static ChangeQuickRedirect a;

        @Override // com.sankuai.waimai.store.drug.widgets.shimmer.DrugShimmer.b
        public final /* bridge */ /* synthetic */ a a() {
            return this;
        }

        public a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "daf9140bae3c14184f54fe7218984767", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "daf9140bae3c14184f54fe7218984767");
            } else {
                this.c.r = true;
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class c extends b<c> {
        public static ChangeQuickRedirect a;

        @Override // com.sankuai.waimai.store.drug.widgets.shimmer.DrugShimmer.b
        public final /* bridge */ /* synthetic */ c a() {
            return this;
        }

        @Override // com.sankuai.waimai.store.drug.widgets.shimmer.DrugShimmer.b
        public final /* synthetic */ c a(TypedArray typedArray) {
            Object[] objArr = {typedArray};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "04d1932632cd2d9be32f7477807e456e", RobustBitConfig.DEFAULT_VALUE)) {
                return (c) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "04d1932632cd2d9be32f7477807e456e");
            }
            super.a(typedArray);
            if (typedArray.hasValue(2)) {
                int color = typedArray.getColor(2, this.c.g);
                Object[] objArr2 = {Integer.valueOf(color)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a68f074b6a5e616bec95507275d41095", RobustBitConfig.DEFAULT_VALUE)) {
                    c cVar = (c) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a68f074b6a5e616bec95507275d41095");
                } else {
                    this.c.g = (color & ViewCompat.MEASURED_SIZE_MASK) | (this.c.g & (-16777216));
                }
            }
            if (typedArray.hasValue(3)) {
                int color2 = typedArray.getColor(3, this.c.f);
                Object[] objArr3 = {Integer.valueOf(color2)};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "a4b527eed0388509b0491bac3da1e6a1", RobustBitConfig.DEFAULT_VALUE)) {
                    c cVar2 = (c) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "a4b527eed0388509b0491bac3da1e6a1");
                } else {
                    this.c.f = color2;
                }
            }
            return this;
        }

        public c() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2541e936ac9553834fb8ef2629255f74", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2541e936ac9553834fb8ef2629255f74");
            } else {
                this.c.r = false;
            }
        }
    }
}
