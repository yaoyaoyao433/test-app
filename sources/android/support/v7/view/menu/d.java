package android.support.v7.view.menu;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.annotation.RestrictTo;
import android.support.constraint.R;
import android.support.v7.app.AlertDialog;
import android.support.v7.view.menu.j;
import android.support.v7.view.menu.k;
import android.util.SparseArray;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import java.util.ArrayList;
/* compiled from: ProGuard */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes.dex */
public final class d implements j, AdapterView.OnItemClickListener {
    Context a;
    LayoutInflater b;
    MenuBuilder c;
    ExpandedMenuView d;
    int e;
    int f;
    int g;
    public j.a h;
    a i;
    private int j;

    @Override // android.support.v7.view.menu.j
    public final boolean a() {
        return false;
    }

    @Override // android.support.v7.view.menu.j
    public final boolean a(MenuBuilder menuBuilder, MenuItemImpl menuItemImpl) {
        return false;
    }

    @Override // android.support.v7.view.menu.j
    public final boolean b(MenuBuilder menuBuilder, MenuItemImpl menuItemImpl) {
        return false;
    }

    public d(Context context, int i) {
        this((int) R.layout.abc_list_menu_item_layout, 0);
        this.a = context;
        this.b = LayoutInflater.from(this.a);
    }

    private d(int i, int i2) {
        this.g = i;
        this.f = 0;
    }

    @Override // android.support.v7.view.menu.j
    public final void a(Context context, MenuBuilder menuBuilder) {
        if (this.f != 0) {
            this.a = new ContextThemeWrapper(context, this.f);
            this.b = LayoutInflater.from(this.a);
        } else if (this.a != null) {
            this.a = context;
            if (this.b == null) {
                this.b = LayoutInflater.from(this.a);
            }
        }
        this.c = menuBuilder;
        if (this.i != null) {
            this.i.notifyDataSetChanged();
        }
    }

    public final k a(ViewGroup viewGroup) {
        if (this.d == null) {
            this.d = (ExpandedMenuView) this.b.inflate(R.layout.abc_expanded_menu_layout, viewGroup, false);
            if (this.i == null) {
                this.i = new a();
            }
            this.d.setAdapter((ListAdapter) this.i);
            this.d.setOnItemClickListener(this);
        }
        return this.d;
    }

    public final ListAdapter d() {
        if (this.i == null) {
            this.i = new a();
        }
        return this.i;
    }

    @Override // android.support.v7.view.menu.j
    public final void a(boolean z) {
        if (this.i != null) {
            this.i.notifyDataSetChanged();
        }
    }

    @Override // android.support.v7.view.menu.j
    public final void a(j.a aVar) {
        this.h = aVar;
    }

    @Override // android.support.v7.view.menu.j
    public final boolean a(SubMenuBuilder subMenuBuilder) {
        if (subMenuBuilder.hasVisibleItems()) {
            f fVar = new f(subMenuBuilder);
            MenuBuilder menuBuilder = fVar.a;
            AlertDialog.a aVar = new AlertDialog.a(menuBuilder.a);
            fVar.c = new d(aVar.a.a, (int) R.layout.abc_list_menu_item_layout);
            fVar.c.h = fVar;
            fVar.a.a(fVar.c);
            aVar.a.t = fVar.c.d();
            aVar.a.u = fVar;
            View view = menuBuilder.h;
            if (view != null) {
                aVar.a.g = view;
            } else {
                aVar.a.d = menuBuilder.g;
                aVar.a(menuBuilder.f);
            }
            aVar.a(fVar);
            fVar.b = aVar.a();
            fVar.b.setOnDismissListener(fVar);
            WindowManager.LayoutParams attributes = fVar.b.getWindow().getAttributes();
            attributes.type = 1003;
            attributes.flags |= 131072;
            fVar.b.show();
            if (this.h != null) {
                this.h.a(subMenuBuilder);
                return true;
            }
            return true;
        }
        return false;
    }

    @Override // android.support.v7.view.menu.j
    public final void a(MenuBuilder menuBuilder, boolean z) {
        if (this.h != null) {
            this.h.a(menuBuilder, z);
        }
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        this.c.a(this.i.getItem(i), this, 0);
    }

    @Override // android.support.v7.view.menu.j
    public final int b() {
        return this.j;
    }

    @Override // android.support.v7.view.menu.j
    public final Parcelable c() {
        if (this.d == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        if (this.d != null) {
            this.d.saveHierarchyState(sparseArray);
        }
        bundle.putSparseParcelableArray("android:menu:list", sparseArray);
        return bundle;
    }

    @Override // android.support.v7.view.menu.j
    public final void a(Parcelable parcelable) {
        SparseArray<Parcelable> sparseParcelableArray = ((Bundle) parcelable).getSparseParcelableArray("android:menu:list");
        if (sparseParcelableArray != null) {
            this.d.restoreHierarchyState(sparseParcelableArray);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public class a extends BaseAdapter {
        private int b = -1;

        @Override // android.widget.Adapter
        public final long getItemId(int i) {
            return i;
        }

        public a() {
            a();
        }

        @Override // android.widget.Adapter
        public final int getCount() {
            int size = d.this.c.h().size() - d.this.e;
            return this.b < 0 ? size : size - 1;
        }

        @Override // android.widget.Adapter
        /* renamed from: a */
        public final MenuItemImpl getItem(int i) {
            ArrayList<MenuItemImpl> h = d.this.c.h();
            int i2 = i + d.this.e;
            if (this.b >= 0 && i2 >= this.b) {
                i2++;
            }
            return h.get(i2);
        }

        @Override // android.widget.Adapter
        public final View getView(int i, View view, ViewGroup viewGroup) {
            if (view == null) {
                view = d.this.b.inflate(d.this.g, viewGroup, false);
            }
            ((k.a) view).a(getItem(i), 0);
            return view;
        }

        private void a() {
            MenuItemImpl menuItemImpl = d.this.c.j;
            if (menuItemImpl != null) {
                ArrayList<MenuItemImpl> h = d.this.c.h();
                int size = h.size();
                for (int i = 0; i < size; i++) {
                    if (h.get(i) == menuItemImpl) {
                        this.b = i;
                        return;
                    }
                }
            }
            this.b = -1;
        }

        @Override // android.widget.BaseAdapter
        public final void notifyDataSetChanged() {
            a();
            super.notifyDataSetChanged();
        }
    }
}
