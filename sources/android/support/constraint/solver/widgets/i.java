package android.support.constraint.solver.widgets;

import android.support.constraint.solver.widgets.e;
import android.support.constraint.solver.widgets.f;
import java.util.ArrayList;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class i extends f {
    protected float a = -1.0f;
    protected int b = -1;
    protected int ar = -1;
    private e as = this.x;
    private int at = 0;
    private boolean au = false;
    private int av = 0;
    private l aw = new l();
    private int ax = 8;

    @Override // android.support.constraint.solver.widgets.f
    public final boolean a() {
        return true;
    }

    public i() {
        this.F.clear();
        this.F.add(this.as);
        int length = this.E.length;
        for (int i = 0; i < length; i++) {
            this.E[i] = this.as;
        }
    }

    public final void m(int i) {
        if (this.at == i) {
            return;
        }
        this.at = i;
        this.F.clear();
        if (this.at == 1) {
            this.as = this.w;
        } else {
            this.as = this.x;
        }
        this.F.add(this.as);
        int length = this.E.length;
        for (int i2 = 0; i2 < length; i2++) {
            this.E[i2] = this.as;
        }
    }

    @Override // android.support.constraint.solver.widgets.f
    public final e a(e.c cVar) {
        switch (cVar) {
            case LEFT:
            case RIGHT:
                if (this.at == 1) {
                    return this.as;
                }
                break;
            case TOP:
            case BOTTOM:
                if (this.at == 0) {
                    return this.as;
                }
                break;
            case BASELINE:
            case CENTER:
            case CENTER_X:
            case CENTER_Y:
            case NONE:
                return null;
        }
        throw new AssertionError(cVar.name());
    }

    @Override // android.support.constraint.solver.widgets.f
    public final ArrayList<e> v() {
        return this.F;
    }

    public final void a(float f) {
        if (f > -1.0f) {
            this.a = f;
            this.b = -1;
            this.ar = -1;
        }
    }

    public final void n(int i) {
        if (i >= 0) {
            this.a = -1.0f;
            this.b = i;
            this.ar = -1;
        }
    }

    public final void o(int i) {
        if (i >= 0) {
            this.a = -1.0f;
            this.b = -1;
            this.ar = i;
        }
    }

    @Override // android.support.constraint.solver.widgets.f
    public final void a(int i) {
        f fVar = this.H;
        if (fVar == null) {
            return;
        }
        if (this.at == 1) {
            this.x.a.a(1, fVar.x.a, 0);
            this.z.a.a(1, fVar.x.a, 0);
            if (this.b != -1) {
                this.w.a.a(1, fVar.w.a, this.b);
                this.y.a.a(1, fVar.w.a, this.b);
                return;
            } else if (this.ar != -1) {
                this.w.a.a(1, fVar.y.a, -this.ar);
                this.y.a.a(1, fVar.y.a, -this.ar);
                return;
            } else if (this.a == -1.0f || fVar.y() != f.a.a) {
                return;
            } else {
                int i2 = (int) (fVar.I * this.a);
                this.w.a.a(1, fVar.w.a, i2);
                this.y.a.a(1, fVar.w.a, i2);
                return;
            }
        }
        this.w.a.a(1, fVar.w.a, 0);
        this.y.a.a(1, fVar.w.a, 0);
        if (this.b != -1) {
            this.x.a.a(1, fVar.x.a, this.b);
            this.z.a.a(1, fVar.x.a, this.b);
        } else if (this.ar != -1) {
            this.x.a.a(1, fVar.z.a, -this.ar);
            this.z.a.a(1, fVar.z.a, -this.ar);
        } else if (this.a == -1.0f || fVar.z() != f.a.a) {
        } else {
            int i3 = (int) (fVar.J * this.a);
            this.x.a.a(1, fVar.x.a, i3);
            this.z.a.a(1, fVar.x.a, i3);
        }
    }

    @Override // android.support.constraint.solver.widgets.f
    public final void a(android.support.constraint.solver.e eVar) {
        g gVar = (g) this.H;
        if (gVar == null) {
            return;
        }
        e a = gVar.a(e.c.LEFT);
        e a2 = gVar.a(e.c.RIGHT);
        boolean z = this.H != null && this.H.G[0] == f.a.b;
        if (this.at == 0) {
            a = gVar.a(e.c.TOP);
            a2 = gVar.a(e.c.BOTTOM);
            z = this.H != null && this.H.G[1] == f.a.b;
        }
        if (this.b != -1) {
            android.support.constraint.solver.h a3 = eVar.a(this.as);
            eVar.c(a3, eVar.a(a), this.b, 6);
            if (z) {
                eVar.a(eVar.a(a2), a3, 0, 5);
            }
        } else if (this.ar != -1) {
            android.support.constraint.solver.h a4 = eVar.a(this.as);
            android.support.constraint.solver.h a5 = eVar.a(a2);
            eVar.c(a4, a5, -this.ar, 6);
            if (z) {
                eVar.a(a4, eVar.a(a), 0, 5);
                eVar.a(a5, a4, 0, 5);
            }
        } else if (this.a != -1.0f) {
            eVar.a(android.support.constraint.solver.e.a(eVar, eVar.a(this.as), eVar.a(a), eVar.a(a2), this.a, this.au));
        }
    }

    @Override // android.support.constraint.solver.widgets.f
    public final void c(android.support.constraint.solver.e eVar) {
        if (this.H == null) {
            return;
        }
        int b = android.support.constraint.solver.e.b(this.as);
        if (this.at == 1) {
            c(b);
            d(0);
            f(this.H.n());
            e(0);
            return;
        }
        c(0);
        d(b);
        e(this.H.m());
        f(0);
    }
}
