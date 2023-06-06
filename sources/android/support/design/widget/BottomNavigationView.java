package android.support.design.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.DrawableRes;
import android.support.annotation.IdRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.support.design.internal.BottomNavigationMenu;
import android.support.design.internal.BottomNavigationPresenter;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.AbsSavedState;
import android.support.v4.view.ViewCompat;
import android.support.v7.view.menu.MenuBuilder;
import android.support.v7.widget.aw;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class BottomNavigationView extends FrameLayout {
    private static final int[] a = {16842912};
    private static final int[] b = {-16842910};
    private final MenuBuilder c;
    private final android.support.design.internal.a d;
    private final BottomNavigationPresenter e;
    private MenuInflater f;
    private b g;
    private a h;

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public interface a {
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public interface b {
        boolean a(@NonNull MenuItem menuItem);
    }

    public int getMaxItemCount() {
        return 5;
    }

    public BottomNavigationView(Context context) {
        this(context, null);
    }

    private BottomNavigationView(Context context, AttributeSet attributeSet) {
        this(context, null, 0);
    }

    public BottomNavigationView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.e = new BottomNavigationPresenter();
        n.a(context);
        this.c = new BottomNavigationMenu(context);
        this.d = new android.support.design.internal.a(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        this.d.setLayoutParams(layoutParams);
        this.e.a = this.d;
        this.e.c = 1;
        this.d.setPresenter(this.e);
        this.c.a(this.e);
        this.e.a(getContext(), this.c);
        aw a2 = aw.a(context, attributeSet, new int[]{R.attr.itemTextColor, R.attr.elevation, R.attr.menu, R.attr.itemIconTint, R.attr.itemBackground}, i, 2131559081);
        if (a2.f(3)) {
            this.d.setIconTintList(a2.e(3));
        } else {
            this.d.setIconTintList(a(16842808));
        }
        if (a2.f(0)) {
            this.d.setItemTextColor(a2.e(0));
        } else {
            this.d.setItemTextColor(a(16842808));
        }
        if (a2.f(1)) {
            ViewCompat.setElevation(this, a2.e(1, 0));
        }
        this.d.setItemBackgroundRes(a2.g(4, 0));
        if (a2.f(2)) {
            int g = a2.g(2, 0);
            this.e.b = true;
            getMenuInflater().inflate(g, this.c);
            this.e.b = false;
            this.e.a(true);
        }
        a2.a.recycle();
        addView(this.d, layoutParams);
        if (Build.VERSION.SDK_INT < 21) {
            View view = new View(context);
            view.setBackgroundColor(ContextCompat.getColor(context, R.color.design_bottom_navigation_shadow_color));
            view.setLayoutParams(new FrameLayout.LayoutParams(-1, getResources().getDimensionPixelSize(R.dimen.design_bottom_navigation_shadow_height)));
            addView(view);
        }
        this.c.a(new MenuBuilder.a() { // from class: android.support.design.widget.BottomNavigationView.1
            @Override // android.support.v7.view.menu.MenuBuilder.a
            public final void a(MenuBuilder menuBuilder) {
            }

            @Override // android.support.v7.view.menu.MenuBuilder.a
            public final boolean a(MenuBuilder menuBuilder, MenuItem menuItem) {
                if (BottomNavigationView.this.h == null || menuItem.getItemId() != BottomNavigationView.this.getSelectedItemId()) {
                    return (BottomNavigationView.this.g == null || BottomNavigationView.this.g.a(menuItem)) ? false : true;
                }
                a unused = BottomNavigationView.this.h;
                return true;
            }
        });
    }

    public void setOnNavigationItemSelectedListener(@Nullable b bVar) {
        this.g = bVar;
    }

    public void setOnNavigationItemReselectedListener(@Nullable a aVar) {
        this.h = aVar;
    }

    @NonNull
    public Menu getMenu() {
        return this.c;
    }

    @Nullable
    public ColorStateList getItemIconTintList() {
        return this.d.getIconTintList();
    }

    public void setItemIconTintList(@Nullable ColorStateList colorStateList) {
        this.d.setIconTintList(colorStateList);
    }

    @Nullable
    public ColorStateList getItemTextColor() {
        return this.d.getItemTextColor();
    }

    public void setItemTextColor(@Nullable ColorStateList colorStateList) {
        this.d.setItemTextColor(colorStateList);
    }

    @DrawableRes
    public int getItemBackgroundResource() {
        return this.d.getItemBackgroundRes();
    }

    public void setItemBackgroundResource(@DrawableRes int i) {
        this.d.setItemBackgroundRes(i);
    }

    @IdRes
    public int getSelectedItemId() {
        return this.d.getSelectedItemId();
    }

    public void setSelectedItemId(@IdRes int i) {
        MenuItem findItem = this.c.findItem(i);
        if (findItem == null || this.c.a(findItem, this.e, 0)) {
            return;
        }
        findItem.setChecked(true);
    }

    private MenuInflater getMenuInflater() {
        if (this.f == null) {
            this.f = new android.support.v7.view.g(getContext());
        }
        return this.f;
    }

    private ColorStateList a(int i) {
        TypedValue typedValue = new TypedValue();
        if (getContext().getTheme().resolveAttribute(16842808, typedValue, true)) {
            ColorStateList a2 = android.support.v7.content.res.b.a(getContext(), typedValue.resourceId);
            if (getContext().getTheme().resolveAttribute(R.attr.colorPrimary, typedValue, true)) {
                int i2 = typedValue.data;
                int defaultColor = a2.getDefaultColor();
                return new ColorStateList(new int[][]{b, a, EMPTY_STATE_SET}, new int[]{a2.getColorForState(b, defaultColor), i2, defaultColor});
            }
            return null;
        }
        return null;
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.a = new Bundle();
        this.c.b(savedState.a);
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
        this.c.a(savedState.a);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() { // from class: android.support.design.widget.BottomNavigationView.SavedState.1
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
        Bundle a;

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.a = parcel.readBundle(classLoader);
        }

        @Override // android.support.v4.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(@NonNull Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeBundle(this.a);
        }
    }
}
