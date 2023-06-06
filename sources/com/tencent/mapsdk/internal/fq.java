package com.tencent.mapsdk.internal;

import android.graphics.Rect;
import com.tencent.map.lib.models.GeoPoint;
import com.tencent.map.tools.Util;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class fq {
    public static final int a = 0;
    public static final int b = 1;
    public static final int c = 2;
    public static final int d = 3;
    public static final int e = 9;
    public static final int f = -1;
    public static final float g = 200.0f;
    public static final float h = 60.0f;
    public static final String i = "color_texture_flat_style.png";
    public static final String j = "color_point_texture.png";
    public static final String k = "color_texture_line_v2.png";
    public boolean O;
    public ArrayList<GeoPoint> l;
    public ArrayList<GeoPoint> m;
    public int[] n;
    public int[] o;
    public String[] p;
    public int[] q;
    public int[] r;
    public int[] s;
    public int[] t;
    public float u;
    public boolean v;
    public boolean w;
    public float x = 9.0f;
    public String y = "";
    public boolean z = true;
    public float A = 1.0f;
    public boolean B = true;
    public int C = 0;
    public boolean D = false;
    public boolean E = false;
    public Rect F = new Rect();
    public int G = 0;
    public String H = "";
    public float I = -1.0f;
    public int J = -1;
    public int K = -15248742;
    public List<Integer> L = null;
    public int M = 2;
    public int N = -7829368;

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public static final class a {
        public static final int a = 0;
        public static final int b = 1;
        public static final int c = 2;
        public static final int d = 3;
        public static final int e = 4;
        public static final int f = 5;
        public static final int g = 6;
        public static final int h = 7;
        public static final int i = 8;
        public static final int j = 9;
        public static final int k = 33;
        public static final int l = 19;
        public static final int m = 20;
    }

    public final fq a(List<GeoPoint> list) {
        if (list == null || list.size() < 2) {
            kj.b("参数points不能小于2!");
            return this;
        }
        this.m = new ArrayList<>(list.size());
        this.m.addAll(list);
        if (this.m.size() < 2) {
            kj.b("参数points存在null值");
            return this;
        }
        this.l = new ArrayList<>(list.size());
        this.l.addAll(this.m);
        return this;
    }

    public final fq a(int[] iArr) {
        if (iArr == null || iArr.length <= 0) {
            kj.b("参数startIndexes不能为空!");
            return this;
        }
        this.q = iArr;
        return this;
    }

    private fq a(int i2) {
        this.N = i2;
        return this;
    }

    @Deprecated
    private void a(String str) {
        this.y = str;
    }

    private fq b(String str) {
        this.y = str;
        return this;
    }

    @Deprecated
    private void a(boolean z) {
        this.z = z;
    }

    private fq a(float f2) {
        this.A = f2;
        return this;
    }

    @Deprecated
    private void b(float f2) {
        this.A = f2;
    }

    public final fq b(int[] iArr) {
        if (iArr == null || iArr.length <= 0) {
            kj.b("参数colors不能为空!");
            return this;
        } else if (!this.v) {
            this.r = iArr;
            return this;
        } else {
            ArrayList arrayList = new ArrayList();
            arrayList.add(Integer.valueOf(this.N));
            for (int i2 = 0; i2 < iArr.length; i2++) {
                if (!arrayList.contains(Integer.valueOf(iArr[i2]))) {
                    arrayList.add(Integer.valueOf(iArr[i2]));
                }
                iArr[i2] = arrayList.indexOf(Integer.valueOf(iArr[i2]));
            }
            this.r = iArr;
            int size = arrayList.size();
            this.s = new int[size];
            for (int i3 = 0; i3 < size; i3++) {
                this.s[i3] = ((Integer) arrayList.get(i3)).intValue();
            }
            return this;
        }
    }

    public final fq a(int[] iArr, int[] iArr2) {
        if (iArr == null || iArr.length <= 0 || iArr2 == null || iArr2.length <= 0) {
            kj.b("参数colors 、borderColors为空，或者两者长度不同");
            return this;
        } else if (!this.v) {
            this.r = iArr;
            return this;
        } else {
            if (iArr2.length < iArr.length) {
                int[] iArr3 = new int[iArr.length];
                for (int i2 = 0; i2 < iArr.length; i2++) {
                    if (i2 < iArr2.length) {
                        iArr3[i2] = iArr2[i2];
                    } else {
                        iArr3[i2] = iArr2[iArr2.length - 1];
                    }
                }
                iArr2 = iArr3;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(new b(this.N, this.N));
            this.r = new int[iArr.length];
            for (int i3 = 0; i3 < iArr.length; i3++) {
                b bVar = new b(iArr[i3], iArr2[i3]);
                if (!arrayList.contains(bVar)) {
                    arrayList.add(bVar);
                }
                this.r[i3] = arrayList.indexOf(bVar);
            }
            int size = arrayList.size();
            this.s = new int[size];
            this.t = new int[size];
            for (int i4 = 0; i4 < size; i4++) {
                this.s[i4] = ((b) arrayList.get(i4)).b;
                this.t[i4] = ((b) arrayList.get(i4)).a;
            }
            return this;
        }
    }

    private fq b() {
        this.v = true;
        return this;
    }

    private fq b(boolean z) {
        this.w = z;
        return this;
    }

    private fq c(float f2) {
        this.x = f2;
        return this;
    }

    private fq d(float f2) {
        this.u = f2;
        return this;
    }

    private fq c(boolean z) {
        this.B = z;
        return this;
    }

    private fq b(int i2) {
        this.C = i2;
        return this;
    }

    private int c() {
        return this.C;
    }

    private fq d(boolean z) {
        this.D = z;
        return this;
    }

    private fq e(boolean z) {
        this.E = z;
        return this;
    }

    private fq c(int i2) {
        this.G = i2;
        return this;
    }

    private fq c(String str) {
        this.H = str;
        return this;
    }

    private fq c(int[] iArr) {
        if (iArr == null || iArr.length <= 0) {
            kj.b("参数startNums不能为空!");
            return this;
        }
        this.n = iArr;
        return this;
    }

    private fq d(int[] iArr) {
        if (iArr == null || iArr.length <= 0) {
            kj.b("参数endNums不能为空!");
            return this;
        }
        this.o = iArr;
        return this;
    }

    private fq a(String[] strArr) {
        if (strArr == null || strArr.length <= 0) {
            kj.b("参数roadNames不能为空!");
            return this;
        }
        this.p = strArr;
        return this;
    }

    private fq e(float f2) {
        this.I = f2;
        return this;
    }

    private fq a(int i2, int i3) {
        this.J = i2;
        this.K = i3;
        return this;
    }

    public final fq b(List<Integer> list) {
        if (list != null && list.size() % 2 != 0) {
            list.add(list.get(list.size() - 1));
        }
        this.L = list;
        return this;
    }

    private int[] d() {
        return new int[]{this.J, this.K};
    }

    private float e() {
        return this.I;
    }

    private void d(int i2) {
        this.M = i2;
    }

    private int f() {
        return this.M;
    }

    public final boolean a() {
        if (this.m == null || this.m.size() < 2) {
            kj.b("LineOptions中点的个数不能小于2");
            return false;
        } else if (this.q == null || this.q.length <= 0) {
            kj.b("参数startIndexes不能为空!");
            return false;
        } else if (this.r == null || this.r.length <= 0) {
            kj.b("参数colors不能为空!");
            return false;
        } else {
            return true;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    final class b {
        public int a;
        public int b;

        public b(int i, int i2) {
            this.b = i;
            this.a = i2;
        }

        public final boolean equals(Object obj) {
            if (obj == null) {
                return false;
            }
            if (obj == this) {
                return true;
            }
            b bVar = (b) obj;
            return bVar.a == this.a && bVar.b == this.b;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        fq fqVar = (fq) obj;
        return Float.compare(fqVar.u, this.u) == 0 && this.v == fqVar.v && this.w == fqVar.w && Float.compare(fqVar.x, this.x) == 0 && this.z == fqVar.z && Float.compare(fqVar.A, this.A) == 0 && this.B == fqVar.B && this.C == fqVar.C && this.D == fqVar.D && this.E == fqVar.E && this.G == fqVar.G && Float.compare(fqVar.I, this.I) == 0 && this.J == fqVar.J && this.K == fqVar.K && this.M == fqVar.M && this.N == fqVar.N && this.O == fqVar.O && Util.equals(this.l, fqVar.l) && Util.equals(this.m, fqVar.m) && Arrays.equals(this.n, fqVar.n) && Arrays.equals(this.o, fqVar.o) && Arrays.equals(this.p, fqVar.p) && Arrays.equals(this.q, fqVar.q) && Arrays.equals(this.r, fqVar.r) && Arrays.equals(this.s, fqVar.s) && Arrays.equals(this.t, fqVar.t) && Util.equals(this.y, fqVar.y) && Util.equals(this.F, fqVar.F) && Util.equals(this.H, fqVar.H) && Util.equals(this.L, fqVar.L);
    }

    public final int hashCode() {
        return (((((((((((((Util.hash(this.l, this.m, Float.valueOf(this.u), Boolean.valueOf(this.v), Boolean.valueOf(this.w), Float.valueOf(this.x), this.y, Boolean.valueOf(this.z), Float.valueOf(this.A), Boolean.valueOf(this.B), Integer.valueOf(this.C), Boolean.valueOf(this.D), Boolean.valueOf(this.E), this.F, Integer.valueOf(this.G), this.H, Float.valueOf(this.I), Integer.valueOf(this.J), Integer.valueOf(this.K), this.L, Integer.valueOf(this.M), Integer.valueOf(this.N), Boolean.valueOf(this.O)) * 31) + Arrays.hashCode(this.n)) * 31) + Arrays.hashCode(this.o)) * 31) + Arrays.hashCode(this.p)) * 31) + Arrays.hashCode(this.q)) * 31) + Arrays.hashCode(this.r)) * 31) + Arrays.hashCode(this.s)) * 31) + Arrays.hashCode(this.t);
    }
}
