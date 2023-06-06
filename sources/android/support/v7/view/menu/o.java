package android.support.v7.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.os.Parcelable;
import android.support.constraint.R;
import android.support.v7.view.menu.j;
import android.support.v7.widget.ag;
import android.support.v7.widget.y;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class o extends h implements j, View.OnKeyListener, AdapterView.OnItemClickListener, PopupWindow.OnDismissListener {
    final ag a;
    View b;
    private final Context c;
    private final MenuBuilder d;
    private final e f;
    private final boolean g;
    private final int h;
    private final int i;
    private final int j;
    private PopupWindow.OnDismissListener m;
    private View n;
    private j.a o;
    private ViewTreeObserver p;
    private boolean q;
    private boolean r;
    private int s;
    private boolean u;
    private final ViewTreeObserver.OnGlobalLayoutListener k = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: android.support.v7.view.menu.o.1
        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            if (!o.this.f() || o.this.a.p) {
                return;
            }
            View view = o.this.b;
            if (view == null || !view.isShown()) {
                o.this.e();
            } else {
                o.this.a.d();
            }
        }
    };
    private final View.OnAttachStateChangeListener l = new View.OnAttachStateChangeListener() { // from class: android.support.v7.view.menu.o.2
        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
            if (o.this.p != null) {
                if (!o.this.p.isAlive()) {
                    o.this.p = view.getViewTreeObserver();
                }
                o.this.p.removeGlobalOnLayoutListener(o.this.k);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    };
    private int t = 0;

    @Override // android.support.v7.view.menu.j
    public final void a(Parcelable parcelable) {
    }

    @Override // android.support.v7.view.menu.h
    public final void a(MenuBuilder menuBuilder) {
    }

    @Override // android.support.v7.view.menu.j
    public final boolean a() {
        return false;
    }

    @Override // android.support.v7.view.menu.j
    public final Parcelable c() {
        return null;
    }

    public o(Context context, MenuBuilder menuBuilder, View view, int i, int i2, boolean z) {
        this.c = context;
        this.d = menuBuilder;
        this.g = z;
        this.f = new e(menuBuilder, LayoutInflater.from(context), this.g);
        this.i = i;
        this.j = i2;
        Resources resources = context.getResources();
        this.h = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.n = view;
        this.a = new ag(this.c, null, this.i, this.j);
        menuBuilder.a(this, context);
    }

    @Override // android.support.v7.view.menu.h
    public final void b(boolean z) {
        this.f.c = z;
    }

    @Override // android.support.v7.view.menu.h
    public final void a(int i) {
        this.t = i;
    }

    @Override // android.support.v7.view.menu.n
    public final void e() {
        if (f()) {
            this.a.e();
        }
    }

    @Override // android.support.v7.view.menu.n
    public final boolean f() {
        return !this.q && this.a.q.isShowing();
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.q = true;
        this.d.close();
        if (this.p != null) {
            if (!this.p.isAlive()) {
                this.p = this.b.getViewTreeObserver();
            }
            this.p.removeGlobalOnLayoutListener(this.k);
            this.p = null;
        }
        this.b.removeOnAttachStateChangeListener(this.l);
        if (this.m != null) {
            this.m.onDismiss();
        }
    }

    @Override // android.support.v7.view.menu.j
    public final void a(boolean z) {
        this.r = false;
        if (this.f != null) {
            this.f.notifyDataSetChanged();
        }
    }

    @Override // android.support.v7.view.menu.j
    public final void a(j.a aVar) {
        this.o = aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0053  */
    @Override // android.support.v7.view.menu.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a(android.support.v7.view.menu.SubMenuBuilder r10) {
        /*
            r9 = this;
            boolean r0 = r10.hasVisibleItems()
            r1 = 0
            if (r0 == 0) goto L5d
            android.support.v7.view.menu.i r0 = new android.support.v7.view.menu.i
            android.content.Context r3 = r9.c
            android.view.View r5 = r9.b
            boolean r6 = r9.g
            int r7 = r9.i
            int r8 = r9.j
            r2 = r0
            r4 = r10
            r2.<init>(r3, r4, r5, r6, r7, r8)
            android.support.v7.view.menu.j$a r2 = r9.o
            r0.a(r2)
            boolean r2 = android.support.v7.view.menu.h.b(r10)
            r0.a(r2)
            int r2 = r9.t
            r0.b = r2
            android.widget.PopupWindow$OnDismissListener r2 = r9.m
            r0.c = r2
            r2 = 0
            r9.m = r2
            android.support.v7.view.menu.MenuBuilder r2 = r9.d
            r2.b(r1)
            android.support.v7.widget.ag r2 = r9.a
            int r2 = r2.g
            android.support.v7.widget.ag r3 = r9.a
            int r3 = r3.b()
            boolean r4 = r0.e()
            r5 = 1
            if (r4 == 0) goto L47
        L45:
            r0 = 1
            goto L51
        L47:
            android.view.View r4 = r0.a
            if (r4 != 0) goto L4d
            r0 = 0
            goto L51
        L4d:
            r0.a(r2, r3, r5, r5)
            goto L45
        L51:
            if (r0 == 0) goto L5d
            android.support.v7.view.menu.j$a r0 = r9.o
            if (r0 == 0) goto L5c
            android.support.v7.view.menu.j$a r0 = r9.o
            r0.a(r10)
        L5c:
            return r5
        L5d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.view.menu.o.a(android.support.v7.view.menu.SubMenuBuilder):boolean");
    }

    @Override // android.support.v7.view.menu.j
    public final void a(MenuBuilder menuBuilder, boolean z) {
        if (menuBuilder != this.d) {
            return;
        }
        e();
        if (this.o != null) {
            this.o.a(menuBuilder, z);
        }
    }

    @Override // android.support.v7.view.menu.h
    public final void a(View view) {
        this.n = view;
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1 && i == 82) {
            e();
            return true;
        }
        return false;
    }

    @Override // android.support.v7.view.menu.h
    public final void a(PopupWindow.OnDismissListener onDismissListener) {
        this.m = onDismissListener;
    }

    @Override // android.support.v7.view.menu.n
    public final ListView g() {
        return this.a.e;
    }

    @Override // android.support.v7.view.menu.h
    public final void b(int i) {
        this.a.g = i;
    }

    @Override // android.support.v7.view.menu.h
    public final void c(int i) {
        this.a.a(i);
    }

    @Override // android.support.v7.view.menu.h
    public final void c(boolean z) {
        this.u = z;
    }

    @Override // android.support.v7.view.menu.n
    public final void d() {
        boolean z = true;
        if (!f()) {
            if (this.q || this.n == null) {
                z = false;
            } else {
                this.b = this.n;
                this.a.a((PopupWindow.OnDismissListener) this);
                this.a.l = this;
                this.a.a(true);
                View view = this.b;
                boolean z2 = this.p == null;
                this.p = view.getViewTreeObserver();
                if (z2) {
                    this.p.addOnGlobalLayoutListener(this.k);
                }
                view.addOnAttachStateChangeListener(this.l);
                this.a.k = view;
                this.a.h = this.t;
                if (!this.r) {
                    this.s = a(this.f, null, this.c, this.h);
                    this.r = true;
                }
                this.a.b(this.s);
                this.a.c(2);
                this.a.o = this.e;
                this.a.d();
                y yVar = this.a.e;
                yVar.setOnKeyListener(this);
                if (this.u && this.d.f != null) {
                    FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(this.c).inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) yVar, false);
                    TextView textView = (TextView) frameLayout.findViewById(16908310);
                    if (textView != null) {
                        textView.setText(this.d.f);
                    }
                    frameLayout.setEnabled(false);
                    yVar.addHeaderView(frameLayout, null, false);
                }
                this.a.a((ListAdapter) this.f);
                this.a.d();
            }
        }
        if (!z) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
    }
}
