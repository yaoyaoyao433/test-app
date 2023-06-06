package android.support.v7.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.support.annotation.Nullable;
import android.support.annotation.RestrictTo;
import android.support.annotation.StyleRes;
import android.support.v7.view.menu.ActionMenuItemView;
import android.support.v7.view.menu.MenuBuilder;
import android.support.v7.view.menu.MenuItemImpl;
import android.support.v7.view.menu.j;
import android.support.v7.widget.LinearLayoutCompat;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class ActionMenuView extends LinearLayoutCompat implements MenuBuilder.b, android.support.v7.view.menu.k {
    MenuBuilder a;
    boolean b;
    ActionMenuPresenter c;
    MenuBuilder.a d;
    e e;
    private Context f;
    private int g;
    private j.a h;
    private boolean i;
    private int j;
    private int k;
    private int l;

    /* compiled from: ProGuard */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* loaded from: classes.dex */
    public interface a {
        boolean c();

        boolean d();
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public interface e {
        boolean a(MenuItem menuItem);
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public int getWindowAnimations() {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.v7.widget.LinearLayoutCompat
    public final /* synthetic */ LinearLayoutCompat.a c() {
        return d();
    }

    @Override // android.support.v7.widget.LinearLayoutCompat, android.view.ViewGroup
    protected /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return d();
    }

    public ActionMenuView(Context context) {
        this(context, null);
    }

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBaselineAligned(false);
        float f = context.getResources().getDisplayMetrics().density;
        this.k = (int) (56.0f * f);
        this.l = (int) (f * 4.0f);
        this.f = context;
        this.g = 0;
    }

    public void setPopupTheme(@StyleRes int i) {
        if (this.g != i) {
            this.g = i;
            if (i == 0) {
                this.f = getContext();
            } else {
                this.f = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public int getPopupTheme() {
        return this.g;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setPresenter(ActionMenuPresenter actionMenuPresenter) {
        this.c = actionMenuPresenter;
        this.c.a(this);
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.c != null) {
            this.c.a(false);
            if (this.c.h()) {
                this.c.e();
                this.c.d();
            }
        }
    }

    public void setOnMenuItemClickListener(e eVar) {
        this.e = eVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x02bd  */
    /* JADX WARN: Type inference failed for: r15v5 */
    /* JADX WARN: Type inference failed for: r15v6, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r15v9 */
    @Override // android.support.v7.widget.LinearLayoutCompat, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onMeasure(int r32, int r33) {
        /*
            Method dump skipped, instructions count: 736
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.ActionMenuView.onMeasure(int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a(View view, int i, int i2, int i3, int i4) {
        c cVar = (c) view.getLayoutParams();
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3) - i4, View.MeasureSpec.getMode(i3));
        ActionMenuItemView actionMenuItemView = view instanceof ActionMenuItemView ? (ActionMenuItemView) view : null;
        boolean z = true;
        boolean z2 = actionMenuItemView != null && actionMenuItemView.b();
        int i5 = 2;
        if (i2 <= 0 || (z2 && i2 < 2)) {
            i5 = 0;
        } else {
            view.measure(View.MeasureSpec.makeMeasureSpec(i2 * i, Integer.MIN_VALUE), makeMeasureSpec);
            int measuredWidth = view.getMeasuredWidth();
            int i6 = measuredWidth / i;
            if (measuredWidth % i != 0) {
                i6++;
            }
            if (!z2 || i6 >= 2) {
                i5 = i6;
            }
        }
        cVar.d = (cVar.a || !z2) ? false : false;
        cVar.b = i5;
        view.measure(View.MeasureSpec.makeMeasureSpec(i * i5, 1073741824), makeMeasureSpec);
        return i5;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.v7.widget.LinearLayoutCompat, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int width;
        int i7;
        if (!this.i) {
            super.onLayout(z, i, i2, i3, i4);
            return;
        }
        int childCount = getChildCount();
        int i8 = (i4 - i2) / 2;
        int dividerWidth = getDividerWidth();
        int i9 = i3 - i;
        int paddingRight = (i9 - getPaddingRight()) - getPaddingLeft();
        boolean a2 = bd.a(this);
        int i10 = paddingRight;
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            if (childAt.getVisibility() != 8) {
                c cVar = (c) childAt.getLayoutParams();
                if (cVar.a) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (b(i13)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (a2) {
                        i7 = getPaddingLeft() + cVar.leftMargin;
                        width = i7 + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - cVar.rightMargin;
                        i7 = width - measuredWidth;
                    }
                    int i14 = i8 - (measuredHeight / 2);
                    childAt.layout(i7, i14, width, measuredHeight + i14);
                    i10 -= measuredWidth;
                    i11 = 1;
                } else {
                    i10 -= (childAt.getMeasuredWidth() + cVar.leftMargin) + cVar.rightMargin;
                    b(i13);
                    i12++;
                }
            }
        }
        if (childCount == 1 && i11 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i15 = (i9 / 2) - (measuredWidth2 / 2);
            int i16 = i8 - (measuredHeight2 / 2);
            childAt2.layout(i15, i16, measuredWidth2 + i15, measuredHeight2 + i16);
            return;
        }
        int i17 = i12 - (i11 ^ 1);
        if (i17 > 0) {
            i6 = i10 / i17;
            i5 = 0;
        } else {
            i5 = 0;
            i6 = 0;
        }
        int max = Math.max(i5, i6);
        if (a2) {
            int width2 = getWidth() - getPaddingRight();
            while (i5 < childCount) {
                View childAt3 = getChildAt(i5);
                c cVar2 = (c) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !cVar2.a) {
                    int i18 = width2 - cVar2.rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i19 = i8 - (measuredHeight3 / 2);
                    childAt3.layout(i18 - measuredWidth3, i19, i18, measuredHeight3 + i19);
                    width2 = i18 - ((measuredWidth3 + cVar2.leftMargin) + max);
                }
                i5++;
            }
            return;
        }
        int paddingLeft = getPaddingLeft();
        while (i5 < childCount) {
            View childAt4 = getChildAt(i5);
            c cVar3 = (c) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !cVar3.a) {
                int i20 = paddingLeft + cVar3.leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i21 = i8 - (measuredHeight4 / 2);
                childAt4.layout(i20, i21, i20 + measuredWidth4, measuredHeight4 + i21);
                paddingLeft = i20 + measuredWidth4 + cVar3.rightMargin + max;
            }
            i5++;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b();
    }

    public void setOverflowIcon(@Nullable Drawable drawable) {
        getMenu();
        ActionMenuPresenter actionMenuPresenter = this.c;
        if (actionMenuPresenter.i != null) {
            actionMenuPresenter.i.setImageDrawable(drawable);
            return;
        }
        actionMenuPresenter.k = true;
        actionMenuPresenter.j = drawable;
    }

    @Nullable
    public Drawable getOverflowIcon() {
        getMenu();
        ActionMenuPresenter actionMenuPresenter = this.c;
        if (actionMenuPresenter.i != null) {
            return actionMenuPresenter.i.getDrawable();
        }
        if (actionMenuPresenter.k) {
            return actionMenuPresenter.j;
        }
        return null;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setOverflowReserved(boolean z) {
        this.b = z;
    }

    private static c d() {
        c cVar = new c(-2, -2);
        cVar.h = 16;
        return cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // android.support.v7.widget.LinearLayoutCompat, android.view.ViewGroup
    /* renamed from: b */
    public c generateLayoutParams(AttributeSet attributeSet) {
        return new c(getContext(), attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.v7.widget.LinearLayoutCompat, android.view.ViewGroup
    /* renamed from: a */
    public final c generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams != null) {
            c cVar = layoutParams instanceof c ? new c((c) layoutParams) : new c(layoutParams);
            if (cVar.h <= 0) {
                cVar.h = 16;
            }
            return cVar;
        }
        return d();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.v7.widget.LinearLayoutCompat, android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams != null && (layoutParams instanceof c);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final c a() {
        c d2 = d();
        d2.a = true;
        return d2;
    }

    @Override // android.support.v7.view.menu.MenuBuilder.b
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final boolean a(MenuItemImpl menuItemImpl) {
        return this.a.a(menuItemImpl, (android.support.v7.view.menu.j) null, 0);
    }

    @Override // android.support.v7.view.menu.k
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final void a(MenuBuilder menuBuilder) {
        this.a = menuBuilder;
    }

    public Menu getMenu() {
        if (this.a == null) {
            Context context = getContext();
            this.a = new MenuBuilder(context);
            this.a.a(new d());
            this.c = new ActionMenuPresenter(context);
            this.c.b(true);
            this.c.f = this.h != null ? this.h : new b();
            this.a.a(this.c, this.f);
            this.c.a(this);
        }
        return this.a;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final void a(j.a aVar, MenuBuilder.a aVar2) {
        this.h = aVar;
        this.d = aVar2;
    }

    public final void b() {
        if (this.c != null) {
            this.c.f();
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    private boolean b(int i) {
        boolean z = false;
        if (i == 0) {
            return false;
        }
        View childAt = getChildAt(i - 1);
        View childAt2 = getChildAt(i);
        if (i < getChildCount() && (childAt instanceof a)) {
            z = false | ((a) childAt).d();
        }
        return (i <= 0 || !(childAt2 instanceof a)) ? z : z | ((a) childAt2).c();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setExpandedActionViewsExclusive(boolean z) {
        this.c.l = z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public class d implements MenuBuilder.a {
        d() {
        }

        @Override // android.support.v7.view.menu.MenuBuilder.a
        public final boolean a(MenuBuilder menuBuilder, MenuItem menuItem) {
            return ActionMenuView.this.e != null && ActionMenuView.this.e.a(menuItem);
        }

        @Override // android.support.v7.view.menu.MenuBuilder.a
        public final void a(MenuBuilder menuBuilder) {
            if (ActionMenuView.this.d != null) {
                ActionMenuView.this.d.a(menuBuilder);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static class b implements j.a {
        @Override // android.support.v7.view.menu.j.a
        public final void a(MenuBuilder menuBuilder, boolean z) {
        }

        @Override // android.support.v7.view.menu.j.a
        public final boolean a(MenuBuilder menuBuilder) {
            return false;
        }

        b() {
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static class c extends LinearLayoutCompat.a {
        @ViewDebug.ExportedProperty
        public boolean a;
        @ViewDebug.ExportedProperty
        public int b;
        @ViewDebug.ExportedProperty
        public int c;
        @ViewDebug.ExportedProperty
        public boolean d;
        @ViewDebug.ExportedProperty
        public boolean e;
        boolean f;

        public c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public c(c cVar) {
            super(cVar);
            this.a = cVar.a;
        }

        public c(int i, int i2) {
            super(-2, -2);
            this.a = false;
        }
    }
}
