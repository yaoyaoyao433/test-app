package android.support.v7.view;

import android.content.Context;
import android.support.annotation.RestrictTo;
import android.support.v4.internal.view.SupportMenu;
import android.support.v4.internal.view.SupportMenuItem;
import android.support.v4.util.SimpleArrayMap;
import android.support.v7.view.b;
import android.support.v7.view.menu.l;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import java.util.ArrayList;
/* compiled from: ProGuard */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes.dex */
public final class f extends ActionMode {
    final Context a;
    final b b;

    public f(Context context, b bVar) {
        this.a = context;
        this.b = bVar;
    }

    @Override // android.view.ActionMode
    public final Object getTag() {
        return this.b.c;
    }

    @Override // android.view.ActionMode
    public final void setTag(Object obj) {
        this.b.c = obj;
    }

    @Override // android.view.ActionMode
    public final void setTitle(CharSequence charSequence) {
        this.b.b(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(CharSequence charSequence) {
        this.b.a(charSequence);
    }

    @Override // android.view.ActionMode
    public final void invalidate() {
        this.b.d();
    }

    @Override // android.view.ActionMode
    public final void finish() {
        this.b.c();
    }

    @Override // android.view.ActionMode
    public final Menu getMenu() {
        return l.a(this.a, (SupportMenu) this.b.b());
    }

    @Override // android.view.ActionMode
    public final CharSequence getTitle() {
        return this.b.f();
    }

    @Override // android.view.ActionMode
    public final void setTitle(int i) {
        this.b.a(i);
    }

    @Override // android.view.ActionMode
    public final CharSequence getSubtitle() {
        return this.b.g();
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(int i) {
        this.b.b(i);
    }

    @Override // android.view.ActionMode
    public final View getCustomView() {
        return this.b.i();
    }

    @Override // android.view.ActionMode
    public final void setCustomView(View view) {
        this.b.a(view);
    }

    @Override // android.view.ActionMode
    public final MenuInflater getMenuInflater() {
        return this.b.a();
    }

    @Override // android.view.ActionMode
    public final boolean getTitleOptionalHint() {
        return this.b.d;
    }

    @Override // android.view.ActionMode
    public final void setTitleOptionalHint(boolean z) {
        this.b.a(z);
    }

    @Override // android.view.ActionMode
    public final boolean isTitleOptional() {
        return this.b.h();
    }

    /* compiled from: ProGuard */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* loaded from: classes.dex */
    public static class a implements b.a {
        final ActionMode.Callback a;
        final Context b;
        final ArrayList<f> c = new ArrayList<>();
        final SimpleArrayMap<Menu, Menu> d = new SimpleArrayMap<>();

        public a(Context context, ActionMode.Callback callback) {
            this.b = context;
            this.a = callback;
        }

        @Override // android.support.v7.view.b.a
        public final boolean a(b bVar, Menu menu) {
            return this.a.onCreateActionMode(b(bVar), a(menu));
        }

        @Override // android.support.v7.view.b.a
        public final boolean b(b bVar, Menu menu) {
            return this.a.onPrepareActionMode(b(bVar), a(menu));
        }

        @Override // android.support.v7.view.b.a
        public final boolean a(b bVar, MenuItem menuItem) {
            return this.a.onActionItemClicked(b(bVar), l.a(this.b, (SupportMenuItem) menuItem));
        }

        @Override // android.support.v7.view.b.a
        public final void a(b bVar) {
            this.a.onDestroyActionMode(b(bVar));
        }

        private Menu a(Menu menu) {
            Menu menu2 = this.d.get(menu);
            if (menu2 == null) {
                Menu a = l.a(this.b, (SupportMenu) menu);
                this.d.put(menu, a);
                return a;
            }
            return menu2;
        }

        public final ActionMode b(b bVar) {
            int size = this.c.size();
            for (int i = 0; i < size; i++) {
                f fVar = this.c.get(i);
                if (fVar != null && fVar.b == bVar) {
                    return fVar;
                }
            }
            f fVar2 = new f(this.b, bVar);
            this.c.add(fVar2);
            return fVar2;
        }
    }
}
