package android.support.v7.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.annotation.RestrictTo;
import android.support.constraint.R;
import android.support.v4.view.ViewCompat;
import android.support.v4.view.ViewPropertyAnimatorCompat;
import android.support.v4.view.ViewPropertyAnimatorListenerAdapter;
import android.support.v7.view.menu.ActionMenuItem;
import android.support.v7.view.menu.MenuBuilder;
import android.support.v7.view.menu.j;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
/* compiled from: ProGuard */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes.dex */
public final class ax implements u {
    Toolbar a;
    CharSequence b;
    Window.Callback c;
    boolean d;
    private int e;
    private View f;
    private View g;
    private Drawable h;
    private Drawable i;
    private Drawable j;
    private boolean k;
    private CharSequence l;
    private CharSequence m;
    private ActionMenuPresenter n;
    private int o;
    private int p;
    private Drawable q;

    public ax(Toolbar toolbar, boolean z) {
        this(toolbar, z, R.string.abc_action_bar_up_description, R.drawable.abc_ic_ab_back_material);
    }

    private ax(Toolbar toolbar, boolean z, int i, int i2) {
        this.o = 0;
        this.p = 0;
        this.a = toolbar;
        this.b = toolbar.getTitle();
        this.l = toolbar.getSubtitle();
        this.k = this.b != null;
        this.j = toolbar.getNavigationIcon();
        aw a = aw.a(toolbar.getContext(), null, new int[]{R.attr.background, R.attr.height, R.attr.title, R.attr.navigationMode, R.attr.displayOptions, R.attr.subtitle, R.attr.titleTextStyle, R.attr.subtitleTextStyle, R.attr.icon, R.attr.logo, R.attr.divider, R.attr.backgroundStacked, R.attr.backgroundSplit, R.attr.customNavigationLayout, R.attr.homeLayout, R.attr.progressBarStyle, R.attr.indeterminateProgressStyle, R.attr.progressBarPadding, R.attr.itemPadding, R.attr.hideOnContentScroll, R.attr.contentInsetStart, R.attr.contentInsetEnd, R.attr.contentInsetLeft, R.attr.contentInsetRight, R.attr.contentInsetStartWithNavigation, R.attr.contentInsetEndWithActions, R.attr.elevation, R.attr.popupTheme, R.attr.homeAsUpIndicator}, R.attr.actionBarStyle, 0);
        this.q = a.a(28);
        if (z) {
            CharSequence c = a.c(2);
            if (!TextUtils.isEmpty(c)) {
                b(c);
            }
            CharSequence c2 = a.c(5);
            if (!TextUtils.isEmpty(c2)) {
                this.l = c2;
                if ((this.e & 8) != 0) {
                    this.a.setSubtitle(c2);
                }
            }
            Drawable a2 = a.a(9);
            if (a2 != null) {
                c(a2);
            }
            Drawable a3 = a.a(8);
            if (a3 != null) {
                a(a3);
            }
            if (this.j == null && this.q != null) {
                this.j = this.q;
                r();
            }
            c(a.a(4, 0));
            int g = a.g(13, 0);
            if (g != 0) {
                a(LayoutInflater.from(this.a.getContext()).inflate(g, (ViewGroup) this.a, false));
                c(this.e | 16);
            }
            int f = a.f(1, 0);
            if (f > 0) {
                ViewGroup.LayoutParams layoutParams = this.a.getLayoutParams();
                layoutParams.height = f;
                this.a.setLayoutParams(layoutParams);
            }
            int d = a.d(20, -1);
            int d2 = a.d(21, -1);
            if (d >= 0 || d2 >= 0) {
                Toolbar toolbar2 = this.a;
                int max = Math.max(d, 0);
                int max2 = Math.max(d2, 0);
                toolbar2.g();
                toolbar2.j.a(max, max2);
            }
            int g2 = a.g(6, 0);
            if (g2 != 0) {
                Toolbar toolbar3 = this.a;
                Context context = this.a.getContext();
                toolbar3.g = g2;
                if (toolbar3.b != null) {
                    toolbar3.b.setTextAppearance(context, g2);
                }
            }
            int g3 = a.g(7, 0);
            if (g3 != 0) {
                Toolbar toolbar4 = this.a;
                Context context2 = this.a.getContext();
                toolbar4.h = g3;
                if (toolbar4.c != null) {
                    toolbar4.c.setTextAppearance(context2, g3);
                }
            }
            int g4 = a.g(27, 0);
            if (g4 != 0) {
                this.a.setPopupTheme(g4);
            }
        } else {
            int i3 = 11;
            if (this.a.getNavigationIcon() != null) {
                i3 = 15;
                this.q = this.a.getNavigationIcon();
            }
            this.e = i3;
        }
        a.a.recycle();
        if (R.string.abc_action_bar_up_description != this.p) {
            this.p = R.string.abc_action_bar_up_description;
            if (TextUtils.isEmpty(this.a.getNavigationContentDescription())) {
                d(this.p);
            }
        }
        this.m = this.a.getNavigationContentDescription();
        this.a.setNavigationOnClickListener(new View.OnClickListener() { // from class: android.support.v7.widget.ax.1
            final ActionMenuItem a;

            {
                this.a = new ActionMenuItem(ax.this.a.getContext(), 0, 16908332, 0, 0, ax.this.b);
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (ax.this.c == null || !ax.this.d) {
                    return;
                }
                ax.this.c.onMenuItemSelected(0, this.a);
            }
        });
    }

    @Override // android.support.v7.widget.u
    public final ViewGroup a() {
        return this.a;
    }

    @Override // android.support.v7.widget.u
    public final Context b() {
        return this.a.getContext();
    }

    @Override // android.support.v7.widget.u
    public final boolean c() {
        Toolbar toolbar = this.a;
        return (toolbar.m == null || toolbar.m.b == null) ? false : true;
    }

    @Override // android.support.v7.widget.u
    public final void d() {
        this.a.c();
    }

    @Override // android.support.v7.widget.u
    public final void a(Window.Callback callback) {
        this.c = callback;
    }

    @Override // android.support.v7.widget.u
    public final void a(CharSequence charSequence) {
        if (this.k) {
            return;
        }
        c(charSequence);
    }

    @Override // android.support.v7.widget.u
    public final CharSequence e() {
        return this.a.getTitle();
    }

    @Override // android.support.v7.widget.u
    public final void b(CharSequence charSequence) {
        this.k = true;
        c(charSequence);
    }

    private void c(CharSequence charSequence) {
        this.b = charSequence;
        if ((this.e & 8) != 0) {
            this.a.setTitle(charSequence);
        }
    }

    @Override // android.support.v7.widget.u
    public final void a(Drawable drawable) {
        this.h = drawable;
        q();
    }

    private void c(Drawable drawable) {
        this.i = drawable;
        q();
    }

    private void q() {
        Drawable drawable;
        if ((this.e & 2) == 0) {
            drawable = null;
        } else if ((this.e & 1) != 0) {
            drawable = this.i != null ? this.i : this.h;
        } else {
            drawable = this.h;
        }
        this.a.setLogo(drawable);
    }

    @Override // android.support.v7.widget.u
    public final boolean f() {
        Toolbar toolbar = this.a;
        return toolbar.getVisibility() == 0 && toolbar.a != null && toolbar.a.b;
    }

    @Override // android.support.v7.widget.u
    public final boolean g() {
        return this.a.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0025 A[RETURN] */
    @Override // android.support.v7.widget.u
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean h() {
        /*
            r4 = this;
            android.support.v7.widget.Toolbar r0 = r4.a
            android.support.v7.widget.ActionMenuView r1 = r0.a
            r2 = 0
            if (r1 == 0) goto L26
            android.support.v7.widget.ActionMenuView r0 = r0.a
            android.support.v7.widget.ActionMenuPresenter r1 = r0.c
            r3 = 1
            if (r1 == 0) goto L22
            android.support.v7.widget.ActionMenuPresenter r0 = r0.c
            android.support.v7.widget.ActionMenuPresenter$c r1 = r0.o
            if (r1 != 0) goto L1d
            boolean r0 = r0.h()
            if (r0 == 0) goto L1b
            goto L1d
        L1b:
            r0 = 0
            goto L1e
        L1d:
            r0 = 1
        L1e:
            if (r0 == 0) goto L22
            r0 = 1
            goto L23
        L22:
            r0 = 0
        L23:
            if (r0 == 0) goto L26
            return r3
        L26:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.ax.h():boolean");
    }

    @Override // android.support.v7.widget.u
    public final boolean i() {
        return this.a.b();
    }

    @Override // android.support.v7.widget.u
    public final boolean j() {
        Toolbar toolbar = this.a;
        if (toolbar.a != null) {
            ActionMenuView actionMenuView = toolbar.a;
            if (actionMenuView.c != null && actionMenuView.c.e()) {
                return true;
            }
        }
        return false;
    }

    @Override // android.support.v7.widget.u
    public final void k() {
        this.d = true;
    }

    @Override // android.support.v7.widget.u
    public final void a(Menu menu, j.a aVar) {
        if (this.n == null) {
            this.n = new ActionMenuPresenter(this.a.getContext());
            this.n.h = R.id.action_menu_presenter;
        }
        this.n.f = aVar;
        this.a.a((MenuBuilder) menu, this.n);
    }

    @Override // android.support.v7.widget.u
    public final void l() {
        Toolbar toolbar = this.a;
        if (toolbar.a != null) {
            toolbar.a.b();
        }
    }

    @Override // android.support.v7.widget.u
    public final int m() {
        return this.e;
    }

    @Override // android.support.v7.widget.u
    public final void c(int i) {
        int i2 = this.e ^ i;
        this.e = i;
        if (i2 != 0) {
            if ((i2 & 4) != 0) {
                if ((i & 4) != 0) {
                    s();
                }
                r();
            }
            if ((i2 & 3) != 0) {
                q();
            }
            if ((i2 & 8) != 0) {
                if ((i & 8) != 0) {
                    this.a.setTitle(this.b);
                    this.a.setSubtitle(this.l);
                } else {
                    this.a.setTitle((CharSequence) null);
                    this.a.setSubtitle((CharSequence) null);
                }
            }
            if ((i2 & 16) == 0 || this.g == null) {
                return;
            }
            if ((i & 16) != 0) {
                this.a.addView(this.g);
            } else {
                this.a.removeView(this.g);
            }
        }
    }

    @Override // android.support.v7.widget.u
    public final void a(ap apVar) {
        if (this.f != null && this.f.getParent() == this.a) {
            this.a.removeView(this.f);
        }
        this.f = apVar;
        if (apVar == null || this.o != 2) {
            return;
        }
        this.a.addView(this.f, 0);
        Toolbar.b bVar = (Toolbar.b) this.f.getLayoutParams();
        bVar.width = -2;
        bVar.height = -2;
        bVar.a = 8388691;
        apVar.setAllowCollapse(true);
    }

    @Override // android.support.v7.widget.u
    public final void a(boolean z) {
        this.a.setCollapsible(z);
    }

    @Override // android.support.v7.widget.u
    public final int n() {
        return this.o;
    }

    @Override // android.support.v7.widget.u
    public final void a(View view) {
        if (this.g != null && (this.e & 16) != 0) {
            this.a.removeView(this.g);
        }
        this.g = view;
        if (view == null || (this.e & 16) == 0) {
            return;
        }
        this.a.addView(this.g);
    }

    @Override // android.support.v7.widget.u
    public final ViewPropertyAnimatorCompat a(final int i, long j) {
        return ViewCompat.animate(this.a).alpha(i == 0 ? 1.0f : 0.0f).setDuration(j).setListener(new ViewPropertyAnimatorListenerAdapter() { // from class: android.support.v7.widget.ToolbarWidgetWrapper$2
            private boolean c = false;

            @Override // android.support.v4.view.ViewPropertyAnimatorListenerAdapter, android.support.v4.view.ViewPropertyAnimatorListener
            public void onAnimationStart(View view) {
                ax.this.a.setVisibility(0);
            }

            @Override // android.support.v4.view.ViewPropertyAnimatorListenerAdapter, android.support.v4.view.ViewPropertyAnimatorListener
            public void onAnimationEnd(View view) {
                if (this.c) {
                    return;
                }
                ax.this.a.setVisibility(i);
            }

            @Override // android.support.v4.view.ViewPropertyAnimatorListenerAdapter, android.support.v4.view.ViewPropertyAnimatorListener
            public void onAnimationCancel(View view) {
                this.c = true;
            }
        });
    }

    private void r() {
        if ((this.e & 4) != 0) {
            this.a.setNavigationIcon(this.j != null ? this.j : this.q);
        } else {
            this.a.setNavigationIcon((Drawable) null);
        }
    }

    private void d(CharSequence charSequence) {
        this.m = charSequence;
        s();
    }

    private void s() {
        if ((this.e & 4) != 0) {
            if (TextUtils.isEmpty(this.m)) {
                this.a.setNavigationContentDescription(this.p);
            } else {
                this.a.setNavigationContentDescription(this.m);
            }
        }
    }

    @Override // android.support.v7.widget.u
    public final void b(Drawable drawable) {
        ViewCompat.setBackground(this.a, drawable);
    }

    @Override // android.support.v7.widget.u
    public final void e(int i) {
        this.a.setVisibility(i);
    }

    @Override // android.support.v7.widget.u
    public final int o() {
        return this.a.getVisibility();
    }

    @Override // android.support.v7.widget.u
    public final void a(j.a aVar, MenuBuilder.a aVar2) {
        Toolbar toolbar = this.a;
        toolbar.n = aVar;
        toolbar.o = aVar2;
        if (toolbar.a != null) {
            toolbar.a.a(aVar, aVar2);
        }
    }

    @Override // android.support.v7.widget.u
    public final Menu p() {
        return this.a.getMenu();
    }

    @Override // android.support.v7.widget.u
    public final void a(int i) {
        a(i != 0 ? android.support.v7.content.res.b.b(this.a.getContext(), i) : null);
    }

    @Override // android.support.v7.widget.u
    public final void b(int i) {
        c(i != 0 ? android.support.v7.content.res.b.b(this.a.getContext(), i) : null);
    }

    @Override // android.support.v7.widget.u
    public final void d(int i) {
        d(i == 0 ? null : this.a.getContext().getString(i));
    }
}
