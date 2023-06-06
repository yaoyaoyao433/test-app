package android.support.constraint.solver;

import android.support.constraint.solver.e;
import com.meituan.robust.common.StringUtil;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class b implements e.a {
    public final a d;
    h a = null;
    float b = 0.0f;
    boolean c = false;
    public boolean e = false;

    public b(c cVar) {
        this.d = new a(this, cVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean a(h hVar) {
        a aVar = this.d;
        if (aVar.g != -1) {
            int i = aVar.g;
            for (int i2 = 0; i != -1 && i2 < aVar.a; i2++) {
                if (aVar.d[i] == hVar.a) {
                    return true;
                }
                i = aVar.e[i];
            }
        }
        return false;
    }

    public final b a(h hVar, h hVar2, h hVar3, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.b = i;
        }
        if (!z) {
            this.d.a(hVar, -1.0f);
            this.d.a(hVar2, 1.0f);
            this.d.a(hVar3, 1.0f);
        } else {
            this.d.a(hVar, 1.0f);
            this.d.a(hVar2, -1.0f);
            this.d.a(hVar3, -1.0f);
        }
        return this;
    }

    public final b b(h hVar, h hVar2, h hVar3, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.b = i;
        }
        if (!z) {
            this.d.a(hVar, -1.0f);
            this.d.a(hVar2, 1.0f);
            this.d.a(hVar3, -1.0f);
        } else {
            this.d.a(hVar, 1.0f);
            this.d.a(hVar2, -1.0f);
            this.d.a(hVar3, 1.0f);
        }
        return this;
    }

    public final b a(float f, float f2, float f3, h hVar, h hVar2, h hVar3, h hVar4) {
        this.b = 0.0f;
        if (f2 == 0.0f || f == f3) {
            this.d.a(hVar, 1.0f);
            this.d.a(hVar2, -1.0f);
            this.d.a(hVar4, 1.0f);
            this.d.a(hVar3, -1.0f);
        } else if (f == 0.0f) {
            this.d.a(hVar, 1.0f);
            this.d.a(hVar2, -1.0f);
        } else if (f3 == 0.0f) {
            this.d.a(hVar3, 1.0f);
            this.d.a(hVar4, -1.0f);
        } else {
            float f4 = (f / f2) / (f3 / f2);
            this.d.a(hVar, 1.0f);
            this.d.a(hVar2, -1.0f);
            this.d.a(hVar4, f4);
            this.d.a(hVar3, -f4);
        }
        return this;
    }

    public final b a(e eVar, int i) {
        this.d.a(eVar.a(i, "ep"), 1.0f);
        this.d.a(eVar.a(i, "em"), -1.0f);
        return this;
    }

    public final b a(h hVar, h hVar2, h hVar3, h hVar4, float f) {
        this.d.a(hVar, -1.0f);
        this.d.a(hVar2, 1.0f);
        this.d.a(hVar3, f);
        this.d.a(hVar4, -f);
        return this;
    }

    public final b b(h hVar, h hVar2, h hVar3, h hVar4, float f) {
        this.d.a(hVar3, 0.5f);
        this.d.a(hVar4, 0.5f);
        this.d.a(hVar, -0.5f);
        this.d.a(hVar2, -0.5f);
        this.b = -f;
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(h hVar) {
        if (this.a != null) {
            this.d.a(this.a, -1.0f);
            this.a = null;
        }
        float a = this.d.a(hVar, true) * (-1.0f);
        this.a = hVar;
        if (a == 1.0f) {
            return;
        }
        this.b /= a;
        this.d.a(a);
    }

    @Override // android.support.constraint.solver.e.a
    public final h a(e eVar, boolean[] zArr) {
        return this.d.a(zArr, (h) null);
    }

    @Override // android.support.constraint.solver.e.a
    public final void a() {
        this.d.a();
        this.a = null;
        this.b = 0.0f;
    }

    @Override // android.support.constraint.solver.e.a
    public final void a(e.a aVar) {
        if (aVar instanceof b) {
            b bVar = (b) aVar;
            this.a = null;
            this.d.a();
            for (int i = 0; i < bVar.d.a; i++) {
                this.d.a(bVar.d.a(i), bVar.d.b(i), true);
            }
        }
    }

    @Override // android.support.constraint.solver.e.a
    public void c(h hVar) {
        float f = 1.0f;
        if (hVar.c != 1) {
            if (hVar.c == 2) {
                f = 1000.0f;
            } else if (hVar.c == 3) {
                f = 1000000.0f;
            } else if (hVar.c == 4) {
                f = 1.0E9f;
            } else if (hVar.c == 5) {
                f = 1.0E12f;
            }
        }
        this.d.a(hVar, f);
    }

    @Override // android.support.constraint.solver.e.a
    public final h b() {
        return this.a;
    }

    public String toString() {
        String str;
        boolean z;
        float b;
        int i;
        String str2 = (this.a == null ? "0" : "" + this.a) + " = ";
        if (this.b != 0.0f) {
            str = str2 + this.b;
            z = true;
        } else {
            str = str2;
            z = false;
        }
        int i2 = this.d.a;
        for (int i3 = 0; i3 < i2; i3++) {
            h a = this.d.a(i3);
            if (a != null && (this.d.b(i3)) != 0.0f) {
                String hVar = a.toString();
                if (z) {
                    if (i > 0) {
                        str = str + " + ";
                    } else {
                        str = str + " - ";
                        b *= -1.0f;
                    }
                } else if (b < 0.0f) {
                    str = str + "- ";
                    b *= -1.0f;
                }
                str = b == 1.0f ? str + hVar : str + b + StringUtil.SPACE + hVar;
                z = true;
            }
        }
        if (z) {
            return str;
        }
        return str + "0.0";
    }
}
