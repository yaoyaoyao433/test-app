package android.support.design.widget;

import android.content.Context;
import android.support.design.widget.CoordinatorLayout;
import android.util.AttributeSet;
import android.view.View;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class ViewOffsetBehavior<V extends View> extends CoordinatorLayout.a<V> {
    private p a;
    private int b;
    private int c;

    public ViewOffsetBehavior() {
        this.b = 0;
        this.c = 0;
    }

    public ViewOffsetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = 0;
        this.c = 0;
    }

    @Override // android.support.design.widget.CoordinatorLayout.a
    public boolean onLayoutChild(CoordinatorLayout coordinatorLayout, V v, int i) {
        a(coordinatorLayout, v, i);
        if (this.a == null) {
            this.a = new p(v);
        }
        this.a.a();
        if (this.b != 0) {
            this.a.a(this.b);
            this.b = 0;
        }
        if (this.c != 0) {
            p pVar = this.a;
            int i2 = this.c;
            if (pVar.c != i2) {
                pVar.c = i2;
                pVar.b();
            }
            this.c = 0;
            return true;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a(CoordinatorLayout coordinatorLayout, V v, int i) {
        coordinatorLayout.a(v, i);
    }

    public boolean a(int i) {
        if (this.a != null) {
            return this.a.a(i);
        }
        this.b = i;
        return false;
    }

    public int b() {
        if (this.a != null) {
            return this.a.b;
        }
        return 0;
    }
}
