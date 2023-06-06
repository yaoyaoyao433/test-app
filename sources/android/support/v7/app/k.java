package android.support.v7.app;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.support.v4.view.ViewCompat;
import android.support.v7.app.ActionBar;
import android.support.v7.view.menu.MenuBuilder;
import android.support.v7.view.menu.j;
import android.support.v7.widget.Toolbar;
import android.support.v7.widget.ax;
import android.support.v7.widget.u;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import java.util.ArrayList;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class k extends ActionBar {
    u a;
    boolean b;
    Window.Callback c;
    private boolean d;
    private boolean e;
    private ArrayList<Object> f = new ArrayList<>();
    private final Runnable g = new Runnable() { // from class: android.support.v7.app.k.1
        @Override // java.lang.Runnable
        public final void run() {
            k kVar = k.this;
            Menu k = kVar.k();
            MenuBuilder menuBuilder = k instanceof MenuBuilder ? (MenuBuilder) k : null;
            if (menuBuilder != null) {
                menuBuilder.d();
            }
            try {
                k.clear();
                if (!kVar.c.onCreatePanelMenu(0, k) || !kVar.c.onPreparePanel(0, null, k)) {
                    k.clear();
                }
            } finally {
                if (menuBuilder != null) {
                    menuBuilder.e();
                }
            }
        }
    };
    private final Toolbar.c h = new Toolbar.c() { // from class: android.support.v7.app.k.2
        @Override // android.support.v7.widget.Toolbar.c
        public final boolean a(MenuItem menuItem) {
            return k.this.c.onMenuItemSelected(0, menuItem);
        }
    };

    @Override // android.support.v7.app.ActionBar
    public final void d(boolean z) {
    }

    @Override // android.support.v7.app.ActionBar
    public final void e(boolean z) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public k(Toolbar toolbar, CharSequence charSequence, Window.Callback callback) {
        this.a = new ax(toolbar, false);
        this.c = new c(callback);
        this.a.a(this.c);
        toolbar.setOnMenuItemClickListener(this.h);
        this.a.a(charSequence);
    }

    @Override // android.support.v7.app.ActionBar
    public final void a(View view, ActionBar.a aVar) {
        if (view != null) {
            view.setLayoutParams(aVar);
        }
        this.a.a(view);
    }

    @Override // android.support.v7.app.ActionBar
    public final void a(float f) {
        ViewCompat.setElevation(this.a.a(), f);
    }

    @Override // android.support.v7.app.ActionBar
    public final Context e() {
        return this.a.b();
    }

    @Override // android.support.v7.app.ActionBar
    public final void c(int i) {
        this.a.d(i);
    }

    @Override // android.support.v7.app.ActionBar
    public final void a(Configuration configuration) {
        super.a(configuration);
    }

    @Override // android.support.v7.app.ActionBar
    public final void a(CharSequence charSequence) {
        this.a.b(charSequence);
    }

    @Override // android.support.v7.app.ActionBar
    public final void a(int i) {
        this.a.b(this.a.b().getText(R.string.paybase__password_title1));
    }

    @Override // android.support.v7.app.ActionBar
    public final void b(CharSequence charSequence) {
        this.a.a(charSequence);
    }

    @Override // android.support.v7.app.ActionBar
    public final void b(int i) {
        a(16, -1);
    }

    @Override // android.support.v7.app.ActionBar
    public final void a(int i, int i2) {
        this.a.c((i & i2) | ((~i2) & this.a.m()));
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
    public final void a(@Nullable Drawable drawable) {
        this.a.b(drawable);
    }

    @Override // android.support.v7.app.ActionBar
    public final int a() {
        return this.a.m();
    }

    @Override // android.support.v7.app.ActionBar
    public final void b() {
        this.a.e(0);
    }

    @Override // android.support.v7.app.ActionBar
    public final void c() {
        this.a.e(8);
    }

    @Override // android.support.v7.app.ActionBar
    public final boolean d() {
        return this.a.o() == 0;
    }

    @Override // android.support.v7.app.ActionBar
    public final boolean f() {
        return this.a.i();
    }

    @Override // android.support.v7.app.ActionBar
    public final boolean g() {
        return this.a.j();
    }

    @Override // android.support.v7.app.ActionBar
    public final boolean h() {
        this.a.a().removeCallbacks(this.g);
        ViewCompat.postOnAnimation(this.a.a(), this.g);
        return true;
    }

    @Override // android.support.v7.app.ActionBar
    public final boolean i() {
        if (this.a.c()) {
            this.a.d();
            return true;
        }
        return false;
    }

    @Override // android.support.v7.app.ActionBar
    public final boolean a(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1) {
            f();
        }
        return true;
    }

    @Override // android.support.v7.app.ActionBar
    public final boolean a(int i, KeyEvent keyEvent) {
        Menu k = k();
        if (k != null) {
            k.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
            return k.performShortcut(i, keyEvent, 0);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // android.support.v7.app.ActionBar
    public final void j() {
        this.a.a().removeCallbacks(this.g);
    }

    @Override // android.support.v7.app.ActionBar
    public final void f(boolean z) {
        if (z == this.e) {
            return;
        }
        this.e = z;
        int size = this.f.size();
        for (int i = 0; i < size; i++) {
            this.f.get(i);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    class c extends android.support.v7.view.i {
        public c(Window.Callback callback) {
            super(callback);
        }

        @Override // android.support.v7.view.i, android.view.Window.Callback
        public final boolean onPreparePanel(int i, View view, Menu menu) {
            boolean onPreparePanel = super.onPreparePanel(i, view, menu);
            if (onPreparePanel && !k.this.b) {
                k.this.a.k();
                k.this.b = true;
            }
            return onPreparePanel;
        }

        @Override // android.support.v7.view.i, android.view.Window.Callback
        public final View onCreatePanelView(int i) {
            if (i == 0) {
                return new View(k.this.a.b());
            }
            return super.onCreatePanelView(i);
        }
    }

    Menu k() {
        if (!this.d) {
            this.a.a(new a(), new b());
            this.d = true;
        }
        return this.a.p();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public final class a implements j.a {
        private boolean b;

        a() {
        }

        @Override // android.support.v7.view.menu.j.a
        public final boolean a(MenuBuilder menuBuilder) {
            if (k.this.c != null) {
                k.this.c.onMenuOpened(108, menuBuilder);
                return true;
            }
            return false;
        }

        @Override // android.support.v7.view.menu.j.a
        public final void a(MenuBuilder menuBuilder, boolean z) {
            if (this.b) {
                return;
            }
            this.b = true;
            k.this.a.l();
            if (k.this.c != null) {
                k.this.c.onPanelClosed(108, menuBuilder);
            }
            this.b = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public final class b implements MenuBuilder.a {
        @Override // android.support.v7.view.menu.MenuBuilder.a
        public final boolean a(MenuBuilder menuBuilder, MenuItem menuItem) {
            return false;
        }

        b() {
        }

        @Override // android.support.v7.view.menu.MenuBuilder.a
        public final void a(MenuBuilder menuBuilder) {
            if (k.this.c != null) {
                if (k.this.a.g()) {
                    k.this.c.onPanelClosed(108, menuBuilder);
                } else if (k.this.c.onPreparePanel(0, null, menuBuilder)) {
                    k.this.c.onMenuOpened(108, menuBuilder);
                }
            }
        }
    }
}
