package android.support.design.widget;

import android.content.Context;
import android.graphics.Rect;
import android.support.design.widget.CoordinatorLayout;
import android.support.v4.math.MathUtils;
import android.support.v4.view.GravityCompat;
import android.support.v4.view.ViewCompat;
import android.support.v4.view.WindowInsetsCompat;
import android.util.AttributeSet;
import android.view.View;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public abstract class HeaderScrollingViewBehavior extends ViewOffsetBehavior<View> {
    final Rect a;
    final Rect b;
    int c;
    int d;

    float a(View view) {
        return 1.0f;
    }

    abstract View a(List<View> list);

    public HeaderScrollingViewBehavior() {
        this.a = new Rect();
        this.b = new Rect();
        this.c = 0;
    }

    public HeaderScrollingViewBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = new Rect();
        this.b = new Rect();
        this.c = 0;
    }

    @Override // android.support.design.widget.CoordinatorLayout.a
    public boolean onMeasureChild(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int i4) {
        View a;
        int i5 = view.getLayoutParams().height;
        if ((i5 == -1 || i5 == -2) && (a = a(coordinatorLayout.a(view))) != null) {
            if (ViewCompat.getFitsSystemWindows(a) && !ViewCompat.getFitsSystemWindows(view)) {
                ViewCompat.setFitsSystemWindows(view, true);
                if (ViewCompat.getFitsSystemWindows(view)) {
                    view.requestLayout();
                    return true;
                }
            }
            int size = View.MeasureSpec.getSize(i3);
            if (size == 0) {
                size = coordinatorLayout.getHeight();
            }
            coordinatorLayout.a(view, i, i2, View.MeasureSpec.makeMeasureSpec((size - a.getMeasuredHeight()) + b(a), i5 == -1 ? 1073741824 : Integer.MIN_VALUE), i4);
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.design.widget.ViewOffsetBehavior
    public final void a(CoordinatorLayout coordinatorLayout, View view, int i) {
        View a = a(coordinatorLayout.a(view));
        if (a != null) {
            CoordinatorLayout.c cVar = (CoordinatorLayout.c) view.getLayoutParams();
            Rect rect = this.a;
            rect.set(coordinatorLayout.getPaddingLeft() + cVar.leftMargin, a.getBottom() + cVar.topMargin, (coordinatorLayout.getWidth() - coordinatorLayout.getPaddingRight()) - cVar.rightMargin, ((coordinatorLayout.getHeight() + a.getBottom()) - coordinatorLayout.getPaddingBottom()) - cVar.bottomMargin);
            WindowInsetsCompat lastWindowInsets = coordinatorLayout.getLastWindowInsets();
            if (lastWindowInsets != null && ViewCompat.getFitsSystemWindows(coordinatorLayout) && !ViewCompat.getFitsSystemWindows(view)) {
                rect.left += lastWindowInsets.getSystemWindowInsetLeft();
                rect.right -= lastWindowInsets.getSystemWindowInsetRight();
            }
            Rect rect2 = this.b;
            int i2 = cVar.c;
            GravityCompat.apply(i2 == 0 ? 8388659 : i2, view.getMeasuredWidth(), view.getMeasuredHeight(), rect, rect2, i);
            int c = c(a);
            view.layout(rect2.left, rect2.top - c, rect2.right, rect2.bottom - c);
            this.c = rect2.top - a.getBottom();
            return;
        }
        super.a(coordinatorLayout, view, i);
        this.c = 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int c(View view) {
        if (this.d == 0) {
            return 0;
        }
        return MathUtils.clamp((int) (a(view) * this.d), 0, this.d);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int b(View view) {
        return view.getMeasuredHeight();
    }
}
