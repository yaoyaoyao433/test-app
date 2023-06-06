package android.support.v7.view.menu;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.support.annotation.RequiresApi;
import android.support.v4.internal.view.SupportMenu;
import android.support.v4.internal.view.SupportMenuItem;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import java.util.Iterator;
/* compiled from: ProGuard */
@RequiresApi(14)
/* loaded from: classes.dex */
public class m extends b<SupportMenu> implements Menu {
    /* JADX INFO: Access modifiers changed from: package-private */
    public m(Context context, SupportMenu supportMenu) {
        super(context, supportMenu);
    }

    @Override // android.view.Menu
    public MenuItem add(CharSequence charSequence) {
        return a(((SupportMenu) this.d).add(charSequence));
    }

    @Override // android.view.Menu
    public MenuItem add(int i) {
        return a(((SupportMenu) this.d).add(i));
    }

    @Override // android.view.Menu
    public MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return a(((SupportMenu) this.d).add(i, i2, i3, charSequence));
    }

    @Override // android.view.Menu
    public MenuItem add(int i, int i2, int i3, int i4) {
        return a(((SupportMenu) this.d).add(i, i2, i3, i4));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(CharSequence charSequence) {
        return a(((SupportMenu) this.d).addSubMenu(charSequence));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i) {
        return a(((SupportMenu) this.d).addSubMenu(i));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        return a(((SupportMenu) this.d).addSubMenu(i, i2, i3, charSequence));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return a(((SupportMenu) this.d).addSubMenu(i, i2, i3, i4));
    }

    @Override // android.view.Menu
    public int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        MenuItem[] menuItemArr2 = menuItemArr != null ? new MenuItem[menuItemArr.length] : null;
        int addIntentOptions = ((SupportMenu) this.d).addIntentOptions(i, i2, i3, componentName, intentArr, intent, i4, menuItemArr2);
        if (menuItemArr2 != null) {
            int length = menuItemArr2.length;
            for (int i5 = 0; i5 < length; i5++) {
                menuItemArr[i5] = a(menuItemArr2[i5]);
            }
        }
        return addIntentOptions;
    }

    @Override // android.view.Menu
    public void setGroupCheckable(int i, boolean z, boolean z2) {
        ((SupportMenu) this.d).setGroupCheckable(i, z, z2);
    }

    @Override // android.view.Menu
    public void setGroupVisible(int i, boolean z) {
        ((SupportMenu) this.d).setGroupVisible(i, z);
    }

    @Override // android.view.Menu
    public void setGroupEnabled(int i, boolean z) {
        ((SupportMenu) this.d).setGroupEnabled(i, z);
    }

    @Override // android.view.Menu
    public boolean hasVisibleItems() {
        return ((SupportMenu) this.d).hasVisibleItems();
    }

    @Override // android.view.Menu
    public MenuItem findItem(int i) {
        return a(((SupportMenu) this.d).findItem(i));
    }

    @Override // android.view.Menu
    public int size() {
        return ((SupportMenu) this.d).size();
    }

    @Override // android.view.Menu
    public MenuItem getItem(int i) {
        return a(((SupportMenu) this.d).getItem(i));
    }

    @Override // android.view.Menu
    public void close() {
        ((SupportMenu) this.d).close();
    }

    @Override // android.view.Menu
    public boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        return ((SupportMenu) this.d).performShortcut(i, keyEvent, i2);
    }

    @Override // android.view.Menu
    public boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return ((SupportMenu) this.d).isShortcutKey(i, keyEvent);
    }

    @Override // android.view.Menu
    public boolean performIdentifierAction(int i, int i2) {
        return ((SupportMenu) this.d).performIdentifierAction(i, i2);
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z) {
        ((SupportMenu) this.d).setQwertyMode(z);
    }

    @Override // android.view.Menu
    public void removeItem(int i) {
        if (this.b != null) {
            Iterator<SupportMenuItem> it = this.b.keySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (i == it.next().getItemId()) {
                    it.remove();
                    break;
                }
            }
        }
        ((SupportMenu) this.d).removeItem(i);
    }

    @Override // android.view.Menu
    public void removeGroup(int i) {
        if (this.b != null) {
            Iterator<SupportMenuItem> it = this.b.keySet().iterator();
            while (it.hasNext()) {
                if (i == it.next().getGroupId()) {
                    it.remove();
                }
            }
        }
        ((SupportMenu) this.d).removeGroup(i);
    }

    @Override // android.view.Menu
    public void clear() {
        if (this.b != null) {
            this.b.clear();
        }
        if (this.c != null) {
            this.c.clear();
        }
        ((SupportMenu) this.d).clear();
    }
}
