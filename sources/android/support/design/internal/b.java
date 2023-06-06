package android.support.design.internal;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.annotation.Nullable;
import android.support.annotation.RestrictTo;
import android.support.annotation.StyleRes;
import android.support.constraint.R;
import android.support.v4.view.ViewCompat;
import android.support.v7.view.menu.MenuBuilder;
import android.support.v7.view.menu.MenuItemImpl;
import android.support.v7.view.menu.SubMenuBuilder;
import android.support.v7.view.menu.j;
import android.support.v7.widget.RecyclerView;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
/* compiled from: ProGuard */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes.dex */
public final class b implements android.support.v7.view.menu.j {
    public NavigationMenuView a;
    public LinearLayout b;
    MenuBuilder c;
    public int d;
    public C0004b e;
    public LayoutInflater f;
    int g;
    boolean h;
    public ColorStateList i;
    public ColorStateList j;
    public Drawable k;
    public int l;
    int m;
    final View.OnClickListener n = new View.OnClickListener() { // from class: android.support.design.internal.b.1
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            b.this.b(true);
            MenuItemImpl itemData = ((NavigationMenuItemView) view).getItemData();
            boolean a2 = b.this.c.a(itemData, b.this, 0);
            if (itemData != null && itemData.isCheckable() && a2) {
                b.this.e.a(itemData);
            }
            b.this.b(false);
            b.this.a(false);
        }
    };
    private j.a o;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public interface d {
    }

    @Override // android.support.v7.view.menu.j
    public final boolean a() {
        return false;
    }

    @Override // android.support.v7.view.menu.j
    public final boolean a(MenuBuilder menuBuilder, MenuItemImpl menuItemImpl) {
        return false;
    }

    @Override // android.support.v7.view.menu.j
    public final boolean a(SubMenuBuilder subMenuBuilder) {
        return false;
    }

    @Override // android.support.v7.view.menu.j
    public final boolean b(MenuBuilder menuBuilder, MenuItemImpl menuItemImpl) {
        return false;
    }

    @Override // android.support.v7.view.menu.j
    public final void a(Context context, MenuBuilder menuBuilder) {
        this.f = LayoutInflater.from(context);
        this.c = menuBuilder;
        this.m = context.getResources().getDimensionPixelOffset(R.dimen.design_navigation_separator_vertical_padding);
    }

    @Override // android.support.v7.view.menu.j
    public final void a(boolean z) {
        if (this.e != null) {
            C0004b c0004b = this.e;
            c0004b.a();
            c0004b.notifyDataSetChanged();
        }
    }

    @Override // android.support.v7.view.menu.j
    public final void a(j.a aVar) {
        this.o = aVar;
    }

    @Override // android.support.v7.view.menu.j
    public final void a(MenuBuilder menuBuilder, boolean z) {
        if (this.o != null) {
            this.o.a(menuBuilder, z);
        }
    }

    @Override // android.support.v7.view.menu.j
    public final int b() {
        return this.d;
    }

    @Override // android.support.v7.view.menu.j
    public final Parcelable c() {
        if (Build.VERSION.SDK_INT >= 11) {
            Bundle bundle = new Bundle();
            if (this.a != null) {
                SparseArray<? extends Parcelable> sparseArray = new SparseArray<>();
                this.a.saveHierarchyState(sparseArray);
                bundle.putSparseParcelableArray("android:menu:list", sparseArray);
            }
            if (this.e != null) {
                bundle.putBundle("android:menu:adapter", this.e.b());
            }
            if (this.b != null) {
                SparseArray<? extends Parcelable> sparseArray2 = new SparseArray<>();
                this.b.saveHierarchyState(sparseArray2);
                bundle.putSparseParcelableArray("android:menu:header", sparseArray2);
            }
            return bundle;
        }
        return null;
    }

    @Override // android.support.v7.view.menu.j
    public final void a(Parcelable parcelable) {
        MenuItemImpl menuItemImpl;
        View actionView;
        ParcelableSparseArray parcelableSparseArray;
        MenuItemImpl menuItemImpl2;
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            SparseArray sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:list");
            if (sparseParcelableArray != null) {
                this.a.restoreHierarchyState(sparseParcelableArray);
            }
            Bundle bundle2 = bundle.getBundle("android:menu:adapter");
            if (bundle2 != null) {
                C0004b c0004b = this.e;
                int i2 = bundle2.getInt("android:menu:checked", 0);
                if (i2 != 0) {
                    c0004b.b = true;
                    int size = c0004b.a.size();
                    int i3 = 0;
                    while (true) {
                        if (i3 >= size) {
                            break;
                        }
                        d dVar = c0004b.a.get(i3);
                        if ((dVar instanceof f) && (menuItemImpl2 = ((f) dVar).a) != null && menuItemImpl2.getItemId() == i2) {
                            c0004b.a(menuItemImpl2);
                            break;
                        }
                        i3++;
                    }
                    c0004b.b = false;
                    c0004b.a();
                }
                SparseArray sparseParcelableArray2 = bundle2.getSparseParcelableArray("android:menu:action_views");
                if (sparseParcelableArray2 != null) {
                    int size2 = c0004b.a.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        d dVar2 = c0004b.a.get(i4);
                        if ((dVar2 instanceof f) && (menuItemImpl = ((f) dVar2).a) != null && (actionView = menuItemImpl.getActionView()) != null && (parcelableSparseArray = (ParcelableSparseArray) sparseParcelableArray2.get(menuItemImpl.getItemId())) != null) {
                            actionView.restoreHierarchyState(parcelableSparseArray);
                        }
                    }
                }
            }
            SparseArray sparseParcelableArray3 = bundle.getSparseParcelableArray("android:menu:header");
            if (sparseParcelableArray3 != null) {
                this.b.restoreHierarchyState(sparseParcelableArray3);
            }
        }
    }

    public final void a(@Nullable ColorStateList colorStateList) {
        this.j = colorStateList;
        a(false);
    }

    public final void b(@Nullable ColorStateList colorStateList) {
        this.i = colorStateList;
        a(false);
    }

    public final void a(@StyleRes int i2) {
        this.g = i2;
        this.h = true;
        a(false);
    }

    public final void a(@Nullable Drawable drawable) {
        this.k = drawable;
        a(false);
    }

    public final void b(boolean z) {
        if (this.e != null) {
            this.e.b = z;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    static abstract class j extends RecyclerView.s {
        public j(View view) {
            super(view);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    static class g extends j {
        public g(LayoutInflater layoutInflater, ViewGroup viewGroup, View.OnClickListener onClickListener) {
            super(layoutInflater.inflate(R.layout.design_navigation_item, viewGroup, false));
            this.itemView.setOnClickListener(onClickListener);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    static class i extends j {
        public i(LayoutInflater layoutInflater, ViewGroup viewGroup) {
            super(layoutInflater.inflate(R.layout.design_navigation_item_subheader, viewGroup, false));
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    static class h extends j {
        public h(LayoutInflater layoutInflater, ViewGroup viewGroup) {
            super(layoutInflater.inflate(R.layout.design_navigation_item_separator, viewGroup, false));
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    static class a extends j {
        public a(View view) {
            super(view);
        }
    }

    /* compiled from: ProGuard */
    /* renamed from: android.support.design.internal.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0004b extends RecyclerView.a<j> {
        final ArrayList<d> a = new ArrayList<>();
        boolean b;
        private MenuItemImpl d;

        @Override // android.support.v7.widget.RecyclerView.a
        public final long getItemId(int i) {
            return i;
        }

        @Override // android.support.v7.widget.RecyclerView.a
        public final /* synthetic */ void onBindViewHolder(j jVar, int i) {
            j jVar2 = jVar;
            switch (getItemViewType(i)) {
                case 0:
                    NavigationMenuItemView navigationMenuItemView = (NavigationMenuItemView) jVar2.itemView;
                    navigationMenuItemView.setIconTintList(b.this.j);
                    if (b.this.h) {
                        navigationMenuItemView.setTextAppearance(b.this.g);
                    }
                    if (b.this.i != null) {
                        navigationMenuItemView.setTextColor(b.this.i);
                    }
                    ViewCompat.setBackground(navigationMenuItemView, b.this.k != null ? b.this.k.getConstantState().newDrawable() : null);
                    f fVar = (f) this.a.get(i);
                    navigationMenuItemView.setNeedsEmptyIcon(fVar.b);
                    navigationMenuItemView.a(fVar.a, 0);
                    return;
                case 1:
                    ((TextView) jVar2.itemView).setText(((f) this.a.get(i)).a.getTitle());
                    return;
                case 2:
                    e eVar = (e) this.a.get(i);
                    jVar2.itemView.setPadding(0, eVar.a, 0, eVar.b);
                    return;
                default:
                    return;
            }
        }

        @Override // android.support.v7.widget.RecyclerView.a
        public final /* synthetic */ void onViewRecycled(j jVar) {
            j jVar2 = jVar;
            if (jVar2 instanceof g) {
                NavigationMenuItemView navigationMenuItemView = (NavigationMenuItemView) jVar2.itemView;
                if (navigationMenuItemView.e != null) {
                    navigationMenuItemView.e.removeAllViews();
                }
                navigationMenuItemView.d.setCompoundDrawables(null, null, null, null);
            }
        }

        public C0004b() {
            a();
        }

        @Override // android.support.v7.widget.RecyclerView.a
        public final int getItemCount() {
            return this.a.size();
        }

        @Override // android.support.v7.widget.RecyclerView.a
        public final int getItemViewType(int i) {
            d dVar = this.a.get(i);
            if (dVar instanceof e) {
                return 2;
            }
            if (dVar instanceof c) {
                return 3;
            }
            if (dVar instanceof f) {
                return ((f) dVar).a.hasSubMenu() ? 1 : 0;
            }
            throw new RuntimeException("Unknown item type.");
        }

        void a() {
            if (this.b) {
                return;
            }
            this.b = true;
            this.a.clear();
            this.a.add(new c());
            int size = b.this.c.f().size();
            int i = -1;
            boolean z = false;
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                MenuItemImpl menuItemImpl = b.this.c.f().get(i3);
                if (menuItemImpl.isChecked()) {
                    a(menuItemImpl);
                }
                if (menuItemImpl.isCheckable()) {
                    menuItemImpl.a(false);
                }
                if (menuItemImpl.hasSubMenu()) {
                    SubMenu subMenu = menuItemImpl.getSubMenu();
                    if (subMenu.hasVisibleItems()) {
                        if (i3 != 0) {
                            this.a.add(new e(b.this.m, 0));
                        }
                        this.a.add(new f(menuItemImpl));
                        int size2 = this.a.size();
                        int size3 = subMenu.size();
                        boolean z2 = false;
                        for (int i4 = 0; i4 < size3; i4++) {
                            MenuItemImpl menuItemImpl2 = (MenuItemImpl) subMenu.getItem(i4);
                            if (menuItemImpl2.isVisible()) {
                                if (!z2 && menuItemImpl2.getIcon() != null) {
                                    z2 = true;
                                }
                                if (menuItemImpl2.isCheckable()) {
                                    menuItemImpl2.a(false);
                                }
                                if (menuItemImpl.isChecked()) {
                                    a(menuItemImpl);
                                }
                                this.a.add(new f(menuItemImpl2));
                            }
                        }
                        if (z2) {
                            a(size2, this.a.size());
                        }
                    }
                } else {
                    int groupId = menuItemImpl.getGroupId();
                    if (groupId != i) {
                        i2 = this.a.size();
                        boolean z3 = menuItemImpl.getIcon() != null;
                        if (i3 != 0) {
                            i2++;
                            this.a.add(new e(b.this.m, b.this.m));
                        }
                        z = z3;
                    } else if (!z && menuItemImpl.getIcon() != null) {
                        a(i2, this.a.size());
                        z = true;
                    }
                    f fVar = new f(menuItemImpl);
                    fVar.b = z;
                    this.a.add(fVar);
                    i = groupId;
                }
            }
            this.b = false;
        }

        private void a(int i, int i2) {
            while (i < i2) {
                ((f) this.a.get(i)).b = true;
                i++;
            }
        }

        public final void a(MenuItemImpl menuItemImpl) {
            if (this.d == menuItemImpl || !menuItemImpl.isCheckable()) {
                return;
            }
            if (this.d != null) {
                this.d.setChecked(false);
            }
            this.d = menuItemImpl;
            menuItemImpl.setChecked(true);
        }

        public final Bundle b() {
            Bundle bundle = new Bundle();
            if (this.d != null) {
                bundle.putInt("android:menu:checked", this.d.getItemId());
            }
            SparseArray<? extends Parcelable> sparseArray = new SparseArray<>();
            int size = this.a.size();
            for (int i = 0; i < size; i++) {
                d dVar = this.a.get(i);
                if (dVar instanceof f) {
                    MenuItemImpl menuItemImpl = ((f) dVar).a;
                    View actionView = menuItemImpl != null ? menuItemImpl.getActionView() : null;
                    if (actionView != null) {
                        ParcelableSparseArray parcelableSparseArray = new ParcelableSparseArray();
                        actionView.saveHierarchyState(parcelableSparseArray);
                        sparseArray.put(menuItemImpl.getItemId(), parcelableSparseArray);
                    }
                }
            }
            bundle.putSparseParcelableArray("android:menu:action_views", sparseArray);
            return bundle;
        }

        @Override // android.support.v7.widget.RecyclerView.a
        public final /* synthetic */ j onCreateViewHolder(ViewGroup viewGroup, int i) {
            switch (i) {
                case 0:
                    return new g(b.this.f, viewGroup, b.this.n);
                case 1:
                    return new i(b.this.f, viewGroup);
                case 2:
                    return new h(b.this.f, viewGroup);
                case 3:
                    return new a(b.this.b);
                default:
                    return null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static class f implements d {
        final MenuItemImpl a;
        boolean b;

        f(MenuItemImpl menuItemImpl) {
            this.a = menuItemImpl;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static class e implements d {
        final int a;
        final int b;

        public e(int i, int i2) {
            this.a = i;
            this.b = i2;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static class c implements d {
        c() {
        }
    }
}
