package android.support.design.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.DrawableRes;
import android.support.annotation.IdRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.RestrictTo;
import android.support.annotation.StyleRes;
import android.support.constraint.R;
import android.support.design.internal.NavigationMenu;
import android.support.design.internal.NavigationMenuView;
import android.support.design.internal.ScrimInsetsFrameLayout;
import android.support.design.internal.b;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.AbsSavedState;
import android.support.v4.view.ViewCompat;
import android.support.v4.view.WindowInsetsCompat;
import android.support.v7.view.menu.MenuBuilder;
import android.support.v7.view.menu.MenuItemImpl;
import android.support.v7.widget.aw;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class NavigationView extends ScrimInsetsFrameLayout {
    private static final int[] d = {16842912};
    private static final int[] e = {-16842910};
    a c;
    private final NavigationMenu f;
    private final android.support.design.internal.b g;
    private int h;
    private MenuInflater i;

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public interface a {
        boolean a(@NonNull MenuItem menuItem);
    }

    public NavigationView(Context context) {
        this(context, null);
    }

    private NavigationView(Context context, AttributeSet attributeSet) {
        this(context, null, 0);
    }

    public NavigationView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        ColorStateList a2;
        boolean z;
        int i2;
        this.g = new android.support.design.internal.b();
        n.a(context);
        this.f = new NavigationMenu(context);
        aw a3 = aw.a(context, attributeSet, new int[]{16842964, 16842973, 16843039, R.attr.itemTextColor, R.attr.elevation, R.attr.menu, R.attr.itemIconTint, R.attr.itemBackground, R.attr.itemTextAppearance, R.attr.headerLayout}, i, 2131559086);
        ViewCompat.setBackground(this, a3.a(0));
        if (a3.f(4)) {
            ViewCompat.setElevation(this, a3.e(4, 0));
        }
        ViewCompat.setFitsSystemWindows(this, a3.a(1, false));
        this.h = a3.e(2, 0);
        if (a3.f(6)) {
            a2 = a3.e(6);
        } else {
            a2 = a(16842808);
        }
        if (a3.f(8)) {
            i2 = a3.g(8, 0);
            z = true;
        } else {
            z = false;
            i2 = 0;
        }
        ColorStateList e2 = a3.f(3) ? a3.e(3) : null;
        if (!z && e2 == null) {
            e2 = a(16842806);
        }
        Drawable a4 = a3.a(7);
        this.f.a(new MenuBuilder.a() { // from class: android.support.design.widget.NavigationView.1
            @Override // android.support.v7.view.menu.MenuBuilder.a
            public final void a(MenuBuilder menuBuilder) {
            }

            @Override // android.support.v7.view.menu.MenuBuilder.a
            public final boolean a(MenuBuilder menuBuilder, MenuItem menuItem) {
                return NavigationView.this.c != null && NavigationView.this.c.a(menuItem);
            }
        });
        this.g.d = 1;
        this.g.a(context, this.f);
        this.g.a(a2);
        if (z) {
            this.g.a(i2);
        }
        this.g.b(e2);
        this.g.a(a4);
        this.f.a(this.g);
        android.support.design.internal.b bVar = this.g;
        if (bVar.a == null) {
            bVar.a = (NavigationMenuView) bVar.f.inflate(R.layout.design_navigation_menu, (ViewGroup) this, false);
            if (bVar.e == null) {
                bVar.e = new b.C0004b();
            }
            bVar.b = (LinearLayout) bVar.f.inflate(R.layout.design_navigation_item_header, (ViewGroup) bVar.a, false);
            bVar.a.setAdapter(bVar.e);
        }
        addView(bVar.a);
        if (a3.f(5)) {
            int g = a3.g(5, 0);
            this.g.b(true);
            getMenuInflater().inflate(g, this.f);
            this.g.b(false);
            this.g.a(false);
        }
        if (a3.f(9)) {
            int g2 = a3.g(9, 0);
            android.support.design.internal.b bVar2 = this.g;
            bVar2.b.addView(bVar2.f.inflate(g2, (ViewGroup) bVar2.b, false));
            bVar2.a.setPadding(0, 0, 0, bVar2.a.getPaddingBottom());
        }
        a3.a.recycle();
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.a = new Bundle();
        this.f.b(savedState.a);
        return savedState;
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.f.a(savedState.a);
    }

    public void setNavigationItemSelectedListener(@Nullable a aVar) {
        this.c = aVar;
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        if (mode == Integer.MIN_VALUE) {
            i = View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i), this.h), 1073741824);
        } else if (mode == 0) {
            i = View.MeasureSpec.makeMeasureSpec(this.h, 1073741824);
        }
        super.onMeasure(i, i2);
    }

    @Override // android.support.design.internal.ScrimInsetsFrameLayout
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final void a(WindowInsetsCompat windowInsetsCompat) {
        android.support.design.internal.b bVar = this.g;
        int systemWindowInsetTop = windowInsetsCompat.getSystemWindowInsetTop();
        if (bVar.l != systemWindowInsetTop) {
            bVar.l = systemWindowInsetTop;
            if (bVar.b.getChildCount() == 0) {
                bVar.a.setPadding(0, bVar.l, 0, bVar.a.getPaddingBottom());
            }
        }
        ViewCompat.dispatchApplyWindowInsets(bVar.b, windowInsetsCompat);
    }

    public Menu getMenu() {
        return this.f;
    }

    public int getHeaderCount() {
        return this.g.b.getChildCount();
    }

    @Nullable
    public ColorStateList getItemIconTintList() {
        return this.g.j;
    }

    public void setItemIconTintList(@Nullable ColorStateList colorStateList) {
        this.g.a(colorStateList);
    }

    @Nullable
    public ColorStateList getItemTextColor() {
        return this.g.i;
    }

    public void setItemTextColor(@Nullable ColorStateList colorStateList) {
        this.g.b(colorStateList);
    }

    @Nullable
    public Drawable getItemBackground() {
        return this.g.k;
    }

    public void setItemBackgroundResource(@DrawableRes int i) {
        setItemBackground(ContextCompat.getDrawable(getContext(), i));
    }

    public void setItemBackground(@Nullable Drawable drawable) {
        this.g.a(drawable);
    }

    public void setCheckedItem(@IdRes int i) {
        MenuItem findItem = this.f.findItem(i);
        if (findItem != null) {
            this.g.e.a((MenuItemImpl) findItem);
        }
    }

    public void setItemTextAppearance(@StyleRes int i) {
        this.g.a(i);
    }

    private MenuInflater getMenuInflater() {
        if (this.i == null) {
            this.i = new android.support.v7.view.g(getContext());
        }
        return this.i;
    }

    private ColorStateList a(int i) {
        TypedValue typedValue = new TypedValue();
        if (getContext().getTheme().resolveAttribute(i, typedValue, true)) {
            ColorStateList a2 = android.support.v7.content.res.b.a(getContext(), typedValue.resourceId);
            if (getContext().getTheme().resolveAttribute(R.attr.colorPrimary, typedValue, true)) {
                int i2 = typedValue.data;
                int defaultColor = a2.getDefaultColor();
                return new ColorStateList(new int[][]{e, d, EMPTY_STATE_SET}, new int[]{a2.getColorForState(e, defaultColor), i2, defaultColor});
            }
            return null;
        }
        return null;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() { // from class: android.support.design.widget.NavigationView.SavedState.1
            @Override // android.os.Parcelable.ClassLoaderCreator
            public final /* synthetic */ SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new SavedState[i];
            }

            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }
        };
        public Bundle a;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.a = parcel.readBundle(classLoader);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // android.support.v4.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(@NonNull Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeBundle(this.a);
        }
    }
}
