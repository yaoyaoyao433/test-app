package android.support.design.widget;

import android.support.v4.view.ViewCompat;
import android.view.View;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class p {
    int a;
    int b;
    int c;
    private final View d;
    private int e;

    public p(View view) {
        this.d = view;
    }

    public final void a() {
        this.a = this.d.getTop();
        this.e = this.d.getLeft();
        b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b() {
        ViewCompat.offsetTopAndBottom(this.d, this.b - (this.d.getTop() - this.a));
        ViewCompat.offsetLeftAndRight(this.d, this.c - (this.d.getLeft() - this.e));
    }

    public final boolean a(int i) {
        if (this.b != i) {
            this.b = i;
            b();
            return true;
        }
        return false;
    }
}
