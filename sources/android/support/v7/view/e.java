package android.support.v7.view;

import android.content.Context;
import android.support.annotation.RestrictTo;
import android.support.v7.view.b;
import android.support.v7.view.menu.MenuBuilder;
import android.support.v7.widget.ActionBarContextView;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import java.lang.ref.WeakReference;
/* compiled from: ProGuard */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes.dex */
public final class e extends b implements MenuBuilder.a {
    private Context a;
    private ActionBarContextView b;
    private b.a e;
    private WeakReference<View> f;
    private boolean g;
    private boolean h;
    private MenuBuilder i;

    public e(Context context, ActionBarContextView actionBarContextView, b.a aVar, boolean z) {
        this.a = context;
        this.b = actionBarContextView;
        this.e = aVar;
        MenuBuilder menuBuilder = new MenuBuilder(actionBarContextView.getContext());
        menuBuilder.e = 1;
        this.i = menuBuilder;
        this.i.a(this);
        this.h = z;
    }

    @Override // android.support.v7.view.b
    public final void b(CharSequence charSequence) {
        this.b.setTitle(charSequence);
    }

    @Override // android.support.v7.view.b
    public final void a(CharSequence charSequence) {
        this.b.setSubtitle(charSequence);
    }

    @Override // android.support.v7.view.b
    public final void a(int i) {
        b(this.a.getString(i));
    }

    @Override // android.support.v7.view.b
    public final void b(int i) {
        a(this.a.getString(i));
    }

    @Override // android.support.v7.view.b
    public final void a(boolean z) {
        super.a(z);
        this.b.setTitleOptional(z);
    }

    @Override // android.support.v7.view.b
    public final boolean h() {
        return this.b.g;
    }

    @Override // android.support.v7.view.b
    public final void a(View view) {
        this.b.setCustomView(view);
        this.f = view != null ? new WeakReference<>(view) : null;
    }

    @Override // android.support.v7.view.b
    public final void d() {
        this.e.b(this, this.i);
    }

    @Override // android.support.v7.view.b
    public final void c() {
        if (this.g) {
            return;
        }
        this.g = true;
        this.b.sendAccessibilityEvent(32);
        this.e.a(this);
    }

    @Override // android.support.v7.view.b
    public final Menu b() {
        return this.i;
    }

    @Override // android.support.v7.view.b
    public final CharSequence f() {
        return this.b.getTitle();
    }

    @Override // android.support.v7.view.b
    public final CharSequence g() {
        return this.b.getSubtitle();
    }

    @Override // android.support.v7.view.b
    public final View i() {
        if (this.f != null) {
            return this.f.get();
        }
        return null;
    }

    @Override // android.support.v7.view.b
    public final MenuInflater a() {
        return new g(this.b.getContext());
    }

    @Override // android.support.v7.view.menu.MenuBuilder.a
    public final boolean a(MenuBuilder menuBuilder, MenuItem menuItem) {
        return this.e.a(this, menuItem);
    }

    @Override // android.support.v7.view.menu.MenuBuilder.a
    public final void a(MenuBuilder menuBuilder) {
        d();
        this.b.a();
    }
}
