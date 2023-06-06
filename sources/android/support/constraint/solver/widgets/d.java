package android.support.constraint.solver.widgets;

import android.support.constraint.solver.widgets.f;
import java.util.ArrayList;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class d {
    protected f a;
    protected f b;
    protected f c;
    protected f d;
    protected f e;
    protected f f;
    protected f g;
    protected ArrayList<f> h;
    protected int i;
    protected int j;
    protected float k = 0.0f;
    protected boolean l;
    protected boolean m;
    protected boolean n;
    boolean o;
    private int p;
    private boolean q;

    public d(f fVar, int i, boolean z) {
        this.q = false;
        this.a = fVar;
        this.p = i;
        this.q = z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a() {
        int i = this.p * 2;
        f fVar = this.a;
        f fVar2 = this.a;
        boolean z = false;
        f fVar3 = fVar;
        boolean z2 = false;
        while (!z2) {
            this.i++;
            f fVar4 = null;
            fVar2.ao[this.p] = null;
            fVar2.an[this.p] = null;
            if (fVar2.ab != 8) {
                if (this.b == null) {
                    this.b = fVar2;
                }
                this.d = fVar2;
                if (fVar2.G[this.p] == f.a.c && (fVar2.i[this.p] == 0 || fVar2.i[this.p] == 3 || fVar2.i[this.p] == 2)) {
                    this.j++;
                    float f = fVar2.am[this.p];
                    if (f > 0.0f) {
                        this.k += fVar2.am[this.p];
                    }
                    int i2 = this.p;
                    if (fVar2.ab != 8 && fVar2.G[i2] == f.a.c && (fVar2.i[i2] == 0 || fVar2.i[i2] == 3)) {
                        if (f < 0.0f) {
                            this.l = true;
                        } else {
                            this.m = true;
                        }
                        if (this.h == null) {
                            this.h = new ArrayList<>();
                        }
                        this.h.add(fVar2);
                    }
                    if (this.f == null) {
                        this.f = fVar2;
                    }
                    if (this.g != null) {
                        this.g.an[this.p] = fVar2;
                    }
                    this.g = fVar2;
                }
            }
            if (fVar3 != fVar2) {
                fVar3.ao[this.p] = fVar2;
            }
            e eVar = fVar2.E[i + 1].d;
            if (eVar != null) {
                f fVar5 = eVar.b;
                if (fVar5.E[i].d != null && fVar5.E[i].d.b == fVar2) {
                    fVar4 = fVar5;
                }
            }
            if (fVar4 != null) {
                fVar3 = fVar2;
                fVar2 = fVar4;
            } else {
                fVar3 = fVar2;
                z2 = true;
            }
        }
        this.c = fVar2;
        if (this.p == 0 && this.q) {
            this.e = this.c;
        } else {
            this.e = this.a;
        }
        if (this.m && this.l) {
            z = true;
        }
        this.n = z;
    }
}
