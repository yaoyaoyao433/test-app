package android.support.v7.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.annotation.RestrictTo;
import android.support.v4.graphics.drawable.DrawableCompat;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ListAdapter;
import android.widget.ListView;
import java.lang.reflect.Field;
/* compiled from: ProGuard */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes.dex */
public class ListViewCompat extends ListView {
    private static final int[] g = {0};
    final Rect a;
    int b;
    int c;
    int d;
    int e;
    protected int f;
    private Field h;
    private a i;

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean a() {
        return false;
    }

    public ListViewCompat(Context context) {
        this(context, null);
    }

    private ListViewCompat(Context context, AttributeSet attributeSet) {
        this(context, null, 0);
    }

    public ListViewCompat(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = new Rect();
        this.b = 0;
        this.c = 0;
        this.d = 0;
        this.e = 0;
        try {
            this.h = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
            this.h.setAccessible(true);
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
    }

    @Override // android.widget.AbsListView
    public void setSelector(Drawable drawable) {
        this.i = drawable != null ? new a(drawable) : null;
        super.setSelector(this.i);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.b = rect.left;
        this.c = rect.top;
        this.d = rect.right;
        this.e = rect.bottom;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        boolean z = true;
        setSelectorEnabled(true);
        Drawable selector = getSelector();
        if (selector != null) {
            if ((a() && isPressed()) ? false : false) {
                selector.setState(getDrawableState());
            }
        }
    }

    @Override // android.widget.AbsListView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        return super.onTouchEvent(motionEvent);
    }

    private void a(int i, View view) {
        Rect rect = this.a;
        rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        rect.left -= this.b;
        rect.top -= this.c;
        rect.right += this.d;
        rect.bottom += this.e;
        try {
            boolean z = this.h.getBoolean(this);
            if (view.isEnabled() != z) {
                this.h.set(this, Boolean.valueOf(!z));
                if (i != -1) {
                    refreshDrawableState();
                }
            }
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    public final int a(int i, int i2, int i3, int i4, int i5) {
        int makeMeasureSpec;
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        getListPaddingLeft();
        getListPaddingRight();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        if (adapter == null) {
            return listPaddingTop + listPaddingBottom;
        }
        int i6 = listPaddingTop + listPaddingBottom;
        dividerHeight = (dividerHeight <= 0 || divider == null) ? 0 : 0;
        int count = adapter.getCount();
        int i7 = i6;
        View view = null;
        int i8 = 0;
        for (int i9 = 0; i9 < count; i9++) {
            int itemViewType = adapter.getItemViewType(i9);
            if (itemViewType != i8) {
                view = null;
                i8 = itemViewType;
            }
            view = adapter.getView(i9, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            if (layoutParams.height > 0) {
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(layoutParams.height, 1073741824);
            } else {
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
            }
            view.measure(i, makeMeasureSpec);
            view.forceLayout();
            if (i9 > 0) {
                i7 += dividerHeight;
            }
            i7 += view.getMeasuredHeight();
            if (i7 >= i4) {
                return i4;
            }
        }
        return i7;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void setSelectorEnabled(boolean z) {
        if (this.i != null) {
            this.i.a = z;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static class a extends android.support.v7.graphics.drawable.a {
        boolean a;

        public a(Drawable drawable) {
            super(drawable);
            this.a = true;
        }

        @Override // android.support.v7.graphics.drawable.a, android.graphics.drawable.Drawable
        public final boolean setState(int[] iArr) {
            if (this.a) {
                return super.setState(iArr);
            }
            return false;
        }

        @Override // android.support.v7.graphics.drawable.a, android.graphics.drawable.Drawable
        public final void draw(Canvas canvas) {
            if (this.a) {
                super.draw(canvas);
            }
        }

        @Override // android.support.v7.graphics.drawable.a, android.graphics.drawable.Drawable
        public final void setHotspot(float f, float f2) {
            if (this.a) {
                super.setHotspot(f, f2);
            }
        }

        @Override // android.support.v7.graphics.drawable.a, android.graphics.drawable.Drawable
        public final void setHotspotBounds(int i, int i2, int i3, int i4) {
            if (this.a) {
                super.setHotspotBounds(i, i2, i3, i4);
            }
        }

        @Override // android.support.v7.graphics.drawable.a, android.graphics.drawable.Drawable
        public final boolean setVisible(boolean z, boolean z2) {
            if (this.a) {
                return super.setVisible(z, z2);
            }
            return false;
        }
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        Drawable selector;
        if (!this.a.isEmpty() && (selector = getSelector()) != null) {
            selector.setBounds(this.a);
            selector.draw(canvas);
        }
        super.dispatchDraw(canvas);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void a(int i, View view, float f, float f2) {
        Drawable selector = getSelector();
        boolean z = (selector == null || i == -1) ? false : true;
        if (z) {
            selector.setVisible(false, false);
        }
        a(i, view);
        if (z) {
            Rect rect = this.a;
            float exactCenterX = rect.exactCenterX();
            float exactCenterY = rect.exactCenterY();
            selector.setVisible(getVisibility() == 0, false);
            DrawableCompat.setHotspot(selector, exactCenterX, exactCenterY);
        }
        Drawable selector2 = getSelector();
        if (selector2 == null || i == -1) {
            return;
        }
        DrawableCompat.setHotspot(selector2, f, f2);
    }
}
