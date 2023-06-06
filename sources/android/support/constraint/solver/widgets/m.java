package android.support.constraint.solver.widgets;

import android.support.constraint.solver.widgets.e;
import com.meituan.robust.common.CommonConstant;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class m extends o {
    e a;
    float b;
    m c;
    float d;
    m e;
    public float f;
    private m j;
    private float k;
    int g = 0;
    private n l = null;
    private int m = 1;
    private n n = null;
    private int o = 1;

    private static String a(int i) {
        return i == 1 ? "DIRECT" : i == 2 ? "CENTER" : i == 3 ? "MATCH" : i == 4 ? "CHAIN" : i == 5 ? "BARRIER" : "UNCONNECTED";
    }

    public m(e eVar) {
        this.a = eVar;
    }

    public final String toString() {
        if (this.i == 1) {
            if (this.e == this) {
                return "[" + this.a + ", RESOLVED: " + this.f + "]  type: " + a(this.g);
            }
            return "[" + this.a + ", RESOLVED: " + this.e + CommonConstant.Symbol.COLON + this.f + "] type: " + a(this.g);
        }
        return "{ " + this.a + " UNRESOLVED} type: " + a(this.g);
    }

    public final void a(m mVar, float f) {
        if (this.i == 0 || !(this.e == mVar || this.f == f)) {
            this.e = mVar;
            this.f = f;
            if (this.i == 1) {
                c();
            }
            d();
        }
    }

    @Override // android.support.constraint.solver.widgets.o
    public final void a() {
        float f;
        float m;
        float f2;
        boolean z = true;
        if (this.i == 1 || this.g == 4) {
            return;
        }
        if (this.l != null) {
            if (this.l.i != 1) {
                return;
            }
            this.d = this.m * this.l.a;
        }
        if (this.n != null) {
            if (this.n.i != 1) {
                return;
            }
            this.k = this.o * this.n.a;
        }
        if (this.g == 1 && (this.c == null || this.c.i == 1)) {
            if (this.c == null) {
                this.e = this;
                this.f = this.d;
            } else {
                this.e = this.c.e;
                this.f = this.c.f + this.d;
            }
            d();
        } else if (this.g == 2 && this.c != null && this.c.i == 1 && this.j != null && this.j.c != null && this.j.c.i == 1) {
            if (android.support.constraint.solver.e.a() != null) {
                android.support.constraint.solver.e.a().w++;
            }
            this.e = this.c.e;
            this.j.e = this.j.c.e;
            int i = 0;
            if (this.a.c != e.c.RIGHT && this.a.c != e.c.BOTTOM) {
                z = false;
            }
            if (z) {
                f = this.c.f - this.j.c.f;
            } else {
                f = this.j.c.f - this.c.f;
            }
            if (this.a.c == e.c.LEFT || this.a.c == e.c.RIGHT) {
                m = f - this.a.b.m();
                f2 = this.a.b.Y;
            } else {
                m = f - this.a.b.n();
                f2 = this.a.b.Z;
            }
            int a = this.a.a();
            int a2 = this.j.a.a();
            if (this.a.d == this.j.a.d) {
                f2 = 0.5f;
                a2 = 0;
            } else {
                i = a;
            }
            float f3 = i;
            float f4 = a2;
            float f5 = (m - f3) - f4;
            if (z) {
                this.j.f = this.j.c.f + f4 + (f5 * f2);
                this.f = (this.c.f - f3) - (f5 * (1.0f - f2));
            } else {
                this.f = this.c.f + f3 + (f5 * f2);
                this.j.f = (this.j.c.f - f4) - (f5 * (1.0f - f2));
            }
            d();
            this.j.d();
        } else if (this.g == 3 && this.c != null && this.c.i == 1 && this.j != null && this.j.c != null && this.j.c.i == 1) {
            if (android.support.constraint.solver.e.a() != null) {
                android.support.constraint.solver.e.a().x++;
            }
            this.e = this.c.e;
            this.j.e = this.j.c.e;
            this.f = this.c.f + this.d;
            this.j.f = this.j.c.f + this.j.d;
            d();
            this.j.d();
        } else if (this.g == 5) {
            this.a.b.c();
        }
    }

    @Override // android.support.constraint.solver.widgets.o
    public final void b() {
        super.b();
        this.c = null;
        this.d = 0.0f;
        this.l = null;
        this.m = 1;
        this.n = null;
        this.o = 1;
        this.e = null;
        this.f = 0.0f;
        this.b = 0.0f;
        this.j = null;
        this.k = 0.0f;
        this.g = 0;
    }

    public final void a(int i, m mVar, int i2) {
        this.g = 1;
        this.c = mVar;
        this.d = i2;
        this.c.a(this);
    }

    public final void a(m mVar, int i) {
        this.c = mVar;
        this.d = i;
        this.c.a(this);
    }

    public final void a(m mVar, int i, n nVar) {
        this.c = mVar;
        this.c.a(this);
        this.l = nVar;
        this.m = i;
        this.l.a(this);
    }

    public final void b(m mVar, float f) {
        this.j = mVar;
        this.k = f;
    }

    public final void b(m mVar, int i, n nVar) {
        this.j = mVar;
        this.n = nVar;
        this.o = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(android.support.constraint.solver.e eVar) {
        android.support.constraint.solver.h hVar = this.a.i;
        if (this.e == null) {
            eVar.a(hVar, (int) (this.f + 0.5f));
        } else {
            eVar.c(hVar, eVar.a(this.e.a), (int) (this.f + 0.5f), 6);
        }
    }
}
