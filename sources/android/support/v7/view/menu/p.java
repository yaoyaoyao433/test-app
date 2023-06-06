package android.support.v7.view.menu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.annotation.RequiresApi;
import android.support.annotation.RestrictTo;
import android.support.v4.internal.view.SupportSubMenu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
/* compiled from: ProGuard */
@RequiresApi(14)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes.dex */
public final class p extends m implements SubMenu {
    /* JADX INFO: Access modifiers changed from: package-private */
    public p(Context context, SupportSubMenu supportSubMenu) {
        super(context, supportSubMenu);
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(int i) {
        ((SupportSubMenu) this.d).setHeaderTitle(i);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(CharSequence charSequence) {
        ((SupportSubMenu) this.d).setHeaderTitle(charSequence);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(int i) {
        ((SupportSubMenu) this.d).setHeaderIcon(i);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(Drawable drawable) {
        ((SupportSubMenu) this.d).setHeaderIcon(drawable);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderView(View view) {
        ((SupportSubMenu) this.d).setHeaderView(view);
        return this;
    }

    @Override // android.view.SubMenu
    public final void clearHeader() {
        ((SupportSubMenu) this.d).clearHeader();
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(int i) {
        ((SupportSubMenu) this.d).setIcon(i);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(Drawable drawable) {
        ((SupportSubMenu) this.d).setIcon(drawable);
        return this;
    }

    @Override // android.view.SubMenu
    public final MenuItem getItem() {
        return a(((SupportSubMenu) this.d).getItem());
    }
}
