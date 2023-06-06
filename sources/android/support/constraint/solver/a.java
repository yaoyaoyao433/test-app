package android.support.constraint.solver;

import android.support.constraint.solver.h;
import java.util.Arrays;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class a {
    final b b;
    final c c;
    int a = 0;
    private int h = 8;
    private h i = null;
    int[] d = new int[this.h];
    int[] e = new int[this.h];
    float[] f = new float[this.h];
    int g = -1;
    private int j = -1;
    private boolean k = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(b bVar, c cVar) {
        this.b = bVar;
        this.c = cVar;
    }

    public final void a(h hVar, float f) {
        if (f == 0.0f) {
            a(hVar, true);
        } else if (this.g == -1) {
            this.g = 0;
            this.f[this.g] = f;
            this.d[this.g] = hVar.a;
            this.e[this.g] = -1;
            hVar.i++;
            hVar.a(this.b);
            this.a++;
            if (this.k) {
                return;
            }
            this.j++;
            if (this.j >= this.d.length) {
                this.k = true;
                this.j = this.d.length - 1;
            }
        } else {
            int i = this.g;
            int i2 = -1;
            for (int i3 = 0; i != -1 && i3 < this.a; i3++) {
                if (this.d[i] == hVar.a) {
                    this.f[i] = f;
                    return;
                }
                if (this.d[i] < hVar.a) {
                    i2 = i;
                }
                i = this.e[i];
            }
            int i4 = this.j + 1;
            if (this.k) {
                if (this.d[this.j] == -1) {
                    i4 = this.j;
                } else {
                    i4 = this.d.length;
                }
            }
            if (i4 >= this.d.length && this.a < this.d.length) {
                int i5 = 0;
                while (true) {
                    if (i5 >= this.d.length) {
                        break;
                    } else if (this.d[i5] == -1) {
                        i4 = i5;
                        break;
                    } else {
                        i5++;
                    }
                }
            }
            if (i4 >= this.d.length) {
                i4 = this.d.length;
                this.h *= 2;
                this.k = false;
                this.j = i4 - 1;
                this.f = Arrays.copyOf(this.f, this.h);
                this.d = Arrays.copyOf(this.d, this.h);
                this.e = Arrays.copyOf(this.e, this.h);
            }
            this.d[i4] = hVar.a;
            this.f[i4] = f;
            if (i2 != -1) {
                int[] iArr = this.e;
                iArr[i4] = iArr[i2];
                this.e[i2] = i4;
            } else {
                this.e[i4] = this.g;
                this.g = i4;
            }
            hVar.i++;
            hVar.a(this.b);
            this.a++;
            if (!this.k) {
                this.j++;
            }
            if (this.a >= this.d.length) {
                this.k = true;
            }
            if (this.j >= this.d.length) {
                this.k = true;
                this.j = this.d.length - 1;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(h hVar, float f, boolean z) {
        if (f == 0.0f) {
            return;
        }
        if (this.g == -1) {
            this.g = 0;
            this.f[this.g] = f;
            this.d[this.g] = hVar.a;
            this.e[this.g] = -1;
            hVar.i++;
            hVar.a(this.b);
            this.a++;
            if (this.k) {
                return;
            }
            this.j++;
            if (this.j >= this.d.length) {
                this.k = true;
                this.j = this.d.length - 1;
                return;
            }
            return;
        }
        int i = this.g;
        int i2 = -1;
        for (int i3 = 0; i != -1 && i3 < this.a; i3++) {
            if (this.d[i] == hVar.a) {
                float[] fArr = this.f;
                fArr[i] = fArr[i] + f;
                if (this.f[i] == 0.0f) {
                    if (i == this.g) {
                        this.g = this.e[i];
                    } else {
                        int[] iArr = this.e;
                        iArr[i2] = iArr[i];
                    }
                    if (z) {
                        hVar.b(this.b);
                    }
                    if (this.k) {
                        this.j = i;
                    }
                    hVar.i--;
                    this.a--;
                    return;
                }
                return;
            }
            if (this.d[i] < hVar.a) {
                i2 = i;
            }
            i = this.e[i];
        }
        int i4 = this.j + 1;
        if (this.k) {
            if (this.d[this.j] == -1) {
                i4 = this.j;
            } else {
                i4 = this.d.length;
            }
        }
        if (i4 >= this.d.length && this.a < this.d.length) {
            int i5 = 0;
            while (true) {
                if (i5 >= this.d.length) {
                    break;
                } else if (this.d[i5] == -1) {
                    i4 = i5;
                    break;
                } else {
                    i5++;
                }
            }
        }
        if (i4 >= this.d.length) {
            i4 = this.d.length;
            this.h *= 2;
            this.k = false;
            this.j = i4 - 1;
            this.f = Arrays.copyOf(this.f, this.h);
            this.d = Arrays.copyOf(this.d, this.h);
            this.e = Arrays.copyOf(this.e, this.h);
        }
        this.d[i4] = hVar.a;
        this.f[i4] = f;
        if (i2 != -1) {
            int[] iArr2 = this.e;
            iArr2[i4] = iArr2[i2];
            this.e[i2] = i4;
        } else {
            this.e[i4] = this.g;
            this.g = i4;
        }
        hVar.i++;
        hVar.a(this.b);
        this.a++;
        if (!this.k) {
            this.j++;
        }
        if (this.j >= this.d.length) {
            this.k = true;
            this.j = this.d.length - 1;
        }
    }

    public final float a(h hVar, boolean z) {
        if (this.i == hVar) {
            this.i = null;
        }
        if (this.g == -1) {
            return 0.0f;
        }
        int i = this.g;
        int i2 = 0;
        int i3 = -1;
        while (i != -1 && i2 < this.a) {
            if (this.d[i] == hVar.a) {
                if (i == this.g) {
                    this.g = this.e[i];
                } else {
                    int[] iArr = this.e;
                    iArr[i3] = iArr[i];
                }
                if (z) {
                    hVar.b(this.b);
                }
                hVar.i--;
                this.a--;
                this.d[i] = -1;
                if (this.k) {
                    this.j = i;
                }
                return this.f[i];
            }
            i2++;
            i3 = i;
            i = this.e[i];
        }
        return 0.0f;
    }

    public final void a() {
        int i = this.g;
        for (int i2 = 0; i != -1 && i2 < this.a; i2++) {
            h hVar = this.c.c[this.d[i]];
            if (hVar != null) {
                hVar.b(this.b);
            }
            i = this.e[i];
        }
        this.g = -1;
        this.j = -1;
        this.k = false;
        this.a = 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(float f) {
        int i = this.g;
        for (int i2 = 0; i != -1 && i2 < this.a; i2++) {
            float[] fArr = this.f;
            fArr[i] = fArr[i] / f;
            i = this.e[i];
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean a(h hVar, e eVar) {
        return hVar.i <= 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(b bVar, b bVar2, boolean z) {
        int i = this.g;
        while (true) {
            for (int i2 = 0; i != -1 && i2 < this.a; i2++) {
                if (this.d[i] == bVar2.a.a) {
                    float f = this.f[i];
                    a(bVar2.a, false);
                    a aVar = bVar2.d;
                    int i3 = aVar.g;
                    for (int i4 = 0; i3 != -1 && i4 < aVar.a; i4++) {
                        a(this.c.c[aVar.d[i3]], aVar.f[i3] * f, false);
                        i3 = aVar.e[i3];
                    }
                    bVar.b += bVar2.b * f;
                    i = this.g;
                } else {
                    i = this.e[i];
                }
            }
            return;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(b bVar, b[] bVarArr) {
        int i = this.g;
        while (true) {
            for (int i2 = 0; i != -1 && i2 < this.a; i2++) {
                h hVar = this.c.c[this.d[i]];
                if (hVar.b != -1) {
                    float f = this.f[i];
                    a(hVar, true);
                    b bVar2 = bVarArr[hVar.b];
                    if (!bVar2.e) {
                        a aVar = bVar2.d;
                        int i3 = aVar.g;
                        for (int i4 = 0; i3 != -1 && i4 < aVar.a; i4++) {
                            a(this.c.c[aVar.d[i3]], aVar.f[i3] * f, true);
                            i3 = aVar.e[i3];
                        }
                    }
                    bVar.b += bVar2.b * f;
                    bVar2.a.b(bVar);
                    i = this.g;
                } else {
                    i = this.e[i];
                }
            }
            return;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final h a(boolean[] zArr, h hVar) {
        int i = this.g;
        h hVar2 = null;
        float f = 0.0f;
        for (int i2 = 0; i != -1 && i2 < this.a; i2++) {
            if (this.f[i] < 0.0f) {
                h hVar3 = this.c.c[this.d[i]];
                if ((zArr == null || !zArr[hVar3.a]) && hVar3 != hVar && (hVar3.f == h.a.c || hVar3.f == h.a.d)) {
                    float f2 = this.f[i];
                    if (f2 < f) {
                        hVar2 = hVar3;
                        f = f2;
                    }
                }
            }
            i = this.e[i];
        }
        return hVar2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final h a(int i) {
        int i2 = this.g;
        for (int i3 = 0; i2 != -1 && i3 < this.a; i3++) {
            if (i3 == i) {
                return this.c.c[this.d[i2]];
            }
            i2 = this.e[i2];
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final float b(int i) {
        int i2 = this.g;
        for (int i3 = 0; i2 != -1 && i3 < this.a; i3++) {
            if (i3 == i) {
                return this.f[i2];
            }
            i2 = this.e[i2];
        }
        return 0.0f;
    }

    public final float a(h hVar) {
        int i = this.g;
        for (int i2 = 0; i != -1 && i2 < this.a; i2++) {
            if (this.d[i] == hVar.a) {
                return this.f[i];
            }
            i = this.e[i];
        }
        return 0.0f;
    }

    public final String toString() {
        String str = "";
        int i = this.g;
        for (int i2 = 0; i != -1 && i2 < this.a; i2++) {
            str = ((str + " -> ") + this.f[i] + " : ") + this.c.c[this.d[i]];
            i = this.e[i];
        }
        return str;
    }
}
