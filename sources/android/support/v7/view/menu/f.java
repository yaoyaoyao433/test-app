package android.support.v7.view.menu;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.view.menu.j;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class f implements DialogInterface.OnClickListener, DialogInterface.OnDismissListener, DialogInterface.OnKeyListener, j.a {
    MenuBuilder a;
    AlertDialog b;
    d c;
    private j.a d;

    public f(MenuBuilder menuBuilder) {
        this.a = menuBuilder;
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        if (i == 82 || i == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.b.getWindow();
                if (window2 != null && (decorView2 = window2.getDecorView()) != null && (keyDispatcherState2 = decorView2.getKeyDispatcherState()) != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.b.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                this.a.b(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return this.a.performShortcut(i, keyEvent, 0);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        this.c.a(this.a, true);
    }

    @Override // android.support.v7.view.menu.j.a
    public final void a(MenuBuilder menuBuilder, boolean z) {
        if ((z || menuBuilder == this.a) && this.b != null) {
            this.b.dismiss();
        }
        if (this.d != null) {
            this.d.a(menuBuilder, z);
        }
    }

    @Override // android.support.v7.view.menu.j.a
    public final boolean a(MenuBuilder menuBuilder) {
        if (this.d != null) {
            return this.d.a(menuBuilder);
        }
        return false;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.a.a((MenuItemImpl) this.c.d().getItem(i), (j) null, 0);
    }
}
