package android.support.constraint.solver.widgets;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class h {
    public List<f> a;
    int b;
    int c;
    public boolean d;
    public final int[] e;
    List<f> f;
    List<f> g;
    HashSet<f> h;
    HashSet<f> i;
    List<f> j;
    List<f> k;

    /* JADX INFO: Access modifiers changed from: package-private */
    public h(List<f> list) {
        this.b = -1;
        this.c = -1;
        this.d = false;
        this.e = new int[]{this.b, this.c};
        this.f = new ArrayList();
        this.g = new ArrayList();
        this.h = new HashSet<>();
        this.i = new HashSet<>();
        this.j = new ArrayList();
        this.k = new ArrayList();
        this.a = list;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public h(List<f> list, boolean z) {
        this.b = -1;
        this.c = -1;
        this.d = false;
        this.e = new int[]{this.b, this.c};
        this.f = new ArrayList();
        this.g = new ArrayList();
        this.h = new HashSet<>();
        this.i = new HashSet<>();
        this.j = new ArrayList();
        this.k = new ArrayList();
        this.a = list;
        this.d = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Set<f> a(int i) {
        if (i == 0) {
            return this.h;
        }
        if (i == 1) {
            return this.i;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(f fVar, int i) {
        if (i == 0) {
            this.h.add(fVar);
        } else if (i == 1) {
            this.i.add(fVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(ArrayList<f> arrayList, f fVar) {
        if (fVar.ah) {
            return;
        }
        arrayList.add(fVar);
        fVar.ah = true;
        if (fVar.h()) {
            return;
        }
        if (fVar instanceof j) {
            j jVar = (j) fVar;
            int i = jVar.as;
            for (int i2 = 0; i2 < i; i2++) {
                a(arrayList, jVar.ar[i2]);
            }
        }
        int length = fVar.E.length;
        for (int i3 = 0; i3 < length; i3++) {
            e eVar = fVar.E[i3].d;
            if (eVar != null) {
                f fVar2 = eVar.b;
                if (eVar != null && fVar2 != fVar.H) {
                    a(arrayList, fVar2);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a() {
        int size = this.k.size();
        for (int i = 0; i < size; i++) {
            a(this.k.get(i));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0095  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void a(android.support.constraint.solver.widgets.f r7) {
        /*
            Method dump skipped, instructions count: 242
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.constraint.solver.widgets.h.a(android.support.constraint.solver.widgets.f):void");
    }
}
