package android.support.v7.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Parcelable;
import android.os.SystemClock;
import android.support.annotation.AttrRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.StyleRes;
import android.support.constraint.R;
import android.support.v4.view.GravityCompat;
import android.support.v4.view.ViewCompat;
import android.support.v7.view.menu.j;
import android.support.v7.widget.af;
import android.support.v7.widget.ag;
import android.support.v7.widget.y;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class CascadingMenuPopup extends h implements j, View.OnKeyListener, PopupWindow.OnDismissListener {
    private PopupWindow.OnDismissListener A;
    final Handler a;
    View c;
    boolean d;
    private final Context f;
    private final int g;
    private final int h;
    private final int i;
    private final boolean j;
    private View q;
    private boolean s;
    private boolean t;
    private int u;
    private int v;
    private boolean x;
    private j.a y;
    private ViewTreeObserver z;
    private final List<MenuBuilder> k = new LinkedList();
    final List<a> b = new ArrayList();
    private final ViewTreeObserver.OnGlobalLayoutListener l = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: android.support.v7.view.menu.CascadingMenuPopup.1
        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            if (!CascadingMenuPopup.this.f() || CascadingMenuPopup.this.b.size() <= 0 || CascadingMenuPopup.this.b.get(0).a.p) {
                return;
            }
            View view = CascadingMenuPopup.this.c;
            if (view == null || !view.isShown()) {
                CascadingMenuPopup.this.e();
                return;
            }
            for (a aVar : CascadingMenuPopup.this.b) {
                aVar.a.d();
            }
        }
    };
    private final View.OnAttachStateChangeListener m = new View.OnAttachStateChangeListener() { // from class: android.support.v7.view.menu.CascadingMenuPopup.2
        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
            if (CascadingMenuPopup.this.z != null) {
                if (!CascadingMenuPopup.this.z.isAlive()) {
                    CascadingMenuPopup.this.z = view.getViewTreeObserver();
                }
                CascadingMenuPopup.this.z.removeGlobalOnLayoutListener(CascadingMenuPopup.this.l);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    };
    private final af n = new af() { // from class: android.support.v7.view.menu.CascadingMenuPopup.3
        @Override // android.support.v7.widget.af
        public final void a(@NonNull MenuBuilder menuBuilder, @NonNull MenuItem menuItem) {
            CascadingMenuPopup.this.a.removeCallbacksAndMessages(menuBuilder);
        }

        @Override // android.support.v7.widget.af
        public final void b(@NonNull final MenuBuilder menuBuilder, @NonNull final MenuItem menuItem) {
            CascadingMenuPopup.this.a.removeCallbacksAndMessages(null);
            int size = CascadingMenuPopup.this.b.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    i = -1;
                    break;
                } else if (menuBuilder == CascadingMenuPopup.this.b.get(i).b) {
                    break;
                } else {
                    i++;
                }
            }
            if (i == -1) {
                return;
            }
            int i2 = i + 1;
            final a aVar = i2 < CascadingMenuPopup.this.b.size() ? CascadingMenuPopup.this.b.get(i2) : null;
            CascadingMenuPopup.this.a.postAtTime(new Runnable() { // from class: android.support.v7.view.menu.CascadingMenuPopup.3.1
                @Override // java.lang.Runnable
                public final void run() {
                    if (aVar != null) {
                        CascadingMenuPopup.this.d = true;
                        aVar.b.b(false);
                        CascadingMenuPopup.this.d = false;
                    }
                    if (menuItem.isEnabled() && menuItem.hasSubMenu()) {
                        menuBuilder.a(menuItem, (j) null, 4);
                    }
                }
            }, menuBuilder, SystemClock.uptimeMillis() + 200);
        }
    };
    private int o = 0;
    private int p = 0;
    private boolean w = false;
    private int r = j();

    /* compiled from: ProGuard */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface HorizPosition {
    }

    @Override // android.support.v7.view.menu.j
    public final void a(Parcelable parcelable) {
    }

    @Override // android.support.v7.view.menu.j
    public final boolean a() {
        return false;
    }

    @Override // android.support.v7.view.menu.j
    public final Parcelable c() {
        return null;
    }

    @Override // android.support.v7.view.menu.h
    protected final boolean h() {
        return false;
    }

    public CascadingMenuPopup(@NonNull Context context, @NonNull View view, @AttrRes int i, @StyleRes int i2, boolean z) {
        this.f = context;
        this.q = view;
        this.h = i;
        this.i = i2;
        this.j = z;
        Resources resources = context.getResources();
        this.g = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.a = new Handler();
    }

    @Override // android.support.v7.view.menu.h
    public final void b(boolean z) {
        this.w = z;
    }

    private ag i() {
        ag agVar = new ag(this.f, null, this.h, this.i);
        agVar.a = this.n;
        agVar.l = this;
        agVar.a((PopupWindow.OnDismissListener) this);
        agVar.k = this.q;
        agVar.h = this.p;
        agVar.a(true);
        agVar.c(2);
        return agVar;
    }

    @Override // android.support.v7.view.menu.n
    public final void d() {
        if (f()) {
            return;
        }
        for (MenuBuilder menuBuilder : this.k) {
            c(menuBuilder);
        }
        this.k.clear();
        this.c = this.q;
        if (this.c != null) {
            boolean z = this.z == null;
            this.z = this.c.getViewTreeObserver();
            if (z) {
                this.z.addOnGlobalLayoutListener(this.l);
            }
            this.c.addOnAttachStateChangeListener(this.m);
        }
    }

    @Override // android.support.v7.view.menu.n
    public final void e() {
        int size = this.b.size();
        if (size > 0) {
            a[] aVarArr = (a[]) this.b.toArray(new a[size]);
            for (int i = size - 1; i >= 0; i--) {
                a aVar = aVarArr[i];
                if (aVar.a.q.isShowing()) {
                    aVar.a.e();
                }
            }
        }
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1 && i == 82) {
            e();
            return true;
        }
        return false;
    }

    private int j() {
        return ViewCompat.getLayoutDirection(this.q) == 1 ? 0 : 1;
    }

    private int d(int i) {
        y yVar = this.b.get(this.b.size() - 1).a.e;
        int[] iArr = new int[2];
        yVar.getLocationOnScreen(iArr);
        Rect rect = new Rect();
        this.c.getWindowVisibleDisplayFrame(rect);
        return this.r == 1 ? (iArr[0] + yVar.getWidth()) + i > rect.right ? 0 : 1 : iArr[0] - i < 0 ? 1 : 0;
    }

    @Override // android.support.v7.view.menu.h
    public final void a(MenuBuilder menuBuilder) {
        menuBuilder.a(this, this.f);
        if (f()) {
            c(menuBuilder);
        } else {
            this.k.add(menuBuilder);
        }
    }

    private void c(@NonNull MenuBuilder menuBuilder) {
        a aVar;
        View view;
        int i;
        int i2;
        int width;
        LayoutInflater from = LayoutInflater.from(this.f);
        e eVar = new e(menuBuilder, from, this.j);
        if (f() || !this.w) {
            if (f()) {
                eVar.c = h.b(menuBuilder);
            }
        } else {
            eVar.c = true;
        }
        int a2 = a(eVar, null, this.f, this.g);
        ag i3 = i();
        i3.a((ListAdapter) eVar);
        i3.b(a2);
        i3.h = this.p;
        if (this.b.size() > 0) {
            aVar = this.b.get(this.b.size() - 1);
            view = a(aVar, menuBuilder);
        } else {
            aVar = null;
            view = null;
        }
        if (view != null) {
            i3.c(false);
            i3.a((Object) null);
            int d = d(a2);
            boolean z = d == 1;
            this.r = d;
            if (Build.VERSION.SDK_INT < 26) {
                int[] iArr = new int[2];
                this.q.getLocationOnScreen(iArr);
                int[] iArr2 = new int[2];
                view.getLocationOnScreen(iArr2);
                i = iArr2[0] - iArr[0];
                i2 = iArr2[1] - iArr[1];
            } else {
                i3.k = view;
                i2 = 0;
                i = 0;
            }
            if ((this.p & 5) == 5) {
                width = z ? i + a2 : i - view.getWidth();
            } else {
                width = z ? i + view.getWidth() : i - a2;
            }
            i3.g = width;
            i3.b(true);
            i3.a(i2);
        } else {
            if (this.s) {
                i3.g = this.u;
            }
            if (this.t) {
                i3.a(this.v);
            }
            i3.o = this.e;
        }
        this.b.add(new a(i3, menuBuilder, this.r));
        i3.d();
        y yVar = i3.e;
        yVar.setOnKeyListener(this);
        if (aVar == null && this.x && menuBuilder.f != null) {
            FrameLayout frameLayout = (FrameLayout) from.inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) yVar, false);
            frameLayout.setEnabled(false);
            ((TextView) frameLayout.findViewById(16908310)).setText(menuBuilder.f);
            yVar.addHeaderView(frameLayout, null, false);
            i3.d();
        }
    }

    private static MenuItem a(@NonNull MenuBuilder menuBuilder, @NonNull MenuBuilder menuBuilder2) {
        int size = menuBuilder.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = menuBuilder.getItem(i);
            if (item.hasSubMenu() && menuBuilder2 == item.getSubMenu()) {
                return item;
            }
        }
        return null;
    }

    @Nullable
    private View a(@NonNull a aVar, @NonNull MenuBuilder menuBuilder) {
        e eVar;
        int i;
        int firstVisiblePosition;
        MenuItem a2 = a(aVar.b, menuBuilder);
        if (a2 == null) {
            return null;
        }
        y yVar = aVar.a.e;
        ListAdapter adapter = yVar.getAdapter();
        int i2 = 0;
        if (adapter instanceof HeaderViewListAdapter) {
            HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
            i = headerViewListAdapter.getHeadersCount();
            eVar = (e) headerViewListAdapter.getWrappedAdapter();
        } else {
            eVar = (e) adapter;
            i = 0;
        }
        int count = eVar.getCount();
        while (true) {
            if (i2 >= count) {
                i2 = -1;
                break;
            } else if (a2 == eVar.getItem(i2)) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 != -1 && (firstVisiblePosition = (i2 + i) - yVar.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < yVar.getChildCount()) {
            return yVar.getChildAt(firstVisiblePosition);
        }
        return null;
    }

    @Override // android.support.v7.view.menu.n
    public final boolean f() {
        return this.b.size() > 0 && this.b.get(0).a.q.isShowing();
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        a aVar;
        int size = this.b.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                aVar = null;
                break;
            }
            aVar = this.b.get(i);
            if (!aVar.a.q.isShowing()) {
                break;
            }
            i++;
        }
        if (aVar != null) {
            aVar.b.b(false);
        }
    }

    @Override // android.support.v7.view.menu.j
    public final void a(boolean z) {
        for (a aVar : this.b) {
            a(aVar.a.e.getAdapter()).notifyDataSetChanged();
        }
    }

    @Override // android.support.v7.view.menu.j
    public final void a(j.a aVar) {
        this.y = aVar;
    }

    @Override // android.support.v7.view.menu.j
    public final boolean a(SubMenuBuilder subMenuBuilder) {
        for (a aVar : this.b) {
            if (subMenuBuilder == aVar.b) {
                aVar.a.e.requestFocus();
                return true;
            }
        }
        if (subMenuBuilder.hasVisibleItems()) {
            a((MenuBuilder) subMenuBuilder);
            if (this.y != null) {
                this.y.a(subMenuBuilder);
            }
            return true;
        }
        return false;
    }

    @Override // android.support.v7.view.menu.h
    public final void a(int i) {
        if (this.o != i) {
            this.o = i;
            this.p = GravityCompat.getAbsoluteGravity(i, ViewCompat.getLayoutDirection(this.q));
        }
    }

    @Override // android.support.v7.view.menu.h
    public final void a(@NonNull View view) {
        if (this.q != view) {
            this.q = view;
            this.p = GravityCompat.getAbsoluteGravity(this.o, ViewCompat.getLayoutDirection(this.q));
        }
    }

    @Override // android.support.v7.view.menu.h
    public final void a(PopupWindow.OnDismissListener onDismissListener) {
        this.A = onDismissListener;
    }

    @Override // android.support.v7.view.menu.n
    public final ListView g() {
        if (this.b.isEmpty()) {
            return null;
        }
        return this.b.get(this.b.size() - 1).a.e;
    }

    @Override // android.support.v7.view.menu.h
    public final void b(int i) {
        this.s = true;
        this.u = i;
    }

    @Override // android.support.v7.view.menu.h
    public final void c(int i) {
        this.t = true;
        this.v = i;
    }

    @Override // android.support.v7.view.menu.h
    public final void c(boolean z) {
        this.x = z;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static class a {
        public final ag a;
        public final MenuBuilder b;
        public final int c;

        public a(@NonNull ag agVar, @NonNull MenuBuilder menuBuilder, int i) {
            this.a = agVar;
            this.b = menuBuilder;
            this.c = i;
        }
    }

    @Override // android.support.v7.view.menu.j
    public final void a(MenuBuilder menuBuilder, boolean z) {
        int size = this.b.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (menuBuilder == this.b.get(i).b) {
                break;
            } else {
                i++;
            }
        }
        if (i < 0) {
            return;
        }
        int i2 = i + 1;
        if (i2 < this.b.size()) {
            this.b.get(i2).b.b(false);
        }
        a remove = this.b.remove(i);
        remove.b.b(this);
        if (this.d) {
            ag agVar = remove.a;
            if (Build.VERSION.SDK_INT >= 23) {
                agVar.q.setExitTransition(null);
            }
            remove.a.q.setAnimationStyle(0);
        }
        remove.a.e();
        int size2 = this.b.size();
        if (size2 > 0) {
            this.r = this.b.get(size2 - 1).c;
        } else {
            this.r = j();
        }
        if (size2 != 0) {
            if (z) {
                this.b.get(0).b.b(false);
                return;
            }
            return;
        }
        e();
        if (this.y != null) {
            this.y.a(menuBuilder, true);
        }
        if (this.z != null) {
            if (this.z.isAlive()) {
                this.z.removeGlobalOnLayoutListener(this.l);
            }
            this.z = null;
        }
        this.c.removeOnAttachStateChangeListener(this.m);
        this.A.onDismiss();
    }
}
