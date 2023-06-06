package android.support.design.internal;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.support.annotation.Nullable;
import android.support.annotation.RestrictTo;
import android.support.constraint.R;
import android.support.transition.e;
import android.support.transition.w;
import android.support.v4.util.Pools;
import android.support.v4.view.ViewCompat;
import android.support.v4.view.animation.FastOutSlowInInterpolator;
import android.support.v7.view.menu.MenuBuilder;
import android.support.v7.view.menu.MenuItemImpl;
import android.support.v7.view.menu.k;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
/* compiled from: ProGuard */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes.dex */
public final class a extends ViewGroup implements k {
    final w a;
    BottomNavigationItemView[] b;
    int c;
    int d;
    BottomNavigationPresenter e;
    MenuBuilder f;
    private final int g;
    private final int h;
    private final int i;
    private final int j;
    private final View.OnClickListener k;
    private final Pools.Pool<BottomNavigationItemView> l;
    private boolean m;
    private ColorStateList n;
    private ColorStateList o;
    private int p;
    private int[] q;

    public final int getWindowAnimations() {
        return 0;
    }

    public a(Context context) {
        this(context, null);
    }

    private a(Context context, AttributeSet attributeSet) {
        super(context, null);
        this.l = new Pools.SynchronizedPool(5);
        this.m = true;
        this.c = 0;
        this.d = 0;
        Resources resources = getResources();
        this.g = resources.getDimensionPixelSize(R.dimen.design_bottom_navigation_item_max_width);
        this.h = resources.getDimensionPixelSize(R.dimen.design_bottom_navigation_item_min_width);
        this.i = resources.getDimensionPixelSize(R.dimen.design_bottom_navigation_active_item_max_width);
        this.j = resources.getDimensionPixelSize(R.dimen.design_bottom_navigation_height);
        this.a = new e();
        this.a.a(0);
        this.a.a(115L);
        this.a.a(new FastOutSlowInInterpolator());
        this.a.b(new c());
        this.k = new View.OnClickListener() { // from class: android.support.design.internal.a.1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MenuItemImpl itemData = ((BottomNavigationItemView) view).getItemData();
                if (a.this.f.a(itemData, a.this.e, 0)) {
                    return;
                }
                itemData.setChecked(true);
            }
        };
        this.q = new int[5];
    }

    @Override // android.support.v7.view.menu.k
    public final void a(MenuBuilder menuBuilder) {
        this.f = menuBuilder;
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int childCount = getChildCount();
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.j, 1073741824);
        if (this.m) {
            int i3 = childCount - 1;
            int min = Math.min(size - (this.h * i3), this.i);
            int i4 = size - min;
            int min2 = Math.min(i4 / i3, this.g);
            int i5 = i4 - (i3 * min2);
            int i6 = 0;
            while (i6 < childCount) {
                this.q[i6] = i6 == this.d ? min : min2;
                if (i5 > 0) {
                    int[] iArr = this.q;
                    iArr[i6] = iArr[i6] + 1;
                    i5--;
                }
                i6++;
            }
        } else {
            int min3 = Math.min(size / (childCount == 0 ? 1 : childCount), this.i);
            int i7 = size - (min3 * childCount);
            for (int i8 = 0; i8 < childCount; i8++) {
                this.q[i8] = min3;
                if (i7 > 0) {
                    int[] iArr2 = this.q;
                    iArr2[i8] = iArr2[i8] + 1;
                    i7--;
                }
            }
        }
        int i9 = 0;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() != 8) {
                childAt.measure(View.MeasureSpec.makeMeasureSpec(this.q[i10], 1073741824), makeMeasureSpec);
                childAt.getLayoutParams().width = childAt.getMeasuredWidth();
                i9 += childAt.getMeasuredWidth();
            }
        }
        setMeasuredDimension(View.resolveSizeAndState(i9, View.MeasureSpec.makeMeasureSpec(i9, 1073741824), 0), View.resolveSizeAndState(this.j, makeMeasureSpec, 0));
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int i5 = i3 - i;
        int i6 = i4 - i2;
        int i7 = 0;
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() != 8) {
                if (ViewCompat.getLayoutDirection(this) == 1) {
                    int i9 = i5 - i7;
                    childAt.layout(i9 - childAt.getMeasuredWidth(), 0, i9, i6);
                } else {
                    childAt.layout(i7, 0, childAt.getMeasuredWidth() + i7, i6);
                }
                i7 += childAt.getMeasuredWidth();
            }
        }
    }

    public final void setIconTintList(ColorStateList colorStateList) {
        this.n = colorStateList;
        if (this.b == null) {
            return;
        }
        for (BottomNavigationItemView bottomNavigationItemView : this.b) {
            bottomNavigationItemView.setIconTintList(colorStateList);
        }
    }

    @Nullable
    public final ColorStateList getIconTintList() {
        return this.n;
    }

    public final void setItemTextColor(ColorStateList colorStateList) {
        this.o = colorStateList;
        if (this.b == null) {
            return;
        }
        for (BottomNavigationItemView bottomNavigationItemView : this.b) {
            bottomNavigationItemView.setTextColor(colorStateList);
        }
    }

    public final ColorStateList getItemTextColor() {
        return this.o;
    }

    public final void setItemBackgroundRes(int i) {
        this.p = i;
        if (this.b == null) {
            return;
        }
        for (BottomNavigationItemView bottomNavigationItemView : this.b) {
            bottomNavigationItemView.setItemBackground(i);
        }
    }

    public final int getItemBackgroundRes() {
        return this.p;
    }

    public final void setPresenter(BottomNavigationPresenter bottomNavigationPresenter) {
        this.e = bottomNavigationPresenter;
    }

    public final void a() {
        removeAllViews();
        if (this.b != null) {
            for (BottomNavigationItemView bottomNavigationItemView : this.b) {
                this.l.release(bottomNavigationItemView);
            }
        }
        if (this.f.size() == 0) {
            this.c = 0;
            this.d = 0;
            this.b = null;
            return;
        }
        this.b = new BottomNavigationItemView[this.f.size()];
        this.m = this.f.size() > 3;
        for (int i = 0; i < this.f.size(); i++) {
            this.e.b = true;
            this.f.getItem(i).setCheckable(true);
            this.e.b = false;
            BottomNavigationItemView newItem = getNewItem();
            this.b[i] = newItem;
            newItem.setIconTintList(this.n);
            newItem.setTextColor(this.o);
            newItem.setItemBackground(this.p);
            newItem.setShiftingMode(this.m);
            newItem.a((MenuItemImpl) this.f.getItem(i), 0);
            newItem.setItemPosition(i);
            newItem.setOnClickListener(this.k);
            addView(newItem);
        }
        this.d = Math.min(this.f.size() - 1, this.d);
        this.f.getItem(this.d).setChecked(true);
    }

    private BottomNavigationItemView getNewItem() {
        BottomNavigationItemView acquire = this.l.acquire();
        return acquire == null ? new BottomNavigationItemView(getContext()) : acquire;
    }

    public final int getSelectedItemId() {
        return this.c;
    }
}
