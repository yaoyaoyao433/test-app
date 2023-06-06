package android.support.constraint.solver.widgets;

import android.support.constraint.solver.widgets.f;
import java.util.ArrayList;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class b extends j {
    public int a = 0;
    private ArrayList<m> at = new ArrayList<>(4);
    public boolean b = true;

    @Override // android.support.constraint.solver.widgets.f
    public final boolean a() {
        return true;
    }

    @Override // android.support.constraint.solver.widgets.f
    public final void b() {
        super.b();
        this.at.clear();
    }

    @Override // android.support.constraint.solver.widgets.f
    public final void a(int i) {
        m mVar;
        m mVar2;
        if (this.H != null && ((g) this.H).m(2)) {
            switch (this.a) {
                case 0:
                    mVar = this.w.a;
                    break;
                case 1:
                    mVar = this.y.a;
                    break;
                case 2:
                    mVar = this.x.a;
                    break;
                case 3:
                    mVar = this.z.a;
                    break;
                default:
                    return;
            }
            mVar.g = 5;
            if (this.a == 0 || this.a == 1) {
                this.x.a.a((m) null, 0.0f);
                this.z.a.a((m) null, 0.0f);
            } else {
                this.w.a.a((m) null, 0.0f);
                this.y.a.a((m) null, 0.0f);
            }
            this.at.clear();
            for (int i2 = 0; i2 < this.as; i2++) {
                f fVar = this.ar[i2];
                if (this.b || fVar.a()) {
                    switch (this.a) {
                        case 0:
                            mVar2 = fVar.w.a;
                            break;
                        case 1:
                            mVar2 = fVar.y.a;
                            break;
                        case 2:
                            mVar2 = fVar.x.a;
                            break;
                        case 3:
                            mVar2 = fVar.z.a;
                            break;
                        default:
                            mVar2 = null;
                            break;
                    }
                    if (mVar2 != null) {
                        this.at.add(mVar2);
                        mVar2.a(mVar);
                    }
                }
            }
        }
    }

    @Override // android.support.constraint.solver.widgets.f
    public final void c() {
        m mVar;
        float f = Float.MAX_VALUE;
        switch (this.a) {
            case 0:
                mVar = this.w.a;
                break;
            case 1:
                mVar = this.y.a;
                f = 0.0f;
                break;
            case 2:
                mVar = this.x.a;
                break;
            case 3:
                mVar = this.z.a;
                f = 0.0f;
                break;
            default:
                return;
        }
        int size = this.at.size();
        m mVar2 = null;
        for (int i = 0; i < size; i++) {
            m mVar3 = this.at.get(i);
            if (mVar3.i != 1) {
                return;
            }
            if (this.a == 0 || this.a == 2) {
                if (mVar3.f < f) {
                    f = mVar3.f;
                    mVar2 = mVar3.e;
                }
            } else if (mVar3.f > f) {
                f = mVar3.f;
                mVar2 = mVar3.e;
            }
        }
        if (android.support.constraint.solver.e.a() != null) {
            android.support.constraint.solver.e.a().z++;
        }
        mVar.e = mVar2;
        mVar.f = f;
        mVar.d();
        switch (this.a) {
            case 0:
                this.y.a.a(mVar2, f);
                return;
            case 1:
                this.w.a.a(mVar2, f);
                return;
            case 2:
                this.z.a.a(mVar2, f);
                return;
            case 3:
                this.x.a.a(mVar2, f);
                return;
            default:
                return;
        }
    }

    @Override // android.support.constraint.solver.widgets.f
    public final void a(android.support.constraint.solver.e eVar) {
        boolean z;
        this.E[0] = this.w;
        this.E[2] = this.x;
        this.E[1] = this.y;
        this.E[3] = this.z;
        for (int i = 0; i < this.E.length; i++) {
            this.E[i].i = eVar.a(this.E[i]);
        }
        if (this.a < 0 || this.a >= 4) {
            return;
        }
        e eVar2 = this.E[this.a];
        for (int i2 = 0; i2 < this.as; i2++) {
            f fVar = this.ar[i2];
            if ((this.b || fVar.a()) && (((this.a == 0 || this.a == 1) && fVar.y() == f.a.c) || ((this.a == 2 || this.a == 3) && fVar.z() == f.a.c))) {
                z = true;
                break;
            }
        }
        z = false;
        if (this.a == 0 || this.a == 1 ? this.H.y() == f.a.b : this.H.z() == f.a.b) {
            z = false;
        }
        for (int i3 = 0; i3 < this.as; i3++) {
            f fVar2 = this.ar[i3];
            if (this.b || fVar2.a()) {
                android.support.constraint.solver.h a = eVar.a(fVar2.E[this.a]);
                fVar2.E[this.a].i = a;
                if (this.a == 0 || this.a == 2) {
                    android.support.constraint.solver.h hVar = eVar2.i;
                    android.support.constraint.solver.b c = eVar.c();
                    android.support.constraint.solver.h d = eVar.d();
                    d.c = 0;
                    c.b(hVar, a, d, 0);
                    if (z) {
                        eVar.a(c, (int) (c.d.a(d) * (-1.0f)), 1);
                    }
                    eVar.a(c);
                } else {
                    android.support.constraint.solver.h hVar2 = eVar2.i;
                    android.support.constraint.solver.b c2 = eVar.c();
                    android.support.constraint.solver.h d2 = eVar.d();
                    d2.c = 0;
                    c2.a(hVar2, a, d2, 0);
                    if (z) {
                        eVar.a(c2, (int) (c2.d.a(d2) * (-1.0f)), 1);
                    }
                    eVar.a(c2);
                }
            }
        }
        if (this.a == 0) {
            eVar.c(this.y.i, this.w.i, 0, 6);
            if (z) {
                return;
            }
            eVar.c(this.w.i, this.H.y.i, 0, 5);
        } else if (this.a == 1) {
            eVar.c(this.w.i, this.y.i, 0, 6);
            if (z) {
                return;
            }
            eVar.c(this.w.i, this.H.w.i, 0, 5);
        } else if (this.a == 2) {
            eVar.c(this.z.i, this.x.i, 0, 6);
            if (z) {
                return;
            }
            eVar.c(this.x.i, this.H.z.i, 0, 5);
        } else if (this.a == 3) {
            eVar.c(this.x.i, this.z.i, 0, 6);
            if (z) {
                return;
            }
            eVar.c(this.x.i, this.H.x.i, 0, 5);
        }
    }
}
