package android.support.v7.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.support.annotation.RestrictTo;
import android.support.constraint.R;
import android.support.v4.view.ViewCompat;
import android.support.v4.view.ViewPropertyAnimatorCompat;
import android.support.v4.view.ViewPropertyAnimatorListener;
import android.support.v4.view.ViewPropertyAnimatorListenerAdapter;
import android.support.v4.view.ViewPropertyAnimatorUpdateListener;
import android.support.v7.app.ActionBar;
import android.support.v7.view.b;
import android.support.v7.view.menu.MenuBuilder;
import android.support.v7.widget.ActionBarContainer;
import android.support.v7.widget.ActionBarContextView;
import android.support.v7.widget.ActionBarOverlayLayout;
import android.support.v7.widget.Toolbar;
import android.support.v7.widget.ap;
import android.support.v7.widget.u;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import com.meituan.robust.common.StringUtil;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
/* compiled from: ProGuard */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes.dex */
public class n extends ActionBar implements ActionBarOverlayLayout.a {
    static final /* synthetic */ boolean s = !n.class.desiredAssertionStatus();
    private static final Interpolator t = new AccelerateInterpolator();
    private static final Interpolator u = new DecelerateInterpolator();
    private boolean A;
    private boolean B;
    private boolean D;
    private boolean F;
    private boolean H;
    Context a;
    ActionBarOverlayLayout b;
    ActionBarContainer c;
    u d;
    ActionBarContextView e;
    View f;
    ap g;
    a h;
    android.support.v7.view.b i;
    b.a j;
    boolean l;
    boolean m;
    android.support.v7.view.h n;
    boolean o;
    private Context v;
    private Activity w;
    private Dialog x;
    private ArrayList<Object> y = new ArrayList<>();
    private int z = -1;
    private ArrayList<Object> C = new ArrayList<>();
    private int E = 0;
    boolean k = true;
    private boolean G = true;
    final ViewPropertyAnimatorListener p = new ViewPropertyAnimatorListenerAdapter() { // from class: android.support.v7.app.WindowDecorActionBar$1
        @Override // android.support.v4.view.ViewPropertyAnimatorListenerAdapter, android.support.v4.view.ViewPropertyAnimatorListener
        public void onAnimationEnd(View view) {
            if (n.this.k && n.this.f != null) {
                n.this.f.setTranslationY(0.0f);
                n.this.c.setTranslationY(0.0f);
            }
            n.this.c.setVisibility(8);
            n.this.c.setTransitioning(false);
            n.this.n = null;
            n nVar = n.this;
            if (nVar.j != null) {
                nVar.j.a(nVar.i);
                nVar.i = null;
                nVar.j = null;
            }
            if (n.this.b != null) {
                ViewCompat.requestApplyInsets(n.this.b);
            }
        }
    };
    final ViewPropertyAnimatorListener q = new ViewPropertyAnimatorListenerAdapter() { // from class: android.support.v7.app.WindowDecorActionBar$2
        @Override // android.support.v4.view.ViewPropertyAnimatorListenerAdapter, android.support.v4.view.ViewPropertyAnimatorListener
        public void onAnimationEnd(View view) {
            n.this.n = null;
            n.this.c.requestLayout();
        }
    };
    final ViewPropertyAnimatorUpdateListener r = new ViewPropertyAnimatorUpdateListener() { // from class: android.support.v7.app.WindowDecorActionBar$3
        @Override // android.support.v4.view.ViewPropertyAnimatorUpdateListener
        public void onAnimationUpdate(View view) {
            ((View) n.this.c.getParent()).invalidate();
        }
    };

    static boolean a(boolean z, boolean z2, boolean z3) {
        if (z3) {
            return true;
        }
        return (z || z2) ? false : true;
    }

    public n(Activity activity, boolean z) {
        this.w = activity;
        View decorView = activity.getWindow().getDecorView();
        a(decorView);
        if (z) {
            return;
        }
        this.f = decorView.findViewById(16908290);
    }

    public n(Dialog dialog) {
        this.x = dialog;
        a(dialog.getWindow().getDecorView());
    }

    private void a(View view) {
        this.b = (ActionBarOverlayLayout) view.findViewById(R.id.decor_content_parent);
        if (this.b != null) {
            this.b.setActionBarVisibilityCallback(this);
        }
        this.d = b(view.findViewById(R.id.action_bar));
        this.e = (ActionBarContextView) view.findViewById(R.id.action_context_bar);
        this.c = (ActionBarContainer) view.findViewById(R.id.action_bar_container);
        if (this.d == null || this.e == null || this.c == null) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with a compatible window decor layout");
        }
        this.a = this.d.b();
        if ((this.d.m() & 4) != 0) {
            this.A = true;
        }
        android.support.v7.view.a a2 = android.support.v7.view.a.a(this.a);
        a2.d();
        i(a2.b());
        TypedArray obtainStyledAttributes = this.a.obtainStyledAttributes(null, new int[]{R.attr.background, R.attr.height, R.attr.title, R.attr.navigationMode, R.attr.displayOptions, R.attr.subtitle, R.attr.titleTextStyle, R.attr.subtitleTextStyle, R.attr.icon, R.attr.logo, R.attr.divider, R.attr.backgroundStacked, R.attr.backgroundSplit, R.attr.customNavigationLayout, R.attr.homeLayout, R.attr.progressBarStyle, R.attr.indeterminateProgressStyle, R.attr.progressBarPadding, R.attr.itemPadding, R.attr.hideOnContentScroll, R.attr.contentInsetStart, R.attr.contentInsetEnd, R.attr.contentInsetLeft, R.attr.contentInsetRight, R.attr.contentInsetStartWithNavigation, R.attr.contentInsetEndWithActions, R.attr.elevation, R.attr.popupTheme, R.attr.homeAsUpIndicator}, R.attr.actionBarStyle, 0);
        if (obtainStyledAttributes.getBoolean(19, false)) {
            c(true);
        }
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(26, 0);
        if (dimensionPixelSize != 0) {
            a(dimensionPixelSize);
        }
        obtainStyledAttributes.recycle();
    }

    private static u b(View view) {
        if (view instanceof u) {
            return (u) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        StringBuilder sb = new StringBuilder("Can't make a decor toolbar out of ");
        sb.append(view);
        throw new IllegalStateException(sb.toString() != null ? view.getClass().getSimpleName() : StringUtil.NULL);
    }

    @Override // android.support.v7.app.ActionBar
    public final void a(float f) {
        ViewCompat.setElevation(this.c, f);
    }

    @Override // android.support.v7.app.ActionBar
    public final void a(Configuration configuration) {
        i(android.support.v7.view.a.a(this.a).b());
    }

    private void i(boolean z) {
        this.D = z;
        if (!this.D) {
            this.d.a((ap) null);
            this.c.setTabContainer(this.g);
        } else {
            this.c.setTabContainer(null);
            this.d.a(this.g);
        }
        boolean z2 = true;
        boolean z3 = n() == 2;
        if (this.g != null) {
            if (z3) {
                this.g.setVisibility(0);
                if (this.b != null) {
                    ViewCompat.requestApplyInsets(this.b);
                }
            } else {
                this.g.setVisibility(8);
            }
        }
        this.d.a(!this.D && z3);
        this.b.setHasNonEmbeddedTabs((this.D || !z3) ? false : false);
    }

    @Override // android.support.v7.widget.ActionBarOverlayLayout.a
    public final void d(int i) {
        this.E = i;
    }

    @Override // android.support.v7.app.ActionBar
    public final void e(boolean z) {
        this.H = z;
        if (z || this.n == null) {
            return;
        }
        this.n.cancel();
    }

    @Override // android.support.v7.app.ActionBar
    public final void f(boolean z) {
        if (z == this.B) {
            return;
        }
        this.B = z;
        int size = this.C.size();
        for (int i = 0; i < size; i++) {
            this.C.get(i);
        }
    }

    @Override // android.support.v7.app.ActionBar
    public final void a(boolean z) {
        a(z ? 4 : 0, 4);
    }

    @Override // android.support.v7.app.ActionBar
    public final void b(boolean z) {
        a(0, 8);
    }

    @Override // android.support.v7.app.ActionBar
    public final void a(int i) {
        a(this.a.getString(R.string.paybase__password_title1));
    }

    @Override // android.support.v7.app.ActionBar
    public final void a(CharSequence charSequence) {
        this.d.b(charSequence);
    }

    @Override // android.support.v7.app.ActionBar
    public final void b(CharSequence charSequence) {
        this.d.a(charSequence);
    }

    @Override // android.support.v7.app.ActionBar
    public final void b(int i) {
        this.d.c(16);
    }

    @Override // android.support.v7.app.ActionBar
    public final void a(int i, int i2) {
        int m = this.d.m();
        if ((i2 & 4) != 0) {
            this.A = true;
        }
        this.d.c((i & i2) | ((~i2) & m));
    }

    @Override // android.support.v7.app.ActionBar
    public final void a(Drawable drawable) {
        this.c.setPrimaryBackground(drawable);
    }

    private int n() {
        return this.d.n();
    }

    @Override // android.support.v7.app.ActionBar
    public final int a() {
        return this.d.m();
    }

    @Override // android.support.v7.app.ActionBar
    public final android.support.v7.view.b a(b.a aVar) {
        if (this.h != null) {
            this.h.c();
        }
        this.b.setHideOnContentScrollEnabled(false);
        this.e.c();
        a aVar2 = new a(this.e.getContext(), aVar);
        if (aVar2.e()) {
            this.h = aVar2;
            aVar2.d();
            this.e.a(aVar2);
            h(true);
            this.e.sendAccessibilityEvent(32);
            return aVar2;
        }
        return null;
    }

    @Override // android.support.v7.widget.ActionBarOverlayLayout.a
    public final void g(boolean z) {
        this.k = z;
    }

    @Override // android.support.v7.app.ActionBar
    public final void b() {
        if (this.l) {
            this.l = false;
            j(false);
        }
    }

    private void o() {
        if (this.F) {
            return;
        }
        this.F = true;
        if (this.b != null) {
            this.b.setShowingForActionMode(true);
        }
        j(false);
    }

    @Override // android.support.v7.widget.ActionBarOverlayLayout.a
    public final void k() {
        if (this.m) {
            this.m = false;
            j(true);
        }
    }

    @Override // android.support.v7.app.ActionBar
    public final void c() {
        if (this.l) {
            return;
        }
        this.l = true;
        j(false);
    }

    private void p() {
        if (this.F) {
            this.F = false;
            if (this.b != null) {
                this.b.setShowingForActionMode(false);
            }
            j(false);
        }
    }

    @Override // android.support.v7.widget.ActionBarOverlayLayout.a
    public final void l() {
        if (this.m) {
            return;
        }
        this.m = true;
        j(true);
    }

    @Override // android.support.v7.app.ActionBar
    public final void c(boolean z) {
        if (!this.b.b) {
            throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
        }
        this.o = true;
        this.b.setHideOnContentScrollEnabled(true);
    }

    private void j(boolean z) {
        if (a(this.l, this.m, this.F)) {
            if (this.G) {
                return;
            }
            this.G = true;
            k(z);
        } else if (this.G) {
            this.G = false;
            l(z);
        }
    }

    private void k(boolean z) {
        int[] iArr;
        if (this.n != null) {
            this.n.cancel();
        }
        this.c.setVisibility(0);
        if (this.E == 0 && (this.H || z)) {
            this.c.setTranslationY(0.0f);
            float f = -this.c.getHeight();
            if (z) {
                this.c.getLocationInWindow(new int[]{0, 0});
                f -= iArr[1];
            }
            this.c.setTranslationY(f);
            android.support.v7.view.h hVar = new android.support.v7.view.h();
            ViewPropertyAnimatorCompat translationY = ViewCompat.animate(this.c).translationY(0.0f);
            translationY.setUpdateListener(this.r);
            hVar.a(translationY);
            if (this.k && this.f != null) {
                this.f.setTranslationY(f);
                hVar.a(ViewCompat.animate(this.f).translationY(0.0f));
            }
            hVar.a(u);
            hVar.a(250L);
            hVar.a(this.q);
            this.n = hVar;
            hVar.a();
        } else {
            this.c.setAlpha(1.0f);
            this.c.setTranslationY(0.0f);
            if (this.k && this.f != null) {
                this.f.setTranslationY(0.0f);
            }
            this.q.onAnimationEnd(null);
        }
        if (this.b != null) {
            ViewCompat.requestApplyInsets(this.b);
        }
    }

    private void l(boolean z) {
        int[] iArr;
        if (this.n != null) {
            this.n.cancel();
        }
        if (this.E == 0 && (this.H || z)) {
            this.c.setAlpha(1.0f);
            this.c.setTransitioning(true);
            android.support.v7.view.h hVar = new android.support.v7.view.h();
            float f = -this.c.getHeight();
            if (z) {
                this.c.getLocationInWindow(new int[]{0, 0});
                f -= iArr[1];
            }
            ViewPropertyAnimatorCompat translationY = ViewCompat.animate(this.c).translationY(f);
            translationY.setUpdateListener(this.r);
            hVar.a(translationY);
            if (this.k && this.f != null) {
                hVar.a(ViewCompat.animate(this.f).translationY(f));
            }
            hVar.a(t);
            hVar.a(250L);
            hVar.a(this.p);
            this.n = hVar;
            hVar.a();
            return;
        }
        this.p.onAnimationEnd(null);
    }

    public final void h(boolean z) {
        ViewPropertyAnimatorCompat a2;
        ViewPropertyAnimatorCompat a3;
        if (z) {
            o();
        } else {
            p();
        }
        if (!ViewCompat.isLaidOut(this.c)) {
            if (z) {
                this.d.e(4);
                this.e.setVisibility(0);
                return;
            }
            this.d.e(0);
            this.e.setVisibility(8);
            return;
        }
        if (z) {
            a3 = this.d.a(4, 100L);
            a2 = this.e.a(0, 200L);
        } else {
            a2 = this.d.a(0, 200L);
            a3 = this.e.a(8, 100L);
        }
        android.support.v7.view.h hVar = new android.support.v7.view.h();
        hVar.a(a3, a2);
        hVar.a();
    }

    @Override // android.support.v7.app.ActionBar
    public final Context e() {
        if (this.v == null) {
            TypedValue typedValue = new TypedValue();
            this.a.getTheme().resolveAttribute(R.attr.actionBarWidgetTheme, typedValue, true);
            int i = typedValue.resourceId;
            if (i != 0) {
                this.v = new ContextThemeWrapper(this.a, i);
            } else {
                this.v = this.a;
            }
        }
        return this.v;
    }

    @Override // android.support.v7.app.ActionBar
    public final void c(int i) {
        this.d.d(i);
    }

    @Override // android.support.v7.widget.ActionBarOverlayLayout.a
    public final void m() {
        if (this.n != null) {
            this.n.cancel();
            this.n = null;
        }
    }

    @Override // android.support.v7.app.ActionBar
    public final boolean i() {
        if (this.d == null || !this.d.c()) {
            return false;
        }
        this.d.d();
        return true;
    }

    /* compiled from: ProGuard */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* loaded from: classes.dex */
    public class a extends android.support.v7.view.b implements MenuBuilder.a {
        final MenuBuilder a;
        private final Context e;
        private b.a f;
        private WeakReference<View> g;

        public a(Context context, b.a aVar) {
            this.e = context;
            this.f = aVar;
            MenuBuilder menuBuilder = new MenuBuilder(context);
            menuBuilder.e = 1;
            this.a = menuBuilder;
            this.a.a(this);
        }

        @Override // android.support.v7.view.b
        public final MenuInflater a() {
            return new android.support.v7.view.g(this.e);
        }

        @Override // android.support.v7.view.b
        public final Menu b() {
            return this.a;
        }

        @Override // android.support.v7.view.b
        public final void c() {
            if (n.this.h != this) {
                return;
            }
            if (!n.a(n.this.l, n.this.m, false)) {
                n.this.i = this;
                n.this.j = this.f;
            } else {
                this.f.a(this);
            }
            this.f = null;
            n.this.h(false);
            n.this.e.b();
            n.this.d.a().sendAccessibilityEvent(32);
            n.this.b.setHideOnContentScrollEnabled(n.this.o);
            n.this.h = null;
        }

        @Override // android.support.v7.view.b
        public final void d() {
            if (n.this.h != this) {
                return;
            }
            this.a.d();
            try {
                this.f.b(this, this.a);
            } finally {
                this.a.e();
            }
        }

        public final boolean e() {
            this.a.d();
            try {
                return this.f.a(this, this.a);
            } finally {
                this.a.e();
            }
        }

        @Override // android.support.v7.view.b
        public final void a(View view) {
            n.this.e.setCustomView(view);
            this.g = new WeakReference<>(view);
        }

        @Override // android.support.v7.view.b
        public final void a(CharSequence charSequence) {
            n.this.e.setSubtitle(charSequence);
        }

        @Override // android.support.v7.view.b
        public final void b(CharSequence charSequence) {
            n.this.e.setTitle(charSequence);
        }

        @Override // android.support.v7.view.b
        public final void a(int i) {
            b(n.this.a.getResources().getString(i));
        }

        @Override // android.support.v7.view.b
        public final void b(int i) {
            a(n.this.a.getResources().getString(i));
        }

        @Override // android.support.v7.view.b
        public final CharSequence f() {
            return n.this.e.getTitle();
        }

        @Override // android.support.v7.view.b
        public final CharSequence g() {
            return n.this.e.getSubtitle();
        }

        @Override // android.support.v7.view.b
        public final void a(boolean z) {
            super.a(z);
            n.this.e.setTitleOptional(z);
        }

        @Override // android.support.v7.view.b
        public final boolean h() {
            return n.this.e.g;
        }

        @Override // android.support.v7.view.b
        public final View i() {
            if (this.g != null) {
                return this.g.get();
            }
            return null;
        }

        @Override // android.support.v7.view.menu.MenuBuilder.a
        public final boolean a(MenuBuilder menuBuilder, MenuItem menuItem) {
            if (this.f != null) {
                return this.f.a(this, menuItem);
            }
            return false;
        }

        @Override // android.support.v7.view.menu.MenuBuilder.a
        public final void a(MenuBuilder menuBuilder) {
            if (this.f == null) {
                return;
            }
            d();
            n.this.e.a();
        }
    }

    @Override // android.support.v7.app.ActionBar
    public final void a(View view, ActionBar.a aVar) {
        view.setLayoutParams(aVar);
        this.d.a(view);
    }

    @Override // android.support.v7.app.ActionBar
    public final void d(boolean z) {
        if (this.A) {
            return;
        }
        a(z);
    }

    @Override // android.support.v7.app.ActionBar
    public final boolean a(int i, KeyEvent keyEvent) {
        MenuBuilder menuBuilder;
        if (this.h == null || (menuBuilder = this.h.a) == null) {
            return false;
        }
        menuBuilder.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
        return menuBuilder.performShortcut(i, keyEvent, 0);
    }

    @Override // android.support.v7.app.ActionBar
    public final boolean d() {
        int height = this.c.getHeight();
        if (this.G) {
            return height == 0 || this.b.getActionBarHideOffset() < height;
        }
        return false;
    }
}
