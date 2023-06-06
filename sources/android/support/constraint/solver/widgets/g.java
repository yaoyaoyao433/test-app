package android.support.constraint.solver.widgets;

import android.support.constraint.solver.widgets.e;
import android.support.constraint.solver.widgets.f;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class g extends q {
    private p aL;
    int ar;
    int as;
    int at;
    int au;
    public boolean a = false;
    protected android.support.constraint.solver.e b = new android.support.constraint.solver.e();
    int av = 0;
    int aw = 0;
    d[] ax = new d[4];
    d[] ay = new d[4];
    public List<h> az = new ArrayList();
    public boolean aA = false;
    public boolean aB = false;
    public boolean aC = false;
    public int aD = 0;
    public int aE = 0;
    public int aF = 7;
    public boolean aG = false;
    public boolean aH = false;
    public boolean aI = false;
    int aJ = 0;

    public final boolean m(int i) {
        return (this.aF & i) == i;
    }

    @Override // android.support.constraint.solver.widgets.q, android.support.constraint.solver.widgets.f
    public final void f() {
        this.b.b();
        this.ar = 0;
        this.at = 0;
        this.as = 0;
        this.au = 0;
        this.az.clear();
        this.aG = false;
        super.f();
    }

    private void a(android.support.constraint.solver.e eVar, boolean[] zArr) {
        zArr[2] = false;
        c(eVar);
        int size = this.aK.size();
        for (int i = 0; i < size; i++) {
            f fVar = this.aK.get(i);
            fVar.c(eVar);
            if (fVar.G[0] == f.a.c && fVar.m() < fVar.V) {
                zArr[2] = true;
            }
            if (fVar.G[1] == f.a.c && fVar.n() < fVar.W) {
                zArr[2] = true;
            }
        }
    }

    @Override // android.support.constraint.solver.widgets.f
    public final void a(int i) {
        super.a(i);
        int size = this.aK.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.aK.get(i2).a(i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:152:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x030b  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x034d  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x035c A[LOOP:6: B:172:0x035a->B:173:0x035c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:186:0x03bd A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:190:0x03d2  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x03ee  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x03fb  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x03fe  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0439 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v19, types: [boolean] */
    /* JADX WARN: Type inference failed for: r8v20 */
    @Override // android.support.constraint.solver.widgets.q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A() {
        /*
            Method dump skipped, instructions count: 1231
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.constraint.solver.widgets.g.A():void");
    }

    public final void B() {
        m mVar = a(e.c.LEFT).a;
        m mVar2 = a(e.c.TOP).a;
        mVar.a((m) null, 0.0f);
        mVar2.a((m) null, 0.0f);
    }

    public final void f(int i, int i2) {
        if (this.G[0] != f.a.b && this.e != null) {
            this.e.a(i);
        }
        if (this.G[1] == f.a.b || this.f == null) {
            return;
        }
        this.f.a(i2);
    }

    public final void C() {
        int size = this.aK.size();
        b();
        for (int i = 0; i < size; i++) {
            this.aK.get(i).b();
        }
    }

    private void F() {
        this.av = 0;
        this.aw = 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(f fVar, int i) {
        if (i == 0) {
            c(fVar);
        } else if (i == 1) {
            d(fVar);
        }
    }

    private void c(f fVar) {
        if (this.av + 1 >= this.ay.length) {
            this.ay = (d[]) Arrays.copyOf(this.ay, this.ay.length * 2);
        }
        this.ay[this.av] = new d(fVar, 0, this.a);
        this.av++;
    }

    private void d(f fVar) {
        if (this.aw + 1 >= this.ax.length) {
            this.ax = (d[]) Arrays.copyOf(this.ax, this.ax.length * 2);
        }
        this.ax[this.aw] = new d(fVar, 1, this.a);
        this.aw++;
    }
}
