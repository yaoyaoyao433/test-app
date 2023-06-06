package android.support.constraint.solver.widgets;

import java.util.ArrayList;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class p {
    int a;
    int b;
    int c;
    int d;
    ArrayList<a> e = new ArrayList<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static class a {
        e a;
        e b;
        int c;
        int d;
        int e;

        public a(e eVar) {
            this.a = eVar;
            this.b = eVar.d;
            this.c = eVar.a();
            this.d = eVar.g;
            this.e = eVar.h;
        }
    }

    public p(f fVar) {
        this.a = fVar.k();
        this.b = fVar.l();
        this.c = fVar.m();
        this.d = fVar.n();
        ArrayList<e> v = fVar.v();
        int size = v.size();
        for (int i = 0; i < size; i++) {
            this.e.add(new a(v.get(i)));
        }
    }

    public final void a(f fVar) {
        fVar.c(this.a);
        fVar.d(this.b);
        fVar.e(this.c);
        fVar.f(this.d);
        int size = this.e.size();
        for (int i = 0; i < size; i++) {
            a aVar = this.e.get(i);
            fVar.a(aVar.a.c).a(aVar.b, aVar.c, -1, aVar.d, aVar.e, false);
        }
    }
}
