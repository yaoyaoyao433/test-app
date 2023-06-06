package android.support.v7.view.menu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.annotation.RestrictTo;
import android.support.v7.view.menu.MenuBuilder;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import com.meituan.robust.common.CommonConstant;
/* compiled from: ProGuard */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes.dex */
public class SubMenuBuilder extends MenuBuilder implements SubMenu {
    public MenuBuilder l;
    private MenuItemImpl m;

    public SubMenuBuilder(Context context, MenuBuilder menuBuilder, MenuItemImpl menuItemImpl) {
        super(context);
        this.l = menuBuilder;
        this.m = menuItemImpl;
    }

    @Override // android.support.v7.view.menu.MenuBuilder, android.view.Menu
    public void setQwertyMode(boolean z) {
        this.l.setQwertyMode(z);
    }

    @Override // android.support.v7.view.menu.MenuBuilder
    public final boolean b() {
        return this.l.b();
    }

    @Override // android.support.v7.view.menu.MenuBuilder
    public final boolean c() {
        return this.l.c();
    }

    @Override // android.view.SubMenu
    public MenuItem getItem() {
        return this.m;
    }

    @Override // android.support.v7.view.menu.MenuBuilder
    public final void a(MenuBuilder.a aVar) {
        this.l.a(aVar);
    }

    @Override // android.support.v7.view.menu.MenuBuilder
    public final MenuBuilder i() {
        return this.l.i();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // android.support.v7.view.menu.MenuBuilder
    public final boolean a(MenuBuilder menuBuilder, MenuItem menuItem) {
        return super.a(menuBuilder, menuItem) || this.l.a(menuBuilder, menuItem);
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(Drawable drawable) {
        this.m.setIcon(drawable);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(int i) {
        this.m.setIcon(i);
        return this;
    }

    @Override // android.support.v7.view.menu.MenuBuilder
    public final boolean c(MenuItemImpl menuItemImpl) {
        return this.l.c(menuItemImpl);
    }

    @Override // android.support.v7.view.menu.MenuBuilder
    public final boolean d(MenuItemImpl menuItemImpl) {
        return this.l.d(menuItemImpl);
    }

    @Override // android.support.v7.view.menu.MenuBuilder
    public final String a() {
        int itemId = this.m != null ? this.m.getItemId() : 0;
        if (itemId == 0) {
            return null;
        }
        return super.a() + CommonConstant.Symbol.COLON + itemId;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(Drawable drawable) {
        super.a(0, null, 0, drawable, null);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(int i) {
        super.a(0, null, i, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(CharSequence charSequence) {
        super.a(0, charSequence, 0, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(int i) {
        super.a(i, null, 0, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderView(View view) {
        super.a(0, null, 0, null, view);
        return this;
    }
}
