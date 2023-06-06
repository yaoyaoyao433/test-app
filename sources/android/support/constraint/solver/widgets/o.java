package android.support.constraint.solver.widgets;

import java.util.HashSet;
import java.util.Iterator;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class o {
    HashSet<o> h = new HashSet<>(2);
    public int i = 0;

    public void a() {
    }

    public final void a(o oVar) {
        this.h.add(oVar);
    }

    public void b() {
        this.i = 0;
        this.h.clear();
    }

    public final void c() {
        this.i = 0;
        Iterator<o> it = this.h.iterator();
        while (it.hasNext()) {
            it.next().c();
        }
    }

    public final void d() {
        this.i = 1;
        Iterator<o> it = this.h.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
    }

    public final boolean e() {
        return this.i == 1;
    }
}
