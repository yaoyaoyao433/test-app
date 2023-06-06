package android.support.v7.view.menu;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.annotation.NonNull;
import android.support.annotation.RestrictTo;
import android.support.constraint.R;
import android.support.v4.content.ContextCompat;
import android.support.v4.internal.view.SupportMenu;
import android.support.v4.view.ActionProvider;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
/* compiled from: ProGuard */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes.dex */
public class MenuBuilder implements SupportMenu {
    private static final int[] l = {1, 4, 5, 3, 2, 0};
    protected final Context a;
    public a b;
    CharSequence f;
    Drawable g;
    View h;
    MenuItemImpl j;
    public boolean k;
    private final Resources m;
    private boolean n;
    private boolean o;
    private ContextMenu.ContextMenuInfo t;
    public int e = 0;
    private boolean u = false;
    private boolean v = false;
    private boolean w = false;
    boolean i = false;
    private boolean x = false;
    private ArrayList<MenuItemImpl> y = new ArrayList<>();
    private CopyOnWriteArrayList<WeakReference<j>> z = new CopyOnWriteArrayList<>();
    ArrayList<MenuItemImpl> c = new ArrayList<>();
    private ArrayList<MenuItemImpl> p = new ArrayList<>();
    private boolean q = true;
    public ArrayList<MenuItemImpl> d = new ArrayList<>();
    private ArrayList<MenuItemImpl> r = new ArrayList<>();
    private boolean s = true;

    /* compiled from: ProGuard */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* loaded from: classes.dex */
    public interface a {
        void a(MenuBuilder menuBuilder);

        boolean a(MenuBuilder menuBuilder, MenuItem menuItem);
    }

    /* compiled from: ProGuard */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* loaded from: classes.dex */
    public interface b {
        boolean a(MenuItemImpl menuItemImpl);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public String a() {
        return "android:menu:actionviewstates";
    }

    public MenuBuilder i() {
        return this;
    }

    public MenuBuilder(Context context) {
        this.a = context;
        this.m = context.getResources();
        boolean z = true;
        this.o = (this.m.getConfiguration().keyboard == 1 || !this.m.getBoolean(R.bool.abc_config_showMenuShortcutsWhenKeyboardPresent)) ? false : false;
    }

    public final void a(j jVar) {
        a(jVar, this.a);
    }

    public final void a(j jVar, Context context) {
        this.z.add(new WeakReference<>(jVar));
        jVar.a(context, this);
        this.s = true;
    }

    public final void b(j jVar) {
        Iterator<WeakReference<j>> it = this.z.iterator();
        while (it.hasNext()) {
            WeakReference<j> next = it.next();
            j jVar2 = next.get();
            if (jVar2 == null || jVar2 == jVar) {
                this.z.remove(next);
            }
        }
    }

    private boolean a(SubMenuBuilder subMenuBuilder, j jVar) {
        if (this.z.isEmpty()) {
            return false;
        }
        boolean a2 = jVar != null ? jVar.a(subMenuBuilder) : false;
        Iterator<WeakReference<j>> it = this.z.iterator();
        while (it.hasNext()) {
            WeakReference<j> next = it.next();
            j jVar2 = next.get();
            if (jVar2 == null) {
                this.z.remove(next);
            } else if (!a2) {
                a2 = jVar2.a(subMenuBuilder);
            }
        }
        return a2;
    }

    private void e(Bundle bundle) {
        Parcelable c;
        if (this.z.isEmpty()) {
            return;
        }
        SparseArray<? extends Parcelable> sparseArray = new SparseArray<>();
        Iterator<WeakReference<j>> it = this.z.iterator();
        while (it.hasNext()) {
            WeakReference<j> next = it.next();
            j jVar = next.get();
            if (jVar == null) {
                this.z.remove(next);
            } else {
                int b2 = jVar.b();
                if (b2 > 0 && (c = jVar.c()) != null) {
                    sparseArray.put(b2, c);
                }
            }
        }
        bundle.putSparseParcelableArray("android:menu:presenters", sparseArray);
    }

    public void a(Bundle bundle) {
        Parcelable parcelable;
        SparseArray sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:presenters");
        if (sparseParcelableArray == null || this.z.isEmpty()) {
            return;
        }
        Iterator<WeakReference<j>> it = this.z.iterator();
        while (it.hasNext()) {
            WeakReference<j> next = it.next();
            j jVar = next.get();
            if (jVar == null) {
                this.z.remove(next);
            } else {
                int b2 = jVar.b();
                if (b2 > 0 && (parcelable = (Parcelable) sparseParcelableArray.get(b2)) != null) {
                    jVar.a(parcelable);
                }
            }
        }
    }

    public final void b(Bundle bundle) {
        e(bundle);
    }

    public final void c(Bundle bundle) {
        int size = size();
        SparseArray<? extends Parcelable> sparseArray = null;
        for (int i = 0; i < size; i++) {
            MenuItem item = getItem(i);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt("android:menu:expandedactionview", item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((SubMenuBuilder) item.getSubMenu()).c(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(a(), sparseArray);
        }
    }

    public final void d(Bundle bundle) {
        MenuItem findItem;
        if (bundle == null) {
            return;
        }
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(a());
        int size = size();
        for (int i = 0; i < size; i++) {
            MenuItem item = getItem(i);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                actionView.restoreHierarchyState(sparseParcelableArray);
            }
            if (item.hasSubMenu()) {
                ((SubMenuBuilder) item.getSubMenu()).d(bundle);
            }
        }
        int i2 = bundle.getInt("android:menu:expandedactionview");
        if (i2 <= 0 || (findItem = findItem(i2)) == null) {
            return;
        }
        findItem.expandActionView();
    }

    public void a(a aVar) {
        this.b = aVar;
    }

    @Override // android.view.Menu
    public MenuItem add(CharSequence charSequence) {
        return a(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public MenuItem add(int i) {
        return a(0, 0, 0, this.m.getString(i));
    }

    @Override // android.view.Menu
    public MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return a(i, i2, i3, charSequence);
    }

    @Override // android.view.Menu
    public MenuItem add(int i, int i2, int i3, int i4) {
        return a(i, i2, i3, this.m.getString(i4));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i) {
        return addSubMenu(0, 0, 0, this.m.getString(i));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        MenuItemImpl menuItemImpl = (MenuItemImpl) a(i, i2, i3, charSequence);
        SubMenuBuilder subMenuBuilder = new SubMenuBuilder(this.a, this, menuItemImpl);
        menuItemImpl.a(subMenuBuilder);
        return subMenuBuilder;
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return addSubMenu(i, i2, i3, this.m.getString(i4));
    }

    @Override // android.view.Menu
    public int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        PackageManager packageManager = this.a.getPackageManager();
        List<ResolveInfo> queryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = queryIntentActivityOptions != null ? queryIntentActivityOptions.size() : 0;
        if ((i4 & 1) == 0) {
            removeGroup(i);
        }
        for (int i5 = 0; i5 < size; i5++) {
            ResolveInfo resolveInfo = queryIntentActivityOptions.get(i5);
            Intent intent2 = new Intent(resolveInfo.specificIndex < 0 ? intent : intentArr[resolveInfo.specificIndex]);
            intent2.setComponent(new ComponentName(resolveInfo.activityInfo.applicationInfo.packageName, resolveInfo.activityInfo.name));
            MenuItem intent3 = add(i, i2, i3, resolveInfo.loadLabel(packageManager)).setIcon(resolveInfo.loadIcon(packageManager)).setIntent(intent2);
            if (menuItemArr != null && resolveInfo.specificIndex >= 0) {
                menuItemArr[resolveInfo.specificIndex] = intent3;
            }
        }
        return size;
    }

    private void a(int i, boolean z) {
        if (i < 0 || i >= this.c.size()) {
            return;
        }
        this.c.remove(i);
        if (z) {
            a(true);
        }
    }

    @Override // android.view.Menu
    public void clear() {
        if (this.j != null) {
            d(this.j);
        }
        this.c.clear();
        a(true);
    }

    @Override // android.view.Menu
    public void setGroupCheckable(int i, boolean z, boolean z2) {
        int size = this.c.size();
        for (int i2 = 0; i2 < size; i2++) {
            MenuItemImpl menuItemImpl = this.c.get(i2);
            if (menuItemImpl.getGroupId() == i) {
                menuItemImpl.a(z2);
                menuItemImpl.setCheckable(z);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupVisible(int i, boolean z) {
        int size = this.c.size();
        boolean z2 = false;
        for (int i2 = 0; i2 < size; i2++) {
            MenuItemImpl menuItemImpl = this.c.get(i2);
            if (menuItemImpl.getGroupId() == i && menuItemImpl.c(z)) {
                z2 = true;
            }
        }
        if (z2) {
            a(true);
        }
    }

    @Override // android.view.Menu
    public void setGroupEnabled(int i, boolean z) {
        int size = this.c.size();
        for (int i2 = 0; i2 < size; i2++) {
            MenuItemImpl menuItemImpl = this.c.get(i2);
            if (menuItemImpl.getGroupId() == i) {
                menuItemImpl.setEnabled(z);
            }
        }
    }

    @Override // android.view.Menu
    public boolean hasVisibleItems() {
        if (this.k) {
            return true;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            if (this.c.get(i).isVisible()) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.Menu
    public MenuItem findItem(int i) {
        MenuItem findItem;
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            MenuItemImpl menuItemImpl = this.c.get(i2);
            if (menuItemImpl.getItemId() == i) {
                return menuItemImpl;
            }
            if (menuItemImpl.hasSubMenu() && (findItem = menuItemImpl.getSubMenu().findItem(i)) != null) {
                return findItem;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public int size() {
        return this.c.size();
    }

    @Override // android.view.Menu
    public MenuItem getItem(int i) {
        return this.c.get(i);
    }

    @Override // android.view.Menu
    public boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return a(i, keyEvent) != null;
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z) {
        this.n = z;
        a(false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean b() {
        return this.n;
    }

    public boolean c() {
        return this.o;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean a(MenuBuilder menuBuilder, MenuItem menuItem) {
        return this.b != null && this.b.a(menuBuilder, menuItem);
    }

    private static int a(ArrayList<MenuItemImpl> arrayList, int i) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size).a <= i) {
                return size + 1;
            }
        }
        return 0;
    }

    @Override // android.view.Menu
    public boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        MenuItemImpl a2 = a(i, keyEvent);
        boolean a3 = a2 != null ? a(a2, (j) null, i2) : false;
        if ((i2 & 2) != 0) {
            b(true);
        }
        return a3;
    }

    private void a(List<MenuItemImpl> list, int i, KeyEvent keyEvent) {
        boolean b2 = b();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i == 67) {
            int size = this.c.size();
            for (int i2 = 0; i2 < size; i2++) {
                MenuItemImpl menuItemImpl = this.c.get(i2);
                if (menuItemImpl.hasSubMenu()) {
                    ((MenuBuilder) menuItemImpl.getSubMenu()).a(list, i, keyEvent);
                }
                char alphabeticShortcut = b2 ? menuItemImpl.getAlphabeticShortcut() : menuItemImpl.getNumericShortcut();
                if (((modifiers & SupportMenu.SUPPORTED_MODIFIERS_MASK) == ((b2 ? menuItemImpl.getAlphabeticModifiers() : menuItemImpl.getNumericModifiers()) & SupportMenu.SUPPORTED_MODIFIERS_MASK)) && alphabeticShortcut != 0 && ((alphabeticShortcut == keyData.meta[0] || alphabeticShortcut == keyData.meta[2] || (b2 && alphabeticShortcut == '\b' && i == 67)) && menuItemImpl.isEnabled())) {
                    list.add(menuItemImpl);
                }
            }
        }
    }

    private MenuItemImpl a(int i, KeyEvent keyEvent) {
        char numericShortcut;
        ArrayList<MenuItemImpl> arrayList = this.y;
        arrayList.clear();
        a(arrayList, i, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return arrayList.get(0);
        }
        boolean b2 = b();
        for (int i2 = 0; i2 < size; i2++) {
            MenuItemImpl menuItemImpl = arrayList.get(i2);
            if (b2) {
                numericShortcut = menuItemImpl.getAlphabeticShortcut();
            } else {
                numericShortcut = menuItemImpl.getNumericShortcut();
            }
            if ((numericShortcut == keyData.meta[0] && (metaState & 2) == 0) || ((numericShortcut == keyData.meta[2] && (metaState & 2) != 0) || (b2 && numericShortcut == '\b' && i == 67))) {
                return menuItemImpl;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public boolean performIdentifierAction(int i, int i2) {
        return a(findItem(i), (j) null, i2);
    }

    public final boolean a(MenuItem menuItem, j jVar, int i) {
        MenuItemImpl menuItemImpl = (MenuItemImpl) menuItem;
        if (menuItemImpl == null || !menuItemImpl.isEnabled()) {
            return false;
        }
        boolean a2 = menuItemImpl.a();
        ActionProvider supportActionProvider = menuItemImpl.getSupportActionProvider();
        boolean z = supportActionProvider != null && supportActionProvider.hasSubMenu();
        if (menuItemImpl.i()) {
            a2 |= menuItemImpl.expandActionView();
            if (a2) {
                b(true);
            }
        } else if (menuItemImpl.hasSubMenu() || z) {
            if ((i & 4) == 0) {
                b(false);
            }
            if (!menuItemImpl.hasSubMenu()) {
                menuItemImpl.a(new SubMenuBuilder(this.a, this, menuItemImpl));
            }
            SubMenuBuilder subMenuBuilder = (SubMenuBuilder) menuItemImpl.getSubMenu();
            if (z) {
                supportActionProvider.onPrepareSubMenu(subMenuBuilder);
            }
            a2 |= a(subMenuBuilder, jVar);
            if (!a2) {
                b(true);
            }
        } else if ((i & 1) == 0) {
            b(true);
        }
        return a2;
    }

    public final void b(boolean z) {
        if (this.x) {
            return;
        }
        this.x = true;
        Iterator<WeakReference<j>> it = this.z.iterator();
        while (it.hasNext()) {
            WeakReference<j> next = it.next();
            j jVar = next.get();
            if (jVar == null) {
                this.z.remove(next);
            } else {
                jVar.a(this, z);
            }
        }
        this.x = false;
    }

    @Override // android.view.Menu
    public void close() {
        b(true);
    }

    public void a(boolean z) {
        if (this.u) {
            this.v = true;
            if (z) {
                this.w = true;
                return;
            }
            return;
        }
        if (z) {
            this.q = true;
            this.s = true;
        }
        if (this.z.isEmpty()) {
            return;
        }
        d();
        Iterator<WeakReference<j>> it = this.z.iterator();
        while (it.hasNext()) {
            WeakReference<j> next = it.next();
            j jVar = next.get();
            if (jVar == null) {
                this.z.remove(next);
            } else {
                jVar.a(z);
            }
        }
        e();
    }

    public final void d() {
        if (this.u) {
            return;
        }
        this.u = true;
        this.v = false;
        this.w = false;
    }

    public final void e() {
        this.u = false;
        if (this.v) {
            this.v = false;
            a(this.w);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(MenuItemImpl menuItemImpl) {
        this.q = true;
        a(true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(MenuItemImpl menuItemImpl) {
        this.s = true;
        a(true);
    }

    @NonNull
    public final ArrayList<MenuItemImpl> f() {
        if (this.q) {
            this.p.clear();
            int size = this.c.size();
            for (int i = 0; i < size; i++) {
                MenuItemImpl menuItemImpl = this.c.get(i);
                if (menuItemImpl.isVisible()) {
                    this.p.add(menuItemImpl);
                }
            }
            this.q = false;
            this.s = true;
            return this.p;
        }
        return this.p;
    }

    public final void g() {
        ArrayList<MenuItemImpl> f = f();
        if (this.s) {
            Iterator<WeakReference<j>> it = this.z.iterator();
            boolean z = false;
            while (it.hasNext()) {
                WeakReference<j> next = it.next();
                j jVar = next.get();
                if (jVar == null) {
                    this.z.remove(next);
                } else {
                    z |= jVar.a();
                }
            }
            if (z) {
                this.d.clear();
                this.r.clear();
                int size = f.size();
                for (int i = 0; i < size; i++) {
                    MenuItemImpl menuItemImpl = f.get(i);
                    if (menuItemImpl.e()) {
                        this.d.add(menuItemImpl);
                    } else {
                        this.r.add(menuItemImpl);
                    }
                }
            } else {
                this.d.clear();
                this.r.clear();
                this.r.addAll(f());
            }
            this.s = false;
        }
    }

    public final ArrayList<MenuItemImpl> h() {
        g();
        return this.r;
    }

    public void clearHeader() {
        this.g = null;
        this.f = null;
        this.h = null;
        a(false);
    }

    public boolean c(MenuItemImpl menuItemImpl) {
        boolean z = false;
        if (this.z.isEmpty()) {
            return false;
        }
        d();
        Iterator<WeakReference<j>> it = this.z.iterator();
        while (it.hasNext()) {
            WeakReference<j> next = it.next();
            j jVar = next.get();
            if (jVar == null) {
                this.z.remove(next);
            } else {
                z = jVar.a(this, menuItemImpl);
                if (z) {
                    break;
                }
            }
        }
        e();
        if (z) {
            this.j = menuItemImpl;
        }
        return z;
    }

    public boolean d(MenuItemImpl menuItemImpl) {
        boolean z = false;
        if (this.z.isEmpty() || this.j != menuItemImpl) {
            return false;
        }
        d();
        Iterator<WeakReference<j>> it = this.z.iterator();
        while (it.hasNext()) {
            WeakReference<j> next = it.next();
            j jVar = next.get();
            if (jVar == null) {
                this.z.remove(next);
            } else {
                z = jVar.b(this, menuItemImpl);
                if (z) {
                    break;
                }
            }
        }
        e();
        if (z) {
            this.j = null;
        }
        return z;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public MenuItem a(int i, int i2, int i3, CharSequence charSequence) {
        int i4 = ((-65536) & i3) >> 16;
        if (i4 < 0 || i4 >= l.length) {
            throw new IllegalArgumentException("order does not contain a valid category.");
        }
        int i5 = (l[i4] << 16) | (65535 & i3);
        MenuItemImpl menuItemImpl = new MenuItemImpl(this, i, i2, i3, i5, charSequence, this.e);
        if (this.t != null) {
            menuItemImpl.c = this.t;
        }
        this.c.add(a(this.c, i5), menuItemImpl);
        a(true);
        return menuItemImpl;
    }

    @Override // android.view.Menu
    public void removeItem(int i) {
        int size = size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                i2 = -1;
                break;
            } else if (this.c.get(i2).getItemId() == i) {
                break;
            } else {
                i2++;
            }
        }
        a(i2, true);
    }

    @Override // android.view.Menu
    public void removeGroup(int i) {
        int size = size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                i2 = -1;
                break;
            } else if (this.c.get(i2).getGroupId() == i) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 >= 0) {
            int size2 = this.c.size() - i2;
            int i3 = 0;
            while (true) {
                int i4 = i3 + 1;
                if (i3 >= size2 || this.c.get(i2).getGroupId() != i) {
                    break;
                }
                a(i2, false);
                i3 = i4;
            }
            a(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(int i, CharSequence charSequence, int i2, Drawable drawable, View view) {
        Resources resources = this.m;
        if (view != null) {
            this.h = view;
            this.f = null;
            this.g = null;
        } else {
            if (i > 0) {
                this.f = resources.getText(i);
            } else if (charSequence != null) {
                this.f = charSequence;
            }
            if (i2 > 0) {
                this.g = ContextCompat.getDrawable(this.a, i2);
            } else if (drawable != null) {
                this.g = drawable;
            }
            this.h = null;
        }
        a(false);
    }
}
