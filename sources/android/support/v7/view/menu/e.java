package android.support.v7.view.menu;

import android.support.annotation.RestrictTo;
import android.support.v7.view.menu.k;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import java.util.ArrayList;
/* compiled from: ProGuard */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes.dex */
public final class e extends BaseAdapter {
    static final int a = 2130968595;
    public MenuBuilder b;
    boolean c;
    private int d = -1;
    private final boolean e;
    private final LayoutInflater f;

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    public e(MenuBuilder menuBuilder, LayoutInflater layoutInflater, boolean z) {
        this.e = z;
        this.f = layoutInflater;
        this.b = menuBuilder;
        a();
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        ArrayList<MenuItemImpl> h = this.e ? this.b.h() : this.b.f();
        if (this.d < 0) {
            return h.size();
        }
        return h.size() - 1;
    }

    @Override // android.widget.Adapter
    /* renamed from: a */
    public final MenuItemImpl getItem(int i) {
        ArrayList<MenuItemImpl> h = this.e ? this.b.h() : this.b.f();
        if (this.d >= 0 && i >= this.d) {
            i++;
        }
        return h.get(i);
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f.inflate(a, viewGroup, false);
        }
        k.a aVar = (k.a) view;
        if (this.c) {
            ((ListMenuItemView) view).setForceShowIcon(true);
        }
        aVar.a(getItem(i), 0);
        return view;
    }

    private void a() {
        MenuItemImpl menuItemImpl = this.b.j;
        if (menuItemImpl != null) {
            ArrayList<MenuItemImpl> h = this.b.h();
            int size = h.size();
            for (int i = 0; i < size; i++) {
                if (h.get(i) == menuItemImpl) {
                    this.d = i;
                    return;
                }
            }
        }
        this.d = -1;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
