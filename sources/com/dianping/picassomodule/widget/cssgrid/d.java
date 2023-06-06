package com.dianping.picassomodule.widget.cssgrid;

import com.dianping.picassomodule.widget.cssgrid.g;
import com.dianping.picassomodule.widget.cssgrid.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.reflect.Array;
import java.util.Arrays;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class d implements Cloneable {
    public static ChangeQuickRedirect a;
    public c b;
    public int c;
    public int d;
    public int e;
    public b[][] f;
    public j[] g;
    public j[] h;
    public f[] i;
    private boolean j;

    public d(c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "27e40186b9a0f4c6331bfde0901c2397", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "27e40186b9a0f4c6331bfde0901c2397");
            return;
        }
        this.c = 0;
        this.d = 0;
        this.e = 0;
        this.j = false;
        this.b = cVar;
        if (this.b != null) {
            if (this.b.l != null && this.b.l.size() > 0) {
                this.c = this.b.l.size();
                this.i = new f[this.c];
                for (int i = 0; i < this.c; i++) {
                    this.i[i] = new f();
                }
            }
            c();
            if (this.b.e > 0) {
                this.e = this.b.e;
            } else {
                this.e = 1;
            }
            if (this.b.d > 0) {
                this.d = this.b.d;
            }
            if (this.c <= 0 || this.e <= 0) {
                return;
            }
            d();
            e();
            b(-1, -1.0f);
            g();
            j();
        }
    }

    public final void a(int i, float f) {
        Object[] objArr = {Integer.valueOf(i), Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7559ee8ac79ae5ab9ee17a78137263e7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7559ee8ac79ae5ab9ee17a78137263e7");
            return;
        }
        b(i, f);
        g();
        j();
    }

    private void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c27c24a6eb7466611f6536fc4cc00b9d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c27c24a6eb7466611f6536fc4cc00b9d");
        } else if (this.b.p != null) {
            int length = this.b.p.length;
            int length2 = this.b.p[0].length;
            this.b.d = length;
            this.b.e = length2;
            for (int i = 0; i < this.c; i++) {
                String str = this.b.l.get(i).e;
                int i2 = -1;
                int i3 = -1;
                for (int i4 = 0; i4 < length; i4++) {
                    int i5 = 0;
                    while (true) {
                        if (i5 >= length2) {
                            break;
                        } else if (this.b.p[i4][i5].equals(str)) {
                            i2 = i4;
                            i3 = i5;
                            break;
                        } else {
                            i5++;
                        }
                    }
                    if (i2 != -1 && i3 != -1) {
                        break;
                    }
                }
                int i6 = -1;
                int i7 = -1;
                for (int i8 = length - 1; i8 >= 0; i8--) {
                    int i9 = length2 - 1;
                    while (true) {
                        if (i9 < 0) {
                            break;
                        } else if (this.b.p[i8][i9].equals(str)) {
                            i6 = i8;
                            i7 = i9;
                            break;
                        } else {
                            i9--;
                        }
                    }
                    if (i6 != -1 && i7 != -1) {
                        break;
                    }
                }
                if (i2 >= 0 && i6 >= 0 && i3 >= 0 && i7 >= 0 && i2 <= i6 && i3 <= i7) {
                    this.b.l.get(i).a = i2;
                    this.b.l.get(i).b = i3;
                    this.b.l.get(i).c = (i6 - i2) + 1;
                    this.b.l.get(i).d = (i7 - i3) + 1;
                } else {
                    this.b.l.get(i).a = -1;
                    this.b.l.get(i).b = -1;
                    this.b.l.get(i).c = 1;
                    this.b.l.get(i).d = this.b.e + 1;
                }
            }
        }
    }

    private boolean a(int[][] iArr, int i, int i2, int i3, int i4) {
        Object[] objArr = {iArr, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d5aff64a81400e1b9f49368318977589", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d5aff64a81400e1b9f49368318977589")).booleanValue();
        }
        for (int i5 = i; i5 < i + i3; i5++) {
            for (int i6 = i2; i6 < i2 + i4; i6++) {
                if (i5 >= iArr.length || i6 >= iArr[0].length || iArr[i5][i6] > 0) {
                    return false;
                }
            }
        }
        return true;
    }

    private void d() {
        int[][] iArr;
        int i;
        boolean z;
        boolean z2;
        int i2;
        int i3;
        int i4;
        boolean z3;
        int i5;
        int i6;
        boolean z4;
        boolean z5;
        char c = 0;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e3f59e0b49741b653faac32bf9542679", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e3f59e0b49741b653faac32bf9542679");
            return;
        }
        if (this.d == 0) {
            int i7 = 0;
            int i8 = 0;
            for (int i9 = 0; i9 < this.c; i9++) {
                e eVar = this.b.l.get(i9);
                if (eVar.a >= 0) {
                    if (eVar.a + eVar.c > i7) {
                        i7 = eVar.a + eVar.c;
                    }
                } else {
                    i8 += eVar.c;
                }
            }
            int i10 = i7 + i8;
            int[][] iArr2 = (int[][]) Array.newInstance(int.class, i10, this.e);
            for (int i11 = 0; i11 < i10; i11++) {
                for (int i12 = 0; i12 < this.e; i12++) {
                    iArr2[i11][i12] = 0;
                }
            }
            i = i10;
            iArr = iArr2;
        } else {
            int[][] iArr3 = (int[][]) Array.newInstance(int.class, this.d, this.e);
            for (int i13 = 0; i13 < this.d; i13++) {
                for (int i14 = 0; i14 < this.e; i14++) {
                    iArr3[i13][i14] = 0;
                }
            }
            iArr = iArr3;
            i = 0;
        }
        int i15 = 0;
        while (i15 < this.c) {
            e eVar2 = this.b.l.get(i15);
            if (eVar2.a >= 0 && eVar2.b >= 0) {
                int i16 = eVar2.a;
                int i17 = eVar2.b;
                int i18 = eVar2.c;
                int i19 = eVar2.d;
                Object[] objArr2 = new Object[5];
                objArr2[c] = iArr;
                objArr2[1] = Integer.valueOf(i16);
                objArr2[2] = Integer.valueOf(i17);
                objArr2[3] = Integer.valueOf(i18);
                objArr2[4] = Integer.valueOf(i19);
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6b77c2db180b4b2a1994a7bafebfa2d3", RobustBitConfig.DEFAULT_VALUE)) {
                    z5 = ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6b77c2db180b4b2a1994a7bafebfa2d3")).booleanValue();
                } else {
                    for (int i20 = i16; i20 < i16 + i18; i20++) {
                        for (int i21 = i17; i21 < i17 + i19; i21++) {
                            if (i20 >= iArr.length || i21 >= iArr[0].length) {
                                z5 = false;
                                break;
                            }
                        }
                    }
                    z5 = true;
                }
                if (z5) {
                    for (int i22 = eVar2.a; i22 < eVar2.a + eVar2.c; i22++) {
                        for (int i23 = eVar2.b; i23 < eVar2.b + eVar2.d; i23++) {
                            iArr[i22][i23] = i15 + 1;
                        }
                    }
                    this.i[i15].b = true;
                    this.i[i15].c = eVar2.a;
                    this.i[i15].d = eVar2.b;
                    this.i[i15].e = eVar2.c;
                    this.i[i15].f = eVar2.d;
                } else {
                    this.i[i15].b = false;
                }
            }
            i15++;
            c = 0;
        }
        for (int i24 = 0; i24 < this.c; i24++) {
            e eVar3 = this.b.l.get(i24);
            if ((eVar3.a < 0 || eVar3.b < 0) && (eVar3.a >= 0 || eVar3.b >= 0)) {
                if (eVar3.a >= 0) {
                    int i25 = eVar3.a;
                    boolean z6 = true;
                    int i26 = 0;
                    while (true) {
                        z4 = false;
                        while (z6) {
                            if (a(iArr, i25, i26, eVar3.c, eVar3.d)) {
                                z6 = false;
                                z4 = true;
                            } else {
                                int i27 = i26 + 1;
                                if (i27 < this.e) {
                                    i26 = i27;
                                }
                            }
                        }
                        z6 = false;
                    }
                    if (z4) {
                        for (int i28 = i25; i28 < eVar3.c + i25; i28++) {
                            for (int i29 = i26; i29 < eVar3.d + i26; i29++) {
                                iArr[i28][i29] = i24 + 1;
                            }
                        }
                        this.i[i24].b = true;
                        this.i[i24].c = i25;
                        this.i[i24].d = i26;
                        this.i[i24].e = eVar3.c;
                        this.i[i24].f = eVar3.d;
                    } else {
                        this.i[i24].b = false;
                    }
                }
                if (eVar3.b >= 0) {
                    int i30 = eVar3.b;
                    if (eVar3.d + i30 <= this.e) {
                        boolean z7 = true;
                        z3 = false;
                        i5 = 0;
                        while (z7) {
                            if (a(iArr, i5, i30, eVar3.c, eVar3.d)) {
                                z7 = false;
                                z3 = true;
                            } else if (this.d == 0) {
                                i6 = i5 + 1;
                                if (i6 < i) {
                                    i5 = i6;
                                } else {
                                    z7 = false;
                                    z3 = false;
                                }
                            } else {
                                i6 = i5 + 1;
                                if (i6 < this.d) {
                                    i5 = i6;
                                } else {
                                    z7 = false;
                                    z3 = false;
                                }
                            }
                        }
                    } else {
                        z3 = false;
                        i5 = 0;
                    }
                    if (z3) {
                        for (int i31 = i5; i31 < eVar3.c + i5; i31++) {
                            for (int i32 = i30; i32 < eVar3.d + i30; i32++) {
                                iArr[i31][i32] = i24 + 1;
                            }
                        }
                        this.i[i24].b = true;
                        this.i[i24].c = i5;
                        this.i[i24].d = i30;
                        this.i[i24].e = eVar3.c;
                        this.i[i24].f = eVar3.d;
                    } else {
                        this.i[i24].b = false;
                    }
                }
            }
        }
        for (int i33 = 0; i33 < this.c; i33++) {
            e eVar4 = this.b.l.get(i33);
            if (eVar4.a < 0 && eVar4.b < 0) {
                if (eVar4.d + 0 <= this.e) {
                    boolean z8 = true;
                    z2 = false;
                    i2 = 0;
                    while (true) {
                        i3 = 0;
                        while (z8) {
                            if (a(iArr, i2, i3, eVar4.c, eVar4.d)) {
                                z8 = false;
                                z2 = true;
                            } else {
                                int i34 = i3 + 1;
                                if (i34 < this.e) {
                                    i3 = i34;
                                } else if (this.d == 0) {
                                    i4 = i2 + 1;
                                    if (i4 < i) {
                                        break;
                                    }
                                    z8 = false;
                                    z2 = false;
                                } else {
                                    i4 = i2 + 1;
                                    if (i4 < this.d) {
                                        break;
                                    }
                                    z8 = false;
                                    z2 = false;
                                }
                            }
                        }
                        i2 = i4;
                    }
                } else {
                    z2 = false;
                    i2 = 0;
                    i3 = 0;
                }
                if (z2) {
                    for (int i35 = i2; i35 < eVar4.c + i2; i35++) {
                        for (int i36 = i3; i36 < eVar4.d + i3; i36++) {
                            iArr[i35][i36] = i33 + 1;
                        }
                    }
                    this.i[i33].b = true;
                    this.i[i33].c = i2;
                    this.i[i33].d = i3;
                    this.i[i33].e = eVar4.c;
                    this.i[i33].f = eVar4.d;
                } else {
                    this.i[i33].b = false;
                }
            }
        }
        if (this.d == 0) {
            boolean z9 = true;
            while (z9) {
                int i37 = 0;
                while (true) {
                    if (i37 >= this.e) {
                        z = true;
                        break;
                    } else if (iArr[i - 1][i37] > 0) {
                        z = false;
                        break;
                    } else {
                        i37++;
                    }
                }
                if (!z || i - 1 <= 0) {
                    z9 = false;
                } else {
                    i--;
                }
            }
            this.d = i;
        }
        this.f = new b[this.d];
        for (int i38 = 0; i38 < this.d; i38++) {
            this.f[i38] = new b[this.e];
            for (int i39 = 0; i39 < this.e; i39++) {
                this.f[i38][i39] = new b();
                this.f[i38][i39].b = iArr[i38][i39];
            }
        }
    }

    private void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5334d17a4178ce3b63504e48d1948d61", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5334d17a4178ce3b63504e48d1948d61");
            return;
        }
        this.g = new j[this.e];
        this.h = new j[this.d];
        for (int i = 0; i < this.e; i++) {
            this.g[i] = new j();
            if (i < this.b.m.size()) {
                this.g[i].b = this.b.m.get(i);
            }
        }
        for (int i2 = 0; i2 < this.d; i2++) {
            this.h[i2] = new j();
            if (i2 < this.b.n.size()) {
                this.h[i2].b = this.b.n.get(i2);
            }
        }
    }

    private void b(int i, float f) {
        Object[] objArr = {Integer.valueOf(i), Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2697a27c53aeb4ee72642825822a89af", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2697a27c53aeb4ee72642825822a89af");
            return;
        }
        f();
        c(i, f);
    }

    private void f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ab4e66a10e32fa32269ca3108b1e623a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ab4e66a10e32fa32269ca3108b1e623a");
            return;
        }
        float f = ((this.b.g - this.b.j) - this.b.k) - ((this.e - 1) * this.b.b);
        float f2 = 0.0f;
        float f3 = 0.0f;
        float f4 = 0.0f;
        for (int i = 0; i < this.e; i++) {
            if (this.g[i].b.b == i.a.GRID_TEMPLATE_STYLE_PIXEL) {
                f3 += this.g[i].b.c;
            } else if (this.g[i].b.b == i.a.GRID_TEMPLATE_STYLE_PERCENTAGE) {
                f4 += this.g[i].b.d;
            } else if (this.g[i].b.b == i.a.GRID_TEMPLATE_STYLE_WEIGHT) {
                f2 += this.g[i].b.e;
            }
        }
        float f5 = f / 100.0f;
        float f6 = f2 > 0.0f ? ((f - f3) - (f4 * f5)) / f2 : 0.0f;
        for (int i2 = 0; i2 < this.e; i2++) {
            if (this.g[i2].b.b == i.a.GRID_TEMPLATE_STYLE_PIXEL) {
                this.g[i2].c = this.g[i2].b.c;
            } else if (this.g[i2].b.b == i.a.GRID_TEMPLATE_STYLE_PERCENTAGE) {
                this.g[i2].c = this.g[i2].b.d * f5;
            } else if (this.g[i2].b.b == i.a.GRID_TEMPLATE_STYLE_WEIGHT) {
                this.g[i2].c = this.g[i2].b.e * f6;
            }
        }
    }

    private void c(int i, float f) {
        float f2;
        float f3;
        float f4;
        int i2;
        Object[] objArr = {Integer.valueOf(i), Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bf6d1c256810798713c3e149fd77a200", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bf6d1c256810798713c3e149fd77a200");
            return;
        }
        float f5 = 0.0f;
        float f6 = 0.0f;
        float f7 = 0.0f;
        for (int i3 = 0; i3 < this.d; i3++) {
            if (this.h[i3].b.b == i.a.GRID_TEMPLATE_STYLE_PIXEL) {
                f5 += this.h[i3].b.c;
            } else if (this.h[i3].b.b == i.a.GRID_TEMPLATE_STYLE_PERCENTAGE) {
                f7 += this.h[i3].b.d;
            } else if (this.h[i3].b.b == i.a.GRID_TEMPLATE_STYLE_WEIGHT) {
                f6 += this.h[i3].b.e;
            }
        }
        if (this.b.f > 0.0f) {
            this.j = false;
            float f8 = ((this.b.f - this.b.h) - this.b.i) - ((this.d - 1) * this.b.c);
            float f9 = f8 / 100.0f;
            if (f6 > 0.0f) {
                f4 = ((f8 - f5) - (f7 * f9)) / f6;
                f2 = f9;
            } else {
                f2 = f9;
                f4 = 0.0f;
            }
        } else if (i == -1 && f == -1.0f) {
            boolean z = false;
            boolean z2 = false;
            boolean z3 = false;
            for (int i4 = 0; i4 < this.c; i4++) {
                int i5 = this.i[i4].c;
                int i6 = this.i[i4].e;
                int i7 = i5;
                while (true) {
                    i2 = i5 + i6;
                    if (i7 >= i2) {
                        break;
                    } else if (this.h[i7].b.b == i.a.GRID_TEMPLATE_STYLE_PIXEL) {
                        z = true;
                        break;
                    } else {
                        i7++;
                    }
                }
                int i8 = i5;
                while (true) {
                    if (i8 >= i2) {
                        break;
                    } else if (this.h[i8].b.b == i.a.GRID_TEMPLATE_STYLE_PERCENTAGE) {
                        z2 = true;
                        break;
                    } else {
                        i8++;
                    }
                }
                while (true) {
                    if (i5 >= i2) {
                        break;
                    } else if (this.h[i5].b.b == i.a.GRID_TEMPLATE_STYLE_WEIGHT) {
                        z3 = true;
                        break;
                    } else {
                        i5++;
                    }
                }
            }
            boolean z4 = false;
            boolean z5 = false;
            for (int i9 = 0; i9 < this.c; i9++) {
                int i10 = this.i[i9].c;
                int i11 = this.i[i9].e;
                for (int i12 = i10; i12 < i10 + i11; i12++) {
                    if (this.h[i12].b.b != i.a.GRID_TEMPLATE_STYLE_PIXEL && (this.h[i12].b.b == i.a.GRID_TEMPLATE_STYLE_WEIGHT || (this.h[i12].b.b == i.a.GRID_TEMPLATE_STYLE_PERCENTAGE && (z3 || !z)))) {
                        z4 = true;
                        z5 = true;
                        break;
                    }
                }
                this.i[i9].k = z5;
            }
            this.j = z4;
            if (!this.j && z && z2) {
                f2 = (f5 / (1.0f - (f7 / 100.0f))) / 100.0f;
                f4 = 0.0f;
            }
            f2 = 0.0f;
            f4 = 0.0f;
        } else {
            this.j = false;
            if (i < 0 || i >= this.b.l.size() || f <= 0.0f) {
                return;
            }
            int i13 = this.i[i].c;
            int i14 = this.i[i].e;
            e eVar = this.b.l.get(i);
            float f10 = ((f + eVar.g) + eVar.i) - ((i14 - 1) * this.b.c);
            if (i13 >= 0 && i14 > 0) {
                float f11 = 0.0f;
                float f12 = 0.0f;
                float f13 = 0.0f;
                for (int i15 = i13; i15 < i13 + i14; i15++) {
                    if (this.h[i15].b.b == i.a.GRID_TEMPLATE_STYLE_PIXEL) {
                        f12 += this.h[i15].b.c;
                    } else if (this.h[i15].b.b == i.a.GRID_TEMPLATE_STYLE_PERCENTAGE) {
                        f13 += this.h[i15].b.d;
                    } else if (this.h[i15].b.b == i.a.GRID_TEMPLATE_STYLE_WEIGHT) {
                        f11 += this.h[i15].b.e;
                    }
                }
                int i16 = (f11 > 0.0f ? 1 : (f11 == 0.0f ? 0 : -1));
                if (i16 == 0 && f13 > 0.0f) {
                    float f14 = ((f10 - f12) * 100.0f) / f13;
                    f2 = f14 / 100.0f;
                    if (f6 > 0.0f) {
                        f3 = ((f14 * (1.0f - (f7 / 100.0f))) - f5) / f6;
                        f4 = f3;
                    }
                    f4 = 0.0f;
                } else if (i16 > 0 && f13 == 0.0f) {
                    float f15 = (f10 - f12) / f11;
                    f4 = f15;
                    f2 = ((f5 + (f6 * f15)) / (1.0f - (f7 / 100.0f))) / 100.0f;
                } else if (i16 > 0) {
                    f2 = 0.0f;
                    if (f13 > 0.0f) {
                        float f16 = f10 - f12;
                        float f17 = ((f5 * f11) + (f6 * f16)) / (((1.0f - (f7 / 100.0f)) * f11) + ((f6 * f13) / 100.0f));
                        f2 = f17 / 100.0f;
                        f3 = (f16 - ((f13 * f17) / 100.0f)) / f11;
                        f4 = f3;
                    }
                    f4 = 0.0f;
                }
            }
            f2 = 0.0f;
            f4 = 0.0f;
        }
        for (int i17 = 0; i17 < this.d; i17++) {
            if (this.h[i17].b.b == i.a.GRID_TEMPLATE_STYLE_PIXEL) {
                this.h[i17].c = this.h[i17].b.c;
            } else if (this.h[i17].b.b == i.a.GRID_TEMPLATE_STYLE_PERCENTAGE) {
                this.h[i17].c = this.h[i17].b.d * f2;
            } else if (this.h[i17].b.b == i.a.GRID_TEMPLATE_STYLE_WEIGHT) {
                this.h[i17].c = this.h[i17].b.e * f4;
            }
        }
        if (this.j) {
            return;
        }
        for (int i18 = 0; i18 < this.c; i18++) {
            this.i[i18].k = false;
        }
    }

    private void g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f24ba0a61b5c1bc61f4dccbda8fd8557", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f24ba0a61b5c1bc61f4dccbda8fd8557");
            return;
        }
        h();
        i();
    }

    private void h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e25b15e692692b8ab129da3da444398c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e25b15e692692b8ab129da3da444398c");
            return;
        }
        for (int i = 0; i < this.c; i++) {
            e eVar = this.b.l.get(i);
            if (this.i[i].b) {
                float f = 0.0f;
                float f2 = this.b.j + 0.0f;
                for (int i2 = 0; i2 < this.i[i].d; i2++) {
                    f2 = f2 + this.g[i2].c + this.b.b;
                }
                float f3 = this.b.h + 0.0f;
                for (int i3 = 0; i3 < this.i[i].c; i3++) {
                    f3 = f3 + this.h[i3].c + this.b.c;
                }
                float f4 = 0.0f;
                for (int i4 = this.i[i].d; i4 < this.i[i].d + this.i[i].f; i4++) {
                    f4 += this.g[i4].c;
                }
                float f5 = f4 + ((eVar.d - 1) * this.b.b);
                for (int i5 = this.i[i].c; i5 < this.i[i].c + this.i[i].e; i5++) {
                    f += this.h[i5].c;
                }
                float f6 = f + ((eVar.c - 1) * this.b.c);
                this.i[i].g = f2;
                this.i[i].h = f3;
                this.i[i].i = f5;
                this.i[i].j = f6;
            }
        }
    }

    private void i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "54c20c460fec3da5cd0141db38b71418", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "54c20c460fec3da5cd0141db38b71418");
            return;
        }
        for (int i = 0; i < this.c; i++) {
            if (this.i[i].b) {
                e eVar = this.b.l.get(i);
                this.i[i].l = (this.i[i].i - eVar.f) - eVar.h;
                if (this.i[i].l < 0.0f) {
                    this.i[i].l = 0.0f;
                }
                if (this.i[i].k) {
                    this.i[i].m = 0.0f;
                } else {
                    this.i[i].m = (this.i[i].j - eVar.g) - eVar.i;
                    if (this.i[i].m < 0.0f) {
                        this.i[i].m = 0.0f;
                    }
                }
            }
        }
    }

    private void j() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "96bb72d2bae591cc926041c8b17c536f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "96bb72d2bae591cc926041c8b17c536f");
            return;
        }
        k();
        l();
    }

    private void k() {
        float f;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e9a92798b7b7559b6847998cd65818d8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e9a92798b7b7559b6847998cd65818d8");
            return;
        }
        for (int i = 0; i < this.d - 1; i++) {
            for (int i2 = 0; i2 < this.e; i2++) {
                int i3 = i + 1;
                if (this.f[i][i2].b == this.f[i3][i2].b) {
                    if (this.b.o.b == g.a.GRID_SERPERATIONLINE_STYLE_NONE) {
                        this.f[i][i2].c = false;
                    } else if (this.b.o.b == g.a.GRID_SERPERATIONLINE_STYLE_AVERAGE) {
                        this.f[i][i2].c = true;
                    } else if (this.b.o.b == g.a.GRID_SERPERATIONLINE_STYLE_AUTO) {
                        this.f[i][i2].c = false;
                    } else if (this.b.o.b == g.a.GRID_SERPERATIONLINE_STYLE_AUTOINCLUDEBLANK) {
                        this.f[i][i2].c = false;
                    }
                } else if (this.f[i][i2].b > 0 && this.f[i3][i2].b > 0) {
                    if (this.b.o.b == g.a.GRID_SERPERATIONLINE_STYLE_NONE) {
                        this.f[i][i2].c = false;
                    } else if (this.b.o.b == g.a.GRID_SERPERATIONLINE_STYLE_AVERAGE) {
                        this.f[i][i2].c = true;
                    } else if (this.b.o.b == g.a.GRID_SERPERATIONLINE_STYLE_AUTO) {
                        this.f[i][i2].c = true;
                    } else if (this.b.o.b == g.a.GRID_SERPERATIONLINE_STYLE_AUTOINCLUDEBLANK) {
                        this.f[i][i2].c = true;
                    }
                } else if (this.b.o.b == g.a.GRID_SERPERATIONLINE_STYLE_NONE) {
                    this.f[i][i2].c = false;
                } else if (this.b.o.b == g.a.GRID_SERPERATIONLINE_STYLE_AVERAGE) {
                    this.f[i][i2].c = true;
                } else if (this.b.o.b == g.a.GRID_SERPERATIONLINE_STYLE_AUTO) {
                    this.f[i][i2].c = false;
                } else if (this.b.o.b == g.a.GRID_SERPERATIONLINE_STYLE_AUTOINCLUDEBLANK) {
                    this.f[i][i2].c = true;
                }
            }
        }
        for (int i4 = 0; i4 < this.d - 1; i4++) {
            float f2 = 0.0f;
            for (int i5 = 0; i5 <= i4; i5++) {
                f2 = f2 + this.h[i5].c + this.b.c;
            }
            float f3 = (f2 - (this.b.c / 2.0f)) + this.b.h;
            float f4 = this.b.j;
            int i6 = 0;
            while (i6 < this.e) {
                float f5 = this.g[i6].c + f4;
                if (i6 == 0 || i6 == this.e - 1) {
                    f = this.b.b / 2.0f;
                } else {
                    f = this.b.b;
                }
                float f6 = f5 + f;
                this.f[i4][i6].e.b = f4;
                this.f[i4][i6].e.c = f3;
                this.f[i4][i6].e.d = f6;
                this.f[i4][i6].e.e = f3;
                i6++;
                f4 = f6;
            }
        }
    }

    private void l() {
        float f;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d4a48961ae2a06f312f55cbd6a4f194a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d4a48961ae2a06f312f55cbd6a4f194a");
            return;
        }
        for (int i = 0; i < this.d; i++) {
            int i2 = 0;
            while (i2 < this.e - 1) {
                int i3 = i2 + 1;
                if (this.f[i][i2].b == this.f[i][i3].b) {
                    if (this.b.o.b == g.a.GRID_SERPERATIONLINE_STYLE_NONE) {
                        this.f[i][i2].d = false;
                    } else if (this.b.o.b == g.a.GRID_SERPERATIONLINE_STYLE_AVERAGE) {
                        this.f[i][i2].d = true;
                    } else if (this.b.o.b == g.a.GRID_SERPERATIONLINE_STYLE_AUTO) {
                        this.f[i][i2].d = false;
                    } else if (this.b.o.b == g.a.GRID_SERPERATIONLINE_STYLE_AUTOINCLUDEBLANK) {
                        this.f[i][i2].d = false;
                    }
                } else if (this.f[i][i2].b > 0 && this.f[i][i3].b > 0) {
                    if (this.b.o.b == g.a.GRID_SERPERATIONLINE_STYLE_NONE) {
                        this.f[i][i2].d = false;
                    } else if (this.b.o.b == g.a.GRID_SERPERATIONLINE_STYLE_AVERAGE) {
                        this.f[i][i2].d = true;
                    } else if (this.b.o.b == g.a.GRID_SERPERATIONLINE_STYLE_AUTO) {
                        this.f[i][i2].d = true;
                    } else if (this.b.o.b == g.a.GRID_SERPERATIONLINE_STYLE_AUTOINCLUDEBLANK) {
                        this.f[i][i2].d = true;
                    }
                } else if (this.b.o.b == g.a.GRID_SERPERATIONLINE_STYLE_NONE) {
                    this.f[i][i2].d = false;
                } else if (this.b.o.b == g.a.GRID_SERPERATIONLINE_STYLE_AVERAGE) {
                    this.f[i][i2].d = true;
                } else if (this.b.o.b == g.a.GRID_SERPERATIONLINE_STYLE_AUTO) {
                    this.f[i][i2].d = false;
                } else if (this.b.o.b == g.a.GRID_SERPERATIONLINE_STYLE_AUTOINCLUDEBLANK) {
                    this.f[i][i2].d = true;
                }
                i2 = i3;
            }
        }
        for (int i4 = 0; i4 < this.e - 1; i4++) {
            float f2 = 0.0f;
            for (int i5 = 0; i5 <= i4; i5++) {
                f2 = f2 + this.g[i5].c + this.b.b;
            }
            float f3 = (f2 - (this.b.b / 2.0f)) + this.b.j;
            float f4 = this.b.h;
            int i6 = 0;
            while (i6 < this.d) {
                float f5 = this.h[i6].c + f4;
                if (i6 == 0 || i6 == this.d - 1) {
                    f = this.b.c / 2.0f;
                } else {
                    f = this.b.c;
                }
                float f6 = f5 + f;
                this.f[i6][i4].f.b = f3;
                this.f[i6][i4].f.c = f4;
                this.f[i6][i4].f.d = f3;
                this.f[i6][i4].f.e = f6;
                i6++;
                f4 = f6;
            }
        }
    }

    public final float a() {
        float f = 0.0f;
        for (int i = 0; i < this.d; i++) {
            f += this.h[i].c;
        }
        for (int i2 = 0; i2 < this.d - 1; i2++) {
            f += this.b.c;
        }
        return f + this.b.h + this.b.i;
    }

    public final boolean b() {
        f[] fVarArr;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "85083c5ed180fdd1b2221f704349726e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "85083c5ed180fdd1b2221f704349726e")).booleanValue();
        }
        if (this.i == null || this.i.length <= 0) {
            return false;
        }
        for (f fVar : this.i) {
            if (fVar.m < 1.0f && fVar.k) {
                return true;
            }
        }
        return false;
    }

    public final Object clone() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9bc479f12beb2e0be9c0a82e46c6e151", RobustBitConfig.DEFAULT_VALUE)) {
            return PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9bc479f12beb2e0be9c0a82e46c6e151");
        }
        try {
            d dVar = (d) super.clone();
            if (this.b != null) {
                dVar.b = (c) this.b.clone();
            }
            if (this.f != null) {
                dVar.f = (b[][]) Arrays.copyOf(this.f, this.f.length);
            }
            if (this.g != null) {
                dVar.g = (j[]) Arrays.copyOf(this.g, this.g.length);
            }
            if (this.h != null) {
                dVar.h = (j[]) Arrays.copyOf(this.h, this.h.length);
            }
            if (this.i != null) {
                dVar.i = (f[]) Arrays.copyOf(this.i, this.i.length);
            }
            return dVar;
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }
}
