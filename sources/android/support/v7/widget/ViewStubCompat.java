package android.support.v7.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.support.annotation.RestrictTo;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.lang.ref.WeakReference;
/* compiled from: ProGuard */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes.dex */
public final class ViewStubCompat extends View {
    private int a;
    private int b;
    private WeakReference<View> c;
    private LayoutInflater d;
    private a e;

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public interface a {
    }

    @Override // android.view.View
    protected final void dispatchDraw(Canvas canvas) {
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
    }

    public ViewStubCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ViewStubCompat(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{16842960, 16842994, 16842995}, i, 0);
        this.b = obtainStyledAttributes.getResourceId(2, -1);
        this.a = obtainStyledAttributes.getResourceId(1, 0);
        setId(obtainStyledAttributes.getResourceId(0, -1));
        obtainStyledAttributes.recycle();
        setVisibility(8);
        setWillNotDraw(true);
    }

    public final int getInflatedId() {
        return this.b;
    }

    public final void setInflatedId(int i) {
        this.b = i;
    }

    public final int getLayoutResource() {
        return this.a;
    }

    public final void setLayoutResource(int i) {
        this.a = i;
    }

    public final void setLayoutInflater(LayoutInflater layoutInflater) {
        this.d = layoutInflater;
    }

    public final LayoutInflater getLayoutInflater() {
        return this.d;
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View
    public final void setVisibility(int i) {
        if (this.c != null) {
            View view = this.c.get();
            if (view != null) {
                view.setVisibility(i);
                return;
            }
            throw new IllegalStateException("setVisibility called on un-referenced view");
        }
        super.setVisibility(i);
        if (i == 0 || i == 4) {
            a();
        }
    }

    public final View a() {
        LayoutInflater from;
        ViewParent parent = getParent();
        if (parent != null && (parent instanceof ViewGroup)) {
            if (this.a != 0) {
                ViewGroup viewGroup = (ViewGroup) parent;
                if (this.d != null) {
                    from = this.d;
                } else {
                    from = LayoutInflater.from(getContext());
                }
                View inflate = from.inflate(this.a, viewGroup, false);
                if (this.b != -1) {
                    inflate.setId(this.b);
                }
                int indexOfChild = viewGroup.indexOfChild(this);
                viewGroup.removeViewInLayout(this);
                ViewGroup.LayoutParams layoutParams = getLayoutParams();
                if (layoutParams != null) {
                    viewGroup.addView(inflate, indexOfChild, layoutParams);
                } else {
                    viewGroup.addView(inflate, indexOfChild);
                }
                this.c = new WeakReference<>(inflate);
                return inflate;
            }
            throw new IllegalArgumentException("ViewStub must have a valid layoutResource");
        }
        throw new IllegalStateException("ViewStub must have a non-null ViewGroup viewParent");
    }

    public final void setOnInflateListener(a aVar) {
        this.e = aVar;
    }
}
