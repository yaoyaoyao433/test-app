package android.support.constraint.solver.widgets;

import java.util.Arrays;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class j extends f {
    protected f[] ar = new f[4];
    protected int as = 0;

    public final void a(f fVar) {
        if (this.as + 1 > this.ar.length) {
            this.ar = (f[]) Arrays.copyOf(this.ar, this.ar.length * 2);
        }
        this.ar[this.as] = fVar;
        this.as++;
    }

    public final void A() {
        this.as = 0;
    }
}
