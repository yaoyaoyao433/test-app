package android.support.constraint.solver.widgets;

import java.util.ArrayList;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class q extends f {
    protected ArrayList<f> aK = new ArrayList<>();

    @Override // android.support.constraint.solver.widgets.f
    public void f() {
        this.aK.clear();
        super.f();
    }

    public final void a(f fVar) {
        this.aK.add(fVar);
        if (fVar.H != null) {
            ((q) fVar.H).b(fVar);
        }
        fVar.H = this;
    }

    public final void b(f fVar) {
        this.aK.remove(fVar);
        fVar.H = null;
    }

    @Override // android.support.constraint.solver.widgets.f
    public final void b(int i, int i2) {
        super.b(i, i2);
        int size = this.aK.size();
        for (int i3 = 0; i3 < size; i3++) {
            this.aK.get(i3).b(q(), r());
        }
    }

    @Override // android.support.constraint.solver.widgets.f
    public final void w() {
        super.w();
        if (this.aK == null) {
            return;
        }
        int size = this.aK.size();
        for (int i = 0; i < size; i++) {
            f fVar = this.aK.get(i);
            fVar.b(o(), p());
            if (!(fVar instanceof g)) {
                fVar.w();
            }
        }
    }

    public void A() {
        w();
        if (this.aK == null) {
            return;
        }
        int size = this.aK.size();
        for (int i = 0; i < size; i++) {
            f fVar = this.aK.get(i);
            if (fVar instanceof q) {
                ((q) fVar).A();
            }
        }
    }

    @Override // android.support.constraint.solver.widgets.f
    public final void a(android.support.constraint.solver.c cVar) {
        super.a(cVar);
        int size = this.aK.size();
        for (int i = 0; i < size; i++) {
            this.aK.get(i).a(cVar);
        }
    }

    public final void E() {
        this.aK.clear();
    }

    public final g D() {
        f fVar = this.H;
        g gVar = (g) this;
        while (fVar != null) {
            f fVar2 = fVar.H;
            if (fVar instanceof g) {
                gVar = (g) fVar;
            }
            fVar = fVar2;
        }
        return gVar;
    }
}
