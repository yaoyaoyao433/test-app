package android.support.v7.view.menu;

import android.content.Context;
import android.support.annotation.RestrictTo;
import android.support.constraint.R;
import android.support.v7.view.menu.j;
import android.support.v7.view.menu.k;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
/* compiled from: ProGuard */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes.dex */
public abstract class a implements j {
    protected Context a;
    protected Context b;
    public MenuBuilder c;
    protected LayoutInflater d;
    protected LayoutInflater e;
    public j.a f;
    public k g;
    public int h;
    private int i = R.layout.abc_action_menu_layout;
    private int j = R.layout.abc_action_menu_item_layout;

    public abstract void a(MenuItemImpl menuItemImpl, k.a aVar);

    @Override // android.support.v7.view.menu.j
    public boolean a() {
        return false;
    }

    public boolean a(int i, MenuItemImpl menuItemImpl) {
        return true;
    }

    @Override // android.support.v7.view.menu.j
    public final boolean a(MenuBuilder menuBuilder, MenuItemImpl menuItemImpl) {
        return false;
    }

    @Override // android.support.v7.view.menu.j
    public final boolean b(MenuBuilder menuBuilder, MenuItemImpl menuItemImpl) {
        return false;
    }

    public a(Context context, int i, int i2) {
        this.a = context;
        this.d = LayoutInflater.from(context);
    }

    @Override // android.support.v7.view.menu.j
    public void a(Context context, MenuBuilder menuBuilder) {
        this.b = context;
        this.e = LayoutInflater.from(this.b);
        this.c = menuBuilder;
    }

    public k a(ViewGroup viewGroup) {
        if (this.g == null) {
            this.g = (k) this.d.inflate(this.i, viewGroup, false);
            this.g.a(this.c);
            a(true);
        }
        return this.g;
    }

    @Override // android.support.v7.view.menu.j
    public void a(boolean z) {
        ViewGroup viewGroup = (ViewGroup) this.g;
        if (viewGroup == null) {
            return;
        }
        int i = 0;
        if (this.c != null) {
            this.c.g();
            ArrayList<MenuItemImpl> f = this.c.f();
            int size = f.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                MenuItemImpl menuItemImpl = f.get(i3);
                if (a(i2, menuItemImpl)) {
                    View childAt = viewGroup.getChildAt(i2);
                    MenuItemImpl itemData = childAt instanceof k.a ? ((k.a) childAt).getItemData() : null;
                    View a = a(menuItemImpl, childAt, viewGroup);
                    if (menuItemImpl != itemData) {
                        a.setPressed(false);
                        a.jumpDrawablesToCurrentState();
                    }
                    if (a != childAt) {
                        ViewGroup viewGroup2 = (ViewGroup) a.getParent();
                        if (viewGroup2 != null) {
                            viewGroup2.removeView(a);
                        }
                        ((ViewGroup) this.g).addView(a, i2);
                    }
                    i2++;
                }
            }
            i = i2;
        }
        while (i < viewGroup.getChildCount()) {
            if (!a(viewGroup, i)) {
                i++;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean a(ViewGroup viewGroup, int i) {
        viewGroup.removeViewAt(i);
        return true;
    }

    @Override // android.support.v7.view.menu.j
    public final void a(j.a aVar) {
        this.f = aVar;
    }

    public View a(MenuItemImpl menuItemImpl, View view, ViewGroup viewGroup) {
        k.a aVar;
        if (view instanceof k.a) {
            aVar = (k.a) view;
        } else {
            aVar = (k.a) this.d.inflate(this.j, viewGroup, false);
        }
        a(menuItemImpl, aVar);
        return (View) aVar;
    }

    @Override // android.support.v7.view.menu.j
    public void a(MenuBuilder menuBuilder, boolean z) {
        if (this.f != null) {
            this.f.a(menuBuilder, z);
        }
    }

    @Override // android.support.v7.view.menu.j
    public boolean a(SubMenuBuilder subMenuBuilder) {
        if (this.f != null) {
            return this.f.a(subMenuBuilder);
        }
        return false;
    }

    @Override // android.support.v7.view.menu.j
    public final int b() {
        return this.h;
    }
}
