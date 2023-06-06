package android.support.v7.view.menu;

import android.content.Context;
import android.support.v4.internal.view.SupportMenuItem;
import android.support.v4.internal.view.SupportSubMenu;
import android.support.v4.util.ArrayMap;
import android.view.MenuItem;
import android.view.SubMenu;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public abstract class b<T> extends c<T> {
    final Context a;
    Map<SupportMenuItem, MenuItem> b;
    Map<SupportSubMenu, SubMenu> c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(Context context, T t) {
        super(t);
        this.a = context;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final MenuItem a(MenuItem menuItem) {
        if (menuItem instanceof SupportMenuItem) {
            SupportMenuItem supportMenuItem = (SupportMenuItem) menuItem;
            if (this.b == null) {
                this.b = new ArrayMap();
            }
            MenuItem menuItem2 = this.b.get(menuItem);
            if (menuItem2 == null) {
                MenuItem a = l.a(this.a, supportMenuItem);
                this.b.put(supportMenuItem, a);
                return a;
            }
            return menuItem2;
        }
        return menuItem;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final SubMenu a(SubMenu subMenu) {
        if (subMenu instanceof SupportSubMenu) {
            SupportSubMenu supportSubMenu = (SupportSubMenu) subMenu;
            if (this.c == null) {
                this.c = new ArrayMap();
            }
            SubMenu subMenu2 = this.c.get(supportSubMenu);
            if (subMenu2 == null) {
                p pVar = new p(this.a, supportSubMenu);
                this.c.put(supportSubMenu, pVar);
                return pVar;
            }
            return subMenu2;
        }
        return subMenu;
    }
}
