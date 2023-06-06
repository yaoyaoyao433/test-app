package android.support.v7.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.support.annotation.NonNull;
import android.support.annotation.RestrictTo;
import android.support.v7.view.menu.ListMenuItemView;
import android.support.v7.view.menu.MenuBuilder;
import android.support.v7.view.menu.MenuItemImpl;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import java.lang.reflect.Method;
/* compiled from: ProGuard */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes.dex */
public final class ag extends ListPopupWindow implements af {
    private static Method b;
    public af a;

    static {
        try {
            b = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
        } catch (NoSuchMethodException unused) {
        }
    }

    public ag(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, null, i, i2);
    }

    @Override // android.support.v7.widget.ListPopupWindow
    final y a(Context context, boolean z) {
        a aVar = new a(context, z);
        aVar.setHoverListener(this);
        return aVar;
    }

    public final void a(Object obj) {
        if (Build.VERSION.SDK_INT >= 23) {
            this.q.setEnterTransition(null);
        }
    }

    public final void c(boolean z) {
        if (b != null) {
            try {
                b.invoke(this.q, Boolean.FALSE);
            } catch (Exception unused) {
            }
        }
    }

    @Override // android.support.v7.widget.af
    public final void b(@NonNull MenuBuilder menuBuilder, @NonNull MenuItem menuItem) {
        if (this.a != null) {
            this.a.b(menuBuilder, menuItem);
        }
    }

    @Override // android.support.v7.widget.af
    public final void a(@NonNull MenuBuilder menuBuilder, @NonNull MenuItem menuItem) {
        if (this.a != null) {
            this.a.a(menuBuilder, menuItem);
        }
    }

    /* compiled from: ProGuard */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* loaded from: classes.dex */
    public static class a extends y {
        final int g;
        final int h;
        private af i;
        private MenuItem j;

        @Override // android.support.v7.widget.y
        public final /* bridge */ /* synthetic */ boolean a(MotionEvent motionEvent, int i) {
            return super.a(motionEvent, i);
        }

        @Override // android.support.v7.widget.y, android.view.ViewGroup, android.view.View
        public final /* bridge */ /* synthetic */ boolean hasFocus() {
            return super.hasFocus();
        }

        @Override // android.support.v7.widget.y, android.view.View
        public final /* bridge */ /* synthetic */ boolean hasWindowFocus() {
            return super.hasWindowFocus();
        }

        @Override // android.support.v7.widget.y, android.view.View
        public final /* bridge */ /* synthetic */ boolean isFocused() {
            return super.isFocused();
        }

        @Override // android.support.v7.widget.y, android.view.View
        public final /* bridge */ /* synthetic */ boolean isInTouchMode() {
            return super.isInTouchMode();
        }

        public a(Context context, boolean z) {
            super(context, z);
            Configuration configuration = context.getResources().getConfiguration();
            if (Build.VERSION.SDK_INT >= 17 && 1 == configuration.getLayoutDirection()) {
                this.g = 21;
                this.h = 22;
                return;
            }
            this.g = 22;
            this.h = 21;
        }

        public final void setHoverListener(af afVar) {
            this.i = afVar;
        }

        @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
        public final boolean onKeyDown(int i, KeyEvent keyEvent) {
            ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
            if (listMenuItemView != null && i == this.g) {
                if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                    performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
                }
                return true;
            } else if (listMenuItemView != null && i == this.h) {
                setSelection(-1);
                ((android.support.v7.view.menu.e) getAdapter()).b.b(false);
                return true;
            } else {
                return super.onKeyDown(i, keyEvent);
            }
        }

        @Override // android.view.View
        public final boolean onHoverEvent(MotionEvent motionEvent) {
            int i;
            android.support.v7.view.menu.e eVar;
            int pointToPosition;
            int i2;
            if (this.i != null) {
                ListAdapter adapter = getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    i = headerViewListAdapter.getHeadersCount();
                    eVar = (android.support.v7.view.menu.e) headerViewListAdapter.getWrappedAdapter();
                } else {
                    i = 0;
                    eVar = (android.support.v7.view.menu.e) adapter;
                }
                MenuItemImpl menuItemImpl = null;
                if (motionEvent.getAction() != 10 && (pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) != -1 && (i2 = pointToPosition - i) >= 0 && i2 < eVar.getCount()) {
                    menuItemImpl = eVar.getItem(i2);
                }
                MenuItem menuItem = this.j;
                if (menuItem != menuItemImpl) {
                    MenuBuilder menuBuilder = eVar.b;
                    if (menuItem != null) {
                        this.i.a(menuBuilder, menuItem);
                    }
                    this.j = menuItemImpl;
                    if (menuItemImpl != null) {
                        this.i.b(menuBuilder, menuItemImpl);
                    }
                }
            }
            return super.onHoverEvent(motionEvent);
        }
    }
}
