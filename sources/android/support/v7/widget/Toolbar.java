package android.support.v7.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.ColorInt;
import android.support.annotation.DrawableRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.RestrictTo;
import android.support.annotation.StringRes;
import android.support.annotation.StyleRes;
import android.support.constraint.R;
import android.support.v4.view.AbsSavedState;
import android.support.v4.view.GravityCompat;
import android.support.v4.view.MarginLayoutParamsCompat;
import android.support.v4.view.ViewCompat;
import android.support.v7.app.ActionBar;
import android.support.v7.view.menu.MenuBuilder;
import android.support.v7.view.menu.MenuItemImpl;
import android.support.v7.view.menu.SubMenuBuilder;
import android.support.v7.view.menu.j;
import android.support.v7.widget.ActionMenuView;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class Toolbar extends ViewGroup {
    private int A;
    private int B;
    private CharSequence C;
    private CharSequence D;
    private int E;
    private int F;
    private boolean G;
    private boolean H;
    private final ArrayList<View> I;
    private final int[] J;
    private final ActionMenuView.e K;
    private ax L;
    private ActionMenuPresenter M;
    private boolean N;
    private final Runnable O;
    ActionMenuView a;
    protected TextView b;
    TextView c;
    protected ImageButton d;
    ImageButton e;
    View f;
    int g;
    int h;
    int i;
    an j;
    final ArrayList<View> k;
    c l;
    a m;
    j.a n;
    MenuBuilder.a o;
    private ImageView p;
    private Drawable q;
    private CharSequence r;
    private Context s;
    private int t;
    private int u;
    private int v;
    private int w;
    private int x;
    private int y;
    private int z;

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public interface c {
        boolean a(MenuItem menuItem);
    }

    @Override // android.view.ViewGroup
    protected /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return e();
    }

    @Override // android.view.ViewGroup
    protected /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return a(layoutParams);
    }

    public Toolbar(Context context) {
        this(context, null);
    }

    public Toolbar(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.toolbarStyle);
    }

    public Toolbar(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.B = 8388627;
        this.I = new ArrayList<>();
        this.k = new ArrayList<>();
        this.J = new int[2];
        this.K = new ActionMenuView.e() { // from class: android.support.v7.widget.Toolbar.1
            @Override // android.support.v7.widget.ActionMenuView.e
            public final boolean a(MenuItem menuItem) {
                if (Toolbar.this.l != null) {
                    return Toolbar.this.l.a(menuItem);
                }
                return false;
            }
        };
        this.O = new Runnable() { // from class: android.support.v7.widget.Toolbar.2
            @Override // java.lang.Runnable
            public final void run() {
                Toolbar.this.b();
            }
        };
        aw a2 = aw.a(getContext(), attributeSet, new int[]{16842927, 16843072, R.attr.title, R.attr.subtitle, R.attr.logo, R.attr.contentInsetStart, R.attr.contentInsetEnd, R.attr.contentInsetLeft, R.attr.contentInsetRight, R.attr.contentInsetStartWithNavigation, R.attr.contentInsetEndWithActions, R.attr.popupTheme, R.attr.titleTextAppearance, R.attr.subtitleTextAppearance, R.attr.titleMargin, R.attr.titleMarginStart, R.attr.titleMarginEnd, R.attr.titleMarginTop, R.attr.titleMarginBottom, R.attr.titleMargins, R.attr.maxButtonHeight, R.attr.buttonGravity, R.attr.collapseIcon, R.attr.collapseContentDescription, R.attr.navigationIcon, R.attr.navigationContentDescription, R.attr.logoDescription, R.attr.titleTextColor, R.attr.subtitleTextColor}, i, 0);
        this.g = a2.g(12, 0);
        this.h = a2.g(13, 0);
        this.B = a2.c(0, this.B);
        this.i = a2.c(21, 48);
        int d = a2.d(14, 0);
        d = a2.f(19) ? a2.d(19, d) : d;
        this.y = d;
        this.x = d;
        this.w = d;
        this.v = d;
        int d2 = a2.d(15, -1);
        if (d2 >= 0) {
            this.v = d2;
        }
        int d3 = a2.d(16, -1);
        if (d3 >= 0) {
            this.w = d3;
        }
        int d4 = a2.d(17, -1);
        if (d4 >= 0) {
            this.x = d4;
        }
        int d5 = a2.d(18, -1);
        if (d5 >= 0) {
            this.y = d5;
        }
        this.u = a2.e(20, -1);
        int d6 = a2.d(5, Integer.MIN_VALUE);
        int d7 = a2.d(6, Integer.MIN_VALUE);
        int e = a2.e(7, 0);
        int e2 = a2.e(8, 0);
        g();
        this.j.b(e, e2);
        if (d6 != Integer.MIN_VALUE || d7 != Integer.MIN_VALUE) {
            this.j.a(d6, d7);
        }
        this.z = a2.d(9, Integer.MIN_VALUE);
        this.A = a2.d(10, Integer.MIN_VALUE);
        this.q = a2.a(22);
        this.r = a2.c(23);
        CharSequence c2 = a2.c(2);
        if (!TextUtils.isEmpty(c2)) {
            setTitle(c2);
        }
        CharSequence c3 = a2.c(3);
        if (!TextUtils.isEmpty(c3)) {
            setSubtitle(c3);
        }
        this.s = getContext();
        setPopupTheme(a2.g(11, 0));
        Drawable a3 = a2.a(24);
        if (a3 != null) {
            setNavigationIcon(a3);
        }
        CharSequence c4 = a2.c(25);
        if (!TextUtils.isEmpty(c4)) {
            setNavigationContentDescription(c4);
        }
        Drawable a4 = a2.a(4);
        if (a4 != null) {
            setLogo(a4);
        }
        CharSequence c5 = a2.c(26);
        if (!TextUtils.isEmpty(c5)) {
            setLogoDescription(c5);
        }
        if (a2.f(27)) {
            setTitleTextColor(a2.b(27, -1));
        }
        if (a2.f(28)) {
            setSubtitleTextColor(a2.b(28, -1));
        }
        a2.a.recycle();
    }

    public void setPopupTheme(@StyleRes int i) {
        if (this.t != i) {
            this.t = i;
            if (i == 0) {
                this.s = getContext();
            } else {
                this.s = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public int getPopupTheme() {
        return this.t;
    }

    public int getTitleMarginStart() {
        return this.v;
    }

    public void setTitleMarginStart(int i) {
        this.v = i;
        requestLayout();
    }

    public int getTitleMarginTop() {
        return this.x;
    }

    public void setTitleMarginTop(int i) {
        this.x = i;
        requestLayout();
    }

    public int getTitleMarginEnd() {
        return this.w;
    }

    public void setTitleMarginEnd(int i) {
        this.w = i;
        requestLayout();
    }

    public int getTitleMarginBottom() {
        return this.y;
    }

    public void setTitleMarginBottom(int i) {
        this.y = i;
        requestLayout();
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i) {
        if (Build.VERSION.SDK_INT >= 17) {
            super.onRtlPropertiesChanged(i);
        }
        g();
        an anVar = this.j;
        boolean z = i == 1;
        if (z != anVar.g) {
            anVar.g = z;
            if (!anVar.h) {
                anVar.a = anVar.e;
                anVar.b = anVar.f;
            } else if (z) {
                anVar.a = anVar.d != Integer.MIN_VALUE ? anVar.d : anVar.e;
                anVar.b = anVar.c != Integer.MIN_VALUE ? anVar.c : anVar.f;
            } else {
                anVar.a = anVar.c != Integer.MIN_VALUE ? anVar.c : anVar.e;
                anVar.b = anVar.d != Integer.MIN_VALUE ? anVar.d : anVar.f;
            }
        }
    }

    public void setLogo(@DrawableRes int i) {
        setLogo(android.support.v7.content.res.b.b(getContext(), i));
    }

    public final boolean a() {
        if (this.a != null) {
            ActionMenuView actionMenuView = this.a;
            if (actionMenuView.c != null && actionMenuView.c.h()) {
                return true;
            }
        }
        return false;
    }

    public final boolean b() {
        if (this.a != null) {
            ActionMenuView actionMenuView = this.a;
            if (actionMenuView.c != null && actionMenuView.c.d()) {
                return true;
            }
        }
        return false;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final void a(MenuBuilder menuBuilder, ActionMenuPresenter actionMenuPresenter) {
        if (menuBuilder == null && this.a == null) {
            return;
        }
        j();
        MenuBuilder menuBuilder2 = this.a.a;
        if (menuBuilder2 == menuBuilder) {
            return;
        }
        if (menuBuilder2 != null) {
            menuBuilder2.b(this.M);
            menuBuilder2.b(this.m);
        }
        if (this.m == null) {
            this.m = new a();
        }
        actionMenuPresenter.l = true;
        if (menuBuilder != null) {
            menuBuilder.a(actionMenuPresenter, this.s);
            menuBuilder.a(this.m, this.s);
        } else {
            actionMenuPresenter.a(this.s, (MenuBuilder) null);
            this.m.a(this.s, (MenuBuilder) null);
            actionMenuPresenter.a(true);
            this.m.a(true);
        }
        this.a.setPopupTheme(this.t);
        this.a.setPresenter(actionMenuPresenter);
        this.M = actionMenuPresenter;
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            h();
            if (!d(this.p)) {
                a((View) this.p, true);
            }
        } else if (this.p != null && d(this.p)) {
            removeView(this.p);
            this.k.remove(this.p);
        }
        if (this.p != null) {
            this.p.setImageDrawable(drawable);
        }
    }

    public Drawable getLogo() {
        if (this.p != null) {
            return this.p.getDrawable();
        }
        return null;
    }

    public void setLogoDescription(@StringRes int i) {
        setLogoDescription(getContext().getText(i));
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            h();
        }
        if (this.p != null) {
            this.p.setContentDescription(charSequence);
        }
    }

    public CharSequence getLogoDescription() {
        if (this.p != null) {
            return this.p.getContentDescription();
        }
        return null;
    }

    private void h() {
        if (this.p == null) {
            this.p = new AppCompatImageView(getContext());
        }
    }

    public final void c() {
        MenuItemImpl menuItemImpl = this.m == null ? null : this.m.b;
        if (menuItemImpl != null) {
            menuItemImpl.collapseActionView();
        }
    }

    public CharSequence getTitle() {
        return this.C;
    }

    public void setTitle(@StringRes int i) {
        setTitle(getContext().getText(i));
    }

    public void setTitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.b == null) {
                Context context = getContext();
                this.b = new AppCompatTextView(context);
                this.b.setSingleLine();
                this.b.setEllipsize(TextUtils.TruncateAt.END);
                if (this.g != 0) {
                    this.b.setTextAppearance(context, this.g);
                }
                if (this.E != 0) {
                    this.b.setTextColor(this.E);
                }
            }
            if (!d(this.b)) {
                a((View) this.b, true);
            }
        } else if (this.b != null && d(this.b)) {
            removeView(this.b);
            this.k.remove(this.b);
        }
        if (this.b != null) {
            this.b.setText(charSequence);
        }
        this.C = charSequence;
    }

    public CharSequence getSubtitle() {
        return this.D;
    }

    public void setSubtitle(@StringRes int i) {
        setSubtitle(getContext().getText(i));
    }

    public void setSubtitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.c == null) {
                Context context = getContext();
                this.c = new AppCompatTextView(context);
                this.c.setSingleLine();
                this.c.setEllipsize(TextUtils.TruncateAt.END);
                if (this.h != 0) {
                    this.c.setTextAppearance(context, this.h);
                }
                if (this.F != 0) {
                    this.c.setTextColor(this.F);
                }
            }
            if (!d(this.c)) {
                a((View) this.c, true);
            }
        } else if (this.c != null && d(this.c)) {
            removeView(this.c);
            this.k.remove(this.c);
        }
        if (this.c != null) {
            this.c.setText(charSequence);
        }
        this.D = charSequence;
    }

    public void setTitleTextColor(@ColorInt int i) {
        this.E = i;
        if (this.b != null) {
            this.b.setTextColor(i);
        }
    }

    public void setSubtitleTextColor(@ColorInt int i) {
        this.F = i;
        if (this.c != null) {
            this.c.setTextColor(i);
        }
    }

    @Nullable
    public CharSequence getNavigationContentDescription() {
        if (this.d != null) {
            return this.d.getContentDescription();
        }
        return null;
    }

    public void setNavigationContentDescription(@StringRes int i) {
        setNavigationContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setNavigationContentDescription(@Nullable CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            k();
        }
        if (this.d != null) {
            this.d.setContentDescription(charSequence);
        }
    }

    public void setNavigationIcon(@DrawableRes int i) {
        setNavigationIcon(android.support.v7.content.res.b.b(getContext(), i));
    }

    public void setNavigationIcon(@Nullable Drawable drawable) {
        if (drawable != null) {
            k();
            if (!d(this.d)) {
                a((View) this.d, true);
            }
        } else if (this.d != null && d(this.d)) {
            removeView(this.d);
            this.k.remove(this.d);
        }
        if (this.d != null) {
            this.d.setImageDrawable(drawable);
        }
    }

    @Nullable
    public Drawable getNavigationIcon() {
        if (this.d != null) {
            return this.d.getDrawable();
        }
        return null;
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        k();
        this.d.setOnClickListener(onClickListener);
    }

    public Menu getMenu() {
        i();
        return this.a.getMenu();
    }

    public void setOverflowIcon(@Nullable Drawable drawable) {
        i();
        this.a.setOverflowIcon(drawable);
    }

    @Nullable
    public Drawable getOverflowIcon() {
        i();
        return this.a.getOverflowIcon();
    }

    private void i() {
        j();
        if (this.a.a == null) {
            MenuBuilder menuBuilder = (MenuBuilder) this.a.getMenu();
            if (this.m == null) {
                this.m = new a();
            }
            this.a.setExpandedActionViewsExclusive(true);
            menuBuilder.a(this.m, this.s);
        }
    }

    private void j() {
        if (this.a == null) {
            this.a = new ActionMenuView(getContext());
            this.a.setPopupTheme(this.t);
            this.a.setOnMenuItemClickListener(this.K);
            this.a.a(this.n, this.o);
            b e = e();
            e.a = 8388613 | (this.i & 112);
            this.a.setLayoutParams(e);
            a((View) this.a, false);
        }
    }

    private MenuInflater getMenuInflater() {
        return new android.support.v7.view.g(getContext());
    }

    public void setOnMenuItemClickListener(c cVar) {
        this.l = cVar;
    }

    public int getContentInsetStart() {
        if (this.j != null) {
            an anVar = this.j;
            return anVar.g ? anVar.b : anVar.a;
        }
        return 0;
    }

    public int getContentInsetEnd() {
        if (this.j != null) {
            an anVar = this.j;
            return anVar.g ? anVar.a : anVar.b;
        }
        return 0;
    }

    public final void a(int i, int i2) {
        g();
        this.j.b(0, 0);
    }

    public int getContentInsetLeft() {
        if (this.j != null) {
            return this.j.a;
        }
        return 0;
    }

    public int getContentInsetRight() {
        if (this.j != null) {
            return this.j.b;
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        return this.z != Integer.MIN_VALUE ? this.z : getContentInsetStart();
    }

    public void setContentInsetStartWithNavigation(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.z) {
            this.z = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public int getContentInsetEndWithActions() {
        return this.A != Integer.MIN_VALUE ? this.A : getContentInsetEnd();
    }

    public void setContentInsetEndWithActions(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.A) {
            this.A = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public int getCurrentContentInsetStart() {
        if (getNavigationIcon() != null) {
            return Math.max(getContentInsetStart(), Math.max(this.z, 0));
        }
        return getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        MenuBuilder menuBuilder;
        if ((this.a == null || (menuBuilder = this.a.a) == null || !menuBuilder.hasVisibleItems()) ? false : true) {
            return Math.max(getContentInsetEnd(), Math.max(this.A, 0));
        }
        return getContentInsetEnd();
    }

    public int getCurrentContentInsetLeft() {
        if (ViewCompat.getLayoutDirection(this) == 1) {
            return getCurrentContentInsetEnd();
        }
        return getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        if (ViewCompat.getLayoutDirection(this) == 1) {
            return getCurrentContentInsetStart();
        }
        return getCurrentContentInsetEnd();
    }

    private void k() {
        if (this.d == null) {
            this.d = new AppCompatImageButton(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            b e = e();
            e.a = 8388611 | (this.i & 112);
            this.d.setLayoutParams(e);
        }
    }

    final void d() {
        if (this.e == null) {
            this.e = new AppCompatImageButton(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            this.e.setImageDrawable(this.q);
            this.e.setContentDescription(this.r);
            b e = e();
            e.a = 8388611 | (this.i & 112);
            e.b = 2;
            this.e.setLayoutParams(e);
            this.e.setOnClickListener(new View.OnClickListener() { // from class: android.support.v7.widget.Toolbar.3
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Toolbar.this.c();
                }
            });
        }
    }

    private void a(View view, boolean z) {
        b bVar;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            bVar = e();
        } else if (!checkLayoutParams(layoutParams)) {
            bVar = a(layoutParams);
        } else {
            bVar = (b) layoutParams;
        }
        bVar.b = 1;
        if (z && this.f != null) {
            view.setLayoutParams(bVar);
            this.k.add(view);
            return;
        }
        addView(view, bVar);
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        if (this.m != null && this.m.b != null) {
            savedState.a = this.m.b.getItemId();
        }
        savedState.b = a();
        return savedState;
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem findItem;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        MenuBuilder menuBuilder = this.a != null ? this.a.a : null;
        if (savedState.a != 0 && this.m != null && menuBuilder != null && (findItem = menuBuilder.findItem(savedState.a)) != null) {
            findItem.expandActionView();
        }
        if (savedState.b) {
            removeCallbacks(this.O);
            post(this.O);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.O);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.G = false;
        }
        if (!this.G) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.G = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.G = false;
        }
        return true;
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.H = false;
        }
        if (!this.H) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.H = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.H = false;
        }
        return true;
    }

    private void a(View view, int i, int i2, int i3, int i4, int i5) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width);
        int childMeasureSpec2 = getChildMeasureSpec(i3, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + 0, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i5 >= 0) {
            if (mode != 0) {
                i5 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i5);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i5, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    private int a(View view, int i, int i2, int i3, int i4, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i5 = marginLayoutParams.leftMargin - iArr[0];
        int i6 = marginLayoutParams.rightMargin - iArr[1];
        int max = Math.max(0, i5) + Math.max(0, i6);
        iArr[0] = Math.max(0, -i5);
        iArr[1] = Math.max(0, -i6);
        view.measure(getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + max + i2, marginLayoutParams.width), getChildMeasureSpec(i3, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, marginLayoutParams.height));
        return view.getMeasuredWidth() + max;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0294  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onMeasure(int r18, int r19) {
        /*
            Method dump skipped, instructions count: 665
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.Toolbar.onMeasure(int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x02ab A[LOOP:0: B:104:0x02a9->B:105:0x02ab, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:108:0x02cd A[LOOP:1: B:107:0x02cb->B:108:0x02cd, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02f2 A[LOOP:2: B:110:0x02f0->B:111:0x02f2, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0333  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0342 A[LOOP:3: B:119:0x0340->B:120:0x0342, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x022a  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void onLayout(boolean r25, int r26, int r27, int r28, int r29) {
        /*
            Method dump skipped, instructions count: 855
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.Toolbar.onLayout(boolean, int, int, int, int):void");
    }

    private int a(View view, int i, int[] iArr, int i2) {
        b bVar = (b) view.getLayoutParams();
        int i3 = bVar.leftMargin - iArr[0];
        int max = i + Math.max(0, i3);
        iArr[0] = Math.max(0, -i3);
        int a2 = a(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max, a2, max + measuredWidth, view.getMeasuredHeight() + a2);
        return max + measuredWidth + bVar.rightMargin;
    }

    private int b(View view, int i, int[] iArr, int i2) {
        b bVar = (b) view.getLayoutParams();
        int i3 = bVar.rightMargin - iArr[1];
        int max = i - Math.max(0, i3);
        iArr[1] = Math.max(0, -i3);
        int a2 = a(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max - measuredWidth, a2, max, view.getMeasuredHeight() + a2);
        return max - (measuredWidth + bVar.leftMargin);
    }

    private int a(View view, int i) {
        b bVar = (b) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i2 = i > 0 ? (measuredHeight - i) / 2 : 0;
        int a2 = a(bVar.a);
        if (a2 != 48) {
            if (a2 == 80) {
                return (((getHeight() - getPaddingBottom()) - measuredHeight) - bVar.bottomMargin) - i2;
            }
            int paddingTop = getPaddingTop();
            int paddingBottom = getPaddingBottom();
            int height = getHeight();
            int i3 = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
            if (i3 < bVar.topMargin) {
                i3 = bVar.topMargin;
            } else {
                int i4 = (((height - paddingBottom) - measuredHeight) - i3) - paddingTop;
                if (i4 < bVar.bottomMargin) {
                    i3 = Math.max(0, i3 - (bVar.bottomMargin - i4));
                }
            }
            return paddingTop + i3;
        }
        return getPaddingTop() - i2;
    }

    private int a(int i) {
        int i2 = i & 112;
        return (i2 == 16 || i2 == 48 || i2 == 80) ? i2 : this.B & 112;
    }

    private void a(List<View> list, int i) {
        boolean z = ViewCompat.getLayoutDirection(this) == 1;
        int childCount = getChildCount();
        int absoluteGravity = GravityCompat.getAbsoluteGravity(i, ViewCompat.getLayoutDirection(this));
        list.clear();
        if (!z) {
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                b bVar = (b) childAt.getLayoutParams();
                if (bVar.b == 0 && a(childAt) && b(bVar.a) == absoluteGravity) {
                    list.add(childAt);
                }
            }
            return;
        }
        for (int i3 = childCount - 1; i3 >= 0; i3--) {
            View childAt2 = getChildAt(i3);
            b bVar2 = (b) childAt2.getLayoutParams();
            if (bVar2.b == 0 && a(childAt2) && b(bVar2.a) == absoluteGravity) {
                list.add(childAt2);
            }
        }
    }

    private int b(int i) {
        int layoutDirection = ViewCompat.getLayoutDirection(this);
        int absoluteGravity = GravityCompat.getAbsoluteGravity(i, layoutDirection) & 7;
        return (absoluteGravity == 1 || absoluteGravity == 3 || absoluteGravity == 5) ? absoluteGravity : layoutDirection == 1 ? 5 : 3;
    }

    private boolean a(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    private static int b(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return MarginLayoutParamsCompat.getMarginStart(marginLayoutParams) + MarginLayoutParamsCompat.getMarginEnd(marginLayoutParams);
    }

    private static int c(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    private static b a(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof b) {
            return new b((b) layoutParams);
        }
        if (layoutParams instanceof ActionBar.a) {
            return new b((ActionBar.a) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new b((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new b(layoutParams);
    }

    protected static b e() {
        return new b(-2, -2);
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof b);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public u getWrapper() {
        if (this.L == null) {
            this.L = new ax(this, true);
        }
        return this.L;
    }

    final void f() {
        for (int size = this.k.size() - 1; size >= 0; size--) {
            addView(this.k.get(size));
        }
        this.k.clear();
    }

    private boolean d(View view) {
        return view.getParent() == this || this.k.contains(view);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setCollapsible(boolean z) {
        this.N = z;
        requestLayout();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void g() {
        if (this.j == null) {
            this.j = new an();
        }
    }

    ActionMenuPresenter getOuterActionMenuPresenter() {
        return this.M;
    }

    Context getPopupContext() {
        return this.s;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static class b extends ActionBar.a {
        int b;

        public b(@NonNull Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.b = 0;
        }

        public b(int i, int i2) {
            super(-2, -2);
            this.b = 0;
            this.a = 8388627;
        }

        public b(b bVar) {
            super((ActionBar.a) bVar);
            this.b = 0;
            this.b = bVar.b;
        }

        public b(ActionBar.a aVar) {
            super(aVar);
            this.b = 0;
        }

        public b(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.b = 0;
            this.leftMargin = marginLayoutParams.leftMargin;
            this.topMargin = marginLayoutParams.topMargin;
            this.rightMargin = marginLayoutParams.rightMargin;
            this.bottomMargin = marginLayoutParams.bottomMargin;
        }

        public b(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.b = 0;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() { // from class: android.support.v7.widget.Toolbar.SavedState.1
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
        int a;
        boolean b;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.a = parcel.readInt();
            this.b = parcel.readInt() != 0;
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // android.support.v4.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.a);
            parcel.writeInt(this.b ? 1 : 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public class a implements android.support.v7.view.menu.j {
        MenuBuilder a;
        MenuItemImpl b;

        @Override // android.support.v7.view.menu.j
        public final void a(Parcelable parcelable) {
        }

        @Override // android.support.v7.view.menu.j
        public final void a(MenuBuilder menuBuilder, boolean z) {
        }

        @Override // android.support.v7.view.menu.j
        public final void a(j.a aVar) {
        }

        @Override // android.support.v7.view.menu.j
        public final boolean a() {
            return false;
        }

        @Override // android.support.v7.view.menu.j
        public final boolean a(SubMenuBuilder subMenuBuilder) {
            return false;
        }

        @Override // android.support.v7.view.menu.j
        public final int b() {
            return 0;
        }

        @Override // android.support.v7.view.menu.j
        public final Parcelable c() {
            return null;
        }

        a() {
        }

        @Override // android.support.v7.view.menu.j
        public final void a(Context context, MenuBuilder menuBuilder) {
            if (this.a != null && this.b != null) {
                this.a.d(this.b);
            }
            this.a = menuBuilder;
        }

        @Override // android.support.v7.view.menu.j
        public final void a(boolean z) {
            if (this.b != null) {
                boolean z2 = false;
                if (this.a != null) {
                    int size = this.a.size();
                    int i = 0;
                    while (true) {
                        if (i >= size) {
                            break;
                        } else if (this.a.getItem(i) == this.b) {
                            z2 = true;
                            break;
                        } else {
                            i++;
                        }
                    }
                }
                if (z2) {
                    return;
                }
                b(this.a, this.b);
            }
        }

        @Override // android.support.v7.view.menu.j
        public final boolean a(MenuBuilder menuBuilder, MenuItemImpl menuItemImpl) {
            Toolbar.this.d();
            if (Toolbar.this.e.getParent() != Toolbar.this) {
                Toolbar.this.addView(Toolbar.this.e);
            }
            Toolbar.this.f = menuItemImpl.getActionView();
            this.b = menuItemImpl;
            if (Toolbar.this.f.getParent() != Toolbar.this) {
                b e = Toolbar.e();
                e.a = 8388611 | (Toolbar.this.i & 112);
                e.b = 2;
                Toolbar.this.f.setLayoutParams(e);
                Toolbar.this.addView(Toolbar.this.f);
            }
            Toolbar toolbar = Toolbar.this;
            for (int childCount = toolbar.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = toolbar.getChildAt(childCount);
                if (((b) childAt.getLayoutParams()).b != 2 && childAt != toolbar.a) {
                    toolbar.removeViewAt(childCount);
                    toolbar.k.add(childAt);
                }
            }
            Toolbar.this.requestLayout();
            menuItemImpl.e(true);
            if (Toolbar.this.f instanceof android.support.v7.view.c) {
                ((android.support.v7.view.c) Toolbar.this.f).a();
            }
            return true;
        }

        @Override // android.support.v7.view.menu.j
        public final boolean b(MenuBuilder menuBuilder, MenuItemImpl menuItemImpl) {
            if (Toolbar.this.f instanceof android.support.v7.view.c) {
                ((android.support.v7.view.c) Toolbar.this.f).b();
            }
            Toolbar.this.removeView(Toolbar.this.f);
            Toolbar.this.removeView(Toolbar.this.e);
            Toolbar.this.f = null;
            Toolbar.this.f();
            this.b = null;
            Toolbar.this.requestLayout();
            menuItemImpl.e(false);
            return true;
        }
    }

    @Override // android.view.ViewGroup
    public /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new b(getContext(), attributeSet);
    }
}
