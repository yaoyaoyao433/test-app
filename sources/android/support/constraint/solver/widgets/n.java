package android.support.constraint.solver.widgets;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class n extends o {
    float a = 0.0f;

    @Override // android.support.constraint.solver.widgets.o
    public final void b() {
        super.b();
        this.a = 0.0f;
    }

    public final void a(int i) {
        if (this.i == 0 || this.a != i) {
            this.a = i;
            if (this.i == 1) {
                c();
            }
            d();
        }
    }
}
